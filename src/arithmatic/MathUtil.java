package arithmatic;

import util.ArrUtil;

public class MathUtil {
    public static void main(String[] args) {
        System.out.println(MathUtil.class.getSimpleName());
        int[] inputArr = ArrUtil.getInputArr();
        ArrUtil.printArray(inputArr);
        System.out.print("Max value = "+findMax(inputArr));
        System.out.println(" index = "+findMax(inputArr, false));
        System.out.print("Min value = "+findMin(inputArr));
        System.out.println(" index = "+findMin(inputArr, false));
    }

    private static int findMin(int[] inputArr) {
        int min = Integer.MAX_VALUE;
        for(int i=0; i<inputArr.length; i++){
            if(inputArr[i] < min){
                min = inputArr[i];
            }
        }
        return min;
    }

    private static int findMin(int[] inputArr, boolean index) {
        int minIndex = 0;
        for(int i=1; i<inputArr.length; i++){
            if(inputArr[i] < inputArr[minIndex]){
                minIndex = i;
            }
        }
        return minIndex;
    }


    private static int findMax(int[] inputArr) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i < inputArr.length; i++){
            if(inputArr[i] > max){
                max = inputArr[i];
            }
        }
        return max;
    }

    private static int findMax(int[] inputArr, boolean index) {
        int maxIndex = 0;
        for(int i=0;i < inputArr.length; i++){
            if(inputArr[i] > inputArr[maxIndex]){
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
