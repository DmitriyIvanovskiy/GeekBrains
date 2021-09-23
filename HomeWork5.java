/**
 * Java 1. HomeWork 5
 *
 * @author Dmitriy Ivanovskiy
 * @version 23.09.21
 */
public class HomeWork5 {

    public static void main(String[] args) {

        Employee [] persArray = new Employee[5];
        persArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Employee("Petrov Petr", "Manager", "Petr@mailbox.com", "8923991234", 60000, 44);
        persArray[2] = new Employee("Fedorov Dima", "Engineer", "Fedorov@mailbox.com", "89994543432", 37000, 20);
        persArray[3] = new Employee("Sidorov Sergey", "Director", "Sidiriv.S@mailbox.com", "89232223344", 130000, 52);
        persArray[4] = new Employee("Sidorov Oleg", "Seller", "Sidiriv.O@mailbox.com", "89232223345", 100000, 32);

        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getAge() >= 40) {
                System.out.println (persArray[i]);
            }
        }
    }
}