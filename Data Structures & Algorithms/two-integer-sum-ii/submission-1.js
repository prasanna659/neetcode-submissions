class Solution {
    /**
     * @param {number[]} numbers
     * @param {number} target
     * @return {number[]}
     */
    twoSum(numbers, target) {
    const map = new Map(); 

    for (let i = 0; i < numbers.length; i++) {
        const complement = target - numbers[i];

        if (map.has(complement)) {
            
            return [map.get(complement) + 1, i + 1];
        }

        
        map.set(numbers[i], i);
    }}
};
   
    

