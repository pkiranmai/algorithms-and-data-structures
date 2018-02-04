import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int tests = sc.nextInt();
		
		while(tests>0){
		    //what hapens with negative numbers? work with example
		    int n = sc.nextInt();
		    {
		        int ans = (n & 0x1);
		        n = n >> 1;
		        while(n!=0){
		          ans = ans ^ (n&0x1);
		          n = n >> 1;
		        }
		        if(ans==1) System.out.println("odd");
		        else System.out.println("even");
		    }
		    tests--;
		}
	}
}