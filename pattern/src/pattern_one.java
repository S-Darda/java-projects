
public class pattern_one {
    public class Main {
        public static void main(String[] args) {
            // Outer loop.
            String star = "*";
            for (int i = 1; i <= 1; i++) {
                //System.out.println("Outer: " + i); // Executes 2 times

                // Inner loop
                for (int j = i; j <= 4; j++) {
                    System.out.println(star.repeat(j) ); // Executes 6 times (2 * 3)

                }
            }
        }
    }
}
