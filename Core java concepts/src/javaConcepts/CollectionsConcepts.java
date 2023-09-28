package javaConcepts;

import java.util.*;

public class CollectionsConcepts {

	public void arrayListConcept() {
		// ArrayList
		ArrayList<Integer> alist = new ArrayList<Integer>(); // ArrayList is a dynamic size
		alist.add(10);
		System.out.println("ArrayList " + alist);

		for (int i = 0; i <= 10; i++) {
			alist.add(i);
		}
		System.out.println("ArrayList " + alist);

		System.out.println("get the value of 3rd index " + alist.get(3));
		alist.set(3, 100);
		System.out.println("value updated " + alist);

		alist.remove(3);
		System.out.println("removed List " + alist);

		System.out.println("value present in the ArrayList or not " + alist.contains(100));

		for (int i : alist) {
			System.out.println("print the ArrayList values " + i);
		}

		Iterator<Integer> i = alist.iterator();
		System.out.println("print value using iterator " + i.next()); // 10
		System.out.println("print value using iterator " + i.next()); // 0

		while (i.hasNext()) {
			System.out.println("print using hasnext() " + i.next());
		}

		ArrayList hetro = new ArrayList(); // ArrayList supports redundancy (have the duplicate value)
		hetro.add("raj");
		hetro.add(34);
		hetro.add("raj");
		hetro.add('a');
		System.out.println("Hetro value stored in ArrayList " + hetro);
	}

	public void linkedListConcept() {
		LinkedList<String> li = new LinkedList<String>();
		li.add("hai");
		System.out.println(li);
	}

	public void queueConcept() {
		Queue<Integer> qu = new LinkedList<Integer>(); // FIFO
		qu.add(10);
		for (int i = 20; i > 10; i--) {
			qu.add(i);
		}
		System.out.println("Queue values " + qu);
		System.out.println("head of queue " + qu.peek());
		System.out.println("removed " + qu.remove()); // this will throw exception if the queue is empty
		qu.poll(); // this doesn't throw error, it returns null value
		System.out.println("head of queue " + qu.peek());
		qu.add(20);
		System.out.println("Queue values " + qu);
		System.out.println("Queue size " + qu.size());

	}

	public void priorityQueueConcept() {
		// priorityQueue
		PriorityQueue<Integer> pr = new PriorityQueue<Integer>(); // sort & add the values into the queue
		pr.add(10);
		for (int i = 20; i > 10; i--) {
			pr.add(i);
		}
		System.out.println("priorityQueue values " + pr);
		System.out.println("head of priorityQueue " + pr.peek());
		System.out.println("removed " + pr.remove()); // this will throw exception if the queue is empty
		pr.poll(); // this doesn't throw error, it returns null value
		System.out.println("head of priorityQueue " + pr.peek());
		pr.add(20);
		System.out.println("priorityQueue values " + pr);
		System.out.println("priorityQueue size " + pr.size());
	}

	public void setConcept() {
		// Set - it doesn't store the redundant value
		HashSet<String> hs = new HashSet<String>();
		hs.add("raj");
		hs.add("kumar");
		hs.add("praveen");
		hs.add("kumar");
		hs.add("xavier");
		System.out.println("HashSet values " + hs);

		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("raj");
		lhs.add("kumar");
		lhs.add("praveen");
		lhs.add("kumar");
		lhs.add("xavier");
		System.out.println("LinkedHashSet values " + lhs);

		TreeSet<String> ts = new TreeSet<String>(); // sort & add the values in the set
		ts.add("raj");
		ts.add("kumar");
		ts.add("praveen");
		ts.add("kumar");
		ts.add("xavier");
		System.out.println("TreeSet values " + ts);
	}

	public static void main(String[] args) {

		int a[] = new int[5]; // Array is a fixed size
		System.out.println(a.length);

		CollectionsConcepts coll = new CollectionsConcepts();
		System.out.println("ArrayList concepts...");
		coll.arrayListConcept();
		System.out.println("\n" + "LinkedList concepts...");
		coll.linkedListConcept();
		System.out.println("\n" + "Queue concepts...");
		coll.queueConcept();
		System.out.println("\n" + "PriorityQueue concepts...");
		coll.priorityQueueConcept();
		System.out.println("\n" + "set concepts...");
		coll.setConcept();
	}

}
