class Solution {
public boolean backspaceCompare(String s, String t) {

    int i = s.length() -1;
    int j = t.length() -1;
    while(i>= 0 || j >= 0){
     if((i >= 0 && s.charAt(i) == '#') || (j >= 0 && t.charAt(j) == '#'))
     {
         if(i >= 0 && s.charAt(i) == '#'){
           int backCount = 2;
           while(backCount > 0){
               i--;
               backCount--;
               if(i >= 0 && s.charAt(i) == '#'){
                 backCount+= 2;   
               }    
           }
         } 
         if(j >= 0 && t.charAt(j) == '#'){
            int backCount = 2;
            while(backCount > 0){
               j--;
               backCount--;
               if(j >= 0 && t.charAt(j) == '#'){
                 backCount+= 2;   
               }    
           } 
     }
    }
    else{
        if(i < 0 || j < 0){
            return false;
        }
        if(s.charAt(i) != t.charAt(j)) {
            return false;
        } else {
            i--;
            j--;
        }
    }
}
return true;

}
}
