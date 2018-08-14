package leetcode;
/*
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.

Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

You may assume nums1 and nums2 cannot be both empty.

 

Example 1:

nums1 = [1, 3]
nums2 = [2]

The median is 2.0
Example 2:

nums1 = [1, 2]
nums2 = [3, 4]

The median is (2 + 3)/2 = 2.5
 */
public class _4_Median_of_Two_Sorted_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_4_Median_of_Two_Sorted_Arrays o =new _4_Median_of_Two_Sorted_Arrays();
		int nums1[]={1,2},nums2[]={3,4};
		double ret=o.findMedianSortedArrays(nums1, nums2);
		System.out.println(ret);
	}
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double ret =0;
        int size1=nums1.length,size2=nums2.length;
        int nums[]=new int[size1+size2];
        int i1=0;
        int i,j;
        for(i=0,j=0;i<size1&&j<size2;){
            if(nums1[i]<nums2[j]){
                nums[i1++]=nums1[i++];
            }
            else{
                nums[i1++]=nums2[j++];
            }
        }
        
        while(i<size1){nums[i1++]=nums1[i++];}
        while(j<size2){nums[i1++]=nums2[j++];}
        
        if(nums.length%2==0)ret=(double)(nums[nums.length/2]+nums[(nums.length-1)/2])/2;
        else ret=(double)nums[nums.length/2];
        return ret;
    }

}
