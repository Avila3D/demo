/**
 * @author Antonio Avila
 */

public class CalculatorService {


    // constructor

    public CalculatorService() {

    }

    // methods


    public double add(double num1, double num2) { // adds two numbers

        double addResult = num1 + num2;
        return addResult;
    }

    public double subtract(double num1, double num2) { // subtracts two numbers

        double subtractResult = num1 - num2;
        return subtractResult;
    }

    public double multiply(double num1, double num2) { // multiplies two numbers

        double multiplyResult = num1 * num2;
        return multiplyResult;
    }

    public double divide(double num1, double num2) { // divides two numbers

        double divideResult = num1 / num2;
        return divideResult;
    }

}
