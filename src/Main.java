import business.CatagoryManager;
import business.CourseManager;
import business.InstructorManager;
import dataAccess.kodlama.HibernateDao;
import dataAccess.kodlama.JdbcIoDao;
import entities.Category;
import entities.Course;
import entities.Instructor;

public class Main {

    public static void main(String[] args) throws Exception {



        Instructor instructor1= new Instructor("Furkan","ARIÇ","Java",25);

        InstructorManager instructorManager = new InstructorManager(new JdbcIoDao());
        instructorManager.add(instructor1);



        Category category1= new Category("Web Geliştirme");

        CatagoryManager catagoryManager= new CatagoryManager();
        CatagoryManager.add(category1);




        Course course1= new Course("Java",101,2500);
        //Course course2= new Course("C#",102,3000);
        CourseManager courseManager= new CourseManager();
        courseManager.add(course1);
        //courseManager.add(course2);
    }
}
