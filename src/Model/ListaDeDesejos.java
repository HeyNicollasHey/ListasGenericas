package Model;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class ListaDeDesejos<E> extends AbstractList<E> implements List<E> {
    ArrayList<E> lanchonete = new ArrayList<E>();

    @Override
    public E get(int index) {
        return (E) lanchonete.get(index);
    }

    @Override
    public boolean add(E e) {
        return lanchonete.add(e);
    }

    @Override
    public E remove(int index) {
        return (E) lanchonete.remove(index);
    }

    @Override
    public int size() {
        return lanchonete.size();
    }

    @Override
    public String toString() {
        return "Lanchonete: " + lanchonete;
    }
}
