
package day8;
public class Check_English {
    //create method check Message
    public static boolean isEanglish(String text) {
        if(text.matches("[a-zA-Z]+")){
            return true;
        }else{
            return false;
            
        }  
    }
    
}
