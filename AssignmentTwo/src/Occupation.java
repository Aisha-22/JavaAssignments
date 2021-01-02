public class Occupation
{
    public String firstName;
    public String lastName;
    public int id;

    public Occupation(String firstName, String lastName, int id){
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;

    }

    public String getDetails(){
        return "Fist Name: " + firstName + "Last Name: " + lastName + "ID: " + id;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String setFirstName(String name){
        return this.firstName = name;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String setLastName(String surName){
        return this.lastName = surName;
    }

    public int getID(){ return this.id = id;
    }

    public int setID(int ID){
        return this.id = ID;
    }
}
