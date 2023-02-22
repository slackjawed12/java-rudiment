package chap07.exercise.solid.lsp;

public class AddOperation extends AbstractOperation {
    public int operate(int x, int y) {
        return x + y;
    }

    public boolean isInvalid(int x, int y) {
        return false;
    }
}
