import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		
		int tests = sc.nextInt();
		
		while(tests>0){
		    //what about negative numbers and fractions?
		    int n = sc.nextInt();
		    int[] ans = new int[14];
		    int i = 0;
		    while(n>0){
		        if( (n&0x1)==1 ){ ans[i] = 1; }
		        i++;
		        n = n >> 1;
		    }
		    
		    for(int p = ans.length -1 ; p >= 0; p--){
		        System.out.print(ans[p]);
		    }
		    System.out.println();
		    
		    tests--;
		}
	}
}