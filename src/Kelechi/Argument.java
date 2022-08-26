package Kelechi;

public class Argument {

    public char function1(String name){
        return name.charAt(3);
    }
    public String letter(String l){
        String temp = " ";
        String[] alphabeth = {"A","B","C","D","E"};

        for(int i = 0; i < alphabeth.length; i++){
            if (alphabeth[i].equals(l)){
                temp=  alphabeth[i+1];
            }
        }
        return temp;
    }
}