public class Electrostatics_Doug_1
{
	public static void main(String[] args)
	{
	    int a[] ={4,3,5};
	    String str = "PNP";
	    int sum = 0;
	    for (int i = 0; i < str.length(); i++)
	    {
	        if (str.charAt(i) == 'P')
	            sum = sum + a[i];
	        else
	            sum = sum - a[i];
	    }
	    System.out.println("Magnitude: " + sum * 100);
	}
}