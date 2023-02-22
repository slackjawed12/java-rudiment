package chap07.exercise.solid.lsp;

/**
 * SRP 위반
 */
public class Calculator {
    // 연산 기능을 추상화된 부모클래스에 의존하여 처리한다.
    public int calculate(AbstractOperation operation, int firstNumber, int secondNumber) {
        if (operation.isInvalid(firstNumber, secondNumber)){
            System.out.println("유효하지 않은 계산");
            return -999999;
        }
        return operation.operate(firstNumber, secondNumber);
    }
}
