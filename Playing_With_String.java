package Recursion;

public class Playing_With_String {


    public static String Replacing(String str,char x,char y) {
        if (str.length() == 0){
            return str;
        }

        String output = Replacing(str.substring(1),x,y);
        if (str.charAt(0) == x){
            return y + output;
        }
        else{
            return str.charAt(0) + output;
        }
    }

    public static void main(String args[]){

        String str = "Iamagooon";
        //Replacing a by b

        System.out.println("Before updation: " + str);

        System.out.println("Updated String: " + Replacing(str,'a','b'));

    }
    
}
