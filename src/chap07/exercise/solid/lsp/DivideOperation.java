package chap07.exercise.solid.lsp;

public class DivideOperation extends AbstractOperation {

    @Override
    public int operate(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    @Override
    boolean isInvalid(int x, int y) {
        return y == 0;
    }
}
