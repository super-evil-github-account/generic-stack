public class Runner {

    public static void main(String[] args) {

        LinkedStack stack = new LinkedStack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        stack.poll().toString();

        System.out.println(stack.peek().toString());

        System.out.println(stack.isEmpty());
    }
}
