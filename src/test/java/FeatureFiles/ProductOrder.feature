Feature: A101 Product Order functionality

  Scenario: Siyah dizalti corap Siparis adimlari
    Given Web sitesine gidilir
    When Urunlerden Siyah dizalti corap bulunur
    And Urunun siyah dizalti corap oldugu dogrulanir
    And Urun secilir ve sepete ekle butonuna tiklanir
    And Sepeti görüntüle butonuna tiklanir
    And Sepeti onayla butonuna tıklanir
    And Üye olmadan devam et butonuna tıklanir
    And Adres olusturulur
    And Siparis tamamla butonuna tiklanir
    Then Odeme ekranina gidildigi dogrulanir