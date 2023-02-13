package entities;

public class Instructor {
    private String fistName;
    private String lastName;
    private int age;
    private String profesion;

    public Instructor() {
    }

    public Instructor(String fistName, String lastName, String profesion,int age) {
        this.fistName=fistName;
        this.lastName=lastName;
        this.profesion=profesion;
        this.age=age;
    }



    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
