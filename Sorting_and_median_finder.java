import java.util.Scanner;
public class Sorting_and_median_finder{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<ar.length;i++)
        {
            ar[i] = sc.nextInt();
        }
		int sorted [] = arraySorter(ar);
		double median = medianFinder(sorted);
		System.out.println(median);
	}
	public static int [] arraySorter(int [] ar)
	{
		for(int i = ar.length-1;i>0;i--)
        {
            for(int j=0;j<i;j++)
            {
                if(ar[i]>ar[j])
                {
                    int aux = ar[i];
                    ar[i] = ar[j];
                    ar[j]=aux;
                }
            }
        }
        return ar;

	}
	public static double medianFinder(int [] sorted)
	{
		double median = 0.0;
	 		if (sorted.length % 2 == 0)
	 		{
	 			median = ((double)sorted[sorted.length/2] + (double)sorted[sorted.length/2 - 1])/2;
	 		}

			else
			{
				 median = (double) sorted[sorted.length/2];
			}
			return median;

	}
}