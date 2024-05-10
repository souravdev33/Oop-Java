package basicjava;

import java.util.*;

public class assignment {
    public static void main(String[] args) {
        int id, price;
        String description, category;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the id No : ");
        id = input.nextInt();

        System.out.println("Enter the Price : ");
        price = input.nextInt();
       
        input.nextLine();

        System.out.println("Enter the Description :");
        description = input.nextLine();

        System.out.println("Enter the Category : ");
        category = input.nextLine();

        System.out.printf("Id is :%d\n", id);
        System.out.printf("Price is : %d\n", price);
        System.out.printf("Description is :%s\n", description);
        System.out.printf("Category is :%s\n", category);
    }
}
