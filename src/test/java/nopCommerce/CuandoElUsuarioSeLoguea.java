package nopCommerce;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import nopCommerce.questions.LaPaginaNopCommerce;
import nopCommerce.actions.Decidido;
import nopCommerce.actions.IngresarCon;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

//@ExtendWith(SerenityJUnit5Extension.class)
@RunWith(SerenityRunner.class)
public class CuandoElUsuarioSeLoguea {
    Actor actor;

    @Managed
    WebDriver navegador;

    @Before
    public void prepararEscenario(){

        actor = Actor.named("Fabian");
        actor.can(BrowseTheWeb.with(navegador));

    }

    @Test
    public void ingresarANopCommerceCorrectamente(){

        //El actor se registra en nuestra plataforma de ventas
        //Given
        actor.has(Decidido.ingresarConUsuarioYContrasena());
        //El actor quiere ingresar a su cuenta
        //When
        actor.attemptsTo(IngresarCon.usuario("ing.pruebas@hotmail.com").contrasena("123456"));
        //El actor puede ver el subtitulo de la cuenta
        //Then
        actor.should(seeThat("Subitulo de pagina nopCommerce", LaPaginaNopCommerce.subtitulo(), equalTo("MY ACCOUNT")));
    }


}
