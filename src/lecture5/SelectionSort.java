package lecture5;

public class SelectionSort {
    public static void selectionSort(double[] list){
        long beginTime = System.nanoTime();
        int steps = 0;
        for(int i = 0; i < list.length - 1; i++){
            double currentMin = list[i];
            int currentMinIndex = i;
            steps++;

            System.out.println("current min: "+currentMin);
            for(int j = i + 1; j < list.length; j++){
                steps++;
                if(currentMin > list[j]){
                    currentMin = list[j];
                    currentMinIndex = j;
                    System.out.println("New curr min: "+currentMin);
                    steps++;
                }
            }
            if(currentMinIndex != i){
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
                steps++;
            }
        }
        long endTime = System.nanoTime();

        System.out.print("Sorted list: ");
        for (double element : list) {
            System.out.print(element + " ");
        }
        System.out.println();

        System.out.println("Time taken: "+(endTime-beginTime));
        System.out.println(steps+" steps taken");
    }


    public static void main(String[] args) {
        double[] list = {2,3,2,6,5};
        selectionSort(list);
    }
}
