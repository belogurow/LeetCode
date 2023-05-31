package ru.belogurow;

import java.util.HashMap;
import java.util.Map;

/**
 * @see <a href="https://leetcode.com/problems/design-underground-system/">1396. Design Underground System</a>
 */
public class Solution1396 {

  static class UndergroundSystem {

    private final Map<String, Map<String, RouteInfo>> routeInfos;
    private final Map<Integer, CustomerInfo> customerInfos;

    public UndergroundSystem() {
      this.routeInfos = new HashMap<>();
      this.customerInfos = new HashMap<>();

    }

    public void checkIn(int id, String startStationName, int t) {
      customerInfos.put(id, new CustomerInfo(id, startStationName, t));
    }

    public void checkOut(int id, String endStationName, int t) {
      CustomerInfo customer = customerInfos.remove(id);

      RouteInfo route = routeInfos.computeIfAbsent(customer.startStationName, (v) -> new HashMap<>())
          .computeIfAbsent(endStationName, (v2) -> new RouteInfo(customer.startStationName, endStationName));

      route.addCustomerTime(t - customer.startTime);
    }

    public double getAverageTime(String startStation, String endStation) {
      return routeInfos.get(startStation).get(endStation).getAvrTime();
    }

    static class RouteInfo {
      private final String startStation;
      private final String endStation;
      private int totalTime;
      private int customers;

      public RouteInfo(String startStation, String endStation) {
        this.startStation = startStation;
        this.endStation = endStation;
      }

      public void addCustomerTime(int addTime) {
        this.totalTime += addTime;
        this.customers += 1;
      }

      public double getAvrTime() {
        return (double) totalTime / customers;
      }
    }

    record CustomerInfo(int id,
                        String startStationName,
                        int startTime) {

    }
  }
}
