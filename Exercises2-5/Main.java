package homework_2;

import java.math.BigInteger;

/**
 *
 * @author mgechev
 */
public class Main {

    /**
     * @param args the command line arguments
     */

    //sum of all numbers till n
    public static int sumOfAllNumbersTillN(int n) { //exercise 0
        int sum = (n + 1)*(n/2);
        return sum;
    }

    //the most "practical" function
    public static int sumOfAllNumbersDevidedBy3And5(int n) { //exercise 1
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    //factoriel
    public static BigInteger factoriel(int n) { //exercise 2
        if (n <= 0) {
            return BigInteger.valueOf(1);
        }
        BigInteger fact = BigInteger.valueOf(2);
        for (int i = 3; i <= n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }

    public static int lettersNumber() { //exercise 3
	int[] underTwenty = {4,3,3,5,4,4,3,5,5,4,3,6,6,8,8,7,7,9,8,8};
	int[] tenths = {6,6,5,5,5,7,6,6};
	int lettersUnderTen = 0;
	int lettersUnderTwenty = 0;
	int lettersUnderHundred = 0;
	int count = 0;
	for (int i=1;i<10;i++) {
		lettersUnderTen += underTwenty[i];	//All letters for 1...9
	}
	for (int i=10;i<20;i++) {
		lettersUnderTwenty += underTwenty[i];	//All letters for 10...19
	}
	lettersUnderTwenty += lettersUnderTen;	//All letters for 1...19
	lettersUnderHundred += 8 * lettersUnderTen;		//8*(Letters count for 1...9) (we have 20,30,40,...,90 - 8)
	lettersUnderHundred += lettersUnderTwenty;
	for (int i=0;i<8;i++) {
		lettersUnderHundred += 10 * tenths[i];
	}
	count = 10 * lettersUnderHundred + 100 * lettersUnderTen + 900 * 7 + 99 * 9 * 3 + 3 + 8;
	int[] underTwenty= {4,3,3,5,4,4,3,5,5,4,3,6,6,8,8,7,7,9,8,8};
	int[] tenths={6,6,5,5,5,7,6,6};
	int lettersUnderTen=0;
	int lettersUnderTwenty=0;
	int lettersUnderHundred=0;
	int count=0;
	for (int i=1;i<10;i++) {
		lettersUnderTen+=underTwenty[i];	//All letters for 1...9
	}
	for (int i=10;i<20;i++) {
		lettersUnderTwenty+=underTwenty[i];	//All letters for 10...19
	}
	lettersUnderTwenty+=lettersUnderTen;	//All letters for 1...19
	lettersUnderHundred+=8*lettersUnderTen;		//8*(Letters count for 1...9) (we have 20,30,40,...,90 - 8)
	lettersUnderHundred+=lettersUnderTwenty;
	for (int i=0;i<8;i++) {
		lettersUnderHundred+=10*tenths[i];
	}
	count=10*lettersUnderHundred+100*lettersUnderTen+900*7+99*9*3+3+8;
        return count;
    }
    
    public static void main(String[] args) {
        System.out.println("The sum of all numbers till 1000 is " + sumOfAllNumbersTillN(1000) + ".");
        System.out.println("The sum of all numbers under 1000 which can be devided by 3 and 5 is " + sumOfAllNumbersDevidedBy3And5(1000) + ".");
        System.out.println("100! = " + factoriel(100) + ".");
        System.out.println("10! = " + factoriel(100) + ".");
        System.out.println("All numbers from one to 1000 could be written with " + lettersNumber()  + " characters.");
    }
}