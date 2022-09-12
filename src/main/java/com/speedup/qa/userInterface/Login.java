package com.speedup.qa.userInterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Login {

    public static final Target USER_NAME = Target
            .the("Se ingresa el nombre de usuario")
            .located(By.id("username"));

    public static final Target USER_PASSWORD = Target
            .the("Se ingresa la contraseña")
            .located(By.id("password"));

    public static final Target VALIDATE_LOGIN = Target
            .the("Validar el Ingreso")
            .located(By.className("app-title"));

    public static final Target LOGIN_OK = Target
            .the("Ingresar a la page")
            .located(By.id("button-login"));

}
