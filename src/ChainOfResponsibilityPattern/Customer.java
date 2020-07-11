package ChainOfResponsibilityPattern;

public class Customer {
    private String name;
    private String surname;
    private Address address;
    private String email;
    private String phone;

    public void setFirstName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return name;
    }

    public void setLastName(String surname) {
        this.surname = surname;
    }

    public Address getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getSurname() {
        return surname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
