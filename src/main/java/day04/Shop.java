package day04;

import java.util.List;

public class Shop {

    private List<User> users;
    private List<Product> products;

    public Shop(List<User> users, List<Product> products) {
        this.users = users;
        this.products = products;
    }

    public void buyingProduct(String userName, String productName) {
        User user = findUser(userName);
        Product product = findProduct(productName);
        user.addProduct(product);
    }

    private User findUser(String userName) {
        for (User user : users) {
            if (user.getName().equals(userName)) {
                return user;
            }
        }
        throw new IllegalArgumentException("-= Ivalid Username =-" + userName);

    }

    private Product findProduct(String productName) {
        for (Product product : products) {
            if (product.getName().equals(productName)) {
                return product;
            }
        }
        throw new IllegalArgumentException("-= Ivalid Product name =-" + productName);
    }
}
