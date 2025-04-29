import java.util.Scanner;

class Product {
    String pname;
    String pcode;
    Double price;

    Product(String pname, String pcode, Double price) {
        this.pname = pname;
        this.pcode = pcode;
        this.price = price;
    }

    static Product lowprice(Product pro1, Product pro2, Product pro3) {
        if (pro1.price <= pro2.price && pro1.price <= pro3.price) {
            return pro1;
        } 
        else if (pro2.price <= pro1.price && pro2.price <= pro3.price) {
            return pro2;
        } 
        else {
            return pro3;
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter name, code, and price of first product:");
        Product pro1 = new Product(s.next(), s.next(), s.nextDouble());
        System.out.println("Enter name, code, and price of second product:");
        Product pro2 = new Product(s.next(), s.next(), s.nextDouble());
        System.out.println("Enter name, code, and price of third product:");
        Product pro3 = new Product(s.next(), s.next(), s.nextDouble());

        Product lowest = lowprice(pro1, pro2, pro3);
        System.out.println("\n\n\nProduct which has LOWEST PRICE ---\nn");
        System.out.println("Pcode: "+ lowest.pcode);
        System.out.println("Pname: "+ lowest.pname);
        System.out.println("Price: "+ lowest.price);
        s.close();
    }
}
