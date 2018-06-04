package exercise38;

/**
 * Class LinkedListStack implements a stack using a linked list. The capacity of
 * a LinkedListStack is not fixed.
 */
public class LinkedListStack implements Stack {
	
	private LinkedList list;
	
	/**
	 * Creates a LinkedListStack without a fixed size.
	 */
	public LinkedListStack() {
		list = new LinkedList();
	}
	
	/**
	 * Returns true if the stack is empty, otherwise false.
	 */
	public boolean empty() {
		return (list.size() == 0);
	}
	
	/**
	 * Pushes the given object onto the stack.
	 */
	public void push(Object data) {
		list.add(data);
	}
	
	/**
	 * Removes the top object from the stack and returns it. 
	 * 
	 * Throws a NoSuchElementException if the stack is empty.
	 */
	public Object pop() {
		if(list.size() == 0) {
			throw new IndexOutOfBoundsException("Stack is empty");
		} else if(list.size() == 1) {
			Object popNode = list.get(list.size() - 1);
			list.clear();
			return popNode;
		} else {
			Object popNode = list.get(list.size() - 1);
			list.delete(list.size() - 1);
			return popNode;
		}
	}
	
	/**
	 * Returns a string description of this stack which shows the size of
	 * the stack on the first line, then lists each object in the stack,
	 * one per line.
	 */
	public String toString() {
		String s = list.toString();
		return s;
	}
}