package bol11_4;
/**
 *
 * @author jalvarezbarciela
 */
public class ComplexNumber {
    private double imaginario;
    private double real;
    public static final ComplexNumber ZERO=new ComplexNumber(0,0);

    public ComplexNumber(double imaginario, double real) {
        this.imaginario = imaginario;
        this.real = real;
    }

    public double getImaginario() {
        return imaginario;
    }

    public double getReal() {
        return real;
    }
    
    public ComplexNumber add(ComplexNumber c){
        ComplexNumber resultado =  new ComplexNumber ( this.real  + c.getReal( ),this.imaginario+c.getImaginario()) ;
        return resultado ;        
    }
    
    public String toString() {
        return "imaginario=" + imaginario + ", real=" + real;
    }
    
    
}
