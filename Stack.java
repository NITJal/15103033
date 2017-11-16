import java.util.*;
public class Stack {		
	public ArrayList<Integer> list ;
	public void push(int x)
	{
		list.add(x);
	}
	public int pop()
	{
		int n = list.get(list.size()-1);
		list.remove(list.size()-1);
		return n;
	}
	public void display()
	{
		int n = list.size();
		System.out.print("Elements in Stack : ");
		
	     
		for(int i=0; i<n; i++)
		{
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
	}
	
	Stack(){
		list = new ArrayList<Integer>();
	    }
	
	public static void main(String arg[])
	{
		Stack s = new Stack();
		s.push(1);
		s.push(2);
		s.push(4);
		s.push(6);
		s.display();
		s.pop();
		s.push(8);
		s.push(18);
		s.display();
		s.pop();
		s.push(12);
		s.display();
	}
}