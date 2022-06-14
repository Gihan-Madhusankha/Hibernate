import org.hibernate.Session;
import org.hibernate.Transaction;
import util.FactoryConfiguration;

/**
 * @author : Gihan Madhusankha
 * 2022-06-14 8:17 PM
 **/

public class AppInitializer {
    public static void main(String[] args) {

        Session session = FactoryConfiguration.getFactoryConfiguration().getSession();
        Transaction transaction = session.beginTransaction();



        transaction.commit();
        session.close();

    }
}
