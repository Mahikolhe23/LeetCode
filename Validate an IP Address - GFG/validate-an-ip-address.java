//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.util.*;
import java.io.*;

  public class validip {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            Solution obj = new Solution();

            if (obj.isValid(s))
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    public boolean isValid(String s) {
            if(s.startsWith(".")|| s.endsWith("."))
                return false;
            String[] temp=s.split("\\.");
            for(int i=0;i<temp.length;i++){
                int val;
                if(temp.length!=4)
                    return false; 
                if(temp[i].startsWith("0") && temp[i].length()>1)
                    return false; 
                try{
                        val=Integer.parseInt(temp[i]);
                        if(val<0||val>255)
                            return false;
                        if(val==0 && temp[i].charAt(0)!='0')
                            return false;
                }catch(NumberFormatException n){
                    return false;
                }
            }
        return true;
    }
}