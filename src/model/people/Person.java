package model.people;

import java.util.Objects;

public class Person implements IOwner{

    private String passNumber;
    private String fullName;

    public Person() {
    }

    public Person(String passNumber, String fullName) {
        this.passNumber = passNumber;
        this.fullName = fullName;
    }

    public String getPassNumber() {
        return passNumber;
    }

    public void setPassNumber(String passNumber) {
        this.passNumber = passNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String getNumber() {
        return passNumber;
    }

    @Override
    public String getName() {
        return fullName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (passNumber != null ? !passNumber.equals(person.passNumber) : person.passNumber != null) return false;
        return fullName != null ? fullName.equals(person.fullName) : person.fullName == null;
    }

    @Override
    public int hashCode() {
        return Objects.hash(passNumber, fullName);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("model.people.Person{");
        sb.append("passNumber='").append(passNumber).append('\'');
        sb.append(", fullName='").append(fullName).append('\'');
//        sb.append(", number='").append(getNumber()).append('\'');
//        sb.append(", name='").append(getName()).append('\'');
//        sb.append('}');
        return sb.toString();
    }
}
