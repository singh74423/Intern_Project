import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Taskm {

    public static void main(String[] args) {
        List<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nTask Management System");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Update Task");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (choice) {
                case 1:
                    addTask(tasks, scanner);
                    break;
                case 2:
                    viewTasks(tasks);
                    break;
                case 3:
                    updateTask(tasks, scanner);
                    break;
                case 4:
                    deleteTask(tasks, scanner);
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }

        scanner.close();
    }

    private static void addTask(List<String> tasks, Scanner scanner) {
        System.out.print("Enter the task description: ");
        String task = scanner.nextLine();
        tasks.add(task);
        System.out.println("Task added successfully!");
    }

    private static void viewTasks(List<String> tasks) {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            System.out.println("List of Tasks:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    private static void updateTask(List<String> tasks, Scanner scanner) {
        viewTasks(tasks);
        System.out.print("Enter the task number to update: ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine(); // Consume newline left-over

        if (index >= 0 && index < tasks.size()) {
            System.out.print("Enter new task description: ");
            tasks.set(index, scanner.nextLine());
            System.out.println("Task updated successfully!");
        } else {
            System.out.println("Invalid task number.");
        }
    }

    private static void deleteTask(List<String> tasks, Scanner scanner) {
        viewTasks(tasks);
        System.out.print("Enter the task number to delete: ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine(); // Consume newline left-over

        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
            System.out.println("Task deleted successfully!");
        } else {
            System.out.println("Invalid task number.");
        }
    }
}
