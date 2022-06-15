package entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class OrderDetail {
    @Id
    private String or_detailsId;
    private int qty;

    @ManyToOne
//    @JoinColumn(name = "order_id")
    private Orders orders;

    @ManyToOne
//    @JoinColumn(name = "item_code")
    private Item item;

    public OrderDetail() {
    }

    public OrderDetail(String or_detailsId, int qty, Orders orders, Item item) {
        this.or_detailsId = or_detailsId;
        this.qty = qty;
        this.orders = orders;
        this.item = item;
    }

    public String getOr_detailsId() {
        return or_detailsId;
    }

    public void setOr_detailsId(String or_detailsId) {
        this.or_detailsId = or_detailsId;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "or_detailsId='" + or_detailsId + '\'' +
                ", qty=" + qty +
                ", orders=" + orders +
                ", item=" + item +
                '}';
    }

}
