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
		    for(int i=0; i<size; i++){
		        System.out.print(sc.nextInt()+" ");
		    }
		    System.out.println();
		    tests--;
		}
	}
}