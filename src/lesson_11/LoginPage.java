package lesson_11;

abstract class LoginPage {
    ILogin iLogin;
    public void login(){
        iLogin.login();
    }
}
