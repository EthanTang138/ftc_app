package org.firstinspires.ftc.team6220;

/*
    Represents a one dimensional polynomial function.
*/

public class Polynomial
{
    //array of coefficients, ordered by increasing power.
    //e.g.  c[0] + c[1]x + c[2]x^2 +...
    private double[] coefficients;

    public Polynomial(double[] c)
    {
        coefficients = c;
    }

    public double getOuput(double input)
    {
        double sum = 0.0;
        int size = coefficients.length;

        for(int i = 0; i < size; i++)
        {
            sum += coefficients[i] * Math.pow(input,i);
        }
        return sum;
    }


}
