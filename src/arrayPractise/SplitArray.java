package arrayPractise;

import java.util.Arrays;

public class SplitArray {
    public static void main(String[] args) {
        int[] array ={1,2,3,3,4,5,6,7,8,4,3,4,0};
        System.out.println(Arrays.deepToString(splitArray(array, 3)));
    }
    public static int[][] splitArray(int[] array, int chunkSize) {
        int numOfChunks = (int) Math.ceil((double) array.length / chunkSize);
        int[][] splitArray = new int[numOfChunks][];

        for (int i = 0; i < numOfChunks; i++) {
            int start = i * chunkSize;
            int end = Math.min(start + chunkSize, array.length);
            int chunkLength = end - start;

            splitArray[i] = new int[chunkLength];
            System.arraycopy(array, start, splitArray[i], 0, chunkLength);
        }

        return splitArray;
    }
}
