import java.util.Scanner;
interface CalculatorInterface
{
	public int add();
	public int subtract();
	public int multiply();
	public float divide();
	public int max();
	public int min();
	public double sine();
	public double cosine();
}
public class Calci implements CalculatorInterface{
	public int a;
	public int b;
	public int add()
	{
		return a+b;
	}
	public int subtract()
	{
		return a-b;
	}
	public int multiply()
	{
		return a*b;
	}
	public float divide()
	{
		return (float)a/(float)b;
	}
	public int max()
	{
		return (a>b) ? a : b;
	}
	public int min()
	{
		return (a<b)? a : b;
	}
	public double sine()
	{
		return Math.sin((double)a); 
	}
	public double cosine()
	{
		return Math.cos((double)a);
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Calci ca=new Calci();
		while(true)
		{
			System.out.println("Select an option:\n1.Add\n2.Subtract\n3.Multiply\n4.Divide\n5.Maximum element\n6.Minimum element\n7.Sine value\n8.Cosine value\n9.Exit\nEnter your choice: ");
			int c=scan.nextInt();
			switch(c)
			{
				case 1:System.out.println("Enter 2 values: ");
				       ca.a=scan.nextInt();
				       ca.b=scan.nextInt();
				       System.out.println("Sum of "+ca.a+" and "+ca.b+" is "+ca.add());
				       break;
				case 2:System.out.println("Enter 2 values: ");
			       		ca.a=scan.nextInt();
			       		ca.b=scan.nextInt();
			       		System.out.println("Difference of "+ca.a+" and "+ca.b+" is "+ca.subtract());
						break;
				case 3:System.out.println("Enter 2 values: ");
			       		ca.a=scan.nextInt();
			       		ca.b=scan.nextInt();
			       		System.out.println("Product of "+ca.a+" and "+ca.b+" is "+ca.multiply());
			       		break;
				case 4:System.out.println("Enter 2 values: ");
			       		ca.a=scan.nextInt();
			       		ca.b=scan.nextInt();
			       		System.out.println("Quotient of "+ca.a+" and "+ca.b+" is "+ca.divide());
			       		break;
				case 5:System.out.println("Enter 2 values: ");
			       		ca.a=scan.nextInt();
			       		ca.b=scan.nextInt();
			       		System.out.println("Maximum of "+ca.a+" and "+ca.b+" is "+ca.max());
			       		break;
				case 6:System.out.println("Enter 2 values: ");
			       		ca.a=scan.nextInt();
			       		ca.b=scan.nextInt();
			       		System.out.println("Minimum of "+ca.a+" and "+ca.b+" is "+ca.min());
			       		break;
				case 7:System.out.println("Enter a value: ");
			       		ca.a=scan.nextInt();
			       		System.out.println("Sin("+ca.a+") = "+ca.sine());
			       		break;
				case 8:System.out.println("Enter a value: ");
			       		ca.a=scan.nextInt();
			       		System.out.println("Cos("+ca.a+") = "+ca.cosine());
						break;
				case 9:scan.close();
						break;
			}
		}
	}

}