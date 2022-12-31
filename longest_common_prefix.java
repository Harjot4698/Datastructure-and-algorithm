package v0;

public class longest_common_prefix {
	
	public static String findLongest_prefix(String[] strs){
		
		if(strs.length==0) {
			return "";
			
		}
		
		int minlen=strs[0].length();
		for(int i=1;i<strs.length;i++) {
			minlen=Math.min(minlen,strs[i].length());
		}
		
		for(int i=0;i<minlen;i++)
		{
			char c=strs[0].charAt(i);
			for(int j=1;j<strs.length;j++) {
				if(strs[j].charAt(i)!=c)
				{
					return strs[0].substring(0,i);
			
				}
			}
		}
		return strs[0].substring(0,minlen);
		
	}

	public static void main(String[] args) {
		
		String[] strs={"geeks","geeksquad","geeky","geek"};
		System.out.println(findLongest_prefix(strs));}}
