class Solution {
    public boolean lemonadeChange(int[] bills) {
        int n=bills.length;
        int s[]=new int[3];
        for(int i:bills){
            if(i==5){
                s[0]++;
            }else if(i==10){
                if(s[0]>0){
                    s[0]--;
                    s[1]++;
                }else{
                    return false;
                }
            }else{
                s[2]++;
                if(s[0]>0 && s[1]>0){
                    s[0]--;
                    s[1]--;
                }else if(s[0]>2){
                    s[0]=s[0]-3;
                }
                else{
                    return false;
                }
            }
        }return true;
    }
}