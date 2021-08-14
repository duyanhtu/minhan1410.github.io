public class MergeSort_QuickSort {
    public static void main(String[] args) {
        int arr[] = new int[] { 25, 30, 45, 6, 11, 90, 15 };
        for (int i : mergeSortArray(arr)) {
            System.out.print(i + ", ");
        }
    }

    // ------------------------------------------------------------------------------------------------
    public static int[] mergeSortArray(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }

    public static int[] mergeSort(int[] nums, int l, int r) {
        if (l == r) {
            return new int[] { nums[l] };
        }

        int mid = (l + r) / 2;
        int[] nums1 = mergeSort(nums, l, mid);
        int[] nums2 = mergeSort(nums, mid + 1, r);

        return merge(nums1, nums2);
    }

    public static int[] merge(int[] nums1, int[] nums2) {
        int nums[] = new int[nums1.length + nums2.length];
        int i = 0, i1 = 0, i2 = 0, length = nums.length, length1 = nums1.length, length2 = nums2.length;

        while (i < length) {
            if (i1 < length1 && i2 < length2) {
                if (nums1[i1] < nums2[i2]) {
                    nums[i++] = nums1[i1++];
                } else {
                    nums[i++] = nums2[i2++];
                }
            } else {
                while (i1 < length1) {
                    nums[i++] = nums1[i1++];
                }
                while (i2 < length2) {
                    nums[i++] = nums2[i2++];
                }
            }
        }
        return nums;
    }
    // ------------------------------------------------------------------------------------------------

}