public class Reduce {
    public static void main(String[] args) {
        Integer n = 100;
        Integer total = 0;

        while (n > 0) {


            if (n % 2 != 0) {
                n = n/2 ;
                total = total + 1;
            } else {
                n = n - 1;
                total = total + 1;
            }

        }
        System.out.println(total);
    }
}
