public class Teacher {

    public String firstName;
    public String lastName;
    public int id;
    public String subject;
    public int hoursWorked[];
    public int hourlyRate;

    public String getDetails(){
        return "";

    }

    public int calculateAverageHoursWorked(){
        return 0;

    }

    public void addHoursWorked(){

    }

    public void calculateRemuneration(){

    }

    public String getSubject(){
        return "";
    }

    public String setSubject(String subject){
        return this.subject = subject;
    }

    public String getLastName(){
        return "";
    }

    /*public int setHoursWorked(int hoursWorked){
        return this.hoursWorked = hoursWorked;
        List al = Arrays.asList(hoursWorked);
    }
     */

    public int getHourlyRate(){
        return this.hourlyRate;
    }

    public int setHourlyRate(int hourlyRate){
        return this.hourlyRate = hourlyRate;
    }
}
