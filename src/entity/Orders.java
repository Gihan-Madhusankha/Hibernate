package entity;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Orders {
    @Id
    private String orId;
    @CreationTimestamp
    private LocalDate date;

    @ManyToOne
    private Customer customer;

//    @ManyToMany(mappedBy = "ordersList")
//    private List<Item> itemList = new ArrayList<>();

    @OneToMany(mappedBy = "orders", cascade = CascadeType.ALL)
    private List<OrderDetail> orderDetails = new ArrayList<>();

    public Orders() {
    }

    public Orders(String orId, LocalDate date, Customer customer, List<OrderDetail> orderDetails) {
        this.orId = orId;
        this.date = date;
        this.customer = customer;
        this.orderDetails = orderDetails;
    }

    public String getOrId() {
        return orId;
    }

    public void setOrId(String orId) {
        this.orId = orId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "orId='" + orId + '\'' +
                ", date=" + date +
                ", customer=" + customer +
                ", orderDetails=" + orderDetails +
                '}';
    }

}
