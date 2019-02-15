public class Contact {

    private String name;
    private String phone;
    private int age;
    private String address;
    private String email;

    public Contact(String name) {
        this.name = name;
    }

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public Contact() {
    }

    String print() {
        return "Name: " + name + "  Phone: " + phone + "  Age: " + age + "  Address: " + address + "  Email: " + email;
    }

    String shortPrint() {
        return "Name: " + name + "  Phone: " + phone  + "  Email: " + email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
