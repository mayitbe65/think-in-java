package obRefer;

import java.io.IOException;


/**
 * 强引用
 * 对象没有引用时，gc进行回收
 */
public class NormalReferenceSample {

    public static void main(String[] args) throws IOException {
        Recycle recycle = new Recycle();

        //recycle = null;

        System.gc();

        // 阻塞当前线程
        System.in.read();
    }
}
