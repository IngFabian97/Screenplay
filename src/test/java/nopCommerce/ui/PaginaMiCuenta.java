package nopCommerce.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaMiCuenta {
    public static final Target SUBTITULO = Target.the("Subtitulo de la página nopCommerce")
            .located(By.xpath("//a[@class='ico-account']"));
}
