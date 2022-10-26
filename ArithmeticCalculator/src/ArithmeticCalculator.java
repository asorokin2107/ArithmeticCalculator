public class ArithmeticCalculator {

    private int numOne;
    private int numTwo;

    public ArithmeticCalculator(int numOne, int numTwo) {
        this.numOne = numOne;
        this.numTwo = numTwo;
    }

    public void calculate(Operation operation) {
        if(operation == Operation.ADD) {
            System.out.println(numOne + numTwo);
        } else if (operation == Operation.SUBSTRACT) {
            System.out.println(numOne - numTwo);
        } else if (operation == Operation.MULTIPLY) {
            System.out.println(numOne * numTwo);

        }

    }


    }
