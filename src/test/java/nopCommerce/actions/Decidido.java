package nopCommerce.actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import nopCommerce.constants.Constants;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Decidido implements Task {
    public Decidido(){

    }

    public static Performable ingresarConUsuarioYContrasena() {
        return instrumented(Decidido.class);
    }

    @Override
    @Step("{0} a decidido ingresar con su cuenta" )
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Navegar.hacia(Constants.PAGINA_SIGN_IN));
    }
}
