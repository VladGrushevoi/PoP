package FifthLaba;

public class Lab5 {
    public static void main (String[] args) throws InterruptedException {
        double A=1, B=2, C=3;

        ExpCalc n1 = new ExpCalc(A, '+', C);
        ExpCalc n2 = new ExpCalc(n1, '-', B);
        ExpCalc n3 = new ExpCalc(A, '-', C);
        ExpCalc n4 = new ExpCalc(B, '*', n3);
        ExpCalc n5 = new ExpCalc(n2, '/', n4);

        System.out.println("Result = "+n5.getResult());
        System.out.println("Library value (A+C-B/(B*(A-C))= " + (A+C-B)/(B*(A-C)));
    }
}
