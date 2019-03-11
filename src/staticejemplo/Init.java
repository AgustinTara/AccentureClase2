package staticejemplo;

class A {
    static int variableuno = 2;
    int variabledos = 2;
    
    static void m1() {
        System.out.println("Metodo static m1");
    }
    void m2() {
        System.out.println("Metodo no static m2");
    }
}


public class Init {
    public static void main(String[] args) {
        A.m1();
        new A().m2();
        System.out.println(A.variableuno);
        A.variableuno++;
        System.out.println(A.variableuno);
        
        System.out.println(new A().variabledos);
        new A().variabledos++;
        System.out.println(new A().variabledos);
    }
}
