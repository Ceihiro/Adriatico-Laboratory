class Student extends Person {
    // Additional Field
    private String gradeLevel;

    // Constructor 
    public Student(String name, int id, String gradeLevel) {
        super(name, id);
        this.gradeLevel = gradeLevel;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Grade Level : " + gradeLevel);
    }
}