public class Multiples {
    public static void main(String[] args) {
        int i = 1;
        int total = 0;
        while (i < 1000) {

            boolean multipleof3 = i % 3 == 0;
            boolean multipleof5 = i % 5 == 0;


            // Print our appropriate result.
            if (multipleof3 && multipleof5) {
                i = i + 1;
                total = total + 1;
            } else if (multipleof3) {
                i = i + 1;
                total = total + 1;
            } else if (multipleof5) {
                i = i + 1;
                total = total + 1;
            } else {
                i = i + 1;

            }

        }
        System.out.println(total);
    }
}
