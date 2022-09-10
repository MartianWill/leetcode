function intersection(nums1, nums2) {
  const map = new Map();
  nums1.forEach((element) => {
    if (map.has(element)) {
      map.set(element, map.get(element) + 1);
    } else {
      map.set(element, 1);
    }
  });

  let result = [];
  nums2.forEach((element) => {
    if (map.has(element) && map.get(element) !== 0) {
      result.push(element);
      map.set(element, map.get(element) - 1);
    }
  });
  return result;
}

const nums1 = [1, 2, 2, 1];
const nums2 = [2, 2];
const result = intersection(nums1, nums2);
console.log(result);
