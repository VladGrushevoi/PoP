package secondlaba;

public class Caller implements Runnable {
    double member;
    Callme target;
    public Caller(Callme target, int n1, double member){
        this.member=member;
        this.target=target;
        for (int i=1; i<=n1; i++) {
            this.member=this.member * (((2*i+1)*(member*member)*(2*i)*(2*i+1))/((2*i-1)*(2*i+2)*(2*i+3)));
        }
        new Thread(this).start();
    }
    public void run() {
        target.CS(this.member);
    }
}

