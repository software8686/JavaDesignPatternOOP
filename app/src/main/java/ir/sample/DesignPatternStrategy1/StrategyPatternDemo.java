package ir.sample.DesignPatternStrategy1;

public class StrategyPatternDemo
{
    public static void main(String[] args)
    {
        Context context = new Context(new OperationAdd());
        System.out.println("10+5=" + context.executeOperation(10, 5));

        context = new Context(new OperationSubtract());
        System.out.println("10-5=" + context.executeOperation(10, 5));

        context = new Context(new OperationMultiplication());
        System.out.println("10*5=" + context.executeOperation(10, 5));
    }

}
