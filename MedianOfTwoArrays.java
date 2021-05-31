
/**
 * Problem originally found at leetCode.com
 * 
 * This method takes two sorted arrays and finds the median of them.
 * This method assumes that the arrays are sorted on input
 * Can run into problems if the arrays are not sorted
 * 
 * This method first creates a new array that is the length of both arrays
 * combined, then does a single pass to combine the two arrays into one array
 * Whatever is left over is then added to the end of the array
 * 
 * If the length of the array is odd, simply returns the value at length / 2
 * Else it will return the value of adding values at length / 2 and length / 2 -1
 * And then dividing that sum by 2
 * 
 * Examples:
 * findMedianSortedArrays([1,2],[3,4]) returns 2.5 because (2+3)/2 = 5
 * findMedianSortedArrays((1,3,5],[6,7]) returns 5
 * 
 * @author (Austin Gage)
 * @version (5/31/21)
 */
public class MedianOfTwoArrays
{
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length = nums1.length + nums2.length;
        int[] sortedArray = new int[length];
        int i=0;int j=0;int k=0;
        while(i < nums1.length && j < nums2.length)
        {
            if(nums1[i] < nums2[j])
            {
                sortedArray[k++] = nums1[i++];
            }
            else
            {
                sortedArray[k++] = nums2[j++];
            }
        }
        while(i < nums1.length)
        {
            sortedArray[k++] = nums1[i++];
        }
        while(j < nums2.length)
        {
            sortedArray[k++] = nums2[j++];
        }
        if(sortedArray.length % 2 == 0)
        {
            return((sortedArray[sortedArray.length/2 - 1] + sortedArray[sortedArray.length/2]) / 2.0);
        }
        else
        {
            return sortedArray[sortedArray.length / 2];
        }
    }
}
