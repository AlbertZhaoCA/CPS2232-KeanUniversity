package others;

public class Sorting {
    public static void main(String[] args) {

        int[] arr1 = new int[10];
        int[] arr2 = new int[200000];

        for(int i = 0; i< arr1.length;i++){
            arr1[i] = (int)(Math.random()*10);
        }

        for(int i = 0; i< arr2.length;i++){
            arr2[i] = (int)(Math.random()*10);
        }

        long begin = System.currentTimeMillis();
        sort(arr2);
        long end = System.currentTimeMillis();
        long a = end - begin;

        begin = System.currentTimeMillis();
        sort(arr2);
        end = System.currentTimeMillis();
        long b =end -begin;
        System.out.println();
        System.out.println(a-b);
    }

    public static void sort(int[] arr){
        int biggest = arr[0];
        int index = 0;
        int tempI = 0;
        int length = arr.length-1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < length+1; j++) {
                if(arr[j]>biggest){
                    biggest = arr[j];
                    index = j;
                }
            }
            int temp = arr[index];
            arr[index] = arr[length];
            arr[length] = temp;
            biggest = arr[0];
            index = 0;
            length--;
        }
        for (int i :arr
        ) {
            System.out.print(i+",");
        }
    }
    public static void sort2(int[] arr){
        int biggest = arr[0];
        int index = 0;
        int tempI = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[j+1]<arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i :arr
        ) {
            System.out.print(i+",");
        }
    }


}
