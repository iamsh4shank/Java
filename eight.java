class Solution {
public boolean backspaceCompare(String S, String T) {
    int i = S.length()-1;
    int j = T.length()-1;
 
    while(i>=0 || j>=0){
        int countS=0;
        while(i>=0 && (countS>0 || S.charAt(i)=='#')){
            if(S.charAt(i)=='#'){
                countS++;
            }else{
                countS--;
            }
            i--;
        }
        int countT=0;
        while(j>=0 && (countT>0 || T.charAt(j)=='#')){
            if(T.charAt(j)=='#'){
                countT++;
            }else{
                countT--;
            }
 
            j--;
        }
        if(i>=0 && j>=0){
            if(S.charAt(i)!=T.charAt(j)){
                return false;
            }else{
                i--;
                j--;
            }
        }else{
            if(i>=0 || j>=0){
                return false;
            }
        }
    }
    return i<0 && j<0;
    }
}
