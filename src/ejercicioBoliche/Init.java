package ejercicioBoliche;

class Hombre {
    private String nombre;

    public Hombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void proponeLlamado(Mujer m) {
        m.hacerPropuesta(this);
    }
    public void recibeLlamado(Mujer m) {
        System.out.println("Soy: " + nombre + " Me llamo!!! " +  m.getNombre());
    }
}

class Mujer {
    private String nombre;
    private Hombre __hombre;

    public Mujer(String nombre) {
        this.nombre = nombre;
    }
    public void hacerPropuesta(Hombre h) {
        __hombre = h;
    }
    public void realizarLlamado() {
        __hombre.recibeLlamado(this);
    }

    public String getNombre() {
        return nombre;
    }
}


public class Init {
    public static void main(String[] args) {
        Hombre peter = new Hombre("Peter");
        Mujer gabriela = new Mujer("Gabriela");
        Hombre josesito = new Hombre("Josesito");
        
        peter.proponeLlamado(gabriela);
        josesito.proponeLlamado(gabriela);
        gabriela.realizarLlamado();
    }
}
