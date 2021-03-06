package byLinkedList;

import java.util.Scanner;

public class ContactList implements ADT<Person> {

    Scanner sc = new Scanner(System.in);
    Node<Person> head = null;


    @Override
    public void add(Person data) {
        Node node = new Node(data);

        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(node);
        }
        System.out.println("contact added successfully");
    }

    @Override
    public void remove() {
        Node response = null;
        if (head != null) {
            Node<Person> temp = head;
            Node previous = null;
            int count = 0;
            int index = printName();
            sc.nextLine();
            while (count < index - 1) {
                previous = temp;
                temp = temp.getNext();
                count++;
            }
            System.out.println(temp.getData().getFirstName() + " " + temp.getData().getLastName() + "'s contact deleted from list!");

            if (previous != null) {
                response = previous.getNext();
                previous.setNext(previous.getNext().getNext());

            } else {
                response = head;
                head = null;
            }
        }
    }

    @Override
    public Person search(String firstName) {
        Node<Person> temp = head;
        int count = 0;
        while (temp != null) {
            if (temp.getData().getFirstName().equals(firstName))
                count++;

            temp = temp.getNext();
        }
        if (count != 0) {
            System.out.println(count + " match found!\n-------- * -------- * -------- * --------");
            temp = head;
            while (temp != null) {
                if (temp.getData().getFirstName().equals(firstName)) {
                    System.out.println(temp.getData());
                    System.out.println("-------- * -------- * -------- * --------");
                }
                temp = temp.getNext();
            }
        } else
            System.out.println("No Result Found.");

        return null;
    }

    @Override
    public void print() {
        System.out.println("---Here are all your contacts---\n" +
                "-------- * -------- * -------- * --------");
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
            System.out.println("-------- * -------- * -------- * --------" + "\n" + "-------- * -------- * -------- * --------");
        }
        System.out.println();
    }

    public void sortList() {
        //Node current will point to head
        Node<Person> current = head, index = null;
        Person temp;

        if (head == null) {
            return;
        } else {
            while (current != null) {
                //Node index will point to node next to current
                index = current.getNext();

                while (index != null) {
                    //If current node's data is greater than index's node data, swap the data between them
                    if (current.getData().getFirstName().compareTo(index.getData().getFirstName()) > 0) {
                        temp = current.getData();
                        current.setData(index.getData());
                        index.setData(temp);
                    }
                    index = index.getNext();
                }
                current = current.getNext();
            }
        }
    }

    private int printName() {
        System.out.println("Here are all your contacts: ");
        Node<Person> temp = head;
        int i = 1;
        while (temp != null) {
            System.out.println(i++ + ". " + temp.getData().getFirstName() + " " + temp.getData().getLastName());
            temp = temp.getNext();
        }
        System.out.print("Press the number against the contact to delete it:");
        return sc.nextInt();

    }
}
