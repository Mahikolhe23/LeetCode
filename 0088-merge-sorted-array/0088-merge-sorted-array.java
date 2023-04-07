class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp=new int[nums1.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                temp[k]=nums1[i];
                i++;
            }else{
                temp[k]=nums2[j];
                j++;
            }
            k++;
        }
        while(i<m){
            temp[k]=nums1[i];
            i++;
            k++;
        }
        while(j<n){
            temp[k]=nums2[j];
            j++;
            k++;
        }
        for(int a=0;a<k;a++){
            nums1[a]=temp[a];
        }
    }
}