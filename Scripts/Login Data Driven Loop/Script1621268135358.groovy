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

for (int i=1;i<=findTestData('Internal Data').getRowNumbers();i++) {
	

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('automationpractice.com')

WebUI.click(findTestObject('Home Page/button_Sign in'))

WebUI.setText(findTestObject('User Account Pages/Login Page/Login Session/input_Email address'), 
	findTestData('Internal Data').getValue(1,i))

WebUI.setText(findTestObject('User Account Pages/Login Page/Login Session/input_Password'),
	findTestData('Internal Data').getValue(2,i))

WebUI.click(findTestObject('User Account Pages/Login Page/Login Session/button_Sign in image selector'))

WebUI.verifyElementVisible(findTestObject('User Account Pages/My Account Page/h1_My account'))

WebUI.closeBrowser()

}