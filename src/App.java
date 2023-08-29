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
        /*
         * * StudentEntity entity = new StudentEntity();
         * entity.setNic("981333791V");
         * StudentName studentName = new StudentName("Nimal", "Henarath");
         * entity.setName(studentName);
         * List<String> mobiles = new ArrayList<>();
         * mobiles.add("0756899374");
         * mobiles.add("0784899373");
         * entity.setMobiles(mobiles);
         * sRepository.saveStudent(entity);
         */

        StudentEntity studentEntity = sRepository.getStudent(2);
        System.out.println(studentEntity.toString());


        studentEntity.setNic("991333791V");
        studentEntity.getName().setFirstName("Saman");

          studentEntity = sRepository.getStudent(2);
        System.out.println(studentEntity.toString());


        sRepository.delete(studentEntity);



    }

    
}
