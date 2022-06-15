import entity.Customer;
import entity.Item;
import entity.Orders;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.FactoryConfiguration;


public class AppInitializer {
    public static void main(String[] args) {

        Customer c1 = new Customer();
        c1.setCusId("C001");
        c1.setCusName("Amila");
        c1.setAddress("Galle");

        Customer c2 = new Customer();
        c2.setCusId("C002");
        c2.setCusName("Anil");
        c2.setAddress("Kandy");

        Item i1 = new Item();
        i1.setCode("i001");
        i1.setDescription("Cake");
        i1.setUnitPrice(370);
        i1.setQtyOnHand(40);

        Item i2 = new Item();
        i2.setCode("i002");
        i2.setDescription("Cookie");
        i2.setUnitPrice(420);
        i2.setQtyOnHand(25);

        Session session = FactoryConfiguration.getFactoryConfiguration().getSession();
        Transaction transaction = session.beginTransaction();

/*
        //saveCustomer
        session.save(c1);
        session.save(c2);

        //save item
        session.save(i1);
        session.save(i2);
*/

/*//update customer
        session.update(c2);

        //update item
        session.update(i1);*/

/*
        //get customer
        Customer c = session.get(Customer.class, "C001");
        System.out.println(c.getCusId() + " " + c.getCusName() + " " + c.getAddress());

        //get item
        Item i = session.get(Item.class, "I002");
        System.out.println(i.getCode() + " " + i.getDescription() + " " + i.getUnitPrice() + " " + i.getQtyOnHand());
*/

/*
        //delete customer
        Customer customer = session.get(Customer.class, "C002");
        session.delete(customer);

        //delete item
        Item item = session.get(Item.class, "I001");
        session.delete(item);
*/




        transaction.commit();
        session.close();

    }
}
