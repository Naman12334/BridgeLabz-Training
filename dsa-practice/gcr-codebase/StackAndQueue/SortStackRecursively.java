import java.util.Stack;

class SortStackRecursively {

    public static void sortStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }

        int topElement = stack.pop();
        sortStack(stack);
        insertInSortedOrder(stack, topElement);
    }

    private static void insertInSortedOrder(Stack<Integer> stack, int value) {
        if (stack.isEmpty() || stack.peek() <= value) {
            stack.push(value);
            return;
        }

        int temp = stack.pop();
        insertInSortedOrder(stack, value);
        stack.push(temp);
    }
}
