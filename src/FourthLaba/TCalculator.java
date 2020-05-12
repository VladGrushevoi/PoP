package FourthLaba;

public class TCalculator implements Runnable {
    double p1,p2;
    double res;
    boolean end_flag = false;
    char znak;
    public TCalculator(double p1,double p2, char znak) {
        this.p1 = p1;
        this.p2 = p2;
        this.znak = znak;
        new Thread(this).start();

    }
    public void run() {
        if( znak == '+')
            res = this.p1 + this.p2;
        else if( znak == '*')
            res = this.p1 * this.p2;
        else if(znak == '/')
            res = this.p1/this.p2;
        else if(znak == '-')
            res = this.p1 - this.p2;
        end_flag = true;
    }
}
