package sobrecargademetodos;

class ejemploSobreCarga {
    public int suma(int x, int y) {
        return x + y;
    }
    public int suma(int x, int y, int z) {
        return x + y + z;
    }
}

public class Init {
    public static void main(String[] args) {
        ejemploSobreCarga ejemplo = new ejemploSobreCarga();
        System.out.println(ejemplo.suma(2,3));
        System.out.println(ejemplo.suma(10,20,30));
    }
}
