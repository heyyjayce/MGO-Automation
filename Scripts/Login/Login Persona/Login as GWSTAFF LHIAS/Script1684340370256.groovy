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

'USER ROLE: LHIAS'
WebUI.setText(findTestObject('Login/input_My Greatway Office_email'), 'gw_lhia_dummy@yopmail.com')

WebUI.setEncryptedText(findTestObject('Login/input_My Greatway Office_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Login/button_Login'))

WebUI.enableSmartWait()

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Main Page/Profile Dialog/div_Profile'))

WebUI.verifyElementText(findTestObject('Main Page/Profile Dialog/div_user_LHIA'), 'Life Health Insurance Agent Supervisor')

WebUI.click(findTestObject('Main Page/Profile Dialog/a_Logout'))

WebUI.enableSmartWait()

WebUI.takeFullPageScreenshot()

