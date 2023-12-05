package preparation;

//Qinjian Zhao
public class passByReferenceQuiz {
    public static void main(String[] args) {
        int[] x = new int[]{3,6,9,12,15};
        System.out.println("Before changing: ");
        for(int i : x){
        System.out.print(i+" ");}
        changeByReference(x);
        System.out.println("\nAfter changing: ");
        for(int i : x){
            System.out.print(i+" ");
           }
    }

    public static void changeByReference(int[] x){
        for(int i = 0;i<x.length;i++){
            x[i]*=3;//pass by reference
        }

    }
}
