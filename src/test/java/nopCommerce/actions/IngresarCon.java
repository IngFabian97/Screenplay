package nopCommerce.actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import nopCommerce.ui.PaginaLogin;
import org.openqa.selenium.Keys;

public class IngresarCon implements Task {

    private final String usuario;
    private final String contrasena;

    public IngresarCon(String usuario, String contrasena){
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public static IngresarConBuilder usuario(String usuario) {
        return new IngresarConBuilder(usuario);
    }

    @Override
    @Step("{0} ingresa a su cuenta con usuario: #usuario y con la contraseña: #contraseña")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(usuario).into(PaginaLogin.EMAIL).thenHit(Keys.TAB),
                Enter.theValue(contrasena).into(PaginaLogin.PASSWORD).thenHit(Keys.TAB),
                Click.on(PaginaLogin.BOTON_SIGN_IN)
        );
    }

    public static class IngresarConBuilder{
        private String usuario;
        public IngresarConBuilder(String usuario){
            this.usuario = usuario;
        }

        public Performable contrasena(String contrasena){
            return Instrumented.instanceOf(IngresarCon.class)
                    .withProperties(usuario,contrasena);
        }
    }


}
