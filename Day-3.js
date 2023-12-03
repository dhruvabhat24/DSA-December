/**
 * @param {string} s
 * @return {string}
 */

var reverseVowels = function(s) {
   const vowels = 'aeiouAEIOU';
  let left = 0;
  let right = s.length - 1;
  const sArray = s.split('');
  while (left < right) {
    while (left < right && !vowels.includes(sArray[left])) {
      left++;
    }
    while (left < right && !vowels.includes(sArray[right])) {
      right--;
    }
    [sArray[left], sArray[right]] = [sArray[right], sArray[left]];
    left++;
    right--;
  }
  return sArray.join('');
};
