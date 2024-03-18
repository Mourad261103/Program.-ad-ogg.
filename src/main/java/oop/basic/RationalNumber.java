package oop.basic;

import java.util.Objects;

public class RationalNumber {
     int  denominator;

     int  numerator;


    public RationalNumber(int numerator, int denominator) {
        int mcm=greatestCommonDivisor(denominator,numerator);
        this.denominator = denominator/mcm;
        this.numerator = numerator/mcm;
    }

    static int greatestCommonDivisor(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);

        int rest = max % min;
        if (max % min == 0) {
            return min;
        } else {
            return greatestCommonDivisor(min, rest);
        }
    }

    static int leastCommonMultiple(int a, int b) {
        return Math.abs(a * b) / greatestCommonDivisor(a, b);
    }

    public int getNumerator()
    {
        return numerator;
    }

    public int getDenominator()
    {
        return denominator;
    }

    /**
     *
     * 2/3+4/6 = ((2*2)+4*1)/6
     */
    public RationalNumber add(RationalNumber o)
    {
        int curr=greatestCommonDivisor(denominator,o.numerator);
        int newd=leastCommonMultiple(denominator,o.denominator);
        int i=(newd/denominator)*numerator;
        int b=(newd/o.denominator)*o.numerator;
        int newn=i+b;
        return new RationalNumber(newn,newd);
    }

    public RationalNumber multiply(RationalNumber o)
    {
        int curr=greatestCommonDivisor(denominator,numerator);
        return new RationalNumber(o.numerator*numerator,o.denominator*denominator);
    }

    @Override
    public String toString() {
        return "RationalNumber{" +
                "denominator=" + denominator +
                ", numerator=" + numerator +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RationalNumber that = (RationalNumber) o;
        return denominator == that.denominator && numerator == that.numerator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(denominator, numerator);
    }
}


