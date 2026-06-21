class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        boolean b=false;
        if(ineq.equals(">")&&eq.equals("=")){
            b=(n>=m);
        }else if(ineq.equals("<")&&eq.equals("=")){
            b=(n<=m);
        }else if(ineq.equals(">")&&eq.equals("!")){
            b=(n>m);
        }else if(ineq.equals("<")&&eq.equals("!")){
            b=(n<m);
        }
        return b?1:0;
    }
}