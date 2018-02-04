/*Complete the function below*/
class GfG{
	public static void convertFive(int n){
    //add code here.
    
    int tmp = n;
    int i = 1;
    while(n>0){
        int p = n%10;
        if(p==0){
            tmp = i*5 + tmp;
        } 
        i = i*10;
        n = n/10;
    }
    
    System.out.println(tmp);
    }
}