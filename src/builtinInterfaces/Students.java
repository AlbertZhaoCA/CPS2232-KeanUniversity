package builtinInterfaces;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class Students implements Comparable<Students>, Iterable<Students.Student> {
    public static void main(String[] args) {
        //Test for student class
        Student[] students = new Student[5];
        students[0] = new Student("Ken", 18, 100);
        students[1] = new Student("Ben", 20, 90);
        students[2] = new Student("Jen", 19, 95);
        students[3] = new Student("Jan", 19, 95);
        students[4] = new Student("Jann", 19, 95);
        Arrays.sort(students);
        for (Student student : students) {
            System.out.println(student.name + " " + student.age + " " + student.score);
        }
        System.out.printf("====================================\n");
        Arrays.sort(students,new Student.NameComparator());
        for (Student student : students) {
            System.out.println(student.name + " " + student.age + " " + student.score);
        }
        //Test for students class
        Students group1 = new Students();
        group1.insert(new Student("Ken", 18, 100));
        group1.insert(new Student("Ben", 20, 90));
        Student Jan = new Student("Jan", 19, 95);
        group1.insert(new Student("Jen", 19, 95));
        group1.insert(Jan);
        group1.insert(new Student("Jann", 19, 95));
        Students group2 = new Students();
        group2.insert(new Student("Ken", 18, 100));
        group2.insert(new Student("Ben", 20, 90));
        group2.insert(new Student("Jen", 19, 95));
        group2.insert(new Student("Jan", 19, 95));
        group2.insert(new Student("Jann", 19, 95));
        System.out.println(group1.compareTo(group2));
        System.out.println(group1.size);
        System.out.println(group2.size);
        group1.remove(Jan);
        for (Student student : group1) {
             System.out.println(student.name + " " + student.age + " " + student.score);
        }
        System.out.printf("====================================\n");
        Iterator iterator = group2.iterator();
        while(iterator.hasNext()){
             ;
            System.out.println(((Student)iterator.next()).name);
        }
    }

    static class Student implements Comparable<Student>{
        private String name;
        private int age;
        private int score;

        public Student(String name, int age, int score){
            this.name = name;
            this.age = age;
            this.score = score;
        }

        @Override
        public int compareTo(Student o) {
            return score - o.score;
        }

        /*
        * 1. compare the first letter of the name
        * 2. if the first letter is the same, compare the second letter
        * 3. if the second letter is the same, compare the third letter
        *   ...
        *      until the end of the name
        * if the name is the same, compare the length of the name
        *
         */
        private static class NameComparator implements Comparator<Student>{
            @Override
            public int compare(Student o1, Student o2) {
                try {
                    for (int i = 0; i < o1.name.length(); i++) {
                        if(o1.name.charAt(i)==(o2.name.charAt(i))){
                            continue;
                        }
                        else return o1.name.charAt(i)-o2.name.charAt(i);
                    }
                }catch (StringIndexOutOfBoundsException e){
                    if (o1.name.length()>o2.name.length()){
                        return 1;
                    }
                    else if(o1.name.length()<o2.name.length()){
                        return -1;
                    }
                    else return 0;
                }

                return 0;
            }
        }

    }
    private Student[] students;
    private int size;

    public Students(){
        students = new Student[10];
    }

    public void insert(Student student){
        ensureCapacity();
        students[size++] = student;

    }

    public void remove(Student student){
        for (int i = 0; i < size; i++) {
            if(this.students[i].equals(student)){
                System.arraycopy(this.students,i+1,this.students,i,size-i-1);
                size--;
                break;
            }
        }
    }

    public void ensureCapacity(){
        // if the array is full, double the size of the array
        if(size == students.length){
            Student[] temp = new Student[students.length*2];
            System.arraycopy(students,0,temp,0,students.length);
            students = temp;
        }

    }

    @Override
    public int compareTo(Students o) {
        return this.size - o.size;
    }

    @Override
    public Iterator iterator(){
        return new aIterator();
    }

    public class aIterator implements Iterator<Student>{
        private int index = 0;
        @Override
        public boolean hasNext() {
            return index<size;
        }

        @Override
        public Student next() {
            return students[index++];
        }
    }
    private static class scorecComparator implements Comparator<Students>{
        @Override
        public int compare(Students o1, Students o2) {
            long avg1 = 0;
            long avg2 = 0;
            for(Student student : o1){
                   avg1 += student.score;
            }
            avg1 /= o1.size;

            for(Student student : o2){
                avg2 += student.score;
            }
            avg2 /= o1.size;

            return (int)(avg1 - avg2);
        }
    }

}

