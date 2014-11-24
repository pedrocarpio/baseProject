package pe.scytl.app.controller.wrapper;

/**
 * Created by robertoespinoza on 24/11/14.
 */
public class Paging {

    private int limit;
    private int offset;
    private int count;
    private int size;

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
