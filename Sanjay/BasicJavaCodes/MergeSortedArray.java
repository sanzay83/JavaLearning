package Sanjay.BasicJavaCodes;

public class MergeSortedArray {
    public static int[] MergeArray(int[] arr, int[] arr2) {
        int[] mergedArray = new int[arr.length+arr2.length];
        int pointerArr = 0;
        int pointerArr2 = 0;
        int pointerMergedArray = 0;
        int i;

        for(i=0; i < mergedArray.length; i++){
            if(pointerArr2 < arr2.length && arr[pointerArr] >= arr2[pointerArr2]){
                mergedArray[pointerMergedArray] = arr2[pointerArr2];
                pointerMergedArray++;
                pointerArr2++;
            } else{
                mergedArray[pointerMergedArray] = arr[pointerArr];
                pointerMergedArray++;
                pointerArr++;
            }
        }
        return mergedArray;
    }
}
