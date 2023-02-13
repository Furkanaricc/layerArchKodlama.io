package dataAccess.kodlama;

import entities.Category;
import entities.Course;
import entities.Instructor;

public class HibernateDao implements ioDao{
    @Override
    public void add(Instructor ınstructor) {
        System.out.println("Instructor Hibernate ile veri tabanına loglandı");
    }

    @Override
    public void add(Category category) {
        System.out.println("Category hibernate ile veritabanına eklendi.");
    }

    @Override
    public void add(Course course) {
        System.out.println("Course Hibernate ile veritabanına eklendi.");
    }
}
