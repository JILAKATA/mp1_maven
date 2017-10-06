import java.util.ArrayList;
import java.util.EmptyStackException;
//import import java.util.Deque;

public class MyStack<E> {

	// generic ArrayList stack
	private ArrayList<E> list;

	/*private static class ArrayList<E>{
		private ArrayList<E> next;

	}*/

	// Constructor
	public MyStack() {
		list = new ArrayList<E>();
	}

	// Test if stack is empty
	public boolean empty() {
		// Implement your code;
		//list = 0;
		/*if(list != null)
			return false;
		else 
			return true;
		*/
		return false;
	}

	// Empty the stack
	public void clear() {
		list = new ArrayList<E>();
	}

	// Push an element to the stack
	public E push(E elt) {
		list.add(elt);
		return elt;
	}

	// Pop an element off the stack
	public E pop() {
		// Implement your code
		//E offStack = peek();
		//list = list.next;
		//if(list.pollLast())
			return null;
	}

	// Peek at top of the stack
	public E peek() {
		try {
			if (empty()) {
				throw new EmptyStackException();
			}
			return list.get(list.size() - 1);
		} catch (EmptyStackException e) {
			System.err.println("\nError: \'peek\' attempted on an empty stack - exception caught!");
			e.printStackTrace();
		}
		return null;

	}

	// Return the size of stack
	public int size() {
		// implement your code
		//if(list.size())
		return 0;
		//return list.size();
	}

	// toString override method
	@Override
	public String toString() {
		return list.toString();
	}

}
