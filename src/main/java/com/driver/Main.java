public class Main {
    public static void main(String[] args) {
        Product p = new Product();

        int result1 = p.product(2, 3);
        System.out.println("Product of 2 and 3: " + result1);

        int result2 = p.product(4, 5, 6);
        System.out.println("Product of 4, 5, and 6: " + result2);

        double result3 = p.product(1.5, 2.5);
        System.out.println("Product of 1.5 and 2.5: " + result3);
    }
}
