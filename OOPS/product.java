import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
public class product{

    class Product{
        String p_name;
        int U_id;
        int price;
        int Quantity;
        Product(String Product, int id, int Price, int quantity){
            Product = this.p_name;
            id = this.U_id;
            Price = this.price;
            quantity = this.Quantity;
        }

        Product p = new Product(p_name, U_id, price, Quantity);
        // String line = p.toCSVfile();
    }
    public static void Add_Product(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Product name: ");
        String P_name = sc.next();

        System.out.print("Enter Product ID: ");
        int U_id = sc.nextInt();

        System.out.print("Enter Product Price: ");
        int price = sc.nextInt();

        System.out.print("Provide the product Quantity: ");
        int quantity = sc.nextInt();

        sc.close();
    }


    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Path path = Paths.get("Inventory.csv");

        System.out.println("1) Add new Product to inventory");
        System.out.println("2) Update an Product");
        System.out.println("3) Delete an Product \n");

        System.out.print("Enter Your Choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                
                break;
        
            case 2:

                break;

            case 3:
                break;

            default:
                break;
        }

        sc.close();
    }
}