package s106ex;

public class MyList {
	private Node head;

	public void add(int value) {
		Node node = new Node(value);

		if (head == null) {
			head = node;
			return;
		}

		Node cur = head;
		Node next = head.getNext();
		while (next != null) {
			cur = next;
			next = cur.getNext();
		}

		cur.setNext(node);
	}

	public int size(MyList ml) {
		Node cur = head;
		int count = 0;
		while (true) {
			if (cur== null) {
				return count;
			}
			cur = cur.getNext();
			count = count + 1;

		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[");

		Node cur = head;
		while (cur != null) {
			sb.append(cur);
			cur = cur.getNext();
		}
		sb.append("]");
		return sb.toString();
	}
}
