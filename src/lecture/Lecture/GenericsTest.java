package lecture;

public class GenericsTest {
    public static void main(String[] args) {
        GenericStack<String> stack1 = new GenericStack<>();
        stack1.push("London");
        stack1.push("Paris");
        stack1.push("Berlin");
        System.out.println(stack1);
        System.out.println(stack1.peek());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1);

        GenericStack<Integer> stack2 = new GenericStack<>();
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        System.out.println(stack2);
        System.out.println(stack2.peek());
        System.out.println(stack2.pop());
        System.out.println(stack2.pop());
        System.out.println(stack2);

    }
}
