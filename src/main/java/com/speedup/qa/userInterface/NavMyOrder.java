package com.speedup.qa.userInterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class NavMyOrder {
    public static final Target MY_ORDER = Target
            .the("Boton de Mis Pedidos")
            .located(By.xpath("(//a[@class='nav-bar-link'])[2]"));
}
