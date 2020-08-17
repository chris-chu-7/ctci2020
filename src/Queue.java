import java.util.NoSuchElementException;

public class Queue {
	
	
	private static class QueueNode<T> {
		/*Class that represents a Node in a Queue.*/
		
		
		private T data;
		private QueueNode<T> next;
		
		public QueueNode(T data) {
			/*Queue Node that indicates where data is*/
			this.data = data;
		}
		
		/*top of queue to dequeue*/
		private QueueNode<T> first;
		
		/*bottom of queue to enqueue*/
		private QueueNode<T> last;
		
		public void add(T item) {
			/*enqueues the node at the back of the queue.*/
			QueueNode<T> t = new QueueNode<T>(item);
			if(last != null) last.next = t;
			last = t;
			if(first == null) first = last;
		}
		
		public T remove() {
			/*
			 * dequeues the node at the front of the queue.
			 * returns the node that is removed 
			 */
			if(first == null) throw new NoSuchElementException();
			T data = first.data;
			first = first.next;
			if(first == null) last = null;
			return data;
		}
		
		public T peek() {
			/*
			 * Looks into the queue and returns the content
			 * of the front of the queue.
			 */
			if(first == null) throw new NoSuchElementException();
			return first.data;
		}
		
		public boolean isEmpty() {
			/*Checks to see if the queue is empty and returns such value*/
			return first == null;
		}

		
	}
	
	
}
