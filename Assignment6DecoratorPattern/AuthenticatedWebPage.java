package Assignment6DecoratorPattern;

public class AuthenticatedWebPage extends WebPageDecorator{
    int token;
    public AuthenticatedWebPage(WebPage decoratedPage, int token) {
        super(decoratedPage);
        this.token = token;}
    public boolean authenticateUser() {
//        System.out.println("Checking token : " + this.token);
        if(this.token % 3 == 0){
            return false;
        }
        System.out.println("Authenticating user");
        return true;
    }
    public void display() {
        if(this.authenticateUser()){
        super.display();
        }else{
            System.out.println("Not Authenticated to view this page");
        }

    }
}
