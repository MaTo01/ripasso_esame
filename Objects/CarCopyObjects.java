package Preparazione_esame.Objects;

public class CarCopyObjects {
    
    private String make;
    private String model;
    private int year;

    CarCopyObjects(String make, String model, int year){
        //this.make = make;
        //this.model = model;
        //this.year = year;
        this.setMake(make);
        this.setModel(model);
        this.setYear(year);
    }

    CarCopyObjects(CarCopyObjects x){
        this.copy(x);
    }

    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public int getYear(){
        return year;
    }

    public void setMake(String make){
        this.make = make;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void copy(CarCopyObjects x){
        this.setMake(x.getMake());
        this.setModel(x.getModel());
        this.setYear(x.getYear());
    }


}
