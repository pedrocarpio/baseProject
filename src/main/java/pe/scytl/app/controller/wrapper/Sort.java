package pe.scytl.app.controller.wrapper;

/**
 * Created by robertoespinoza on 24/11/14.
 */
public class Sort {

    private String orderDirection;
    private String orderFieldName;

    public String getOrderDirection() {
        return orderDirection;
    }

    public void setOrderDirection(String orderDirection) {
        this.orderDirection = orderDirection;
    }

    public String getOrderFieldName() {
        return orderFieldName;
    }

    public void setOrderFieldName(String orderFieldName) {
        this.orderFieldName = orderFieldName;
    }
}
