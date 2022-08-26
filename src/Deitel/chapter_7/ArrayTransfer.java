package Deitel.chapter_7;

public class ArrayTransfer {
    public static void main(String[] args) {
        arrayTest();

    }
    static void arrayTest(){
        int [] a = {11,21,3,4,7,8,10,19,18,24,57};
        int b [] = new int[34];
        for (int i = 0; i< 11; i++){
            System.out.print(b[i]);
        }
        System.arraycopy(a,0,b,5,11);
        for (int i = 0; i< a.length; i++){
            System.out.printf("%n%d,%d %n",a[i] ,b[i]);
        }
    }
}
