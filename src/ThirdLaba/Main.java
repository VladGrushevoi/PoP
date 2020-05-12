package ThirdLaba;

public class Main {

    public static void main(String args[]) {
        Callme target = new Callme();
        double x = 0;
        for (int j = 1; j <= 100; j++) {
            new Caller(target, x);
            x = x + 0.001;
            new Caller(target, x);
            x = x + 0.001;
            new Caller(target, x);
            x = x + 0.001;
            new Caller(target, x);
            x = x + 0.001;
            new Caller(target, x);
            x = x + 0.001;
            new Caller(target, x);
            x = x + 0.001;
            new Caller(target, x);
            x = x + 0.001;
            new Caller(target, x);
            x = x + 0.001;
            new Caller(target, x);
            x = x + 0.001;
            new Caller(target, x);
            x = x + 0.001;

        }
    }
}
