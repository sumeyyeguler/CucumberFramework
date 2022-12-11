package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target\\cucumber reports .html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"
        },
        features = "src/test/resources/features",
        glue = "stepDefinitions",




        tags = "@amazonSearch",//2 tagi ayni anada calistirmak isterseniz "@gp1 or @gp2" seklinde yazariz




        dryRun = false
)


public class TestRunner {
/*
Runner Class'i TestNG'deki XML mantigi ile calisir
Calistirmak istedigimiz senaryolari tag belirtiriz
ve belirttigimiz taglari calistirir XML'deki gibi istedigimiz testleri calitrimak icin kullaniriz
Runner Class body'si bostur ve Runner Class'ini ekleyecegimiz notasyonlar aktive eder
Bu class'da kullanacagimiz 2 adet notasyon vardir
1-@RunWith(Cucumber.class)  notasyonu Runner Class'ina calisma ozelligi ekler,
Bu notasyon oldugu icin Cucumber frameworkumuz de Junit kullanmayi tercih ederiz

2-@CucumberOptions notasyonu icin de

features :Runner dosyasinin feature dosyasini nereden bulacagimizi tarif eder
glue:stepDefinitions yolunu belirtiriz
tags :Hangi tagi calistirmak istiyorsak onu belli eder

dryRun: 2 secenek vardir
a-)dryRun=true --> dersek testimizi calistirmadan eksik adimlari bize verir
b-)dryRun=false-->Testlerimizi drive ile calistirir
 */


}
