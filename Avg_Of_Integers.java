import java.util.Scanner;
import java.util.*;
import java.util.function.BiFunction;
public class Avg_Of_Integers
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int n,avg;
		ArrayList<Integer> integers=new ArrayList<Integer>();
		System.out.print("Enter number of elements:");
		n=scan.nextInt();
		System.out.println("Enter elements");
		for(int iter=1;iter<=n;iter++)
		{
			integers.add(scan.nextInt());
		}
		avg=avgOfListOfIntegers(integers,( a, b)->a+b);
		System.out.println("Average of given integers is : "+avg);
	}
	public static int avgOfListOfIntegers(ArrayList<Integer> integers,BiFunction<Integer,Integer,Integer> biFunction)
	{
		int sum=0,average;
		BiFunction<Integer,Integer,Integer> findDiv=(a,b)->a/b;
		for(int num:integers)
		{
			sum=biFunction.apply(sum,num);
		}
		average=findDiv.apply(sum,integers.size());
		return average;
	}
}
