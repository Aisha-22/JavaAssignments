public class Person {
    public String firstName;
    public String lastName;
    public int id;

    public Person() {

    }


    public String getDetails(){
        return "";
    }

    public String getFirstName(){
        return "";
    }

    public String setFirstName(String name){
        return this.firstName = name;
    }

    public String getLastName(){
        return "";
    }

    public String setLastName(String surName){
        return this.lastName = surName;
    }

    public int getID(){
        return 0;
    }

    public int setID(int ID){
        return this.id = ID;
    }

    //Constructor
    public Person(String firstName, String lastName, int id){
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;

    }
}
