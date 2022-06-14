import entity.Customer;
import entity.Item;
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
        c2.setCusName("Kamal");
        c2.setAddress("Panadura");

        Item i1 = new Item();
        i1.setCode("i001");
        i1.setDescription("Milk");
        i1.setUnitPrice(300);
        i1.setQtyOnHand(36);

        Item i2 = new Item();
        i2.setCode("i002");
        i2.setDescription("Cookie");
        i2.setUnitPrice(420);
        i2.setQtyOnHand(25);

        Session session = FactoryConfiguration.getFactoryConfiguration().getSession();
        Transaction transaction = session.beginTransaction();

        /*saveCustomer*/
        session.save(c1);
        session.save(c2);

        /*save item*/
        session.save(i1);
        session.save(i2);

        transaction.commit();
        session.close();

    }
}
