package simplews;

import org.junit.Assert;
import org.junit.Test;

public class LoginServiceTest {

    @Test
    public void testValidLogin() {
    	Assert.assertEquals("Login Successful",
    	        LoginService.login("student", "pass123"));
    }

    @Test
    public void testInvalidUsername() {
        Assert.assertEquals("Invalid Username",
                LoginService.login("wrong", "pass123"));
    }

    @Test
    public void testInvalidPassword() {
        Assert.assertEquals("Invalid Password",
                LoginService.login("student", "wrong"));
    }

    @Test
    public void testEmptyLogin() {
        Assert.assertEquals("Login Failed",
                LoginService.login("", ""));
    }
}