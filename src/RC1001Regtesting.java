
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RC1001Regtesting {

public static void main(String[] args) throws InterruptedException {
// TODO Auto-generated method stub

//setting the driver executable
System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

//Initiating your chromedriver
WebDriver driver=new ChromeDriver();

//Applied wait time
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//maximize window
driver.manage().window().maximize();

//open browser with desried URL
driver.get("https://www.gj.mahidol.ac.th/main/register/"); 
driver.findElement(By.xpath("/html/body/div[2]/div[2]/i")).click(); 

driver.findElement(By.id("user_login-667")).sendKeys("gunktp14");  
driver.findElement(By.id("user_email-667")).sendKeys("6442590003@webmail.npru.ac.th"); 
driver.findElement(By.id("user_password-667")).sendKeys("0979603214"); 
driver.findElement(By.id("confirm_user_password-667")).sendKeys("0979603214");
driver.findElement(By.id("first_name-667")).sendKeys("กัตพัตร์");
driver.findElement(By.id("last_name-667")).sendKeys("สมหวัง");
driver.findElement(By.id("first_name_en-667")).sendKeys("Kuttapat");
driver.findElement(By.id("Last_name_en-667")).sendKeys("Somwang");
driver.findElement(By.id("id-667")).sendKeys("1418529188408");
driver.findElement(By.id("father_name-667")).sendKeys("สมชาย สมหวัง");
driver.findElement(By.id("mother_name-667")).sendKeys("สมหญิง สมหวัง");
driver.findElement(By.id("house_number-667")).sendKeys("270");
driver.findElement(By.id("moo-667")).sendKeys("9");
driver.findElement(By.id("alley-667")).sendKeys("เจริญดี 5");
driver.findElement(By.id("village-667")).sendKeys("-");
driver.findElement(By.id("street-667")).sendKeys("-");
driver.findElement(By.id("sub_district-667")).sendKeys("ลำพยา");
driver.findElement(By.id("district-667")).sendKeys("เมืองนครปฐม");
driver.findElement(By.id("postal_code-667")).sendKeys("73000");
driver.findElement(By.id("phone_home-667")).sendKeys("034254583");
driver.findElement(By.id("phone_office-667")).sendKeys("-");
driver.findElement(By.id("phone_number-667")).sendKeys("0979603214");
driver.findElement(By.id("related_as-667")).sendKeys("ป้า");
driver.findElement(By.id("ralated_name-667")).sendKeys("สมป้า สมหวัง");
driver.findElement(By.xpath("/html/body/div[1]/main/article/div/div/div[3]/div[2]/div/div/div/div[1]/div[2]/div/div/div[3]/div/div/form/div[5]/div[5]/div/div/label/span[1]/i")).click();
driver.findElement(By.id("phone_home_related-667")).sendKeys("034254583");
driver.findElement(By.id("phone_office_related-667")).sendKeys("-");
driver.findElement(By.id("phone_related-667")).sendKeys("0979603214");
driver.findElement(By.xpath("//*[@id=\"um_field_667_drug_allergy_history\"]/div[2]/label[2]/span[1]/i")).click();
driver.findElement(By.xpath("//*[@id=\"um_field_667_congenital_disease\"]/div[2]/label[2]/span[1]/i")).click();
driver.findElement(By.xpath("//*[@id=\"um_field_667_news_email\"]/div/label/span[1]/i")).click();
driver.findElement(By.xpath("//*[@id=\"um_field_667_accept_data\"]/div/label/span[1]/i")).click();






Thread.sleep(4000);

//closing the browser
driver.close();

}

}