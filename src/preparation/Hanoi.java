package preparation;


public class Hanoi {
    static void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod) {
        /*

        1
        2
        3
        A      B      C

        Move all to C we dive it as two sub-task, move the top (1,2) to B and move 3 to C
        then move (1,2) to C.

         */
        if (n == 1) {// when to stop?  here the base case as no disk needs to move
            System.out.println("Move disk 1 from rod " + from_rod + " to rod " + to_rod);
            return;
        }
        towerOfHanoi(n-1, from_rod, aux_rod, to_rod);// move Top (1,2)
        System.out.println("Move disk " + n + " from rod " + from_rod + " to rod " + to_rod);//print ,move 3 to C
        towerOfHanoi(n-1, aux_rod, to_rod, from_rod);// move (1,2) to C
    }

    // Driver method
    public static void main(String args[])
    {
        int n = 3; // Number of disks
        towerOfHanoi(n, 'A', 'C', 'B');
    }
}
