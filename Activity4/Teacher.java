class Teacher extends Person {
    // Additional Field
    private String subject;

    // Constructor 
    public Teacher(String name, int id, String subject) {
        super(name, id);
        this.subject = subject;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Subject     : " + subject);.
    }
}