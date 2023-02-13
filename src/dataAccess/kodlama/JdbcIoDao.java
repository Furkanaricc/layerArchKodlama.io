package dataAccess.kodlama;

import entities.Category;
import entities.Course;
import entities.Instructor;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class JdbcIoDao implements ioDao{

    //Jdbc erişim kodları buraya yazılır (Sql)
    @Override
    public void add(Instructor ınstructor) {

        System.out.println("JDBC ile veritabanına eklendi.");
    }

    @Override
    public void add(Category category) {
        System.out.println("Category JDBC ile veritabanına eklendi.");
    }

    @Override
    public void add(Course course) {
        System.out.println("Course JDBC ilde veritabanına eklendi.");
    }
}
