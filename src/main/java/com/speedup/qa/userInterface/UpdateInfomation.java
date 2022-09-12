package com.speedup.qa.userInterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class UpdateInfomation{

    WebDriver driver;
    public static final Target PERSONAL_INFORMATION = Target
            .the("Ingresar a informacion personal")
            .located(By.xpath("(//li[@class='nav-bar-item'])[4]"));

    public static final Target CHOSE_FILE = Target
            .the("Elegir Archivo")
            .located(By.xpath("//input[@id='image']"));

    public static final Target FIRST_NAME = Target
            .the("Se ingresa el nombre")
            .located(By.xpath("(//input[@class='input ng-untouched ng-pristine ng-valid'])[1]"));

    public static final Target LAST_NAME = Target
            .the("Se ingresa el apellido")
            .located(By.xpath("(//input[@class='input ng-untouched ng-pristine ng-valid'])[1]"));

    public static final Target BIRTH = Target
            .the("Se ingresa la fecha")
            .located(By.xpath("(//input[@class='input ng-untouched ng-pristine ng-valid'])[1]"));

    public static final Target SELECT_NATIONALITY = Target
            .the("Seleciona nacionalidad")
            .located(By.xpath("//select[@class='select ng-valid ng-touched ng-dirty']"));

    public static final Target NATIONALITY = Target
            .the("Nacionalidad")
            .located(By.linkText("Estados Unidos"));

    public static final Target SAVE = Target
            .the("Guardar")
            .located(By.id("save-profile"));

}
