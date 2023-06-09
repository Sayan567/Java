public class QueueUse {
    public static void main(String[] args) throws QueueFullException {
        QueuesUsingLL2<Integer> queue = new QueuesUsingLL2<>(3);
        for (int i = 1; i <= 5; i++) {
            queue.enqueue(i);
        }
        while (!queue.isEmpty()) {
            try {
                System.out.println(queue.dequeue());
            } catch (QueueEmptyException2 e) {
                throw new RuntimeException(e);
            }
        }

        QueueUsingArray queue1 = new QueueUsingArray();
        int[] arr = {10, 20, 30, 40, 50};
        for (int element : arr) {
            queue1.enqueue(element);
        }

        while (!queue1.isEmpty()) {
            try {
                System.out.println(queue1.dequeue());
            } catch (QueueEmptyException2 e) {
                // will never reach here
            }
        }
    }
}