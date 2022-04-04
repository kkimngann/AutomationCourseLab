package lesson_11;

public class lab_11 {
    public static void main(String[] args) {
        InternalLoginPage internalLoginPage = new InternalLoginPage();
        internalLoginPage.login();
        ExternalLoginPage externalLoginPage = new ExternalLoginPage();
        externalLoginPage.login();
    }
}
