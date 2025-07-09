package hackerrank.algorithms;

import java.util.List;

public class RateLimiterProxy {
    public static void main(String[] args) {

        List<Integer> requestTime = List.of(1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 7, 11, 11, 11, 11);

        System.out.println(droppedRequests(requestTime));
    }

    public static int droppedRequests(List<Integer> requestTime) {
        int dropped = 0;

        for (int i = 0; i < requestTime.size(); i++) {
            int currentTime = requestTime.get(i);

            // Rule 1: More than 3 requests in the same second
            if (i >= 3 && requestTime.get(i - 3) == currentTime) {
                dropped++;
                System.out.println("Dropped request at index " + i + " (time " + currentTime + "): Rule 1 - More than 3 in 1 second");
            }
            // Rule 2: More than 20 requests in any 10-second window
            else if (i >= 20 && currentTime - requestTime.get(i - 20) < 10) {
                dropped++;
                System.out.println("Dropped request at index " + i + " (time " + currentTime + "): Rule 2 - More than 20 in 10 seconds");
            }
            // Rule 3: More than 60 requests in any 60-second window
            else if (i >= 60 && currentTime - requestTime.get(i - 60) < 60) {
                dropped++;
                System.out.println("Dropped request at index " + i + " (time " + currentTime + "): Rule 3 - More than 60 in 60 seconds");
            }
        }

        return dropped;
    }
}
