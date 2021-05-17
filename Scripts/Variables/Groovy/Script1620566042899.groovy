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

WebUI.openBrowser('file:///C:/Program Files (x86)/Code/learnks1-home.html')

Date today = new Date()

String timeNow = today.format('hh:mm a')

WebUI.setText(findTestObject('Object Repository/Windows iFrame Alert Pages/Home Page/Extra textbox for Debugging/input_debugTextbox'), 
    timeNow)

WebUI.delay(1)

WebUI.click(findTestObject('Windows iFrame Alert Pages/Home Page/Handling Alerts/button_Open an ALERT box'))

WebUI.waitForAlert(1)

groovyalert = WebUI.getAlertText()

WebUI.acceptAlert()

WebUI.clearText(findTestObject('Windows iFrame Alert Pages/Home Page/Extra textbox for Debugging/input_debugTextbox'))

WebUI.delay(1)

WebUI.setText(findTestObject('Windows iFrame Alert Pages/Home Page/Extra textbox for Debugging/input_debugTextbox'), groovyalert)

WebUI.delay(1)

WebUI.closeBrowser()

