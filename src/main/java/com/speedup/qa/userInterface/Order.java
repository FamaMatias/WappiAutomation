package com.speedup.qa.userInterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Order {
    public static final Target ORDER = Target
            .the("Boton de Pedir")
            .located(By.xpath("(//button[@class='button success offers-table-block-button'])[1]"));

}
