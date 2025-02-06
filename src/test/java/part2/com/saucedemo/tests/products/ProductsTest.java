package part2.com.saucedemo.tests.products;

import com.saucedemo.pages.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import part2.com.saucedemo.base.BaseTest;

//user can login into application and be displayed with products on the page
public class ProductsTest extends BaseTest {


    @Test
    public void testProductsHeaderIsDisplayed(){
        ProductsPage productsPage = loginPage.
                logIntoApp("standard_user", "secret_sauce");
        Assert.assertTrue(productsPage.isProductHeaderDisplayed(), " \n Products Page Not Displayed \n");
    }
}
