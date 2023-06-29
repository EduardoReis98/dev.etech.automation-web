package dev.etech.automation_web.pages;

import org.openqa.selenium.By;

public class SeriesPage {

    By seriesSubmenu = By.xpath("//li[@data-v-77f2d1d7 and descendant:: span[text()='Séries']]");

    By nomeSeriesSubmenu = By.xpath("//h2[@data-v-362558b1]");

    public By getSeriesSubmenu() {
        return seriesSubmenu;
    }

    public By getNomeSeriesSubmenu() {
        return nomeSeriesSubmenu;
    }
}
