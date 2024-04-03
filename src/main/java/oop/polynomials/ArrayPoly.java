package oop.polynomials;

import java.lang.reflect.Array;

public class ArrayPoly extends AbstractPoly{

    double[] coefficients;

    public ArrayPoly(double[] coeff) {
        super(coeff);
        this.coefficients = coeff;
    }

    @Override
    public double coefficient(int grade) {
        return Array.getDouble(coefficients,grade);
    }

    @Override
    public double[] coefficients() {
        return coefficients;
    }

    @Override
    public int degree() {
        return coefficients.length-1;
    }

    @Override
    public Poly derivative() {
        double[] cder= new double[coefficients.length-1];
        for (int i = 0; i < coefficients.length-1; i++)
        {
            cder[i]=coefficients[i+1]*(i+1);
        }
        Poly pder = new ArrayPoly(cder);
        return pder;
    }


}
