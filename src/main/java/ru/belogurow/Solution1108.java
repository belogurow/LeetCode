package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/defanging-an-ip-address/">1108. Defanging an IP Address</a>
 */
public class Solution1108 {

    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
