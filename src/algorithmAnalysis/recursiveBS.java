package algorithmAnalysis;

public class recursiveBS {

    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,7,8,9,12};
        System.out.println(search(arr,4));
    }

    public static int search(int[] arr, int target ){
        return search(arr, target, 0, arr.length-1);
    }

    public static int search(int[] arr, int target, int low, int high){
        if(low > high)
            return -1;

        int middle = (low + high) / 2;

        if (arr[middle]>target){
            //search the left part
            return search(arr,target,low,middle - 1);
        }
        else if (arr[middle]==target){
            return middle;
        }
        else{

            return search(arr,target,middle+1,high);
        }
    }
}
