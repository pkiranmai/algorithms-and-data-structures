import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int testcases = 0;
		testcases = sc.nextInt();
		while(testcases > 0){
		    int v = sc.nextInt();
		    int e = sc.nextInt();
		    System.out.println(e);
		    while(e>0){
		        v = sc.nextInt();
		        v = sc.nextInt();
		        e--;
		    }
		    testcases --;
		}
	}
}