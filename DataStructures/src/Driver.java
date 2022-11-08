import LinkedList.LinkedList;

public class Driver {
    public static void main(String[] args) {
        System.out.println("Driver Code for Java Data Structures project\n");
        driverCode();
    }

    private static void driverCode() {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Hello");
        list.add("Hi");
        list.add("Bye");
        System.out.println("List Size: "+list.size());

    }
}
