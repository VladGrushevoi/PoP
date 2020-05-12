package FifthLaba;

public class ExpCalc implements Runnable {
    private boolean isDone = false;
    private double result;
    private char opCode;
    private double op2 = Double.POSITIVE_INFINITY;
    private double op1 = Double.POSITIVE_INFINITY;
    public ExpCalc(ExpCalc calcToWaitFor, char opCode, double op2) {
        this.op1 = calcToWaitFor.getResult();
        this.op2 = op2;
        this.opCode = opCode;
        new Thread(this).start();
    }
    public ExpCalc(double op1, char opCode, ExpCalc calcToWaitFor) {
        this.op1 = op1;
        this.op2 = calcToWaitFor.getResult();;
        this.opCode = opCode;
        new Thread(this).start();
    }
    public ExpCalc(double op1, char opCode, double op2) {
        this.op1 = op1;
        this.op2 = op2;
        this.opCode = opCode;
        new Thread(this).start();
    }
    public ExpCalc(ExpCalc calcToWaitFor1, char opCode, ExpCalc calcToWaitFor2){
        this.op1 = calcToWaitFor1.getResult();
        this.op2 = calcToWaitFor2.getResult();
        this.opCode = opCode;
        new Thread(this).start();
    }
    public synchronized void run() {
        switch (opCode) {
            case '+':
                result = op1 + op2; break;
            case '-':
                result = op1 - op2; break;
            case '*':
                result = op1 * op2; break;
            case '/':
                result = op1 / op2; break;
        }
        isDone = true;
        notifyAll();
    }
    public synchronized double getResult() {
        while (!isDone) {
            try {
                wait(1);
            } catch (InterruptedException e) {}
        }
        return result;
    }
}
