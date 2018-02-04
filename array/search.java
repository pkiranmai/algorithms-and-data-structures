import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc  = new Scanner(System.in);
		
		int tests = sc.nextInt();
		
		while(tests>0){
		    int size = sc.nextInt();
		    int [] input = new int[size];
		    for(int i =0; i < size; i++){
		        input[i] = sc.nextInt();
		    }
		    int n = sc.nextInt();
		    System.out.println(findNum(input,n));
		    tests--;
		}
	}
	
	public static int findNum(int[] input, int n){
	    //base case
	    if(input==null || input.length<1) return -1;
	    
	    int ans = -1;
	    for(int i=0; i < input.length; i++){
	        if(input[i]==n){
	            ans = i;
	            break;
	        }
	    }
	    
	    return ans;
	}
}