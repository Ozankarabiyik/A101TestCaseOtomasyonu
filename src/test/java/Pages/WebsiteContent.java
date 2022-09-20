package Pages;

import Utilities.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebsiteContent extends Parent {

    public WebsiteContent() {
        PageFactory.initElements(WebDriver.getDriver(), this);
    }

    @FindBy(xpath = "//button[text()='Kabul Et']")
    private WebElement cookiesAccept;

    @FindBy(xpath = "(//a[@href='/giyim-aksesuar/'])[1]")
    private WebElement giyimAksesuar;

    @FindBy(xpath = "(//a[@href='/giyim-aksesuar/kadin-ic-giyim/'])[2]")
    private WebElement kadinIcGiyim;

    @FindBy(xpath = "(//a[@href='/giyim-aksesuar/dizalti-corap/'])[2]")
    private WebElement dizaltiCorap;

    @FindBy(xpath = "//a[@href='/giyim-aksesuar/penti-kadin-50-denye-pantolon-corabi-siyah/']")
    private WebElement siyahcorap;

    @FindBy(css = "[class='selected-variant-text']>span")
    private WebElement siyahRenkOnay;

    @FindBy(xpath = "//button[@data-pk='18864']")
    private WebElement sepeteEkle;

    @FindBy(xpath = "(//a[text()='Sepeti Görüntüle'])[2]")
    private WebElement sepetiGoruntele;

    @FindBy(xpath = "(//a[@title='Sepeti Onayla'])[2]")
    private WebElement sepetiOnayla;

    @FindBy(xpath = "//a[@title='ÜYE OLMADAN DEVAM ET']")
    private WebElement uyeOlmadanDevamEt;

    @FindBy(xpath = "//input[@name='user_email']")
    private WebElement email;

    @FindBy(xpath = "//button[@class='button block green']")
    private WebElement devamEt;

    @FindBy(xpath = "(//a[@title='Yeni adres oluştur'])[1]")
    private WebElement yeniAdres;

    @FindBy(xpath = "//input[@name='title']")
    private WebElement adresBasligi;

    @FindBy(name = "first_name")
    private WebElement firstName;

    @FindBy(name = "last_name")
    private WebElement lastName;

    @FindBy(name = "phone_number")
    private WebElement phoneNumber;

    @FindBy(css = "select[name='city']")
    private WebElement ilSecim;

    @FindBy(css = "option[value='40']")
    private WebElement sehir;

    @FindBy(css = "select[name='township']")
    private WebElement ilceSecim;
    @FindBy(css = "option[value='455']")
    private WebElement ilce;

    @FindBy(css = "select[name='district']")
    private WebElement mahalleSecim;

    @FindBy(css = "option[value='35513']")
    private WebElement mahalle;

    @FindBy(css = "textarea[name='line']")
    private WebElement adres;

    @FindBy(xpath = "(//button[@type='button'])[6]")
    private WebElement kaydet;

    @FindBy(xpath = "//button[@class='button block green js-proceed-button']")
    private WebElement kaydetveDevam;


    @FindBy(xpath = "(//div[@class='section-hero'])[5]")
    private WebElement odemeEkranidogrulama;
    WebElement setElement;

    /*Elementleri String olarak belirtmemim sebebi, projenin daha sonra Cucumber da Gherkin Language kullanarak
    DataTable ve Scenario Outline'a uygun bir şekilde oluşturulması.*/
    public void findAndClick(String element) {
        switch (element) {
            case "cookiesAccept":
                setElement = cookiesAccept;
                break;
            case "giyimAksesuar":
                setElement = giyimAksesuar;
                break;
            case "kadinIcGiyim":
                setElement = kadinIcGiyim;
                break;
            case "dizaltiCorap":
                setElement = dizaltiCorap;
                break;
            case "siyahcorap":
                setElement = siyahcorap;
                break;
            case "sepeteEkle":
                setElement = sepeteEkle;
                break;
            case "sepetiGoruntele":
                setElement = sepetiGoruntele;
                break;
            case "sepetiOnayla":
                setElement = sepetiOnayla;
                break;
            case "uyeOlmadanDevamEt":
                setElement = uyeOlmadanDevamEt;
                break;
            case "devamEt":
                setElement = devamEt;
                break;
            case "yeniAdres":
                setElement = yeniAdres;
                break;
            case "ilSecim":
                setElement = ilSecim;
                break;
            case "sehir":
                setElement = sehir;
                break;
            case "ilceSecim":
                setElement = ilceSecim;
                break;
            case "ilce":
                setElement = ilce;
                break;
            case "mahalleSecim":
                setElement = mahalleSecim;
                break;
            case "mahalle":
                setElement = mahalle;
                break;
            case "kaydet":
                setElement = kaydet;
                break;
            case "kaydetveDevam":
                setElement = kaydetveDevam;
                break;
        }
        clickFunction(setElement);
    }

    public void findAndSend(String element, String value) {
        switch (element) {
            case "email":
                setElement = email;
                break;
            case "adresBasligi":
                setElement = adresBasligi;
                break;
            case "firstName":
                setElement = firstName;
                break;
            case "lastName":
                setElement = lastName;
                break;
            case "phoneNumber":
                setElement = phoneNumber;
                break;
            case "adres":
                setElement = adres;
                break;
        }
        sendKeysFunction(setElement, value);
    }

    public void findAndContainsText(String element, String text) {
        switch (element) {
            case "siyahRenkOnay":
                setElement = siyahRenkOnay;
                break;
            case "odemeEkranidogrulama":
                setElement = odemeEkranidogrulama;
                break;
        }
        verifyContainsText(setElement, text);
    }
}
