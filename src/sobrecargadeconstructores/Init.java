package sobrecargadeconstructores;

class A {
    public A() {
    }
    public A(int x) {
    }
    public A(String x) {
    }
}

class B {
    private B() {
    }
    public void mostrarNombre() {
        System.out.println("hola");
    }
    public static B inicializar() {
        return new B();
    }
}

public class Init {
    public static void main(String[] args) {        
        B.inicializar().mostrarNombre();
    }
}
