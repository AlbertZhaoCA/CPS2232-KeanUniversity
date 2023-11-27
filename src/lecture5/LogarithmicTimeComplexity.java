package lecture5;

public class LogarithmicTimeComplexity {
    static int steps;
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10,11};
        int num = 11;
        long beginTime = System.nanoTime();
        System.out.println("Search index: " + binarySearch(array,num));
        long endTime = System.nanoTime();
        System.out.println(endTime - beginTime);
        System.out.println(steps);
    }

    public static int binarySearch(int[] arr, int search){
        int low = 0;
        int high = arr.length -1;
        while (low<=high){
            int mid = (low+high)/2;
            if (search == arr[mid]){
                steps++;
                return mid;
            }
            else if (search<arr[mid]) {
                steps++;
                high = mid -1;
            }
            else {
                steps++;
                low = mid + 1;
            }
        }
        System.out.println("Search not found");
        steps++;
        return -low - 1;
    }
}
