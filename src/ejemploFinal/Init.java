package ejemploFinal;

class A {
    public final int a = 10;
    public final void saludar() {
        System.out.println("HOLA");
    }
}

final class B extends A {
    // no compila
    /*
    public void saludar() {
    }
    */
}


// NO PERMITE LA HERENCIA
/*
class C extends B {
    
}
*/

public class Init {
    public static void main(String[] args) {
        // no compila porque es una constante
        // new A().a = 10;
        new B().saludar();
    }
}
