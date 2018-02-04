import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int testcases = sc.nextInt();
		//base case: if testcases <=0, then return
		while(testcases>0){
		    System.out.println(edgeCount(sc.nextInt()));
		    testcases--;
		}
		sc.close();
		
		return;
	}
	
	public static int edgeCount(int n){
	    //base case
	    if(n<=0) return 0;
	    int count = 0;
	    while(n>1){
	        if(n%3 == 0){
	         count++;
	         n = n /3;
	          } else{
	         count++;
	         n--;
	        }
	   }
	    return count;
	}
}