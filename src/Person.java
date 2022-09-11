public class Person {
    public String firstName;
    public String lastName;
    public Integer myAge;

    public Person(String firstName, String lastName, Integer myAge) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.myAge = myAge;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getMyAge() {
        return myAge;
    }

    public void setMyAge(Integer myAge) {
        this.myAge = myAge;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", myAge=" + myAge +
                '}';
    }

}
