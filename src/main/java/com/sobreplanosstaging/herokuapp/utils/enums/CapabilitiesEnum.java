package com.sobreplanosstaging.herokuapp.utils.enums;

public enum CapabilitiesEnum {

    REMOTE_DRIVER("remote"),

    DRIVER("driver"),

    WEBDRIVER_GECKO_DRIVER("webdriver.gecko.driver"),
    WEBDRIVER_CHROME_DRIVER("webdriver.chrome.driver"),

    RUTA_MOZILLA("src/test/resources/drivers/geckodriver.exe"),
    RUTA_CHROME("src/test/resources/drivers/chromedriver.exe"),

    PRIVATE_MOZILLA("-private"),
    PRIVATE_GOOGLE("--incognito"),

    MAXIMIZE("--start-maximized"),

    ACCEPT_INSECURE_CERTS("acceptInsecureCerts"),
    URL_REMOTE("http://localhost:4444/wd/hub");
    private String atributo;


    private CapabilitiesEnum(String atributo) {
        this.atributo = atributo;
    }

    public String getAtributo() {
        return atributo;
    }
}
