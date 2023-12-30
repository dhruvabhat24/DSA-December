class Solution {
    public String addBinary(String a, String b) {
        String ans = "";
        int carry = 0;
        if (a.length()<b.length()) {
            String temp = a;
            a = b;
            b = temp;
        }
        int j = a.length()-1;
        for (int i=b.length()-1; i>=0; i--,j--) {
            if ((a.charAt(j)-'0')+(b.charAt(i)-'0')+carry==3) {
                ans = "1"+ans;
                carry = 1;
            }
            else if ((a.charAt(j)-'0')+(b.charAt(i)-'0')+carry==2) {
                ans = "0"+ans;
                carry = 1;
            }
            else if ((a.charAt(j)-'0')+(b.charAt(i)-'0')+carry==1) {
                ans = "1"+ans;
                carry = 0;
            }
            else {
                ans = "0"+ans;
                carry = 0;
            }
        }
        while (j>=0) {
            if ((a.charAt(j)-'0')+carry==2) {
                ans = "0"+ans;
                carry = 1;
            }
            else if ((a.charAt(j)-'0')+carry==1) {
                ans = "1"+ans;
                carry = 0;
            }
            else {
                ans = "0"+ans;
                carry = 0;
            }
            j--;
        }
        if (carry==1) {
            return "1"+ans;
        }
        return ans;        
    }
}
