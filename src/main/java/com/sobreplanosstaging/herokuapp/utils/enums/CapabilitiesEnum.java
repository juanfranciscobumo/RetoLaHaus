package com.sobreplanosstaging.herokuapp.utils.enums;

public enum CapabilitiesEnum {
    CHROME("chrome"),
    OPERA("opera"),
    EDGE("edge"),
    MOZILLA("mozilla"),
    INTERNET_EXPLORER("explorer"),
    SAFARI("safari"),
    CHROME_MOBILE("mobile"),
    REMOTE_DRIVER("remote"),

    ENVIROMENT("environment"),

    WEBDRIVER_GECKO_DRIVER("webdriver.gecko.driver"),
    WEBDRIVER_EDGE_DRIVER("webdriver.edge.driver"),
    WEBDRIVER_OPERA_DRIVER("webdriver.opera.driver"),
    WEBDRIVER_IE_DRIVER("webdriver.ie.driver"),
    WEBDRIVER_CHROME_DRIVER("webdriver.chrome.driver"),

    RUTA_MOZILLA("src/test/resources/drivers/geckodriver.exe"),
    RUTA_CHROME("src/test/resources/drivers/chromedriver.exe"),
    RUTA_OPERA("src/test/resources/drivers/operadriver.exe"),
    RUTA_EDGE("src/test/resources/drivers/msedgedriver.exe"),
    RUTA_INTERNET_EXPLORER("src/test/resources/drivers/IEDriverServer.exe"),

    PRIVATE_MOZILLA("-private"),
    PRIVATE_OPERA("private"),
    PRIVATE_GOOGLE("--incognito"),

    MAXIMIZE("--start-maximized"),

    WIDTH("width"),
    HEIGHT("height"),
    PIXEL_RADIO("pixelRatio"),
    DEVICE_METRICS("deviceMetrics"),
    USER_AGENT("userAgent"),
    USER_AGENT_CAPS("Mozilla/5.0 (Linux; Android 4.2.1; en-us; Responsive, like Gecko) Chrome/18.0.1025.166 Mobile Safari/535.19"),
    MOBILE_EMULATION("mobileEmulation"),
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
