package byLinkedList;

import java.util.ArrayList;

public class Person {
    private String firstName;
    private String lastName;
    private ArrayList<Long> contactNumber;
    private String mailId;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public ArrayList<Long> getContactNumber() {
        return contactNumber;
    }

    public String getMailId() {
        return mailId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setContactNumber(ArrayList<Long> contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setMailId(String mailId) {
        this.mailId = mailId;
    }

    public Person(String firstName, String lastName, ArrayList<Long> contactNumber, String mailId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactNumber = contactNumber;
        this.mailId = mailId;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", contactNumber=").append(contactNumber);
        sb.append(", mailId='").append(mailId).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
