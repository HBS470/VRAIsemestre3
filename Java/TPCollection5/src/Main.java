import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
//        ArrayList<Integer> l= new ArrayList<>();
//        l .add(1);
//        l .add(3);
//        l .add(4);
//        l .add(6);
//
//        Iterator<Integer> z2 = l.iterator ();
//        int sommePairs2 = 0;
//        while (z2.hasNext()) {
//            int n = z2.next();
//            if (n % 2 == 0) sommePairs2 += n;
//        }
//        System.out.println("sommePairs: " + sommePairs2);
//        System.out.println("∗∗∗∗∗∗∗∗ ");
//        while (z2.hasNext()) {
//            int n = z2.next();
//            System.out.println(n);
//        }
//        System.out.println("∗∗∗∗∗∗∗∗ ");

        Collection<Integer> ll = new HashSet<>();
        ll .add(1);
        ll .add(3);
        ll .add(4);
        ll .add(6);
        System.out.println( ll );
        for (Integer n : ll ) {
            if (n % 2 == 0) ll.remove(n);
        }
        System.out.println("ll : " + ll );
    }
}
