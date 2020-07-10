/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorials;

/**
 *
 * @author User
 */
public class MathUtils {
    // -------------------------------------------------------------
    // Returns the factorial of the argument given
    // -------------------------------------------------------------
    public static int factorial(int n) throws IllegalArgumentException {
        if (n < 0) {
            throw new IllegalArgumentException("Value of n cannot be negative!");
        }

        if (n > 16) {
            throw new IllegalArgumentException("Value of n cannot be greater than 16!");
        }

        int fac = 1;
        for (int i = n; i > 0; i--)
            fac *= i;
        return fac;
    }
}
