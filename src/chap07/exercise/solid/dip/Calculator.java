package chap07.exercise.solid.dip;

/**
 * DIP 위반
 */
public class Calculator {
    private AbstractOperation operation;

    public Calculator () {}

    public Calculator(AbstractOperation operation){
        this.operation = operation;
    }

    public int calculate(String operator, int firstNumber, int secondNumber) {
        try{
            operation = OperationMaker.getOperation(operator);
            return operation.operate(firstNumber, secondNumber);   
        } catch (NullPointerException e) {
            System.out.println("연산자를 정확히 입력해 주십시오");
            return -9999;
        }
    }
}
