package chap07.exercise.solid.isp;

public class SubtractOperation extends AbstractOperation{
    @Override
    public int operate(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    @Override
    public String getOperator() {
        return "-";
    }
}
