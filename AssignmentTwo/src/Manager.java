public class Manager extends Person {

    public String firstName;
    public String lastName;
    public int id;
    public String responsibilities[];
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

    public String getResponsibilities(){
        return "";
    }

    public String[] setResponsibilities(String[] responsibilities){
        return this.responsibilities = responsibilities;
    }

    public int getHoursWorked(){
        return 0;
    }

    public int[] setHoursWorked(int[] hoursWorked){
        return this.hoursWorked = hoursWorked;
    }

    public int getHourlyRate(){
        return 0;
    }

    public int setHourlyRate(int hourlyRate){
        return this.hourlyRate = hourlyRate;
    }


}
