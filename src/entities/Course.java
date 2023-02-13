package entities;

public class Course {

    private String name;
    private int id;
    private double unitPrice;

    public Course(String name,int id,double unitPrice) {
        this.id=id;
        this.name=name;
        this.unitPrice=unitPrice;
    }






    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getName() {
        return name;
    }

    public void setCourse(String course) {
        this. name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
