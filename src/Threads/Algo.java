package Threads;

public class Algo {
    public static int QuickSortHelper(int left, int right, int[] arr){
        int pivotIdx = left;
        int pivot = arr[left];
        int leftIdx = pivotIdx + 1;
        int rightIdx = right;

        while(leftIdx <= rightIdx) {

            while(leftIdx <= right && arr[leftIdx] <= pivot) {
                leftIdx += 1;
            }

            while(rightIdx > pivotIdx &&  arr[rightIdx] > pivot) {
                rightIdx -= 1;
            }

            // swap
            if(leftIdx < rightIdx){
                int temp = arr[leftIdx];
                arr[leftIdx] = arr[rightIdx];
                arr[rightIdx] = temp;
            }

        }

        // swap the pivot index with rightIdx
        int temp = arr[pivotIdx];
        arr[pivotIdx] = arr[rightIdx];
        arr[rightIdx] = temp;

        return rightIdx;
    }

    public static void QuickSort(int left, int right, int[] arr){
        if(left >= right) {
            return;
        }
        int pivotIdx = QuickSortHelper(left, right, arr);
        QuickSort(left, pivotIdx-1, arr);
        QuickSort(pivotIdx+1, right, arr);

    }

    public static void main(String[] args) {
        System.out.println("welcome");
        int[] arr = new int[] {5,7,1,6,9,2,0,4};
        QuickSort(0,arr.length-1,arr);

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
