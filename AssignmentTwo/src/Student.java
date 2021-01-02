import java.lang.reflect.Array;

//
public class Student extends Occupation{

    //Instant variable
    /*public String firstName;
    public String lastName;
    public int id;
     */
    public String[] subjects;
    public int[] grades;

    public Student(String firstName, String lastName, int id) {
        super(firstName, lastName, id);
    }

    public String getDetails(){
        return "";

    }

    public int calculateAverageGrade(){
        return 0;

    }

    public void addSubjects(){

    }

    public void addGrades(){

    }

    public String getSubjects() {
        return "";
    }

    //Arrays

    public String[] setSubjects(String[] subjects) {
        return this.subjects = subjects;
    }


    public int getGrades() {
        return 0;
    }

   public int[] setGrades(int[] grades) {
        return this.grades = grades;
    }

}
