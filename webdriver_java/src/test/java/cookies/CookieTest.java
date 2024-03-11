package cookies;

import static org.testng.Assert.assertFalse;

import base.BaseTests;
import java.util.Set;
import org.openqa.selenium.Cookie;
import org.testng.annotations.Test;

public class CookieTest extends BaseTests {

    @Test
    public void testCookieDeletion() {
        Set<Cookie> initialCookies = getCookies();
        Cookie cookieToDelete = initialCookies.iterator().next();
        deleteCookie(cookieToDelete);
        Set<Cookie> finalCookies = getCookies();
        assertFalse(finalCookies.contains(cookieToDelete), "Cookie has been deleted");
    }

}
