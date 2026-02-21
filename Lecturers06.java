public class Lecturers06 {

    String idLecturer;
    String name;
    boolean activeStatus;
    int yearOfEntry;
    String expertiseCompetency;

    public Lecturers06() {

    }

    public Lecturers06(String idLecturer, String name, boolean activeStatus, int yearOfEntry, String expertiseCompetency) {
        this.idLecturer = idLecturer;
        this.name = name;
        this.activeStatus = activeStatus;
        this.yearOfEntry = yearOfEntry;
        this.expertiseCompetency = expertiseCompetency;
    }

    void showInformation() {

        System.out.println("Lecturer ID        : " + idLecturer);
        System.out.println("Name               : " + name);
        System.out.println("Active Status      : " + (activeStatus ? "Active" : "Inactive"));
        System.out.println("Year Of Entry      : " + yearOfEntry);
        System.out.println("Expertise Field    : " + expertiseCompetency);

    }

    void setStatusActive(boolean status) {

        activeStatus = status;

        if (activeStatus) {
            System.out.println("Lecturer is now Active.");
        } else {
            System.out.println("Lecturer is now Inactive.");
        }

    }

    int calculateTimeWork(int yearNow) {

        return yearNow - yearOfEntry;

    }

    void changeSkill(String skill) {

        expertiseCompetency = skill;
        System.out.println("Expertise successfully changed to: " + expertiseCompetency);

    }
}