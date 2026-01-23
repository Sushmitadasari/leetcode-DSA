class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0;
        int j=0;
        int k=0;
        int[] res=new int[nums1.length+nums2.length];
        while(i<nums1.length&&j<nums2.length){
            if(nums1[i]<=nums2[j]){
                res[k]=nums1[i];
                i++;
                k++;
            }
            else{
                res[k]=nums2[j];
                j++;
                k++;
            }
        }
        while(i<nums1.length){
            res[k]=nums1[i];
            i++;
            k++;
        }
        while(j<nums2.length){
            res[k]=nums2[j];
            j++;
            k++;
        }
        double median;
        int n=res.length;
        if(n%2==0){
            median=(res[(n/2)-1]+res[n/2])/2.0;
        }
        else{
            median=res[n/2]/1.0;
        }
        return median;
    }
}