import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://github.com/')

WebUI.click(findTestObject('Object Repository/Github Login Object/Page_The worlds leading software de/a_Signin'))

WebUI.setText(findTestObject('Object Repository/Github Login Object/Page_Sign in to GitHub  GitHub/input_Username or email addres'), 
    'sumit')

WebUI.setEncryptedText(findTestObject('Object Repository/Github Login Object/Page_Sign in to GitHub  GitHub/input_Forgot password_password'), 
    'kGg6ALQHac0=')

WebUI.click(findTestObject('Object Repository/Github Login Object/Page_Sign in to GitHub  GitHub/input_Forgot password_commit'))

WebUI.click(findTestObject('Object Repository/Github Login Object/Page_Sign in to GitHub  GitHub/div_Incorrect username or pass'))

WebUI.closeBrowser()

