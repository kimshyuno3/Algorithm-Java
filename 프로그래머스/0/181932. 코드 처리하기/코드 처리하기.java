class Solution {
    public String solution(String code) {
        StringBuilder answer = new StringBuilder();
        int mode=0;
        for(int idx=0;idx<code.length();idx++){
            if(mode==0){
                if(code.charAt(idx)=='1'){
                    mode=1;
                }else{
                    if(idx%2==0){
                        answer.append(code.charAt(idx));
                    }
                }
            }else{
                if(code.charAt(idx)=='1'){
                    mode=0;
            }else{
                    if(idx%2==1){
                        answer.append(code.charAt(idx));
                    }
                }
        }
    }
         return answer.toString().isEmpty()?"EMPTY":answer.toString();
}
}