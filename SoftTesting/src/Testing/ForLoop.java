package Testing;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print(col);
				//System.out.print(row);
			}
			System.out.println();
		}
		
		//palindrome string
		String str="abac";
		//String s1=str;
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		
		System.out.println("Reverse String:"+rev);
		if(str.equals(rev))
		{
			System.out.println("palindrome string");
		}
		else
			System.out.println("Not palindrome string");
		
	}

}
