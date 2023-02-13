package business;


import dataAccess.kodlama.HibernateDao;
import dataAccess.kodlama.JdbcIoDao;
import dataAccess.kodlama.ioDao;
import entities.Instructor;

public class InstructorManager {

    private dataAccess.kodlama.ioDao ioDao;

    public InstructorManager(ioDao ioDao) {
        this.ioDao = ioDao;
    }

    public void add(Instructor ınstructor) throws Exception {
        //iş kuralları business rules

        if(ınstructor.getAge()<18){
            throw new Exception("Eğitmen yaşı 18 den küçük olamaz.");
        }

        //Jdbc yi kullanabilmek için new liyoruz
        JdbcIoDao jdbcIoDao = new JdbcIoDao();
        jdbcIoDao.add(ınstructor);

        //Hibernate kullanımı için newlioruz.
        HibernateDao hibernateDao= new HibernateDao();
        hibernateDao.add(ınstructor);


    }
}
