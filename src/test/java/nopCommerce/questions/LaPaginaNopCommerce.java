package nopCommerce.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import nopCommerce.ui.PaginaMiCuenta;

public class LaPaginaNopCommerce {
    public static Question<String> subtitulo(){
        return actor -> Text.of(PaginaMiCuenta.SUBTITULO)
                .answeredBy(actor);
    }
}
