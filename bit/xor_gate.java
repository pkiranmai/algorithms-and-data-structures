import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		
		int tests = sc.nextInt();
		int n =0 ;
		
		while(tests>0){
		    int len = sc.nextInt();
		    int l = len;
		    if(len>0) { n = sc.nextInt(); len--; }
		    
		    while(len>0){
		        n = n ^ sc.nextInt();
		        len--;
		    }
		    
		    if(l>0) System.out.println(n); 
		    
		    tests--;
		}
	}
}