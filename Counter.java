public class Counter implements AutoCloseable {

    private int count = 0;
    private boolean isClosed = false;
    private boolean inTryWithResorces = true;

    public Counter () {

    }

    public void add() throws Exception {
        if (!inTryWithResorces) {
            throw new Exception("Объект должен находится внутри ресурса");
        }
        this.count++;
    }

    public int getCount() {
        return count;
    }

    @Override
    public void close() throws Exception {
        if (!isClosed) {
            throw new Exception("Ресурс закрыт!");
        }
        this.isClosed = true;
    }
}
