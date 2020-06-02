package co.com.choucair.certification.tallerscreenplay.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DatosPage extends PageObject {
    public static final Target INPUT_FIRSTNAME = Target.the("where do we write the first name")
            .located(By.xpath("//*[@id='basicBootstrapForm']/div[1]/div[1]/input"));
    public static final Target INPUT_LASTNAME = Target.the("where do we write the last name")
            .located(By.xpath("//*[@id='basicBootstrapForm']/div[1]/div[2]/input"));
    public static final Target INPUT_ADDRES = Target.the("where do we write the address")
            .located(By.xpath("//*[@id='basicBootstrapForm']/div[2]/div/textarea"));
    public static final Target INPUT_EMAIL = Target.the("where do we write the email")
            .located(By.xpath("//*[@id='eid']/input"));
    public static final Target INPUT_PHONE = Target.the("where do we write the phone")
            .located(By.xpath("//*[@id='basicBootstrapForm']/div[4]/div/input"));
    public static final Target CHECK_GENDER = Target.the("where do we write the gender")
            .located(By.xpath("//*[@id='basicBootstrapForm']/div[5]/div/label[1]/input"));
    public static final Target CHECK_HOBBIES = Target.the("where do we write the hobbies")
            .located(By.id("checkbox1"));
    public static final Target OPTION_LANGUAGE = Target.the("where do we write the option language")
            .located(By.xpath("//*[@id='basicBootstrapForm']/div[7]/div/multi-select/div[2]/ul"));
    public static final Target LIST_LANGUAGE = Target.the("where do we write the language")
            .located(By.id("msdd"));
    public static final Target OPTION_SKILL = Target.the("where do we write the option skill")
            .located(By.xpath("//*[@id='basicBootstrapForm']/div[8]/div"));
    public static final Target OPTION_CONTRY = Target.the("where do we write the option contry")
            .located(By.xpath("//*[@id='basicBootstrapForm']/div[9]/div"));
    public static final Target OPTION_SELECONTRY = Target.the("where do we write the option sele contry")
            .located(By.id("country"));
    public static final Target OPTION_YEAR = Target.the("where do we write the option sele year")
            .located(By.id("yearbox"));
    public static final Target OPTION_MONTH = Target.the("where do we write the option sele month")
            .located(By.xpath("//*[@id='basicBootstrapForm']/div[11]/div[2]/select"));
    public static final Target OPTION_DAY = Target.the("where do we write the option sele day")
            .located(By.id("daybox"));
    public static final Target INPUT_PASSWORD = Target.the("where do we write the password")
            .located(By.id("firstpassword"));
    public static final Target INPUT_CONFIRPASSWORD = Target.the("where do we write the confir password")
            .located(By.id("secondpassword"));
    public static final Target ENTER_BUTTON = Target.the("where do we write the confir password")
            .located(By.id("submitbtn"));
}
