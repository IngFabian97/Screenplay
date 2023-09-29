package nopCommerce.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaLogin {
   public static Target EMAIL = Target.the("Entrada de correo")
           .located(By.xpath("//input[@id='Email']"));
   public static Target PASSWORD = Target.the("Entrada de contraseña")
            .located(By.xpath("//input[@id='Password']"));

   public static Target BOTON_SIGN_IN= Target.the("Clic sobre el boton Log in")
           .located(By.xpath( "//button[normalize-space()='Log in']"));
}
