function mergeArray(nums1, m, nums2, n) {
  let len = m + n;
  while (m > 0 && n > 0) {
    // if (nums1[m - 1] > nums2[n - 1]) {
    //   nums1[--len] = nums1[--m];
    // } else {
    //   nums1[--len] = nums2[--n];
    // }
    nums1[--len] = nums1[m - 1] > nums2[n - 1] ? nums1[--m] : nums2[--n];
  }
  while (n > 0) {
    nums1[--len] = nums2[--n];
  }
}

const nums1 = [0, 0, 3, 0, 0, 0, 0, 0, 0];
const m = 3;
const nums2 = [-1, 1, 1, 1, 2, 3];
const n = 6;
mergeArray(nums1, m, nums2, n);

console.log(nums1);
