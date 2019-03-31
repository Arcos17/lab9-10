package lab7;

import lab6.Vegetables;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class MySet implements Set<Vegetables> {

    private static final int INITIAL_CAPACITY = 15;
    private Vegetables[] elements = new Vegetables[INITIAL_CAPACITY];
    private int size = 0;

    public MySet() {

    }

    public MySet(Vegetables vegetables) {
        add(vegetables);

    }

    public MySet(Collection<Vegetables> collection) {
        addAll(collection);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        Iterator<Vegetables> iterator = iterator();
        while (iterator.hasNext()) {
            if (o.equals(iterator.next())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<Vegetables> iterator() {
        return new Iterator<Vegetables>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < size;
            }

            @Override
            public String toString() {
                return "$classname{" + "index=" + index + '}';
            }

            @Override
            public Vegetables next() {
                return elements[index++];
            }
        };
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Vegetables vegetables) {
        if (size() == INITIAL_CAPACITY) {
            Vegetables[] element = new Vegetables[(int) Math.round(INITIAL_CAPACITY * 1.3)];
            System.arraycopy(elements, 0, element, 0, size());
            element[size++] = vegetables;
            elements = element;
        }
        if (size() < INITIAL_CAPACITY) {
            elements[size++] = vegetables;
        }
        return true;
    }

    @Override
    public boolean remove(Object o) {
        for (int i = 0; i < elements.length; i++) {
            if (o.equals(elements[i])) {
                for (int j = i; j < elements.length - 1; j++) {
                    elements[j] = elements[j + 1];
                }

                size--;

            }

        }
        return true;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        if (c.equals(elements)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Vegetables> c) {
        Iterator<? extends Vegetables> iterator = c.iterator();
        while (iterator.hasNext()) {
            add(iterator.next());
        }
        return true;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }
}
