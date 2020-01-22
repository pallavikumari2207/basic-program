package practice;

public class swap {
	      
		
		// Driver code 
		public static void main(String arg[]) 
		{ 
		    
		    System.out.println("hi i am main");
		    int [] res={0,1,0,0,1,1,1,1};
			int [] pass={0,1,0,0,1,1,1,1};
			int[] temp=new int[8];
			 for(int i=0;i<8;i++)
		     {
		    	temp[i]=pass[i] & res[i];
		    }for(int i=0;i<temp.length;i++)
		    {
		    	System.out.print("\n"+temp[i]);	
		    	}
		} 
		} 
