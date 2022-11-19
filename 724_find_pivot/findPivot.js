let pivotIndex = (nums) => {
  let preSum = 0;
  let leftSum = 0;
  nums.forEach((element) => {
    preSum += element;
  });
  for (let i = 0; i < nums.length; i++) {
    const element = nums[i];
    if (2 * leftSum === preSum - nums[i]) {
      return i;
    }
    leftSum += nums[i];
  }
  return -1;
};

let nums = [1, 7, 3, 6, 5, 6];

console.log(pivotIndex(nums));
