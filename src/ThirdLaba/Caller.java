package ThirdLaba;

class Caller implements Runnable {
    double member, h = 0.001;
    Callme target;

    public Caller(Callme target,double member){
        this.target = target;
        this.member = 0.001*(f(member)+f(member+0.001))/2;

        new Thread(this).start();
    }
    private double f(double x){
        return 2/(1+Math.pow(x,2));
    }

    public void run () {
        synchronized(target) {
            target.CS(this.member);
        }
    }
}
