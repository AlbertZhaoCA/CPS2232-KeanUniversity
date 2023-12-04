package sort;

import java.util.Random;

public class RandomPickQS {

    public static void main(String[] args) {
        int randomSize = new Random().nextInt(100);
        int[] arr = new int[randomSize];

        for (int i = 0;i<randomSize;i++){
            arr[i] = new Random().nextInt(100);
        }

        int[] arr2 = new int[randomSize];
        System.arraycopy(arr,0,arr2,0,randomSize);

        long beginTime = System.nanoTime();
        quickSort(arr,0,randomSize-1);
        long endTime = System.nanoTime();

        long begin1Time = System.nanoTime();
        QuickSort.quickSort(arr2);
        long end1Time = System.nanoTime();

        System.out.print("[");
        for (int i:arr
             ) {
            System.out.print(i + ",");
        }
        System.out.println("]");

        System.out.println(end1Time-begin1Time);
        System.out.println(endTime -beginTime);
    }


    public static void quickSort(int[] arr, int lowIndex, int highIndex){
        if (lowIndex>=highIndex)
            return;
        int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
        int pivot = arr[pivotIndex];
        swap(arr,pivotIndex,highIndex);

        int lp = partition(arr,lowIndex,highIndex,pivot);

        quickSort(arr,lowIndex,lp-1);
        quickSort(arr,lp+1,highIndex);
    }
    private static int partition(int[] arr,int lowIndex,int highIndex,int pivot){
        int lp = lowIndex;
        int rp = highIndex;

        while(lp<rp){
            while(arr[lp] <= pivot && lp<rp){
                lp++;
            }
            while(arr[rp]>=pivot && lp<rp){
                rp--;
            }
            swap(arr,lp,rp);
        }
        swap(arr,lp,highIndex);// do not mess up with swap(lp,pivot)
        return lp;
    }

    public static void swap(int[]arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
