package zadania.ex5;

import java.util.HashSet;

public class SDAHashSet<E> extends HashSet<E> {

    @Override
    public boolean add(E e) {
        boolean result = super.add(e);
        System.out.println("add for SDA");
        return result;
    }
}
