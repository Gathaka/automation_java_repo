package day2;

public class equationtwo {
	
	public int sum(int a,int b) {
    	int sumres = a+b;
        System.out.println("Sum of a plus b :"+sumres);
        return sumres;
    }

    public int sub(int c,int d) {
    	int subres = c-d;
        System.out.println("Sub of c minus d :"+subres);
        return subres;
    }
    

    public int mul(int e,int f) {
    	int mulres = e*f;
        System.out.println("product of e plus f :"+mulres);
        return mulres;
    }
    
    public int div(int g,int h) {
    	int divres = g/h;
        System.out.println("quotient of g plus h :"+divres);
        return divres;
    }
    //Equation  1 (((((10+2)+2)-2)*2)/2)
    public static void main(String args[]) {
    	int val2 =2, val1=10;
        equationtwo abc = new equationtwo();
        System.out.println("Day 2 Assignment 1 & 2 Results ");
        int a = abc.sum(val1,val2);
        int b = abc.sum(a,val2);
        int c = abc.sub(b,val2);
        int d = abc.mul(c,val2);
        int e = abc.div(d,val2);
        System.out.println("Result of the Equation 1 : " + e);
        //equation 2 (((((10*2)+2)-2)/2);
        int mul = abc.mul(val1,val2);
        int sum = abc.sum(mul,val2);
        int sub = abc.sub(sum,val2);
        int div = abc.div(sub,val2);
        System.out.println("Result of Equation 2 :" +div);

    }    
}

