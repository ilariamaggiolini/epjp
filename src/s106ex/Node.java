package s106ex;

public class Node {
	private int value;
	private Node next; // null

	public Node(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}