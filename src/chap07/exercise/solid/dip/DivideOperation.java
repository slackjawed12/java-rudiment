package chap07.exercise.solid.dip;

public class DivideOperation extends AbstractOperation {

    @Override
    public int operate(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }
}
