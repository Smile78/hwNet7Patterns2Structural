package patterns.structural.homeWork.hw3AdapterCalc;


public class IntsCalculator implements Ints {

    //    protected final Calculator target;
    protected final Calculator c1;
//    Calculator  c1 = new Calculator();

    public IntsCalculator() {
        this.c1 = new Calculator();
    }


    @Override
    public int sum(int arg0, int arg1) {
        //считаем через target
        double x1 = c1.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.SUM)
                .result;
        return (int) x1;
    }


    @Override
    public int mult(int arg0, int arg1) {
        double x1 = c1.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.MULT)
                .result;
        return (int) x1;
    }

    @Override
    public int pow(int a, int b) {
        double x1 = c1.newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.POW)
                .result;
        return (int) x1;
    }


}
