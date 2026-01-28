package bank_system_project;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BankSystem {
    public static void main(String[] args) {
        Queue<Customer> bankQueue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int ticketCounter = 1;

        while (true) {
            System.out.println("\n--- نظام انتظار البنك ---");
            System.out.println("1. إضافة عميل جديد (قطع تذكرة)");
            System.out.println("2. خدمة العميل التالي");
            System.out.println("3. عرض قائمة الانتظار");
            System.out.println("4. خروج");
            System.out.print("اختر عملية: ");

            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("أدخل اسم العميل: ");
                String name = scanner.next();
                Customer c = new Customer(name, ticketCounter++);
                bankQueue.add(c);
                System.out.println("تمت الإضافة بنجاح!");

            } else if (choice == 2) {
                if (!bankQueue.isEmpty()) {
                    System.out.println("يتم الآن خدمة: " + bankQueue.poll());
                } else {
                    System.out.println("لا يوجد عملاء في الانتظار.");
                }

            } else if (choice == 3) {
                System.out.println("العملاء المنتظرون: " + bankQueue);

            } else if (choice == 4) {
                System.out.println("إغلاق النظام...");
                break;
            }
        }
    }
}
