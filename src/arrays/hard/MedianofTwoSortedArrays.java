package arrays.hard;

public class MedianofTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int ml;
        int mr;
        int mVlaue1;
        int mValue2;

        if ((nums1.length + nums2.length) % 2 == 0) {
            ml = (nums1.length + nums2.length) / 2;
            mr = ml + 1;
        } else {
            ml = mr = (nums1.length + nums2.length) / 2;
        }

        int nums1Index = 0;
        int nums2Index = 0;
        int nums = 0;

        while (nums < ml) {

        }
        return 0;

    }
}
