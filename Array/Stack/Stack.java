public class Stack 
{
	private int maxSize;
	private long[] stackArray;
	private int top;

	public Stack(int S) 
	{
		maxSize = S;
		stackArray = new long[maxSize];
		top = -1;
	}
	
	public void push(long J) 
	{
		stackArray[++top] = J;
	}
	
	public long pop() 
	{
		return stackArray[top--];
	}
	
	public long peek() 
	{
		return stackArray[top];
	}
	
	public boolean isEmpty() 
	{
		return (top == -1);
	}
	
	public boolean isFull() 
	{
		return (top == maxSize - 1);
	}
	
	public static void main(String[] args) 
	{
		Stack theStack = new Stack(10); 
		theStack.push(10);
		theStack.push(20);
		theStack.push(30);
		theStack.push(40);
		theStack.push(50);
		theStack.push(60);

		while (!theStack.isEmpty()) 
		{
			long value = theStack.pop();
			
			System.out.print(value);
			System.out.print(" ");
		}
		System.out.println("");
	}
}
