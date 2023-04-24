public class StudentController {
    private StudentModel model;
    private StudentView view;

    public StudentController(StudentModel model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void registerForPlacement(String name, String srn, String gpa, String jobId, String emailId, String phoneNumber) {
        model.registerForPlacement(name, srn, gpa, jobId, emailId, phoneNumber);
    }

    public void raiseQuery(String name, String srn, String query) {
        model.raiseQuery(name, srn, query);
    }

    public void viewJobDescription() {
        model.viewJobDescription();
    }

    public void editProfileName(String srn, String updatedName) {
        model.editProfileName(srn, updatedName);
    }
}