package obRefer;


import java.lang.ref.WeakReference;

/**
 * 弱引用
 * 弱引用遭到gc就会回收
 */
public class WeakReferenceSample {

    public static void main(String[] args) {
        WeakReference<Recycle> m = new WeakReference<>(new Recycle());

        System.out.println(m.get());

        System.gc();

        System.out.println(m.get());

//        ThreadLocal<Recycle> tl = new ThreadLocal<>();
//        tl.set(new Recycle());
//        tl.remove();
    }
}
