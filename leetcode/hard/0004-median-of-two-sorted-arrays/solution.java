class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] arr = new int[nums1.length + nums2.length];
        int n = arr.length;
        int k = 0;

        for(int i = 0; i < nums1.length; i++){
            arr[i] = nums1[i];
            k++;
        }

        for(int i = k; i < n; i++){
            arr[i] = nums2[i - k];
        }

        Arrays.sort(arr);

        if(n % 2 != 0){
            return arr[n / 2];
        }
        else{
            int v1 = arr[n / 2];
            int v2 = arr[n / 2 - 1];

            return (v1 + v2) / 2.0;
        }
    }
}