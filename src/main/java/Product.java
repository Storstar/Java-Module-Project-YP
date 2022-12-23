import java.util.Scanner;

public class Product {
    String name;
    float priсe;
    static Scanner input = new Scanner(System.in);

    Product (String name,float priсe){
        this.name=name;
        this.priсe=priсe;
    }

    public static Product addNewProduct(){
        System.out.println("Введите название товара");
        String productName = scannerIn();
        System.out.println("Введите цену товара");
        String sproductPrice = scannerIn();
        while (!checkForNormalNumber(sproductPrice)){
            System.out.println("Введите корректную цену, в формате рубли.копейки, например 10.45 или 11.40, c двумя числами после запятой!");
             sproductPrice = scannerIn();
        }
        return new Product(productName,Float.parseFloat(sproductPrice));
    }

    private static boolean checkForNormalNumber (String price){
        return price.matches("\\d+(|\\.)\\d{2}");
    }
    public static String scannerIn(){
        return input.next();
    }

}
