package automationpractice

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class User {
	
	/**
	 * Login to automationpractice.com
	 * @param to Email address for logging in
	 * @param to password for logging in
	 */
	@Keyword
	def Login(String emailadd,String pass) {
	
			WebUI.click(findTestObject('Home Page/button_Sign in'))
			WebUI.setText(findTestObject('User Account Pages/Login Page/Login Session/input_Email address'),emailadd)			
			WebUI.setText(findTestObject('User Account Pages/Login Page/Login Session/input_Password'), pass)			
			WebUI.click(findTestObject('User Account Pages/Login Page/Login Session/button_Sign in image selector'))
	}
	/**
	 * Logout from automationpractice.com
	 */
	@Keyword
	def Logout(String emailadd,String pass) {
			WebUI.navigateToUrl('automationpractice.com')

	}
}
