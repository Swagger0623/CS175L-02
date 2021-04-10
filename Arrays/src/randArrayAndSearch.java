import java.util.Random;
public class randArrayAndSearch {
	public static void main(String[] args) {
		Random rd = new Random(); 
	    int[] arr = new int[25];
	    int max = 1;
	    int min = 25;
	    for (int i = 0; i < arr.length; i++)
	    {
	    	arr[i] = rd.nextInt(25)+1;
	        System.out.print(arr[i] + ", ");
	        if(arr[i] > max) 
	        {
	               max = arr[i];
	        }
	        else if(arr[i] < min)  
	    	{
	    		min = arr[i]; 
	    	}
	} 
	    System.out.println();
	 System.out.println("The largest number is:" + max);
     System.out.println("The smallest number is:" + min);
}
}
	


