package com.speedup.qa.userInterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class OrderOk {
    public static final Target ORDER_OK = Target
            .the("Boton Confirmar Pedido")
            .located(By.xpath("//button[@id='order-confirm']"));

    public static final Target CLOSE_POPUP = Target
            .the("Boton Cerrar pedido")
            .located(By.xpath("(//div[@class='modal-content']//span[@class='close'])[3]"));
}
