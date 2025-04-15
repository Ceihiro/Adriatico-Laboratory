class Person {
    // Variable
    private String name;
    private int id;

    // Constructor 
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayInfo() {
        System.out.println("Name        : " + name);
        System.out.println("Id          : " + id);
    }
}