/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package rational;

/**
 *
 * @author mgechev
 */

public class Rational
{
    private int numerator;
    private int denominator;

    //start property Numerator
    public void setNumerator(int n) {
        numerator = n;
    }

    public void setDenominator(int d) {
        if (d != 0) {
            denominator = d;
        } else {
            denominator = 1;
        }
    }

    public int getDenominator() {
        return denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    //Euclidius alcorithm for greatest common divisor
    private int AlgorithmOfEuclid(int x, int y)
    {
        //getting the greatest number
        int greatest = Math.max(x, y);
        //getting the lowest number
        int lowest = Math.min(x, y);
        //containing the previous result
        int prev = 0;
        //the first rest
        int firstRest = 0;
        //the second rest
        int secondRest = 0;
        int tmp = 0;
        //if the greatest number is dividing by
        //the lowest without a rest
        //the greatest common divisor is the lowest number
        if (greatest % lowest == 0)
        {
            return lowest;
        }
        secondRest = greatest % lowest;
        firstRest = lowest;
        //if i haven't found the result yet
        //i'm looping until i the rest is zero
        while (secondRest != 0)
        {
            prev = secondRest;
            tmp = firstRest % secondRest;
            firstRest = secondRest;
            secondRest = tmp;
        }
        return prev;
    }

    //default construct
    public Rational()
    {
        this(1, 1);
    }//end default construct definition

    //purpose construct
    public Rational(int a, int b)
    {
        if (a == 0) {
            numerator = 0;
            denominator = 1;
        } else {
            int divisor = AlgorithmOfEuclid(a, b);
            numerator = a / divisor;
            denominator = b / divisor;
        }
    }//end purpose construct

    //convert to a floating point number
    public double toFloatPointNumber()
    {
        return numerator / denominator;
    }//end of the definition

    //multiply to rational numbers
    public Rational Multiply(Rational number)
    {
        Rational result = new Rational();
        result.numerator = numerator*number.numerator;
        result.denominator = denominator * number.denominator;
        return Simplify(result);
    }//end of the definition

    //dividing to rational numbers
    public Rational Divide(Rational number)
    {
        Rational result = new Rational();
        result.numerator = numerator * number.denominator;
        result.denominator = denominator * number.numerator;
        return Simplify(result);
    }//end of the definition

    //converting to string any rational
    @Override
    public String toString()
    {
        String result;
        if (denominator == 1) {
            result = String.valueOf(numerator);
        }
        else {
            result = String.format(numerator + "/" + denominator);
        }
        return result;
    }//end of the definition

    private Rational Simplify(Rational toSimplify)
    {
        //variable for the greatest common divisor
        int greatestCommonDivisor = 0;
        //calculating the gratest common divisor
        greatestCommonDivisor = AlgorithmOfEuclid(toSimplify.numerator,
            toSimplify.denominator);
        toSimplify.denominator /= greatestCommonDivisor;
        toSimplify.numerator /= greatestCommonDivisor;
        if (toSimplify.numerator < 0 && toSimplify.denominator < 0) {
            toSimplify.numerator *= -1;
            toSimplify.denominator *= -1;
        } else if (toSimplify.denominator < 0 && toSimplify.numerator >= 0) {
            toSimplify.denominator *= -1;
            toSimplify.numerator *= -1;
        } else if (toSimplify.numerator == 0) {
            toSimplify.denominator = 1;
        }
        return toSimplify;
    }

    //for add and subtract in one function
    //i declarated this one with second parameter toAdd
    private Rational DoAction(Rational number, boolean toAdd)
    {
        //declarating the return result
        Rational result = new Rational();
        //a temporary variable
        int temp;
        result.numerator = numerator * number.denominator;
        temp = number.numerator * denominator;
        result.denominator = number.denominator * denominator;
        //add or subtract, depends of the parameter
        if (toAdd) {
            result.numerator += temp;
        }
        else {
            result.numerator -= temp;
        }
        return Simplify(result);
    }//end of the definition

    //for add a rational
    public Rational Add(Rational number)
    {
        return DoAction(number, true);
    }//end of the definition

    //to add an int
    public Rational Add(int number)
    {
        return DoAction(new Rational(number,1), true);
    }//end of the definition

    //for subtract
    public Rational Subtract(Rational number)
    {
        return DoAction(number, false);
    }//end of the definition

    public Rational Subtract(int number)
    {
        return DoAction(new Rational(number,1), false);
    }//end of the definition

}