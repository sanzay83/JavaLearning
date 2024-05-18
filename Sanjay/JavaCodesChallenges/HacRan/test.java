package Sanjay.JavaCodesChallenges.HacRan;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test {

    public static long nearlySimilarRectangles(List<List<Long>> sides) {
        // A map to store the normalized ratios as strings and their counts
        Map<String, Long> ratioCount = new HashMap<>();

        // Loop through each rectangle
        for (List<Long> rect : sides) {
            long a = rect.get(0);
            long b = rect.get(1);

            // Calculate the gcd of a and b
            long g = gcd(a, b);

            // Normalize the sides
            long normalizedA = a / g;
            long normalizedB = b / g;

            // Create a unique key for the ratio
            String ratio = normalizedA + ":" + normalizedB;

            // Increment the count of this ratio in the map
            ratioCount.put(ratio, ratioCount.getOrDefault(ratio, 0L) + 1);
        }

        long pairs = 0;
        // Calculate the number of pairs from the counts
        for (long count : ratioCount.values()) {
            if (count > 1) {
                pairs += count * (count - 1) / 2;
            }
        }

        return pairs;
    }

    // Helper method to calculate gcd
    private static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        List<List<Long>> sides = List.of(
                List.of(4L, 8L),
                List.of(15L, 30L),
                List.of(25L, 50L)
        );
        System.out.println(nearlySimilarRectangles(sides));  // Output: 3
    }
}