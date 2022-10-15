import wsdl.Calculator;
import wsdl2.NumberConversion;

import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("calculator.getCalculatorSoap().add(1,2) = " + calculator.getCalculatorSoap().add(1, 2));

        NumberConversion numberConversion = new NumberConversion();
        System.out.println(numberConversion.getNumberConversionSoap().numberToDollars(BigDecimal.valueOf(154654225)));
    }
}
