package tiposAbtractos;

class Persona {
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public final String nombre;
    public final String apellido;
}

class UsuarioPlanDeAhorro {

    public UsuarioPlanDeAhorro(Persona persona, String idPlan) {
        this.persona = persona;
        this.idPlan = idPlan;
    }
    
    public final Persona persona;
    public final String idPlan;
}

public class Init {
    public static void main(String[] args) {
        new UsuarioPlanDeAhorro(new Persona("n","a"),"idPLan");
    }
}
