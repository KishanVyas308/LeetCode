/**
 * @param {number[]} nums
 * @return {number}
 */
var alternatingSubarray = function (nums) {

    let maxLen = -1;

    for (let i = 0; i < nums.length - 1; i++) {
        if (nums[i + 1] - nums[i] === 1) {
            let len = 2;
            let flag = -1;  // Next expected diff

            for (let j = i + 2; j < nums.length; j++) {
                if (nums[j] - nums[j - 1] === flag) {
                    len++;
                    flag *= -1; // Flip between +1 and -1
                } else {
                    break;
                }
            }
            maxLen = Math.max(maxLen, len);
        }
    }

    return maxLen;
};