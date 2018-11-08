import java.util.Scanner;
public class array_String_selection_sort{
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
		int min;
		for(int i = 0;i<ar.length;i++)
		{
			min=i;
			for(int j =i+1;j<ar.length;j++)
			{
				if(ar[i].compareToIgnoreCase(ar[min])<0)
				{
					min=i;
				}
			}
			String aux = ar[i];
                    ar[i] = ar[min];
                    ar[min]=aux;

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