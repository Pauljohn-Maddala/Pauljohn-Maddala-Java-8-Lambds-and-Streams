import java.util.function.Predicate;
import java.util.stream.*;
//import java.util.stream.Collectors;
//import java.util.Scanner;
import java.util.*;
public class Strings_Of_Length
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int n,iter;
		List<String> strings=new ArrayList<String>();
		List<String> r;//=new ArrayList<String>();
		Predicate<String> predicate = (str)->str.length()==3&&str.startsWith("a");
		
		System.out.print("Enter no of strings : ");
		n=scan.nextInt();
		
		System.out.println("Enter strings");
		for(iter=1;iter<=n;iter++)
		{
			strings.add(scan.next());
		}
		
		r=strings.stream().filter(predicate).collect(Collectors.toList());
		
		System.out.println(r);
	}
}
