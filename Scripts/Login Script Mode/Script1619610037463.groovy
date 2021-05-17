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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://automationpractice.com/index.php')

WebUI.click(findTestObject('Home Page/button_Sign in'))

WebUI.setText(findTestObject('User Account Pages/Login Page/Registration Session/input_Email address'), 'star@g.com')

WebUI.click(findTestObject('User Account Pages/Login Page/Registration Session/button_Create an account'))

WebUI.click(findTestObject('User Account Pages/Registration Page/Personal Info Session/input_First Name'))

WebUI.click(findTestObject('User Account Pages/Registration Page/Personal Info Session/radio_Gender_Mrs'))

WebUI.setText(findTestObject('User Account Pages/Registration Page/Personal Info Session/input_First Name'), 'star')

WebUI.setText(findTestObject('User Account Pages/Registration Page/Personal Info Session/input_Last Name'), 'g')

WebUI.setEncryptedText(findTestObject('User Account Pages/Registration Page/Personal Info Session/input_Password'), 'q6ipoTh20U4=')

WebUI.selectOptionByValue(findTestObject('User Account Pages/Registration Page/Personal Info Session/select_DOB_Day'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('User Account Pages/Registration Page/Personal Info Session/select_DOB_Month'), 
    '8', true)

WebUI.selectOptionByValue(findTestObject('Registration Page/select_year'), 
    '1993', true)

WebUI.setText(findTestObject('User Account Pages/Registration Page/Address Session/input_Company'), 'star')

WebUI.setText(findTestObject('Registration Page/Address Session/input__address1'), 'star')

WebUI.setText(findTestObject('User Account Pages/Registration Page/Address Session/input_City'), 'hyd')

WebUI.selectOptionByValue(findTestObject('User Account Pages/Registration Page/Address Session/select_State'), 
    '14', true)

WebUI.setText(findTestObject('User Account Pages/Registration Page/Address Session/input_Post Code'), '50001')

WebUI.setText(findTestObject('User Account Pages/Registration Page/Address Session/input_Mobile Phone'), '9999999991')

WebUI.setText(findTestObject('User Account Pages/Registration Page/Address Session/input_Address Alias'), 'star')

WebUI.click(findTestObject('User Account Pages/Registration Page/button_Register'))

