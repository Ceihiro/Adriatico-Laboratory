class Staff extends Person {
    // Additional Field
    private String department;

    // Constructor 
    public Staff(String name, int id, String department) {
    super(name, id);
    this.department = department;
    }
    
    @Override
    public void displayInfo() {
    super.displayInfo();
    System.out.println("Department  : " + department);
    }
}