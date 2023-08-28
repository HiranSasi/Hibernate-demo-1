import org.hibernate.Session;

import entity.StudentEntity;
import utill.SessionFactoryConfiguration;

public class App {
    public static void main(String[] args) throws Exception {
        Session session = SessionFactoryConfiguration.getInstance().getSession();
    }
}
