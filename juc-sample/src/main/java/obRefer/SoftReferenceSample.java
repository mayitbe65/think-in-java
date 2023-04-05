package obRefer;


import java.lang.ref.SoftReference;
import java.util.concurrent.TimeUnit;

/**
 * 软引用
 * 内存不足，gc进行回收
 * -Xms20m -Xmx20m
 */
public class SoftReferenceSample {


    public static void main(String[] args) {

        SoftReference<byte[]> softReference = new SoftReference<>(new byte[1024 * 1024 * 10]);

        System.out.println(softReference.get());

        System.gc();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(softReference.get());

        byte[] b = new byte[1024 * 1024 * 15];

        System.out.println(softReference.get());

    }
}
