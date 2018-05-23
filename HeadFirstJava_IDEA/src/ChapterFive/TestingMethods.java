package ChapterFive;

public class TestingMethods {
    int i = 1;

    public static void main(String[] args) {
        TestingMethods ts = new TestingMethods();
        ts.go();
        ts.go1();
        ts.go2();
        ts.go3(1);
        ts.go4(5,6);
        System.out.println(ts.go4(5,6));
        System.out.println(ts.go5(9,2));

    }

    public void go(){
        System.out.println("I'm inside Go");
        go1();
    }

    public void go1(){
        System.out.println("I'm inside Go");
    }

    public void go2(){
        System.out.println("I'm inside Go");
    }
    public int go3(int b) {
        int someName = 0;
        someName += b;
        System.out.println(someName);
        return someName;
    }
    public int go4(int c, int d){
        int e = 0;
        e = c+d;
        //System.out.println(e);
        return e;
    }
    public double go5(double x, double y){
        double z = x / y;
        return z;
    }
}

