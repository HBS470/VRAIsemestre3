package IterEnumEnonce;

import java.util.Enumeration;
import java.util.Iterator;

public class AdaptateurEnumeration<E> implements Iterator<E> {
    private Enumeration<E> enumeration;

    public AdaptateurEnumeration(Enumeration<E> enumeration) {
        this.enumeration = enumeration;
    }


    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public E next() {
        if(!hasNext()){
            System.out.println("Plus d'éléments");
        }
        return enumeration.nextElement();
    }
}
