package CollectionFramework._1_ListInterface._4_Stack;
// stack extend karta hai vector ko
// but follows LIFO nature

// NOTE--> ArrayList , LinkedList are not Thread-Safe but Vector and Stack is.
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        // 50
        // 40
        // 30
        // 20
        // 10
        stack.pop(); // top element remove karta hai
        System.out.println(stack);

        int peek = stack.peek();
        System.out.println(peek); // shows top of stack element

        System.out.println(stack.isEmpty());
        System.out.println(stack.size());

        int search = stack.search(10);// search  method 30 ka top se uska index nikaalega
        // search is 1 based indexing
        System.out.println(search);
    }
}
