package oop.polynomials;

import java.util.ArrayList;

public class ListPoly extends AbstractPoly{

    ArrayList<Double> coefficients;

    public ListPoly(double[] coeff) {
        super(coeff);
        ArrayList<Double> l=new ArrayList<>();
        for (int i = 0; i < coeff.length; i++)
        {
            l.add(coeff[i]);
        }
        this.coefficients = l;
    }

    @Override
    public double coefficient(int grade) {
        return coefficients.get(grade);
    }

    @Override
    public double[] coefficients() {
        double[] coef=new double[coefficients.size()];
        for (int i = 0; i < coefficients.size(); i++) {
            coef[i]=coefficients.get(i);
        }
        return coef ;
    }

    @Override
    public int degree() {
        return coefficients.size()-1;
    }

    @Override
    public Poly derivative() {
        double[] cder= new double[coefficients.size()-1];
        double[] coef=coefficients();
        for (int i = 0; i < coef.length-1; i++)
        {
            cder[i]=coef[i+1]*(i+1);
        }
        Poly pder = new ArrayPoly(cder);
        return pder;
    }


}
