package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/average-waiting-time/">1701. Average Waiting Time</a>
 */
public class Solution1701 {

    public double averageWaitingTime(int[][] customers) {
        long waitingTime = 0;
        int finishTime = 0; // chef finish time

        for (int[] customer : customers) {
            int arriveTime = customer[0];
            int dishTime = customer[1];

            finishTime = Math.max(arriveTime, finishTime) + dishTime;
            waitingTime += finishTime - arriveTime;
        }

        return (double) waitingTime / customers.length;
    }
}
