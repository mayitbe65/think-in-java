package obRefer;

public class Recycle {

    @Override
    protected void finalize() throws Throwable {
        System.out.println("object finalize");
        super.finalize();
    }
}
