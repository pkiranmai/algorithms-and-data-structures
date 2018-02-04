class GfG
{
    int thirdLargest(int a[])
    {
	// Your code here
	//base case
	if(a.length < 3) return -1;
	int first = a[0],second = a[0],third =a[0];
	    for(int n: a){
	     if(n > first){ 
	     third = second;
	     second = first;
	     first = n;
	     }
	     else if(n > second){
	         third = second;
	         second = n; 
	     }
	     else if (n > third) third = n;
	     else continue;
	    }
	    
	   return third;
    }
}
