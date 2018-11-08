import java.util.Scanner;
public class Array_Strings_Bubble{
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
		for(int i = ar.length-1;i>0;i--)
        {
            for(int j=0;j<i;j++)
            {
                if(ar[i].compareToIgnoreCase(ar[j])<0)
                {
                    String aux = ar[i];
                    ar[i] = ar[j];
                    ar[j]=aux;
                }
            }
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