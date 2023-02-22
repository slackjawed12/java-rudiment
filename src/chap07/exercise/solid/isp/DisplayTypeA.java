package chap07.exercise.solid.isp;

public class DisplayTypeA extends Calculator implements DisplayResult {
    @Override
    public void displayResult(AbstractOperation operation, int firstNumber, int secondNumber) {
        int answer = calculate(operation, firstNumber, secondNumber);
        System.out.println(answer);
    }
}
