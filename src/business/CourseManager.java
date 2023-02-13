package business;


import entities.Course;

public class CourseManager {

    public void add(Course course) throws Exception {
        //iş kuralları

        //kurs ücreti 1 den küçük  olamaz
        if(course.getUnitPrice()<1) {
            throw new Exception("Kurs fiyatı 1'den küçük olamaz.");
        }


        if(!course.getName().equalsIgnoreCase("Java")){
            throw new Exception(course.getName()+"isminde bir kurs bulunamadı.");
        }else {
            System.out.println("Kurs seçildi."+ course.getName().substring(0,1).toUpperCase() + course.getName().substring(1).toLowerCase());
        }
    }


}

