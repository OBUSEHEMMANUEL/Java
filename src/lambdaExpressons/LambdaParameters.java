package lambdaExpressons;

interface Addable{
    int addition(int a, int b);
}

class AddableImpl implements Addable{

    @Override
    public int addition(int a, int b) {
        return a+b;
    }
}


public class LambdaParameters {
    public static void main(String[] args) {
        Addable addition =(a,b)->  ( a+b );
        System.out.println(addition.addition(10, 20));
    }

}
