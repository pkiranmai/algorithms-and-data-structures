class GfG
{
	boolean isBinary(String str)
	{
	  //Your code here
	  //base case
	  if(str.length() < 1) return false;
	  
	  for(int i=0; i<str.length(); i++){
	      char t = str.charAt(i);
	      if(t=='1' || t=='0') continue;
	      else return false;
	  }
	  
	  return true;
	}
}