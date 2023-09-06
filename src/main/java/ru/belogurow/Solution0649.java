package ru.belogurow;

import ru.belogurow.common.TreeNode;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @see <a href="https://leetcode.com/problems/dota2-senate/">649. Dota2 Senate</a>
 */
public class Solution0649 {

    public String predictPartyVictory(String senate) {
        LinkedList<Character> queue = new LinkedList<>();

        for (char c : senate.toCharArray()) {
            queue.add(c);
        }


        while (queue.size() > 1) {
            char firstChar = queue.poll();
            if (!removeFromQueue(queue, firstChar == 'R' ? 'D' : 'R')) {
                // not found another senate
                break;
            }
            queue.add(firstChar);
        }


        return queue.peek() == 'R' ? "Radiant" : "Dire";
    }

    private boolean removeFromQueue(LinkedList<Character> queue, char searchChar) {
        Iterator<Character> iterator = queue.iterator();

        while (iterator.hasNext()) {
            if (iterator.next() == searchChar) {
                iterator.remove();
                return true;
            }
        }

        return false;
    }
}
