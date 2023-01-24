import java.util.*;
public class ReducingDishes_Monica
{
    static int maxSum(int[] arr, int length)
    {
    	Arrays.sort(arr);
        int result = 0;
        int sumSoFar = 0;
        for (int i = length - 1; i >=0; i--)
        {
        	int temp = result + sumSoFar + arr[i];
            if (temp > result)
            	result = temp;
            else
            	return result;
            sumSoFar += arr[i];
        }
        return result;
    }
    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
    	int  length = sc.nextInt();
    	int array [] = new int [length];
    	for (int i =0; i<length; i++)
    		array[i] = sc.nextInt();
    	int ans = maxSum(array,length);
    	System.out.println(ans);
    }
}