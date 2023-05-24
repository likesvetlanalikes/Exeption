import java.util.Scanner;

public class MyMemory {
    public void memory() {
        Scanner scanner = new Scanner(System.in);
        DataService service = new LocalMemoryService();

        while (true) {
            String next = scanner.next();
            if ("exit".equals(next)) {
                break;
            } else if ("get".equals(next)) {
                try {
                    System.out.println(service.get());
                } catch (NoSuchElementException e) {
                    System.out.println("no elements");
                }
            } else {
                try {
                    service.add(next);
                } catch (LowMemoryException e) {
                    System.out.println("Memory is full");
                }

            }
        }

    }
}
