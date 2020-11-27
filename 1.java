import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the first string: ");
		String string1 = s.next();
		System.out.print("Enter the second string: ");
		String string2 = s.next();
		int loc1=0,loc2=0;
		for(int i=0;i<string1.length() && i<string2.length();i++)
		{
			if((int)string1.charAt(i)==(int)string2.charAt(i))
			{
				continue;
			}
			else if((int)string1.charAt(i)>(int)string2.charAt(i))
			{
				loc2++;
				break;
			}
			else
			{
				loc1++;
				break;
			}
		}
		
		if(string1.length() == string2.length() && loc1==0 && loc2==0)
		{
			System.out.print("Both strings are of the same length");
		}
		else if(loc1>0 || (loc1==0 && loc2==0 && string1.length()<string2.length()))
		{
			System.out.print("The first string is smaller than the second string.");
		}
		else if(loc2>0 || (loc2==0 && loc1==0 && string2.length()<string1.length()))
		{
			System.out.print("the second string is smaller than the first string.");
		}

	}

}