import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

'เก็บเวลาปัจุบันของเครื่อง'
Date date = new Date()

'เก็บเวลาปัจุบันของเครื่อง'
java.text.SimpleDateFormat df = new java.text.SimpleDateFormat()

'เก็บเวลาปัจุบันของเครื่อง'
df.applyPattern('ddmmyyyyHHmmss')

'เ�?ิดเ�?ราเ�?อร�?'
WebUI.openBrowser('', FailureHandling.CONTINUE_ON_FAILURE)

'�?ยายห�?�?าต�?า�? เ�?ราเ�?อร�?'
WebUI.maximizeWindow(FailureHandling.CONTINUE_ON_FAILURE)

'เ�?�?าสู�? URL'
WebUI.navigateToUrl('192.168.11.59', FailureHandling.CONTINUE_ON_FAILURE)

'login'
WebUI.click(findTestObject('Page_Guru TMDA/span_Login'), FailureHandling.CONTINUE_ON_FAILURE)

'login'
WebUI.setText(findTestObject('Page_Guru TMDA (1)/input_ng-untouched ng-valid ng'), 'piew', FailureHandling.CONTINUE_ON_FAILURE)

'login'
WebUI.setText(findTestObject('Page_Guru TMDA (1)/input_ng-untouched ng-pristine'), 'piew', FailureHandling.CONTINUE_ON_FAILURE)

'login'
WebUI.submit(findTestObject('Page_Guru TMDA (1)/button_Login'), FailureHandling.CONTINUE_ON_FAILURE)

'click profile picture'
WebUI.click(findTestObject('Edit profile/img (1)'))

'click "Edit Profile"'
WebUI.click(findTestObject('Edit profile//span_Edit Profile'))

'click pencil icon after lastname input'
WebUI.click(findTestObject('Edit profile//i_fa fa-pencil'))

'empty for firstname'
WebUI.setText(findTestObject('Edit profile//input_firstname (2)'), 'a')

'button not click'
WebUI.sendKeys(findTestObject('Edit profile//input_firstname (2)'), Keys.chord(Keys.BACK_SPACE), FailureHandling.STOP_ON_FAILURE)

'put text to lastname input'
WebUI.setText(findTestObject('Edit profile/input_lastname (2)'), 'Maksub')

'click pencil icon after email input'
WebUI.click(findTestObject('Edit profile/i_fa fa-pencil (1)'))

'put email to email input'
WebUI.setText(findTestObject('Edit profile/input_email (1)'), 'creme@mail.com')

'verify submit button not click'
WebUI.verifyElementNotClickable(findTestObject('Edit profile/button_SUBMIT (3)'), FailureHandling.CONTINUE_ON_FAILURE)

'put num to firstname input'
WebUI.setText(findTestObject('Edit profile//input_firstname (2)'), '55555')

'verify submit button not click'
WebUI.verifyElementNotClickable(findTestObject('Edit profile/button_SUBMIT (3)'), FailureHandling.CONTINUE_ON_FAILURE)

'put text to firstname input'
WebUI.setText(findTestObject('Edit profile//input_firstname (2)'), 'Piratchana')

'empty for lastname'
WebUI.setText(findTestObject('Edit profile/input_lastname (2)'), 'a')

'button not click'
WebUI.sendKeys(findTestObject('Edit profile//input_lastname (2)'), Keys.chord(Keys.BACK_SPACE), FailureHandling.STOP_ON_FAILURE)

'verify submit button not click'
WebUI.verifyElementNotClickable(findTestObject('Edit profile/button_SUBMIT (3)'), FailureHandling.CONTINUE_ON_FAILURE)

'put num to lastname input'
WebUI.setText(findTestObject('Edit profile/input_lastname (2)'), '55555')

'verify submit button not click'
WebUI.verifyElementNotClickable(findTestObject('Edit profile/button_SUBMIT (3)'), FailureHandling.CONTINUE_ON_FAILURE)

'put text to firstname input'
WebUI.setText(findTestObject('Edit profile//input_firstname (2)'), 'Piratchana')

'put text to lastname input'
WebUI.setText(findTestObject('Edit profile/input_lastname (2)'), 'Maksub')

'empty for email'
WebUI.setText(findTestObject('Edit profile/input_email (1)'), 'a')

'button not click'
WebUI.sendKeys(findTestObject('Edit profile//input_email (1)'), Keys.chord(Keys.BACK_SPACE), FailureHandling.STOP_ON_FAILURE)

'verify submit button not click'
WebUI.verifyElementNotClickable(findTestObject('Edit profile/button_SUBMIT (3)'), FailureHandling.CONTINUE_ON_FAILURE)

'put text to email input'
WebUI.setText(findTestObject('Edit profile/input_email (1)'), 'Cremememe')

'verify submit button not click'
WebUI.verifyElementNotClickable(findTestObject('Edit profile/button_SUBMIT (3)'), FailureHandling.CONTINUE_ON_FAILURE)

'put email to email input ------> set value are now date and time'
WebUI.setText(findTestObject('Edit profile/input_email (1)'), df.format(date) + '@mail.com')

not_run: WebUI.scrollToElement(findTestObject('Edit profile/button_SUBMIT (2)'), 5)

'click submit button'
WebUI.click(findTestObject('Edit profile/button_SUBMIT (2)'))

'verify successful pop up present'
WebUI.verifyElementPresent(findTestObject('Edit profile//div_Edit Profile Successful.'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'click  x'
WebUI.click(findTestObject('Edit profile/button_1'))

'click submit button more'
WebUI.click(findTestObject('Edit profile//button_SUBMIT_1'))

'verify successful pop up not present'
WebUI.verifyElementNotPresent(findTestObject('Edit profile//div_Edit Profile Successful.'), 5)

WebUI.closeBrowser()

