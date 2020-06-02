package co.com.choucair.certification.tallerscreenplay.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ValidationLabel extends PageObject {
    public static final Target NAME_LABEL = Target.the("Extrae el nombre del label")
            .located(By.xpath("/html/body/section/div[1]/div/div[2]/h4[1]"));
}
