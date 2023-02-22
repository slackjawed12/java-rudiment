package chap07.exercise.solid.isp;

public class DisplayTypeB extends Calculator implements DisplayWithOperator{
    @Override
    public void displayResultWithOperator(AbstractOperation operation, int firstNumber, int secondNumber) {
        int answer = calculate(operation, firstNumber, secondNumber);
        String operator = operation.getOperator();
        System.out.println(firstNumber + " " + operator + " " + secondNumber + " = " + answer);
    }
}
