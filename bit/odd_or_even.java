import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int tests = sc.nextInt();
		int n;
		
		while(tests>0){
		    n = sc.nextInt();
		    if(n<0) n=n*-1; //i always want to deal with positive numbers
		    if((n & 0x1) == 1) System.out.println("odd");
		    else System.out.println("even");
		    tests--;
		}
	}
}