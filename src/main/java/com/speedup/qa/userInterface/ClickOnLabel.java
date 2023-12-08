package com.speedup.qa.userInterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ClickOnLabel {
    public static final Target USER_NAME = Target
            .the("Se ingresa el nombre de usuario")
            .located(By.id("username"));

    public static final Target USER_PASSWORD = Target
            .the("Se ingresa la contraseña")
            .located(By.id("password"));

    public static final Target WARNING_USER = Target
            .the("advertencia usuario obligatorio")
            .located(By.id("e-username"));

    public static final Target WARNING_PASSWORD = Target
            .the("Advertencia contraseña obligatoria")
            .located(By.id("e-password"));

}
