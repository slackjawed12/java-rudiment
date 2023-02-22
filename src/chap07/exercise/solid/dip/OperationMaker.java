package chap07.exercise.solid.dip;

public class OperationMaker {

    public static AbstractOperation getOperation(String op){
        switch (op){
            case "+":
                return new AddOperation();
            case "-":
                return new SubstractOperation();
            case "*":
                return new MultiplyOperation();
            case "/":
                return new DivideOperation();
            default:
                return null;
        }
    }
}
