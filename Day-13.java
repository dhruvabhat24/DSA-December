class Solution {
    public boolean isHappy(int n) {
        int sum = n;//GIVE VALUE TO SUM
        while (sum != 1 && sum!=4 ) {
            int temp = sum;//THEN TEMP
            sum = 0;
            while (temp != 0 ) {
                int digit = temp % 10;
                sum += digit * digit;//ADDING VALUES
                temp =temp/ 10;
            }
        }
        return sum == 1;
    }
}
