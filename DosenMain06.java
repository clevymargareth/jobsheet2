public class DosenMain06 {

    public static void main(String[] args) {

        Lecturers06 lecturer1 = new Lecturers06();

        lecturer1.idLecturer = "L001";
        lecturer1.name = "Dr. Budi Santoso";
        lecturer1.activeStatus = true;
        lecturer1.yearOfEntry = 2015;
        lecturer1.expertiseCompetency = "Data Structures";

        System.out.println("LECTURER 1 DATA");
        lecturer1.showInformation();

        System.out.println("Working Period: " + lecturer1.calculateTimeWork(2025) + " years");

        lecturer1.setStatusActive(false);
        lecturer1.changeSkill("Basic Programming");

        System.out.println("\nAfter Update:");
        lecturer1.showInformation();


        Lecturers06 lecturer2 = new Lecturers06(
                "L002",
                "Dr. Siti Rahma",
                true,
                2018,
                "Database Systems"
        );

        System.out.println("\nLECTURER 2 DATA");
        lecturer2.showInformation();

        System.out.println("Working Period: " + lecturer2.calculateTimeWork(2025) + " years");

        lecturer2.setStatusActive(true);
        lecturer2.changeSkill("Cyber Security");

        System.out.println("\nAfter Update:");
        lecturer2.showInformation();

    }
}