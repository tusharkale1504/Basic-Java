public class Pattern {
    public static void main(String[] args) {
        int n = 3;
        int i = 1;
        while (i == 1) {
            System.out.println(i);
            i++;
        }
        System.out.println("**");
        while (i == 2) {
            int j = 1;
            while (j <= i) {
                System.out.print(i);
                j++;
            }
            System.out.println();
            i++;
        }
        System.out.println("****");
        while (i == 3) {
            int j = 1;
            while (j <= i + 2) {
                System.out.print(i);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
