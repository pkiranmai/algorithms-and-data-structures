import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		// (not(A)).B + C.D +E.(not(F))
		
		Scanner sc = new Scanner(System.in);
		
		int tests = sc.nextInt();
		
		while(tests>0){
		    int x= sc.nextInt();
		    x = (~x) & sc.nextInt();
		    x = x | (sc.nextInt() & sc.nextInt());
		    x = x | (sc.nextInt() & ~(sc.nextInt())); 
		    System.out.println(x);
		    tests--;
		}
	}
}