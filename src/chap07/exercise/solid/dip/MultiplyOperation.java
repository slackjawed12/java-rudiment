package chap07.exercise.solid.dip;

public class MultiplyOperation extends AbstractOperation {
    @Override
    public int operate(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
}
