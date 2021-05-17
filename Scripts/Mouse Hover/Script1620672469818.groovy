import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser(GlobalVariable.autoURL)

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Home Page/a_Product 2 old'))

WebUI.delay(1)

WebUI.click(findTestObject('Home Page/button_Add to cart'))

WebUI.delay(2)

WebUI.click(findTestObject('Product Details popup/button_Proceed to checkout'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Shopping Cart Summary Page/a_View my shopping cart'))

WebUI.delay(2)

WebUI.click(findTestObject('Shopping Cart Summary Page/button_Check Out'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Shopping Cart Summary Page/span_Number of product'), '1 Product')

WebUI.delay(1)

WebUI.closeBrowser()

