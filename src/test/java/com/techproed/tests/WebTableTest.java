package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class WebTableTest extends TestBase {

    //Her test methodundan once calisir
    @BeforeMethod
    public void beforeMethod(){
        driver.get("http://fhctrip-qa.com/admin/HotelroomAdmin");
        driver.findElement(By.id("UserName")).sendKeys("manager2");
        driver.findElement(By.id("Password")).sendKeys("Man1ager2!" + Keys.ENTER);

    }
    @Test
    public void basliklar() {
        // sayfadaki basliklar //table//th
        List<WebElement> basliklar = driver.findElements(By.xpath("//table//th"));
        for (WebElement w : basliklar) {
            System.out.println(w.getText());

        }
    }
    @Test
    public void tumSatirlar(){
        // sayfadaki tüm satırlar : //tbody/tr
        List<WebElement> satirlar = driver.findElements(By.xpath("//tbody/tr"));
        for(WebElement w : satirlar){
            System.out.println(w.getText());
        }
    }
    @Test
    public void sutunYazdirma(){
        List<WebElement> besinciSutun = driver.findElements(By.xpath("//tbody/tr/td[5]"));
        for (WebElement w: besinciSutun) {
            System.out.println(w.getText());

        }
    }
    @Test
    public void hucreYazdirma(){
        WebElement hucre = driver.findElement(By.xpath("//tbody/tr[2]/td[5]"));
        System.out.println(hucre.getText());

    }

    //Her test methodundan sonra calisir
    @AfterMethod
    public void afterMethod(){


    }


}
