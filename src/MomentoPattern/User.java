package MomentoPattern;

public class User {
    private String fullName;
    private String email;
    private int age;

    public User(String fullName, String email, int age) {
        this.fullName = fullName;
        this.email = email;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }
}
