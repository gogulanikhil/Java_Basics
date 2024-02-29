package interfacevsabstract;


abstract class a{
    void method1(){
        System.out.println("hello");
    }

    void method4() {
        System.out.println("method 4 in a class");
    }

    abstract void method2();
    static void method3(){
        System.out.println("static method");
    }
}
class b extends a{
    @Override
    void method2() {
        System.out.println("in child class b");
    }

    static void method3(){
        System.out.println("static method in child class");
    }
}
public class outputabstract {
    public static void main(String[] args) {
        b objb=new b();
        objb.method1();
        objb.method2();
        objb.method4();
    }
}