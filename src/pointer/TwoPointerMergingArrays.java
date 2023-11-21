package pointer;

public class TwoPointerMergingArrays {

    public static void main(String[] args) {
        new Solution().merge(new int[]{1,2,3,0,0},3,new int[]{2,4},2);
    }
}
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int poin1 = 0;
        int poin2 = 0;
        int[] tempArr = new int[m+n];
        while(poin1<m||poin2<n){
            if(poin1 == m){
                tempArr[poin1+poin2] = nums2[poin2];
                poin2++;}
            else if(poin2 == n){
                tempArr[poin1+poin2] = nums1[poin1];
                poin1++;}
            else if(nums1[poin1]<nums2[poin2]){
                tempArr[poin1+poin2] = nums1[poin1];
                poin1++;}
            else if(nums1[poin1]>nums2[poin2]){
                tempArr[poin1+poin2] = nums1[poin2];
                poin2++;}

            else{
                tempArr[poin1+poin2] = nums2[poin2];
                tempArr[poin1+poin2+1] = nums1[poin1];
                poin1++;poin2++;
            }

        }
        System.arraycopy(tempArr,0,nums1,0,m+n);
        System.out.println(nums1[0]);
        System.out.println(nums1[1]);
        System.out.println(nums1[2]);
        System.out.println(nums1[3]);
        System.out.println(nums1[4]);



    }


}
