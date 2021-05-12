public class MyLinkedList<T> {
	public static void main(String[] args) {
		MyLinkedList<String> myLinkedList = new MyLinkedList<>();

		myLinkedList.showElements();
		System.out.println(myLinkedList.getSize());
		myLinkedList.remove(2);

		myLinkedList.add("0");
		myLinkedList.add("1");
		myLinkedList.add("2");
		myLinkedList.add("3");
		myLinkedList.add("4");
		myLinkedList.add("5");

		myLinkedList.showElements();
		System.out.println(myLinkedList.getSize());

		myLinkedList.remove(35);
		myLinkedList.remove(3);

		myLinkedList.showElements();
	}

	private Node<T> head;
	private int numberOfElements;

	MyLinkedList() {
		head = null;
		numberOfElements = 0;
	}

	public int getSize() {
		return numberOfElements;
	}

	public void add(T value) {
		if(head == null) {
			head = new Node(value);
		}
		else {
			Node current = head;
			while(current.getNextNode() != null) {
				current = current.getNextNode();
			}
			current.setNextNode(new Node(value));
		}

		numberOfElements++;
	}

	public void remove(int index) {
		Node current = head;
		if(current == null) {
			System.out.println("There is no elements to remove.");
		} else if(index > numberOfElements) {
			System.out.println("Wrong index, there is no elements with that index.");
		} else if(index == 0) {
			head = head.getNextNode();
		}
		else {
			for(int i = 0; i < index - 2; i++) {
				current = current.getNextNode();
			}
			current.setNextNode(current.getNextNode().getNextNode());
		}
	}

	public void showElements() {
		Node current = head;
		if(current == null) {
			System.out.println("There is no elements in MyLinkedList.");
		}
		else {
			System.out.print(current.getValue() + " ");
			while(current.getNextNode() != null) {
				current = current.getNextNode();
				System.out.print(current.getValue() + " ");
			}
			System.out.println();
		}
	}

	private static class Node<T> {
		private T value;
		private Node<T> nextNode;

		Node(T value) {
			this.value = value;
		}

		public T getValue() {
			return value;
		}

		public void setValue(T value) {
			this.value = value;
		}

		public Node<T> getNextNode() {
			return nextNode;
		}

		public void setNextNode(Node<T> nextNode) {
			this.nextNode = nextNode;
		}
	}
}

