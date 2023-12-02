/**
 * @param {string} a
 * @param {string} b
 * @return {number}
 */
var repeatedStringMatch = function(a, b) {
    let count =Math.ceil(b.length /a.length);
    let str = a.repeat(count);
    return str.includes(b) ? count : (str+a).includes(b) ? count +1 :-1;
};
