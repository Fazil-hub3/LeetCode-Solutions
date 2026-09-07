class Solution {
    public int addDigits(int num) {

        while(num / 10 != 0){
            int dig1 = num%10;
            int dig2 = num/10;
            num = dig1 + dig2;
        }

        return num;
        
    }
}
