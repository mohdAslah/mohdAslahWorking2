package basic;

public class LitArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {4,6,2,1,7};
		
		int min= a[0];
		
		for(int i=0; i<a.length; i++)
			
		{
			if(a[i]< min)
			{
				min= a[i];
			}
			
			
		}
		
		System.out.println(min);

	}

}
