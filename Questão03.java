import java.lang.invoke.ConstantCallSite;

public class Questão03 {
    
    private static final String String1 = null;
    private static final String String2 = null;

    public static void main(String[] args) throws Exception {
       
        Boolean Anagrama(String1, String2){

        
            ConstantCallSite string1Keys = Object.Keys(String1); 
            ConstantCallSite string2Keys = Object.Keys(String2);
            
        
            if (string1Keys.length != string2Keys.length) {
                return false;
            }
        
         
        
            for(let i = 0; i < string1Keys.length; i++){
        
        
               
        
        
                int value = string1Keys[i];
        
        
                Object[] a;
                if(a[value] != String2[value]){
        
        
                    return false;
                }
            }
                
        
            return true;
            
        }
}   }

 
