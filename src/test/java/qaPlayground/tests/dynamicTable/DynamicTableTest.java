package qaPlayground.tests.dynamicTable;

import org.testng.Assert;
import org.testng.annotations.Test;
import qaPlayground.base.BaseTest;

import static com.base.BasePage.delay;

public class DynamicTableTest extends BaseTest {

    @Test
    public void testFindingSpecificNameWithinTable(){
        var dynamicTablePage = homePage.goToDynamicTablePage();

        String expectedNameOfHero = "Peter Parker";
        boolean isHeroPresent = dynamicTablePage.isHeroInTable("Spider-Man", expectedNameOfHero);
        Assert.assertTrue(isHeroPresent, "\n Spider-Man's real name 'Peter Parker' was not found in the table. \n");
    }
}
