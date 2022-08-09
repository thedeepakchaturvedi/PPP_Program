class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;
        
        int sign = ((dividend >= 0) == (divisor >=0))?1:-1;
        
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        
        int res = 0;
        while(dividend - divisor >= 0)
        {
            int c = 0;
            while(dividend - (divisor << 1 << c) >= 0)
            {
                c++;
            }
            res += 1 << c;
            dividend -= divisor << c; 
        }

        return sign * res;
    }
}