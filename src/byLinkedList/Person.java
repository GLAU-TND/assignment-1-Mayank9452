package byLinkedList;

import java.util.ArrayList;

public class Person {
    private String firstName;
    private String lastName;
    private ArrayList<String> contactNumber;
    private String mailId;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Person() {
        this.firstName = null;
        this.lastName = null;
        this.contactNumber = null;
        this.mailId = null;
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

    public ArrayList<String> getContactNumber() {
        return contactNumber;
    }

    public void setMailId(String mailId) {
        this.mailId = mailId;
    }

    public void setContactNumber(ArrayList<String> contactNumber) {
        this.contactNumber = contactNumber;
    }

    @Override
    public String toString() {
        String contact = "";
        for (int i = 0; i < contactNumber.size(); i++) {
            contact += contactNumber.get(i);
            contact += " ";
        }
        if (mailId != null) {
            if (this.contactNumber.size() > 1) {
                return "First Name: " + firstName + "\n" +
                        "Last Name: " + lastName + "\n" +
                        "Contact Number(s): " + contact + "\n" +
                        "Email address: " + mailId;

            } else {
                return "First Name: " + firstName + "\n" +
                        "Last Name: " + lastName + "\n" +
                        "Contact Number: " + contact + "\n" +
                        "Email address: " + mailId;
            }
        } else {
            return "First Name: " + firstName + "\n" +
                    "Last Name: " + lastName + "\n" +
                    "Contact Number: " + contact + "\n"
                    ;
        }
    }
}
