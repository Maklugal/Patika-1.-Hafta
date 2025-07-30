package Patika_3_Week.ProjeKitap;

import Patika_3_Week.ProjeKitap.model.Author;
import Patika_3_Week.ProjeKitap.model.Product;
import Patika_3_Week.ProjeKitap.model.enums.Gender;
import Patika_3_Week.ProjeKitap.service.AuthorService;
import Patika_3_Week.ProjeKitap.service.OrderService;
import Patika_3_Week.ProjeKitap.service.ProductService;
import Patika_3_Week.ProjeKitap.service.UserService;

import java.time.LocalDate;
import java.util.List;

public class PatikaBooks {
    public static void main(String[] args) {

        UserService userService = new UserService();
        userService.create("Mehmet", "mehmet@patika.com", "password");
        userService.create("Ayşe", "ayse@patika.com", "password1");
        userService.create("Fatma", "fatma@patika.com", "password2");
        userService.create("Fatma", "fatma1@patika.com", "password2");
        userService.list();

        AuthorService authorService = new AuthorService();
        authorService.create("Patika", "Patika", Gender.WOMEN);
        Author author = authorService.findAuthor("Patika");

        ProductService productService = new ProductService();
        productService.create("Java Programlama", 155, author, LocalDate.of(2022, 01, 01));
        productService.create("Java Programlama - 2", 255, author, LocalDate.of(2023, 01, 01));
        productService.create("Java İleri Programlama ", 355, author, LocalDate.of(2024, 01, 01));

        productService.create("Aylık Patika.dev Teknoloji Dergisi", 99.9);

        productService.list();

        Product product = productService.findProductByName("Java İleri Programlama");
        Product product1 = productService.findProductByName("Java Programlama - 2");

        User user = userService.findUserByName("Fatma");


        OrderService orderService = new OrderService();
        if (product != null) {
            orderService.create(List.of(product, product1), user);
        } else {
            System.out.println("Hata: product nesnesi null!");
        }

        orderService.list();

    }
}
