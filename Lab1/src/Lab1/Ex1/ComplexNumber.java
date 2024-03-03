package Lab1.Ex1;

public class ComplexNumber {
    int real;
    int imag;

    public ComplexNumber()
    {
        this.real = 0;
        this.imag = 0;
    }

    public ComplexNumber add(ComplexNumber n2)
    {
        ComplexNumber result = new ComplexNumber();
        result.real = this.real + n2.real;
        result.imag = this.imag + n2.imag;
        return result;
    }

    public ComplexNumber substract(ComplexNumber n2)
    {
        ComplexNumber result = new ComplexNumber();
        result.real = this.real - n2.real;
        result.imag = this.imag - n2.imag;
        return result;
    }

    public ComplexNumber multiply(ComplexNumber n2)
    {
        ComplexNumber result = new ComplexNumber();
        result.real = this.real* n2.real - this.imag*n2.imag;
        result.imag = this.real* n2.imag + this.imag*n2.real;
        return result;
    }

    public String toString()
    {
        if(this.imag>0)
            return(this.real + " + " + this.imag + "i");
        else return(this.real + " " + this.imag + "i");
    }
}
