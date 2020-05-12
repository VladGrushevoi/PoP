package secondlaba;

public class Synchro {
    public static void main(String args[]) {
        double x = Math.pow(0.5, 2) - 1;
        Callme target = new Callme();
        new Caller(target, 1, x);
        new Caller(target, 2, x);
        new Caller(target, 3, x);
        new Caller(target, 4, x);
        new Caller(target, 5, x);
        new Caller(target, 6, x);
        new Caller(target, 7, x);
        new Caller(target, 8, x);
        new Caller(target, 9, x);
    }
}
