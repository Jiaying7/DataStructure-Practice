import java.util.Objects;

/**
 * Person class representing a person with basic attributes such as name, age, occupation, job,
 * marital status, gender, and address. This class implements the Comparable<Person> interface
 * which allows Person objects to be compared based on their age.
 */
public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private String occupation;
    private String job;
    private String maritalStatus;
    private String gender;
    private String address;

    /**
     * Constructs a new Person object with the specified attributes.
     *
     * @param name The name of the person
     * @param age The age of the person
     * @param occupation The occupation of the person
     * @param job The job of the person
     * @param maritalStatus The marital status of the person
     * @param gender The gender of the person
     * @param address The address of the person
     */
    public Person(String name, int age, String occupation, String job, String maritalStatus, String gender, String address) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
        this.job = job;
        this.maritalStatus = maritalStatus;
        this.gender = gender;
        this.address = address;
    }

    // Getter and setter methods for each attribute
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    /**
     * Compares this Person object with the specified Person object for order.
     * The comparison is based on the age of the Person objects.
     *
     * @param other The Person object to be compared
     * @return A negative integer, zero, or a positive integer as this Person's age is less than,
     *         equal to, or greater than the specified Person's age
     */
    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age);
    }

    /**
     * Returns a string representation of the Person object, displaying the name and age.
     *
     * @return A string representation of the Person object
     */
    @Override
    public String toString() {
        return name+"("+age+")" ;
    }

}
