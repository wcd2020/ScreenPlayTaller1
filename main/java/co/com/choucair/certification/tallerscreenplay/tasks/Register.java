package co.com.choucair.certification.tallerscreenplay.tasks;

import co.com.choucair.certification.tallerscreenplay.interactions.*;
import co.com.choucair.certification.tallerscreenplay.model.RegisterPage;
import co.com.choucair.certification.tallerscreenplay.userinterface.DatosPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class Register implements Task {

    private List<RegisterPage> registerpage;

    public Register(List<RegisterPage> registerpage) {
        this.registerpage = registerpage;
    }

    public static Register onThePage(List<RegisterPage> registerpage) {
        return Tasks.instrumented(Register.class,registerpage);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(registerpage.get(0).getName()).into(DatosPage.INPUT_FIRSTNAME),
                Enter.theValue(registerpage.get(0).getLast()).into(DatosPage.INPUT_LASTNAME),
                Enter.theValue(registerpage.get(0).getAddress()).into(DatosPage.INPUT_ADDRES),
                Enter.theValue(registerpage.get(0).getEmail()).into(DatosPage.INPUT_EMAIL),
                Enter.theValue(registerpage.get(0).getNumber()).into(DatosPage.INPUT_PHONE),
                Click.on(DatosPage.CHECK_GENDER),
                Click.on(DatosPage.CHECK_HOBBIES),
                Click.on(DatosPage.LIST_LANGUAGE),
                Seleccionar.laLista(DatosPage.OPTION_LANGUAGE, registerpage.get(0).getLanguage()),
                SeleccionarSkill.laLista(DatosPage.OPTION_SKILL, registerpage.get(0).getSkill()),
                SeleccionarContry.laLista(DatosPage.OPTION_CONTRY, registerpage.get(0).getContry()),
                SeleccionarSeleContry.laLista(DatosPage.OPTION_SELECONTRY, registerpage.get(0).getSelecontry()),
                SeleccionarYear.laLista(DatosPage.OPTION_YEAR, registerpage.get(0).getYear()),
                SeleccionarMonth.laLista(DatosPage.OPTION_MONTH, registerpage.get(0).getMonth()),
                SeleccionarDay.laLista(DatosPage.OPTION_DAY, registerpage.get(0).getDay()),
                Enter.theValue(registerpage.get(0).getPassword()).into(DatosPage.INPUT_PASSWORD),
                Enter.theValue(registerpage.get(0).getConfirpassword()).into(DatosPage.INPUT_CONFIRPASSWORD),
                Click.on(DatosPage.ENTER_BUTTON)

    );
    }
}
