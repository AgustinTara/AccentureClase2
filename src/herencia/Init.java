package herencia;

class A {
    public void saludar() {
        System.out.println("Saludo desde A");
    }
}

class B extends A {
    public void saludar() {
        System.out.println("Saludo desde B");
    }
}

class C extends B {
    public void saludar() {
        System.out.println("Saludo desde C");
    }
}

public class Init {
    public static void main(String[] args) {
        A a = new A();
        Object o = a;
        a = null;
        // String a2 = (String)o;
        System.out.println(o.getClass().toString());
    }
}
