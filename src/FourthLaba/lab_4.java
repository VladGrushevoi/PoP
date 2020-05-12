package FourthLaba;

public class lab_4 {
    public static double temp=0;
    public static void main(String args[]) {
        TCalculator par1, par2, par3, par4, par5, par6,par7,par8;
        boolean l1=false;
        boolean l2=false;
        double A=1;
        double B=2;
        double C=3;

        par1 = new TCalculator(A,C,'+');
        while( !par1.end_flag ) {
            System.out.println("Now waiting par1.end_flag");
        }
        par2 = new TCalculator(par1.res,B,'-');
        while( !par2.end_flag)
            System.out.println("Now waiting par2.end_flag");

        par3 = new TCalculator(A,C,'-');
        while( !par3.end_flag)
            System.out.println("Now waiting par3.end_flag");

        par4 = new TCalculator(B,par3.res,'*');
        while( !par4.end_flag)
            System.out.println("Now waiting par4.end_flag");

        par5 = new TCalculator(par2.res,par4.res,'/');
        while( !par5.end_flag)
            System.out.println("Now waiting par5.end_flag");

        System.out.println("Library value (A+C-B/(B*(A-C))= " + (A+C-B)/(B*(A-C)));
        System.out.println("Result = "+par5.res);
    }
}
