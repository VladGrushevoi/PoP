package secondlaba;

public class Callme {

    double SUM=Math.PI;;
    public synchronized void CS(double member) {
        SUM=SUM+member;
        System.out.println(" member : "+member+" Value : "+SUM);
        return;
    }


}
