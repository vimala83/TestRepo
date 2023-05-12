package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LinkedlistPage {

	WebDriver driver;
	@FindBy(xpath="//a[@href='linked-list']")
	static WebElement LinkedlistGetstartedBtn;
	@FindBy(xpath="//a[@href='introduction']")WebElement introductionbtn;
	@FindBy(xpath="//a[@href='/tryEditor']")WebElement tryHereBtn;
	@FindBy(xpath="//div[contains(@class,'CodeMirror')])[1]")WebElement tryEditorBtn;
	@FindBy(xpath="//a[@href=\"creating-linked-list\"]")WebElement creatingLinkedList;
	@FindBy(xpath="//a[@href='tryEditor']")WebElement creatingLinkedListtryHereBtn;
	@FindBy(xpath="//a[@href='types-of-linked-list']")WebElement TypesofLinkedListBtn;
	@FindBy(xpath="//a[@href=\"/tryEditor\"]")WebElement typesOfLinkedListTryBtn;
	@FindBy(xpath="//a[@href=\"traversal\"]")WebElement Traversalbtn;
	@FindBy(xpath="//a[@href=\"/tryEditor\"]")WebElement TraversaltryHerebtn;
	@FindBy(xpath="//a[@href=\"deletion-in-linked-list\"]")WebElement DeletionLinkedList;
	@FindBy(xpath="//a[@href=\"/tryEditor\"]")WebElement DeletionLinkedListTryHere;
	
	
	
	public LinkedlistPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	public void VerifyLinkedlistUrl() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://dsportalapp.herokuapp.com/linked-list/");
	}
	
	public void VerifyLinkedlistIntroUrl() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://dsportalapp.herokuapp.com/linked-list/introduction/");
	}
	
	public void VerifyLinkedlistTryHeredUrl() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://dsportalapp.herokuapp.com/tryEditor");
	}
	
	public void VerifyLinkedlistChildUrl(String url) {
		Assert.assertEquals(driver.getCurrentUrl(), url);
	}
	
	public void LaunchSubUrl(String url) {
		driver.get(url);
	}
	
	public void LinkedlistGetstarted() {
		LinkedlistGetstartedBtn.click();
	}
	
	public void LinkedlistIntroductionBtn() {
		introductionbtn.click();
	}
	
	public void LinkedlistClickOnLink(String linkname) {
		WebElement element = driver.findElement(By.xpath("//a[text()='" + linkname + "']"));
		element.click();
	}
	
	public void LinkedListIntroductionPage() {
		tryHereBtn.click();
	}
	
	public void tryEditorBtn() {
		tryHereBtn.sendKeys("printintroductioncheck");
	}
	
	public void tryHereBtn() {
		tryHereBtn.click();;
	}
	
	public void creatingLinkedList() {
		introductionbtn.click();
	}
	
	public void creatingLinkedListtryHereBtn() {
		tryHereBtn.click();
	}
	
	public void TypesofLinkedListBtn() {
		TypesofLinkedListBtn.click();
	}
	
	public void typesOfLinkedListTryBtn() {
		tryHereBtn.click();
	}
	
	public void Traversalbtn() {
		TypesofLinkedListBtn.click();
	}
	
	public void TraversaltryHerebtn() {
		TraversaltryHerebtn.click();
	}
	
	public void DeletionLinkedList() {
		DeletionLinkedList.click();
	}
	
	public void DeletionLinkedListTryHere() {
		DeletionLinkedListTryHere.click();
	
	}
	
	
	
	
}
