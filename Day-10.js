/**
 * @param {string} s
 * @return {boolean}
 */
var isPalindrome = function(s) {
    s = s.toLowerCase().replace(/[^a-z0-9]|\s+|\r?\n|\r/gmi, "");
    
    let left = 0
    let right = s.length - 1
    if(s.length == 0) return true
    if (s.length == 2) return s[0] == s[1]
    while (left < right) {
        if(s[left] != s[right] ) {
           
             return false
        }
            left++;
            right--
          
     
        
    }
    return true
    
};
