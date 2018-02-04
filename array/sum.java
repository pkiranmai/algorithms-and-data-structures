import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int tests = sc.nextInt();
		while(tests>0){
		    int size = sc.nextInt();
		    int a[] = new int[size];
		    while(size>0){
		        size--;
		        a[size] = sc.nextInt();
		    }
		    System.out.println(sum(a));
		    tests--;
		}
	}
	
	public static int sum(int[] a){
	    //base case
	    if(a.length<1) return 0;
	    
	    int ans = 0;
	    for(int n: a){
	        ans = ans + n;
	    }
	    return ans;
	}
}