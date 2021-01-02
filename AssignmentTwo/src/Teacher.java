public class Teacher extends Person{

    public String firstName;
    public String lastName;
    public int id;
    public String subject;
    public int[] hoursWorked;
    public int hourlyRate;

    public Teacher(String firstName, String lastName, int id) {
        super(firstName, lastName, id);
    }

    public String getDetails() {
        return "";

    }

    public int calculateAverageHoursWorked() {
        return 0;

    }

    public void addHoursWorked() {

    }

    public void calculateRemuneration() {

    }

    public String getSubject() {
        return "";
    }

    public String setSubject(String subject) {
        return this.subject = subject;
    }

    public int getHoursWorked() {
        return 0;
    }

    public int[] setHoursWorked(int[] hoursWorked){
        return this.hoursWorked = hoursWorked;
    }

    public int getHourlyRate() {
        return this.hourlyRate;
    }

    public int setHourlyRate(int hourlyRate) {
        return this.hourlyRate = hourlyRate;
    }
}
