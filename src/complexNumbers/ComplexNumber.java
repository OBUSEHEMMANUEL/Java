package complexNumbers;

import java.nio.file.attribute.FileAttribute;

public class ComplexNumber {
    private float realPart;
    private float imaginaryPart;

    public ComplexNumber() {
    }

    public ComplexNumber(float realPart, float imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart =imaginaryPart;

    }

    public float getRealPart() {
        return realPart;
    }

    public void setRealPart(float realPart) {
        this.realPart = realPart;
    }

    public float getImaginaryPart() {
        return imaginaryPart;
    }

    public void setImaginaryPart(float imaginaryPart) {
        this.imaginaryPart =  imaginaryPart;
    }
}
