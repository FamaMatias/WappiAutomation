package com.speedup.qa.userInterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class OrderInList {
    public static final Target ORDER_IN_LIST = Target
            .the("Pedido en la lista")
            .located(By.xpath("//tr[@id='order-0']"));

}
