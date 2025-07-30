package Patika_3_Week.ProjeKitap.service;

import Patika_3_Week.ProjeKitap.model.Author;
import Patika_3_Week.ProjeKitap.model.Book;
import Patika_3_Week.ProjeKitap.model.Magazine;
import Patika_3_Week.ProjeKitap.model.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProductService {

    private static final List<Product> productList = new ArrayList<>();

    public void create(String name, double price, Author author, LocalDate publishedDate) {
        Product book = new Book(name, price, author, publishedDate);
        productList.add(book);
    }

    public void create(String name, double price) {
        Product magazine = new Magazine(name, price);
        productList.add(magazine);
    }

    public void list() {
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    public Product findProductByName(String productName) {
        Product foundProduct = null;

        for (Product product : productList) {
            if (product.getName().equals(productName)) {
                foundProduct = product;
                break;
            }
        }
        return foundProduct;
    }
}
