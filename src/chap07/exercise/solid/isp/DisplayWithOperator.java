package chap07.exercise.solid.isp;

public interface DisplayWithOperator extends Display{
    void displayResultWithOperator(AbstractOperation operation, int x, int y);
}
