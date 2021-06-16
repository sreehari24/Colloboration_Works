import java.util.Scanner;

public class Session2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.out.println("Enter the Input : ");
		
		Scanner scans = new Scanner(System.in);
		int nUserInput = scans.nextInt();
		
		int nRowCol = (nUserInput+nUserInput)-1;
		
		int nLeft = nUserInput, nRight = nUserInput;
		//System.out.println("nRowCol : "+nRowCol);
		
		for(int i=1;i<=nRowCol;i++)//row
		{
			
			for(int j=1; j<=nRowCol;j++)//col
			{
				
				if(j>=nLeft && j<=nRight )
				    System.out.print("*");
				else
					System.out.print(" ");
				
			}
			if(i<nUserInput) {
			   nLeft--;
			   nRight++;
			}
			else {
				nLeft++;
				nRight--;
			}
			
			
			System.out.println();
			
		}
		
		
		
	}

}
