package Sanjay.JavaCodesChallenges.HacRan;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class ClimbingTheLeaderboard {
    public static void main(String[] args) {
        int[] arr1 = {102, 100, 100, 90, 90, 80, 75, 60, 51};
        //int[] arr1 = {100, 100, 50, 40, 40, 20, 10};
        List<Integer> ranked = new LinkedList<Integer>();
        List<Integer> player = new LinkedList<Integer>();

        for (int each : arr1) {
            ranked.add(each);
        }

        int[] arr2 = {50, 65, 77, 90, 102};
        //int[] arr2 = {5, 25, 50, 120};
        for (int each : arr2) {
            player.add(each);
        }

        System.out.println(climbingLeaderboard(ranked, player));
    }

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        TreeSet<Integer> uniqueSet = new TreeSet<>(ranked);
        List<Integer> uniqueRanked = new ArrayList<>(uniqueSet);
        List<Integer> result = new ArrayList<>();
        int num = 0;
        int n = uniqueRanked.size();

        for (int score : player) {
            while (num < n && uniqueRanked.get(num) <= score) {
                num++;
            }
            result.add(n - num + 1);
        }

        return result;
    }
}
