class Solution {
    public int solution(int a, int b) {
        int a1= Integer.parseInt(""+a+b);
        return a1>=(2*a*b)?a1:(2*a*b);
    }
}