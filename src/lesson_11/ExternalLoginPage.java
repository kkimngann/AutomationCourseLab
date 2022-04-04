package lesson_11;

public class ExternalLoginPage extends LoginPage{
    public ExternalLoginPage() {
        iLogin = new SSOLogin();
    }
}
