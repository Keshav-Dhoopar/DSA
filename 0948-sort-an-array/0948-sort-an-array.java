class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    void mergeSort(int[] a, int l, int r) {
        if (l >= r) return;

        int m = l + (r - l) / 2;
        mergeSort(a, l, m);
        mergeSort(a, m + 1, r);
        merge(a, l, m, r);
    }

    void merge(int[] a, int l, int m, int r) {
        int[] temp = new int[r - l + 1];
        int i = l, j = m + 1, k = 0;

        while (i <= m && j <= r)
            temp[k++] = a[i] <= a[j] ? a[i++] : a[j++];

        while (i <= m) temp[k++] = a[i++];
        while (j <= r) temp[k++] = a[j++];

        for (i = 0; i < temp.length; i++)
            a[l + i] = temp[i];
    }
}