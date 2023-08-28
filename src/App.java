import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import entity.StudentEntity;
import entity.embeded.StudentName;
import repository.StudentRepository;
import utill.SessionFactoryConfiguration;

public class App {
    public static void main(String[] args) throws Exception {
       StudentRepository sRepository = new StudentRepository();
       StudentEntity entity = new StudentEntity();
       entity.setNic("971333791V");
       StudentName studentName = new StudentName("Hiran", "Sasitha");
       entity.setName(studentName);
       List<String> mobiles = new ArrayList<>();
       mobiles.add("0764899374");
       mobiles.add("0714899373");
       entity.setMobiles(mobiles);
sRepository.saveStudent(entity);

    }
}
