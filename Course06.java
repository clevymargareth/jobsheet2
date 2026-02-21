public class Course06 {

    String kodeCourse;
    String name;
    int credits;
    int numberOfHours;

    public Course06() {

    }

    public Course06(String kodeCourse, String name, int credits, int numberOfHours) {
        this.kodeCourse = kodeCourse;
        this.name = name;
        this.credits = credits;
        this.numberOfHours = numberOfHours;
    }

    void showInformation() {
        System.out.println("Course Code     : " + kodeCourse);
        System.out.println("Course Name     : " + name);
        System.out.println("Credits (SKS)   : " + credits);
        System.out.println("Number of Hours : " + numberOfHours);
    }

    void updateSKS(int sksNew) {
        credits = sksNew;
        System.out.println("Credits updated to: " + credits);
    }

    void addHour(int hours) {
        numberOfHours += hours;
        System.out.println("Hours added. Total hours now: " + numberOfHours);
    }

    void reduceHours(int hours) {

        if (hours <= numberOfHours) {
            numberOfHours -= hours;
            System.out.println("Hours reduced. Total hours now: " + numberOfHours);
        } else {
            System.out.println("Reduction failed. Not enough hours.");
        }

    }
}