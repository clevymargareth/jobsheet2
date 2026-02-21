public class CourseMain06 {

    public static void main(String[] args) {

        Course06 course1 = new Course06();

        course1.kodeCourse = "ASD";
        course1.name = "Algorithms and Data Structures";
        course1.credits = 3;
        course1.numberOfHours = 6;

        System.out.println("COURSE 1 DATA");
        course1.showInformation();

        course1.updateSKS(4);
        course1.addHour(2);
        course1.reduceHours(3);

        System.out.println("\nAfter Update:");
        course1.showInformation();

        
        Course06 course2 = new Course06(
                "DB",
                "Database Systems",
                3,
                4
        );

        System.out.println("\nCOURSE 2 DATA");
        course2.showInformation();

        course2.updateSKS(5);
        course2.addHour(1);
        course2.reduceHours(10);

        System.out.println("\nAfter Update:");
        course2.showInformation();

    }
}