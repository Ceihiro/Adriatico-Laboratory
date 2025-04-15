public class SchoolTest {
    public static void main(String[] args) {
        Student student = new Student("Ceihiro", 04, "Grade 12");
        Teacher teacher = new Teacher("Mr. Jazel", 15, "CCOBJPGL");
        Staff staff = new Staff("Mr. Adriatico", 25, "IT");

        student.displayInfo();
        teacher.displayInfo();
        staff.displayInfo();
        }
}