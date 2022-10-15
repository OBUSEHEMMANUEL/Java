package complexNumbers;



public class ComplexNumberMain {



  static   ComplexNumber complexNumber = new ComplexNumber(4,4);

    public static void main(String[] args) {
    bothMethods(3,7);

    }
    public static void bothMethods(float realPart, float imaginaryPart) {
            addNumbers(realPart,imaginaryPart);
            subtractNumbers(realPart,imaginaryPart);

    }
    public static void addNumbers(float realPart, float imaginaryPart) {

        float real = complexNumber.getRealPart() + realPart;
        float imaginary = complexNumber.getImaginaryPart() + imaginaryPart;
        System.out.println("Added Numbers = "+real+ " + " + imaginary+"i");
    }
    public static void subtractNumbers(float realPart, float imaginaryPart) {

        float real = complexNumber.getRealPart() - realPart;
        float imaginary = complexNumber.getImaginaryPart() - imaginaryPart;
        float imaginaryConvert = -1 * imaginary;
        if (imaginary < 0) System.out.println("Subtracted Numbers = "+real + " - " + imaginaryConvert+"i");
        else System.out.println("Subtracted Numbers = "+real+ " + " + imaginary+"i");
    }
}

