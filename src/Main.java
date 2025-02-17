/** Yusuf Ibrahim 2/14/25 CSCI 1660 Excercise 5 **/
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Person> personList = new ArrayList<>();
        while (true) {
            System.out.println(" Enter a contact's name you would like to add");
            String name = input.nextLine();
            System.out.println("Please Enter their email");
            String email = input.nextLine();
            Person person = new Person(name, email);
            personList.add(person);
            System.out.println("Do you want to add more contacts to the list? (Yes/No)");
            String answer = input.nextLine();
            System.out.println(personList);
            if (!answer.equalsIgnoreCase("yes")) {
                break;
            }
        }
        search(personList);
    }

    static void search(ArrayList<Person> personList) {
        System.out.println("Please enter the name of the person you would like to search.");
        String name = input.nextLine();
        for (Person person : personList) {
            if (person.getName().equalsIgnoreCase(name)) {
                System.out.println(name + "'s contact is " + person);
            } else {
                System.out.println("No contact named " + name + " is found.");
            }
        }
    }
}
