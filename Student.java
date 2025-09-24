public class Student {
    private int id;
    private String name;
    private String contact;

    public Student(int id, String name, String contact) {
        this.id = id;
        this.name = name;
        this.contact = contact;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getContact() { return contact; }

    public void setName(String name) { this.name = name; }
    public void setContact(String contact) { this.contact = contact; }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', contact='" + contact + "'}";
    }
}
