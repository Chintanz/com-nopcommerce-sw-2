package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {
    //set base url
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    //set up browser
    public void setUp(){
        openBrowser(baseUrl);
         }
         @Test
public void userShouldNavigateToComputerPageSuccessfully(){
        //click on the ‘Computers’ Tab
driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Computers ']")).click();

//Verify the text ‘Computers’
             WebElement computerText = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Computers ']"));
             String text = computerText.getText();
             System.out.println(text);
             Assert.assertEquals("Computers",text);

}
@Test
public void userShouldNavigateToElectronicsPageSuccessfully(){
      //click on the ‘Electronics’ Tab
    driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Electronics ']")).click();
   // Verify the text ‘Electronics’
    WebElement electronicText = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Electronics ']"));
    String text = electronicText.getText();
    System.out.println(text);
    Assert.assertEquals("Electronics",text);
}
@Test
    public void userShouldNavigateToApparelPageSuccessfully(){
        //click on the ‘Apparel’ Tab
    driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Apparel ']")).click();
      //Verify the text ‘Apparel’
    WebElement apparelText = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Apparel ']"));
    String text = apparelText.getText();
    System.out.println(text);
    Assert.assertEquals("Apparel",text);
}
@Test
public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
    //click on the ‘Digital downloads’ Tab
    driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Digital downloads ']")).click();
    //Verify the text ‘Digital downloads’
    WebElement digitalDownloadsText = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Digital downloads ']"));
    String text = digitalDownloadsText.getText();
    System.out.println(text);
    Assert.assertEquals("Digital downloads", text);
}
@Test
public void userShouldNavigateToBooksPageSuccessfully() {
    //click on the ‘Books’ Tab
    driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Books ']")).click();
    //Verify the text ‘Books’
    WebElement booksText = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Books ']"));
    String text = booksText.getText();
    System.out.println(text);
    Assert.assertEquals("Books", text);
}
@Test
public void userShouldNavigateToJewelryPageSuccessfully() {
    //click on the ‘Jewelry’ Tab
    driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Jewelry ']")).click();
    //Verify the text ‘Jewelry’
    WebElement jewelryText = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Jewelry ']"));
    String text = jewelryText.getText();
    System.out.println(text);
    Assert.assertEquals("Jewelry", text);
}
@Test
public void userShouldNavigateToGiftCardsPageSuccessfully() {
    //click on the ‘Gift Cards’ Tab
    driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Gift Cards ']")).click();
    //Verify the text ‘Gift Cards ’
    WebElement giftCardsText = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Gift Cards ']"));
    String text = giftCardsText.getText();
    System.out.println(text);
    Assert.assertEquals("Gift Cards", text);
}


}
