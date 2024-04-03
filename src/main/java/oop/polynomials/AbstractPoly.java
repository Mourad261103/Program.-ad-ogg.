package oop.polynomials;

import java.util.Arrays;

abstract public class AbstractPoly implements Poly {

double[] coeff;

   public AbstractPoly(double[] coeff) {
      this.coeff = coeff;
   }


   @Override
   public boolean equals(Object o) {
      if (o == null) {
         return false;
      }

      if (!(o instanceof Poly p)) { //con questo vedo o come poly
         return false;
      }
      if (degree() != p.degree()) {
         return false;
      }
      for (int i = 0; i <= degree(); i++) {
         if (coefficient(i) != p.coefficient(i)) {
            return false;
         }
      }
      return true;
   }

   @Override
   public int hashCode() {
      return Arrays.hashCode(coeff);
   }

   @Override
   public String toString() {
      return "AbstractPoly{" +
              "coeff=" + Arrays.toString(coeff) +
              '}';
   }
}
