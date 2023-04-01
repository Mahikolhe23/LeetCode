class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int i=num.length;
        int cur=k;
        List<Integer> list= new ArrayList<>();
        while(--i>=0 || cur>0){
            if(i>=0)
                cur+=num[i];
            list.add(cur%10);
            cur/=10;
        }
        Collections.reverse(list);
        return list;
    }
}