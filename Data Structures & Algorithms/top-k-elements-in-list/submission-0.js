class Solution {
    /**
     * @param {number[]} nums
     * @param {number} k
     * @return {number[]}
     */
    topKFrequent(nums, k) {
    const freqMap = new Map();    
    for (const num of nums) {
        freqMap.set(num, (freqMap.get(num) || 0) + 1);
    }
   const sortedElements = Array.from(freqMap).sort((a, b) => b[1] - a[1]);
    return sortedElements.slice(0, k).map(entry => entry[0]);
};

}
