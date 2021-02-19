package net.logcodapps.apma.utilits;

import javafx.animation.FadeTransition;
import javafx.scene.control.Label;
import javafx.util.Duration;

public class Utilits {

	public static void animateMessage(Label success) {
        FadeTransition ft = new FadeTransition(Duration.millis(1000), success);
        ft.setFromValue(0.0);
        ft.setToValue(1);
        ft.play();
    }
}
