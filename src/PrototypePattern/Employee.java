package PrototypePattern;

import java.util.Arrays;

public class Employee implements Cloneable{
    private int id;
    private String Lastname;
    private String Firstname;
    private String streetAddress;
    private String city;
    private String state;
    private String zipcode;
    private Employee supervisor;
    private Employee staff[];

    public Employee(int id, String lastname, String firstname, String streetAddress, String city, String state, String zipcode, Employee supervisor, Employee[] staff) {
        this.id = id;
        Lastname = lastname;
        Firstname = firstname;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.supervisor = supervisor;
        this.staff = staff;
    }

    public Employee(){ }
    public Employee(int id, String name){
        this.id = id;
        this.Firstname = name;
    }

    @Override
    public Object doClone() {
        Employee e = new Employee();
        e.setId(this.getId());
        e.setLastname(this.getLastname());
        e.setFirstname(this.getFirstname());
        e.setStreetAddress(this.getStreetAddress());
        e.setCity(this.getCity());
        e.setState(this.getState());
        if(this.getSupervisor() != null)
        e.setSupervisor((Employee) this.getSupervisor().doClone());

        if(this.getStaff() != null) {
            e.setStaff(this.getStaff());
            for (int i = 0; i < this.getStaff().length; i++) {
                e.getStaff()[i] = (Employee) this.getStaff()[i].doClone();
            }
        }
        return e;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public Employee getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Employee supervisor) {
        this.supervisor = supervisor;
    }

    public Employee[] getStaff() {
        return staff;
    }

    public void setStaff(Employee[] staff) {
        this.staff = staff;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                " Lastname='" + Lastname + '\n' +
                " Firstname='" + Firstname + '\n' +
                " streetAddress='" + streetAddress + '\n' +
                " city='" + city + '\n' +
                " state='" + state + '\n' +
                " zipcode='" + zipcode + '\n' +
                " supervisor=" + supervisor +
                " staff=" + Arrays.toString(staff) +
                '}';
    }
}
