package lecture5;

public class BubbleSort {

    public static void bubbleSort(int[] arr){
        int steps = 0;
        int temp = 0;
        long beginTime = System.nanoTime();

        for(int i = 0; i < arr.length; i++){
            for(int j = 1; j < arr.length-i; j++){
                if(arr[j-1]>arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    steps++;
                    System.out.println("Step : " + steps);
                }
            }
        }
        long endTime = System.nanoTime();
        System.out.println("Time taken: "+(endTime-beginTime));
    }

    public static void main(String[] args) {
        int arr[] = {2,3,2,6,5,1,-2,3,17,12};
        bubbleSort(arr);
        System.out.println("Sorted array: + Bubble ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
