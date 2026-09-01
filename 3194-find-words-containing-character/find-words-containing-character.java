class Solution {
    public List<Integer> findWordsContaining(String[] w, char x) {
       List<Integer> r=new ArrayList();
       for(int i=0;i<w.length;i++){
        for(int j=0;j<w[i].length();j++){
            if(w[i].charAt(j)==x){
                r.add(i);
                break;
            }
        }
       } return r;
    }
}