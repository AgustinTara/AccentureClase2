package entorno;

public class Init {
    public static void main(String[] args) {
        /*
        for (String s : args) {
            System.out.println(s);
        }
        */
        
        /*
        System.out.println("La clave es: ");
        System.out.println(System.getProperty("clave"));
        */
        
        System.out.println("Las variables de entorno son: ");
        for (String k : System.getenv().keySet()) {
            System.out.println(k);
            System.out.println(System.getenv(k));
        }
    }
}
