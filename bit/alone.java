import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc =  new Scanner(System.in);
		int tests = sc.nextInt();
		int ans = 0;//have to initialize even this in java
		
		while(tests > 0){
		    int n = sc.nextInt();
		    if(n>0){ ans = sc.nextInt(); }
		    
		    for(int i =1; i < n; i++){
		        ans = ans ^ sc.nextInt();
		    }
		    
		    if(n>0) System.out.println(ans);
		    tests--;
		}
		
	}
}