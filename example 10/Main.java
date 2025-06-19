public class Main {
    public static void main(String[] args) {
        // Create Model
        Student student = new Student("Sushmitha", 1001, "A");

        // Create View
        StudentView view = new StudentView();

        // Create Controller
        StudentController controller = new StudentController(student, view);

        // Initial Display
        controller.updateView();

        // Update Data via Controller
        controller.setStudentName("Sushmitha N.");
        controller.setStudentGrade("A+");

        // Display Updated Data
        System.out.println("\nAfter Updating:");
        controller.updateView();
    }
}
