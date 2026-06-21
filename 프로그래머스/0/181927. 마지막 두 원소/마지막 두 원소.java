class Solution {
    public int[] solution(int[] num_list) {
        int len=num_list.length;
        int[] list=new int[len+1];
        for(int i=0;i<len;i++){
            list[i]=num_list[i];
        }
        if(num_list[len-1]>num_list[len-2]){
            list[len]=list[len-1]-list[len-2];
        }else{
            list[len]=list[len-1]*2;
        }
        return list;
    }
}