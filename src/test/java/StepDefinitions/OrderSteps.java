package StepDefinitions;

import Pages.WebsiteContent;
import Utilities.WebDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;

public class OrderSteps extends WebDriver {
    WebsiteContent websiteContent = new WebsiteContent();

    @Given("Web sitesine gidilir")
    public void webSitesineGidilir() {
        WebDriver.getDriver().get("https://www.a101.com.tr/");
        WebDriver.getDriver().manage().window().maximize();
        WebDriver.getDriver().manage().deleteAllCookies();
        websiteContent.findAndClick("cookiesAccept");
    }

    @When("Urunlerden Siyah dizalti corap bulunur")
    public void urunlerdenSiyahDizaltiCorapBulunur() {
        websiteContent.findAndClick("giyimAksesuar");
        websiteContent.findAndClick("kadinIcGiyim");
        websiteContent.findAndClick("dizaltiCorap");
    }

    @And("Urunun siyah dizalti corap oldugu dogrulanir")
    public void urununSiyahDizaltiCorapOlduguDogrulanir() {
        websiteContent.findAndClick("siyahcorap");
        websiteContent.findAndContainsText("siyahRenkOnay", "SİYAH");
        System.out.println("Ürünün Siyah olduğu doğrulandı.");
    }

    @And("Urun secilir ve sepete ekle butonuna tiklanir")
    public void urunSecilirVeSepeteEkleButonunaTiklanir() {
        websiteContent.findAndClick("sepeteEkle");
    }

    @And("Sepeti görüntüle butonuna tiklanir")
    public void sepetiGörüntüleButonunaTiklanir() {
        websiteContent.findAndClick("sepetiGoruntele");
    }

    @And("Sepeti onayla butonuna tıklanir")
    public void sepetiOnaylaButonunaTıklanir() {
        websiteContent.findAndClick("sepetiOnayla");
    }

    @And("Üye olmadan devam et butonuna tıklanir")
    public void üyeOlmadanDevamEtButonunaTıklanir() {
        websiteContent.findAndClick("uyeOlmadanDevamEt");
    }

    @And("Adres olusturulur")
    public void adresOlusturulur() {
        String randomName = RandomStringUtils.randomAlphabetic(5); //Her seferinde farklı emailler ile deneme yapılması için mail
        websiteContent.findAndSend("email", randomName + "@gmail.com");
        websiteContent.findAndClick("devamEt");
        websiteContent.findAndClick("yeniAdres");
        websiteContent.findAndSend("adresBasligi", "Ev");
        websiteContent.findAndSend("firstName", "Kamil");
        websiteContent.findAndSend("lastName", "Yilmaz");
        websiteContent.findAndSend("phoneNumber", "05554443322");
        websiteContent.findAndClick("ilSecim");
        websiteContent.findAndClick("sehir");
        websiteContent.findAndClick("ilceSecim");
        websiteContent.findAndClick("ilce");
        wait(1);
        websiteContent.findAndClick("mahalleSecim");
        websiteContent.findAndClick("mahalle");
        websiteContent.findAndSend("adres", "Kahramanlar sokak");
        websiteContent.findAndClick("kaydet");
        wait(1);
    }

    @And("Siparis tamamla butonuna tiklanir")
    public void siparisTamamlaButonunaTiklanir() {
        websiteContent.findAndClick("kaydetveDevam");
    }

    @Then("Odeme ekranina gidildigi dogrulanir")
    public void odemeEkraninaGidildigiDogrulanir() {
        wait(1);
        websiteContent.findAndContainsText("odemeEkranidogrulama", "Masterpass ile Ödeme");
        System.out.println("Kullanıcının Ödeme Ekranında Olduğu Doğrulanır.");
    }
}
