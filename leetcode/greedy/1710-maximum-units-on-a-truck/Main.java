class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int total = 0;
        Arrays.sort(boxTypes, (x, y) -> Integer.compare(y[1], x[1]));
        for (int i = 0; i < boxTypes.length; i++) {
            while (truckSize > 0 && boxTypes[i][0] > 0){
                truckSize --;
                total = boxTypes[i][1] + total;
                boxTypes[i][0]--;
            }
        }
        return total;
    }
}