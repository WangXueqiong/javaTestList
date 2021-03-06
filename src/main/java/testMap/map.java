package testMap;

import java.util.HashSet;
import java.util.Set;

public class map {
	  public static int maxLength(String str){  
	       
	        Set<Character> set=new HashSet<Character>();  
	        int maxLength=0;  
	        int pre=0;  
	        int after=0;  
	        while(after<str.length()){  
	            if(!set.contains(str.charAt(after))){  
	                set.add(str.charAt(after));  
	                after++;  
	            }else{  
	                set.clear();  
	                if((after-pre)>maxLength){  
	                    maxLength=after-pre;  
	                }  
	                pre++;  
	                after=pre;  
	            }  
	        }  
	          
	        if((after-pre)>maxLength){  
	            maxLength=after-pre;  
	        }  
	        return maxLength;  
	    }  
	    public static void main(String[] args) {  
	        String str="abcdaf";  
	        System.out.println(maxLength(str));  
	  
	    }  
}
