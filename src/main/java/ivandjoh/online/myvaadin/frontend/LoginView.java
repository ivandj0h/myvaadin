package ivandjoh.online.myvaadin.frontend;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.login.LoginOverlay;
import com.vaadin.flow.router.Route;

@Route("login")
public class LoginView extends Composite<LoginOverlay> {

    public LoginView() {
        getContent().setOpened(true);
        getContent().setAction("Login");
    }
}
