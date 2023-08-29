package repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import entity.StudentEntity;
import utill.SessionFactoryConfiguration;

public class StudentRepository {
    Session session = SessionFactoryConfiguration.getInstance().getSession();

    public Integer saveStudent(StudentEntity studentEntity) {
        Transaction transaction = session.beginTransaction();
        try {
            Integer id = (Integer) session.save(studentEntity);
            transaction.commit();
            return id;
        } catch (Exception e) {
            transaction.rollback();

            return -1;

        }
    }

    public StudentEntity getStudent(Integer id) {
        StudentEntity entity = session.get(StudentEntity.class, id);
        return entity;

    }

    public void update(StudentEntity studentEntity) {

        Transaction transaction = session.beginTransaction();
        try {
            session.update(studentEntity);
            transaction.commit();

        } catch (Exception e) {
            transaction.rollback();
            throw e;

        }


        

    }

      public void delete(StudentEntity studentEntity) {

        Transaction transaction = session.beginTransaction();
        try {
            session.delete(studentEntity);
            transaction.commit();

        } catch (Exception e) {
            transaction.rollback();
            throw e;

        }
}


}
