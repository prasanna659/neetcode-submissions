class Solution {
    /**
     * @param {string} s
     * @return {boolean}
     */
    isPalindrome(s) {


    const cleanStr = s.toLowerCase().replace(/[^a-z0-9]/g, '');

   
    const reversedStr = cleanStr.split('').reverse().join('');

    
    return cleanStr === reversedStr;
};

            }

