package dataAccess.kodlama;

import entities.Category;
import entities.Course;
import entities.Instructor;

public interface ioDao {
    void add(Instructor ınstructor);

    void add(Course course);

    void add(Category category);
}
