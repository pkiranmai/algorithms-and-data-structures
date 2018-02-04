/*Complete the Function below*/
class GfG
{
	public static int palinArray(int[] a, int n)
           {
                  //add code here.
                  //base case
                  if(a.length<0) return -1;
                  
                  int ans = 1;
                  
                  for(int p: a){
                      ans = ans & isPalindrome(p);
                  }
                  
                  return ans;
           }
           
    public static int isPalindrome(int n){
        //if(n<10 && n>-10) return 1; //single digit number is palindrome
        if(n%10 ==0) return 0; //number ending in 0 will never be palindrome
        
        int tmp = 0, g=n;
        int i = 10;
        while(n>0){
            int p = n%10;
            tmp = tmp*i + p;
            n = n/10;
        }
        
        if(tmp==g) return 1;
        return 0;
    }
}