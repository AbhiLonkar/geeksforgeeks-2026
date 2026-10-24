function intersection(arr1, arr2) {
  const countsMap = new Map();
  let result = [];
  for (const i of arr1) {
    countsMap.set(i, (countsMap.get(i) || 0) + 1);
  }
  for (const i of arr2) {
    if (countsMap.has(i)) {
      result.push(i);
      countsMap.set(i, countsMap.get(i) - 1);
      if (countsMap.get(i) === 0) {
        countsMap.delete(i);
      }
    }
  }
  return result;
}

function intersectionTwoPointers(arr1, arr2) {
  arr1.sort((a, b) => a - b);
  arr2.sort((a, b) => a - b);
  let res = [];
  let l = 0;
  let r = 0;
  while (l < arr1.length && r < arr2.length) {
    if (arr1[l] == arr2[r]) {
      res.push(arr1[l]);
      l++;
      r++;
    } else if (arr1[l] > arr2[r]) {
      r++;
    } else if (arr1[l] < arr2[r]) {
      l++;
    }
  }
  return res;
}
