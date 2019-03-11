package claseabstractametodoconcreto;

abstract class TxtStorage {
    public void store(String usuario) {
        this.onStore("Atencion se va a guardar: " + usuario);
        System.out.println("Voy a realizar la accion de store");        
        this.onStore("Se guardo satisfactoriamente: " + usuario);
    }
    public abstract void onStore(String mensaje);
}

class ImplementacionSimple extends TxtStorage {
    public void onStore(String usuario) {
    }
}

class ImplementacionSeria extends TxtStorage {
    public void onStore(String mensaje) {
        System.out.println(mensaje);
    }
}

public class Init {
    public static void main(String[] args) {
        TxtStorage t = new ImplementacionSeria();
        t.store("Anibal");
    }
}
