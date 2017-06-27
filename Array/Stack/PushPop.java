
public class PushPop 
{
	private static final int capacity = 3;  
	int arr[] = new int[capacity];  
	int top = -1;  

	public void push(int pushedElement) 
	{  
		if (top < capacity - 1) 
		{  
			top++;  
			arr[top] = pushedElement; 
			System.out.println("=== PUSH ==="); 
			System.out.println("Element " + pushedElement + " is pushed to Stack!");  
			printElements();  
			System.out.println("");  
		} 
		
		else 
		{  
			System.out.println("Stack Overflow!"); 
			System.out.println(""); 
		}  
	}  

	public void pop() 
	{  
		if (top >= 0) 
		{  
			top--;  
			System.out.println("=== POP ==="); 
			System.out.println("Pop operation done!"); 
			printElements(); 
			System.out.println(""); 
			
		}
		else 
		{  
			System.out.println("Stack Underflow!");  
			System.out.println(""); 
		}  
	}  

	public void printElements() 
	{  
		if (top >= 0) 
		{  
			System.out.println("Elements in stack;");  
			for (int i = 0; i <= top; i++) 
			{  
				System.out.println(arr[i]);
			}  
		}  
	}  

	public static void main(String[] args) 
	{  
		PushPop stackDemo = new PushPop();  

		stackDemo.pop();  
		stackDemo.push(23);  
		stackDemo.push(2);  
		stackDemo.push(73);  
		stackDemo.push(21);  
		stackDemo.pop();
		stackDemo.pop();  
		stackDemo.pop();  
		stackDemo.pop();  
	}  

}  
