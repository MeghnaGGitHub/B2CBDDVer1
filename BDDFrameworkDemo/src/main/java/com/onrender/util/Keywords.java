package com.onrender.util;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
public class Keywords {
    /* ------ declared globally so that can be used anywhere but when integrated.----*/
    public static WebDriver wd;
    /*---browser set-up----*/
    public void browserSetUp() {

        wd = new FirefoxDriver();//instantiated FF browser by creating obj
        wd.manage().window().maximize();//maximized browser window
    }
    //Screenshot-> try,catch auto
    /*-- create method for FirefoxDriver to verify & call browser set-up method  --*/
    public WebDriver getFirefoxDriver() throws FileNotFoundException {//created a constructor to launch browser
        if (wd == null) {
            /*---if previously obj is null then only browserSetUp method will be called this will avoid multiple instance of browser--*/
            browserSetUp();
        }
        return wd;
    }
    /*---PASSING DIFFERENT LOCATOR AS PER ELEMENTS UNDER RESPECTIVE METHODS---*/
    public String getConfigValue(String key) throws IOException {//
        Properties prop= new Properties();
        File f = new File ("src/test/resources/config.properties");
        /*--FileInputStream is used to open any file & read data from it--*/
        FileInputStream input= new FileInputStream(f);
        prop.load(input);
        System.out.println("Able to read : -  " + prop.getProperty(key));
        return  prop.getProperty(key);
    }
    /*----Open Page method----*/
    public void openPage(String url) throws FileNotFoundException {//to open website creating a mthd openPage
        getFirefoxDriver().get(url);//passing url from config.prop file key
    }
    /*---PageTitle method----*/
    public String getPageTitle( ) throws FileNotFoundException {//created a constructor to launch browser
        return wd.getTitle();
    }
/*----Perform input action to text-box-----*/
    public void setText(String locator ,String value) throws FileNotFoundException {
        getFirefoxDriver().findElement(By.xpath(locator)).sendKeys(value);
    }
//    public void setTextByConfig(String locator ,String value) throws FileNotFoundException,IOException {
//        getFirefoxDriver().findElement(By.xpath(locator)).sendKeys(getConfigValue(value));
//    }
    /*----Perform click action----*/
    public void clickLocator(String locator) throws FileNotFoundException {
        getFirefoxDriver().findElement(By.xpath(locator)).click();
    }
    /*--Fetch text from element--*/
    public String  getText(String locator) throws FileNotFoundException {
       return  getFirefoxDriver().findElement(By.xpath(locator)).getText();
    }
    public String handelAlert(){
      String alertText=wd.switchTo().alert().getText();
        System.out.println("Alert ------ > "+ alertText);
        wd.switchTo().alert().accept();
        return alertText;
    }
    public void selectOptionFromCategoryDropdown(String locator,String option) throws FileNotFoundException {
        Select category_dropdown=new Select(getFirefoxDriver().findElement(By.xpath(locator)));
        category_dropdown.selectByVisibleText(option);
    }
    public String verifyHeaderColor(String locator) throws FileNotFoundException {
        WebElement element = getFirefoxDriver().findElement(By.xpath(locator));
        String actualColor = element.getAttribute("value");
        return actualColor;
    }
    public void setColor(String locator,String value) throws FileNotFoundException {
        JavascriptExecutor jse=(JavascriptExecutor) getFirefoxDriver();
        String query="document.querySelector("+'"' +locator+'"'+").value="+"'"+value+"'";
        System.out.println(query);
        jse.executeScript(query);
    }
       // jse.executeScript("arguments[0].setAttribute());

//    public void uploadFile(String locator, String path) throws FileNotFoundException, InterruptedException {
//        Thread.sleep(1000);
//      getFirefoxDriver().findElement(By.xpath(locator)).sendKeys(path);
//    }
    public static void uploadFileUsingJavaScript(WebDriver getFireWebDriver, WebElement fileUploadElement, String filePath) {
        // Convert the file path to an absolute path
        File file = new File(filePath);
        String absolutePath = file.getAbsolutePath();
        WebElement fileUploadElement= getFireWebDriver.findElement(By.xpath("input[name='color']"));
        // Use JavaScript to set the file input element's value to the absolute file path
        ((JavascriptExecutor) getFireWebDriver).executeScript("arguments[0].style.display='block';", fileUploadElement);
        ((JavascriptExecutor) getFireWebDriver).executeScript("arguments[0].value='" + absolutePath + "';", fileUploadElement);
    }
    ExtentHtmlReporter htmlReporter;
    ExtentReports extent;
    //helps to generate the logs in the test report.
    ExtentTest test;
    public ExtentReports reportSetup(){
        htmlReporter = new ExtentHtmlReporter("H:/BDDFrameworkDemo/target/cucumber-reports/Report.html");
        //initialize ExtentReports and attach the HtmlReporter
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        //configuration items to change the look and feel
        //add content, manage tests etc
       // htmlReporter.config().setChartVisibilityOnOpen(true);
        htmlReporter.config().setDocumentTitle("Simple Automation Report");
        htmlReporter.config().setReportName("Report");
       // htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
        //htmlReporter.config().setTheme(Theme.STANDARD);
        htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
    return extent;
    }
    public static void main(String[] args) throws IOException {
//        Properties prop= new Properties();
//        File f = new File ("src/test/resources/config.properties");
//        FileInputStream input= new FileInputStream(f);
//        prop.load(input);
//        System.out.println("Able to read : -  " + prop.getProperty("env_url"));
    }
}
// relevant screenshot for failed
//overloading edge cases on internet
// lead-code pattern based codes
//map
//collection program