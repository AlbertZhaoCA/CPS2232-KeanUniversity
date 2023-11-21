package lecture4;

public class TestPriorityQueue {
    public static void main(String[] args) {
        Patient patient1 = new Patient("John", 2);
        Patient patient2 = new Patient("Jim", 1);
        Patient patient3 = new Patient("Tim", 5);
        Patient patient4 = new Patient("Cindy", 7);
        MyPriorityQueue<Patient> priorityQueue = new MyPriorityQueue<Patient>();
        priorityQueue.enqueue(patient1);
        priorityQueue.enqueue(patient2);
        priorityQueue.enqueue(patient3);
        priorityQueue.enqueue(patient4);
        while (priorityQueue.getSize()>0)
            System.out.println(priorityQueue.dequeue() + " ");

    }
    static class Patient implements Comparable<Patient>{
        public String name;
        public int priority;
        public Patient(String s, int age){
            this.name = s;
            this.priority = age;
        }

        @Override
        public String toString() {
            return name + "(priority: " + priority + ")";
        }

        @Override
        public int compareTo(Patient o) {
            return this.priority  - o.priority;
        }
    }
}

