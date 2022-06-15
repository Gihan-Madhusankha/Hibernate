package entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Customer {
    @Id
    private String cusId;
    private String cusName;
    private String address;

    @OneToMany(mappedBy = "customer")
    private List<Orders> orList = new ArrayList<>();

    public Customer() {
    }

    public Customer(String cusId, String cusName, String address, List<Orders> orList) {
        this.cusId = cusId;
        this.cusName = cusName;
        this.address = address;
        this.orList = orList;
    }

    public String getCusId() {
        return cusId;
    }

    public void setCusId(String cusId) {
        this.cusId = cusId;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Orders> getOrList() {
        return orList;
    }

    public void setOrList(List<Orders> orList) {
        this.orList = orList;
    }
}
