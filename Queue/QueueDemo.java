// import java.util.*;

class QueueArray {
    // static variables shared across all objects
    static int size;
    static int arr[];
    static int front;
    static int rear;

    // constructor to initialize queue
    QueueArray(int n) {
        size = n;
        arr = new int[size];
        front = -1;
        rear = -1;
    }

    // Enqueue operation
    public static void enqueue(int data) {
        if (rear == size - 1) {
            System.out.println("Queue is Full!");
            return;
        }
        if (front == -1) { // first element
            front = 0;
        }
        arr[++rear] = data;
        System.out.println(data + " enqueued");
    }

    // Dequeue operation
    public static void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is Empty!");
            return;
        }
        System.out.println(arr[front] + " dequeued");
        front++;
    }

    // Peek operation
    public static void peek() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is Empty!");
            return;
        }
        System.out.println("Front element: " + arr[front]);
    }

    // Check if empty
    public static boolean isEmpty() {
        return (front == -1 || front > rear);
    }

    // Check if full
    public static boolean isFull() {
        return (rear == size - 1);
    }
}

public class QueueDemo {
    public static void main(String[] args) {
        // QueueArray q = new QueueArray(5);

        QueueArray.enqueue(10);
        QueueArray.enqueue(20);
        QueueArray.enqueue(30);

        QueueArray.peek();   // Front element: 10

        QueueArray.dequeue(); // 10 dequeued
        QueueArray.peek();   // Front element: 20

        System.out.println("Is Empty? " + QueueArray.isEmpty());
        System.out.println("Is Full? " + QueueArray.isFull());
    }
}