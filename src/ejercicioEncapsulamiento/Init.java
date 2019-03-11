package ejercicioEncapsulamiento;

class Usuario {
    public Usuario(String nombre, String apellido) {
        this.id = java.util.UUID.randomUUID().toString();
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    public String toString() {
        return id + " >> " + nombre + " " + apellido;
    }
    public final String id;
    public final String nombre;
    public final String apellido;
}

class PlanAhorro {
    private TxtStore txtStore;
    private SQLStore sqlStore;

    public PlanAhorro(TxtStore txtStore, SQLStore sqlStore) {
        this.txtStore = txtStore;
        this.sqlStore = sqlStore;
    }
    public void suscribir(Usuario usu) {
        txtStore.almacenarSuscripcion(usu);
        sqlStore.almacenarSuscripcion(usu);
    }
}

class TxtStore {
    public void almacenarSuscripcion(Usuario usu) {
        System.out.println(usu);
    }
}
class SQLStore {
    public void almacenarSuscripcion(Usuario usu) {
        System.out.println(usu);
    }
}


public class Init {
    public static void main(String[] args) {
        Usuario u = new Usuario("Jorge", "Aguilar");
        PlanAhorro plan = new PlanAhorro(
                new TxtStore(),
                new SQLStore()
        );
        plan.suscribir(u);
    }
}
