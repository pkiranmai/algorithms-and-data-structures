import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int tests = sc.nextInt();
		int t;
		while(tests>0){
		    int len = sc.nextInt();
		    while(len>0){
		        t = (sc.nextInt() == 0) ? 1 : 0;
		        System.out.print(t+" ");
		        len--;
		    }
		    System.out.println();
		    
		    tests--;
		}
	}
}