package clasesabstractas;

abstract class Storage {
    public abstract void store(String s);
}

class SQLStorage extends Storage {
    public void store(String s) {
        System.out.println("Graba en SQL:" + s);
    }
}
class TxtStorage extends Storage {
    public void store(String s) {
        System.out.println("Graba en Txt:" + s);
    }
}

public class Init {
    public static void grabaTodo(Storage[] todosLosStorages) {
        int x = 100;
        for (Storage s : todosLosStorages) {
            s.store(String.valueOf(x++));
        }
    }
    public static void main(String[] args) {
        Storage[] storages = new Storage[] {
            new SQLStorage(),
            new SQLStorage(),
            new SQLStorage(),
            new TxtStorage(),
            new SQLStorage(),
            new TxtStorage(),
            new TxtStorage(),
            new TxtStorage(),
            new SQLStorage(),
            new TxtStorage()
        };
        grabaTodo(storages);
    }
}
