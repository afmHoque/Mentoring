package classesandObject;


import java.util.ArrayList;

public class University {

    private String location;
    private int numOfTheBuildings;
    private String name;
    private ArrayList<String> departments;

    public University(String location, int numOfTheBuildings, String name, ArrayList<String> departments) {
        this.location = location;
        this.numOfTheBuildings = numOfTheBuildings;
        this.name = name;
        this.departments = departments;
    }

    public void getFinancialAidStatus(){

        String universityName = "NYU";
        System.out.println(" This is university, "+ universityName + "Dose not provide Aid");
    }

    public void register (){
        System.out.println("Register for university");
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNumOfTheBuildings() {
        return numOfTheBuildings;
    }

    public void setNumOfTheBuildings(int numOfTheBuildings) {
        this.numOfTheBuildings = numOfTheBuildings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getDepartments() {
        return departments;
    }

    public void setDepartments(ArrayList<String> departments) {
        this.departments = departments;
    }

}
