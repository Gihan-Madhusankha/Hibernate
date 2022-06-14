package entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Orders {
    @Id
    private String orId;
    private LocalDate date;

    @ManyToOne
    private Customer customer;
    @ManyToMany
    private List<Item> itemList = new ArrayList<>();

    public Orders() {
    }

    public Orders(String orId, LocalDate date, Customer customer) {
        this.orId = orId;
        this.date = date;
        this.customer = customer;
    }

    public Orders(String orId, LocalDate date, Customer customer, List<Item> itemList) {
        this.orId = orId;
        this.date = date;
        this.customer = customer;
        this.itemList = itemList;
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

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }
}
