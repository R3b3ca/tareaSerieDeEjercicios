public class ejercicioDos {

    public static void main(String[] args) {

       int i=1;
       int x=1;

        while (i <= 5) {

            while (x <= i) {
                System.out.print(x);
                x++;
            }
            x=1;
            i++;
            System.out.println();
        }
    }
}
