public class table_method {

    // declaration and definition of method
   static void printTable() {
        for(int i=1; i<=10; i++) {
            int ans = 2*i;
            System.out.println("-> " + ans);
        }
    }

    public static void main (String[] args) {
        System.out.println("hi");
        printTable();
        System.out.println("bye");
    }
}