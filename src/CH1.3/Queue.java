import edu.princeton.cs.algs4.*;

public class Queue<Item> {
    private Node first;
	private Node last;
    private int N;
    private class Node {
        Item item;
        Node next;
    }

    public boolean isEmpty() {
        return first == null;
    }
    public int size() {
        return N;
    }
    public void enqueue(Item item) {
        Node oldLast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty()) {
            //将first引用初始化
            first = last;
        } else {
            //如果队列为空，则oldLast==null，不需要关联
            oldLast.next = last;
        }
        N++;
    }
    public Item dequeue() {
        Item item = first.item;
        first = first.next;
        if (isEmpty()) {
            //因为last引用仍指向已出队列的最后一个item
            last = null;
        }
        N--;
        return item;
    }

    //TODO: iterator()

    public static void main(String[] args) {
        Queue<String> q = new Queue<String>();

        while(!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!item.equals("-")) {
                q.enqueue(item);
            } else if (!q.isEmpty()) {
                StdOut.print(q.dequeue() + " ");
            }
        }
        StdOut.println("(" + q.size() + " left on queue)");    
    }
}
