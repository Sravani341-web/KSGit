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

WebUI.maximizeWindow()

WebUI.click(findTestObject('Home Page/button_Sign in'))

WebUI.setText(findTestObject('User Account Pages/Login Page/Registration Session/input_Email address'), 'testingdfgdfhdfhdfh@test.com')

WebUI.click(findTestObject('User Account Pages/Login Page/Registration Session/button_Create an account'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_DOWN))

WebUI.delay(1)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_UP))

WebUI.delay(1)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ARROW_DOWN))

WebUI.delay(1)

WebUI.sendKeys(findTestObject('User Account Pages/Registration Page/Personal Info Session/input_First Name'), Keys.chord(
        Keys.SHIFT, 'test'))

WebUI.delay(1)

WebUI.sendKeys(findTestObject('User Account Pages/Registration Page/Personal Info Session/input_First Name'), Keys.chord(
        Keys.CONTROL, 'A'))

WebUI.delay(1)

WebUI.sendKeys(findTestObject('User Account Pages/Registration Page/Personal Info Session/input_First Name'), Keys.chord(
        Keys.CONTROL, 'C'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('User Account Pages/Registration Page/Personal Info Session/input_Last Name'), Keys.chord(
        Keys.CONTROL, 'V'))

WebUI.delay(1)

WebUI.closeBrowser()

