package org.example;


import org.example.config.Config;
import org.example.model.product.Product;
import org.example.model.user_account.UserAccount;
import org.example.service.ProductService;
import org.example.service.UserAccountService;
import org.example.service.UserAccountServiceImpl;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * Hello world!
 */

public class App {
    @Autowired
    private static UserAccountServiceImpl userAccountService;

    @Autowired
    private static SessionFactory sessionFactory;

    public static void main(String[] args) {

        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(Config.class);
        final UserAccountService userAccountServiceBean = appContext.getBean(UserAccountService.class);
        UserAccount userAccount = userAccountServiceBean.getUserAccount(1);
        System.out.println(userAccount.toString());
        appContext.close();

        AnnotationConfigApplicationContext appContext1 = new AnnotationConfigApplicationContext(Config.class);
        final ProductService productServiceBean = appContext1.getBean(ProductService.class);
        Product product = productServiceBean.getProduct(1);
        System.out.println(product.toString());
    }
}
