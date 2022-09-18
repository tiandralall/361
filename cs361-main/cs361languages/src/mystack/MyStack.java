/**
 * 
 */
package mystack;

/**
 * @author Tiandra Lall
 *
 */

// Stack using generics

// Complete the provided code

public class MyStack<T> {

	private class MyNode<T1> {
		T1 val;
		MyNode<T1> next;

		MyNode(T1 v, MyNode<T1> n) {
			val = v;
			next = n;
		}
	}

	private MyNode<T> theStack = null;

	/**
	 * 
	 */
	public MyStack() {
	}

	public T pop() {
		while(theStack.next != null)
		{
			theStack=theStack.next;
		}

		Object item= new Object();
		item=theStack.val;

		theStack.val=null;
		return (T) item;

	}

	public void push(T v) {
		if(theStack==null){
			theStack= new MyNode(v, null);
		}
		else
		{
			theStack.next=new MyNode(v,null);
		}
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyStack <Integer> stack1= new MyStack<Integer>();
		stack1.push(1);
		stack1.push(2);
		System.out.println(stack1.pop());
		stack1.push(5);



		MyStack <Person> stack2= new MyStack<Person>();
		Person p1= new Person();
		p1.setFname("Tiandra");
		p1.setLname("Lall");

		stack2.push(p1);

		Person p2= new Person();
		p1.setFname("Christelle");
		p1.setLname("Scharff");

		stack2.push(p2);
	}

}
