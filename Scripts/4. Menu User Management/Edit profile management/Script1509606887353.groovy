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

not_run: WebUI.openBrowser('', FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.maximizeWindow(FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.navigateToUrl('192.168.11.59', FailureHandling.CONTINUE_ON_FAILURE)

'login'
not_run: WebUI.click(findTestObject('Page_Guru TMDA/span_Login'), FailureHandling.CONTINUE_ON_FAILURE)

'login'
not_run: WebUI.setText(findTestObject('Page_Guru TMDA (1)/input_ng-untouched ng-valid ng'), 'piew', FailureHandling.CONTINUE_ON_FAILURE)

'login'
not_run: WebUI.setText(findTestObject('Page_Guru TMDA (1)/input_ng-untouched ng-pristine'), 'piew', FailureHandling.CONTINUE_ON_FAILURE)

'login'
not_run: WebUI.submit(findTestObject('Page_Guru TMDA (1)/button_Login'), FailureHandling.CONTINUE_ON_FAILURE)

'Click menu User Management'
WebUI.click(findTestObject('Change role/Page_Guru TMDA/a_User Management'))

'Fill in the search box.'
WebUI.setText(findTestObject('Change role/Page_Guru TMDA (2)/input_ng-untouched ng-valid ng'), 'fortest')

'Click edit Profile button'
WebUI.click(findTestObject('Edit user profile/list/i_fa fa-pencil-square-o'))

'Click Submit button'
WebUI.click(findTestObject('Edit user profile/Edit/button_SUBMIT'), FailureHandling.STOP_ON_FAILURE)

'Verify Edit Profile Successful text'
WebUI.verifyElementNotPresent(findTestObject('Edit user profile/Edit/div_Edit Profile Successful.'), 5)

'Choose a picture in drive C'
WebUI.uploadFile(findTestObject('Change profile pic/input_file-input (1)'), 'C:\\Penguins.jpg')

'Click edit name button'
WebUI.click(findTestObject('Edit user profile/Edit//i_fa fa-pencil name'))

'Clic edit email button'
WebUI.click(findTestObject('Edit user profile/Edit/i_fa fa-pencil email'))

'Delete First name'
WebUI.setText(findTestObject('Edit user profile/Edit//input_firstname'), 'e')

'Delete First name'
WebUI.sendKeys(findTestObject('Edit user profile/Edit//input_firstname'), Keys.chord(Keys.BACK_SPACE), FailureHandling.STOP_ON_FAILURE)

'Click submit button'
WebUI.verifyElementNotClickable(findTestObject('Edit user profile/Edit/button_SUBMIT'))

'Fill firstname by number'
WebUI.setText(findTestObject('Edit user profile/Edit//input_firstname'), '55555')

'Verify submit button is not clickable'
WebUI.verifyElementNotClickable(findTestObject('Edit user profile/Edit/button_SUBMIT'))

'Fill firstname '
WebUI.setText(findTestObject('Edit user profile/Edit//input_firstname'), 'Piratchana')

'Delete Last name'
WebUI.setText(findTestObject('Edit user profile/Edit//input_lastname'), 'e')

'Delete Last name'
WebUI.sendKeys(findTestObject('Edit user profile/Edit//input_lastname'), Keys.chord(Keys.BACK_SPACE), FailureHandling.STOP_ON_FAILURE)

'Verify Submit button not clickable'
WebUI.verifyElementNotClickable(findTestObject('Edit user profile/Edit/button_SUBMIT'))

'Fill lastname by number'
WebUI.setText(findTestObject('Edit user profile/Edit//input_lastname'), '55555')

'Verify submit button is not clickable'
WebUI.verifyElementNotClickable(findTestObject('Edit user profile/Edit/button_SUBMIT'))

'Fill lastname'
WebUI.setText(findTestObject('Edit user profile/Edit//input_lastname'), 'Maksub')

'Delete Email'
WebUI.setText(findTestObject('Edit user profile/Edit/input_email'), 'e')

'Delete Email'
WebUI.sendKeys(findTestObject('Edit user profile/Edit/input_email'), Keys.chord(Keys.BACK_SPACE), FailureHandling.STOP_ON_FAILURE)

'Verify submit button is not clickable'
WebUI.verifyElementNotClickable(findTestObject('Edit user profile/Edit/button_SUBMIT'))

'Fill email without @ and .co'
WebUI.setText(findTestObject('Edit user profile/Edit/input_email'), 'Cremecreme')

'Verify submit button is not clickable'
WebUI.verifyElementNotClickable(findTestObject('Edit user profile/Edit/button_SUBMIT'))

'Fill email'
WebUI.setText(findTestObject('Edit user profile/Edit/input_email'), df.format(date) + '@mail.com')

'Click submit button'
WebUI.click(findTestObject('Edit user profile/Edit/button_SUBMIT'))

'Verify Edit Profile Successful text'
WebUI.verifyElementPresent(findTestObject('Edit user profile/Edit/div_Edit Profile Successful.'), 2, FailureHandling.CONTINUE_ON_FAILURE)

'Close alert pop up'
WebUI.click(findTestObject('Edit user profile/Edit/button_'))

not_run: WebUI.closeBrowser(FailureHandling.CONTINUE_ON_FAILURE)

