package hackerrank.luxoft.efficient_shipping;

import java.util.List;

public class EfficientShipping {

    public static void main(String[] args) {
        List<Long> boxes = List.of(1L,2L,3L);
        List<Long> unitsPerBox = List.of(3L,2L,1L);
        long truckSize = 3;

        System.out.print(getMaxUnits(boxes, unitsPerBox, truckSize));
    }

    private static long maxValue = Long.MIN_VALUE;
    public static long getMaxUnits(List<Long> boxes, List<Long> unitsPerBox, long truckSize) {
        // Write your code here
        long capt = 0;
        long endMaxValue = 0;
        for (int i = 0; i < boxes.size(); i++){
            capt += boxes.get(i);
            if (capt <= truckSize) {
                endMaxValue += boxes.get(i) * unitsPerBox.get(i);
                if (maxValue <= endMaxValue) {
                    maxValue = endMaxValue;
                }
            }
        }
        return maxValue;
    }
}
