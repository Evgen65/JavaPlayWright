import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPhoneBookTest extends TestBase{
    @Test
    public void LoginPositiveTest() {
        page.navigate("https://telranedu.web.app/home");
        page.locator("a[href='/login']").click();
        page.locator("//input[@placeholder='Email']").click();
        page.getByPlaceholder("Email").click();
        page.getByPlaceholder("Email").fill("abcd@mail.com");
        page.getByPlaceholder("Password").click();
        page.getByPlaceholder("Password").fill("Abcd1234$");
        page.locator("//button[.='Login']").click();
        Assert.assertTrue(page.locator("//button").textContent().contains("Sign Out"));
    }
}
