public class Arithmetic {
    // TODO: replace this an assignment to a lambda expression that returns the result the test needs
    private ArithmeticOperation lambdaAsInstanceVariable = Constant.REPLACE_WITH_LAMBDA;

    public int callLambdaAsInstanceVariable(int a, int b) {
        return lambdaAsInstanceVariable.operate(a, b);
    }

    public ArithmeticOperation createSumAndDivider(int divisor) {
        // TODO: return a lambda that sums the two arguments and divides by divisor
        return Constant.REPLACE_WITH_LAMBDA;
    }

    public int calculateResult(int a, int b) {
        // TODO: pass a lambda as a parameter that returns the result the test needs
        return internalCalculation(Constant.REPLACE_WITH_LAMBDA, a, b);
    }

    private int internalCalculation(ArithmeticOperation operation, int a, int b) {
        // TODO: call the operation
        return 0;
    }




}
