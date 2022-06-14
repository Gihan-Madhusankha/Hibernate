package entity;

import com.sun.xml.internal.messaging.saaj.packaging.mime.util.LineInputStream;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;


@Entity
public class Customer {
    @Id
    private String cusId;
    private String cusName;
    private String address;

    @OneToMany(mappedBy = "customer")
    private List<Orders> orList;

    public Customer() {
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
}
