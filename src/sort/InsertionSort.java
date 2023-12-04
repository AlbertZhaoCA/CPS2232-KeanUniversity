package sort;

public class InsertionSort {
    public static void insertionSort(int[] list) {
        long beginTime = System.nanoTime();
        int totalSteps = 0;
        for (int i = 1; i < list.length; i++) {
            int currentElement = list[i];
            int stepsTaken = 0;
            System.out.println("current min: "+currentElement);
            int j;

            for (j = i - 1; j >= 0 && list[j] > currentElement; j--) {
                list[j + 1] = list[j];
                stepsTaken++;
                System.out.println(list[j] + " in index" + " : " + j + " " + stepsTaken + " swaps");
            }
            totalSteps +=stepsTaken;

            list[j + 1] = currentElement;
        }
        long endTime = System.nanoTime();
        System.out.println("\nTime taken: "+(endTime-beginTime));
        System.out.println("Total steps: "+totalSteps);
    }

    public static void main(String[] args) {
        int[] list = {2, 3, 2, 6, 5, 1, -2, 3, 17, 12};
        insertionSort(list);
        System.out.println("Sorted list:");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
