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

WebUI.click(findTestObject('Windows iFrame Alert Pages/Home Page/a_LOGIN'))

WebUI.delay(1)

WebUI.switchToWindowIndex(1)

WebUI.delay(1)

WebUI.setText(findTestObject('Windows iFrame Alert Pages/Log in Page/input_User Name'), 'testing')

WebUI.setText(findTestObject('Windows iFrame Alert Pages/Log in Page/input_Password'), 'testing')

WebUI.click(findTestObject('Windows iFrame Alert Pages/Log in Page/a_Forgot your password'))

WebUI.delay(1)

WebUI.switchToWindowTitle('LearnKS Forgot Password')

WebUI.delay(1)

WebUI.setText(findTestObject('Windows iFrame Alert Pages/Forgot Password Page/input_Email Address'), 'kstest@gmail.com')

WebUI.delay(1)

WebUI.closeWindowUrl('file:///C:/Program%20Files%20(x86)/Code/learnks1-forgot-password.html')

WebUI.delay(1)

WebUI.closeWindowIndex(1)

WebUI.delay(1)

WebUI.closeBrowser()

