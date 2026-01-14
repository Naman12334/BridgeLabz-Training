import java.util.Stack;

class QueueUsingStacks {
    private Stack<Integer> stackEnqueue = new Stack<>();
    private Stack<Integer> stackDequeue = new Stack<>();

    public void enqueue(int value) {
        stackEnqueue.push(value);
    }

    public int dequeue() {
        if (stackDequeue.isEmpty()) {
            while (!stackEnqueue.isEmpty()) {
                stackDequeue.push(stackEnqueue.pop());
            }
        }

        if (stackDequeue.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        return stackDequeue.pop();
    }
}
