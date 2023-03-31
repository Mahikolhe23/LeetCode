class Solution {
    public String[] findWords(String[] words) {
        String s1="eiopqrtuwy";
        String s2="adfghjkls";
        String s3="bcmnvxz";
        ArrayList<String> list= new ArrayList<>();
        for(int i=0;i<words.length;i++){
            String temp=words[i].toLowerCase();
            char[] arr=temp.toCharArray();
            int c1=0;
            int c2=0;
            int c3=0;
            for(int j=0;j<arr.length;j++){
                String ch=""+arr[j];
                if(s1.contains(ch)){
                    c1++;
                }
               else if(s2.contains(ch)){
                    c2++;
                }
                else if(s3.contains(ch)){
                    c3++;
                }
            }
            if((c1==words[i].length()) || 
               (c2==words[i].length()) ||
               (c3==words[i].length())){
                list.add(words[i]);
            }
        }
        String[] ans= new String[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}