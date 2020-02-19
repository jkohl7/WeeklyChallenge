import java.math.BigDecimal;
import java.math.BigInteger;

public class Letters {
    public static void main(String[] args) {
        //Gets the value of the populations
        BigInteger Wis = BigInteger.valueOf(5726398);
        BigInteger Cal = BigInteger.valueOf(38041430);
        BigInteger Tex = BigInteger.valueOf(26059203);
        BigInteger math1 = BigInteger.valueOf(100);
        BigInteger math2 = BigInteger.valueOf(31);

        //multiplies the wisconsin population with the california population
        BigInteger wisToCal;
        wisToCal = Wis.multiply(Cal);
        //data is stored in wisToCal

        //Multiplies wisToCal with Tex
        BigInteger copies;
        copies = wisToCal.multiply(Tex);
        //Data is stored in copies

        System.out.println("The total number of copies needed: " + copies);

        BigInteger cost;
        cost = math1.divide(math2);

        BigInteger Postage = wisToCal.multiply(Tex);
        BigInteger Last = Postage.multiply(cost);

        System.out.println("The cost of all the copies would be $" + Last);
    }
}
