import java.util.Scanner;
public class Array_Strings_Insertion_Sort{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String ar[]=new String[n];
		for(int i=0;i<ar.length;i++)
        {
            ar[i] = sc.next();
        }
		String sorted [] = arraySorter(ar);
		printSortedArray(sorted);
	}
	public static String [] arraySorter(String [] ar)
	{
		for(int i = 1;i<ar.length;i++)
        {
        	String temp=ar[i];
        	int j=i;

        	while(j>0&&ar[j-1].compareToIgnoreCase(temp)>0)
        	{
        		ar[j]=ar[j-1];
        		j--;
        	}
        	ar[j]=temp;

        }
        return ar;

	}
	public static void printSortedArray(String[] sorted)
	{
		for(int i = 0;i<sorted.length;i++)
		{
			System.out.println(sorted[i]);
		}
	}
}