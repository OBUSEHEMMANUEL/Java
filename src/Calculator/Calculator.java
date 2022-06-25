package Calculator;

public class Calculator {

    public int addTwoNumber(int one, int two) {

        int sum = one + two;
        System.out.println("the sum is " + sum );

        return sum;
    }

    public int substractTwoNumber(int one, int two) {

        int diff = one - two;
        System.out.println("the difference is " + diff);

        return diff;

    }

    public int divideTwoNumber(int one, int two) {

        int div = one / two;
        System.out.println("The result is " + div);
        return div;
    }
    public int multiplyTwoNumber(int one, int two) {

        int Ans = one * two;
        System.out.println("The result is " + Ans);
        return Ans;
    }
}