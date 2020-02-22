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
    public void remove(Person data) {

    }

    @Override
    public Person search(String firstName) {
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
}
