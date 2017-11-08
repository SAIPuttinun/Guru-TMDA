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

not_run: WebUI.openBrowser('')

not_run: WebUI.maximizeWindow()

not_run: WebUI.navigateToUrl('192.168.11.59')

not_run: WebUI.click(findTestObject('Page_Guru TMDA/span_Login'))

not_run: WebUI.setText(findTestObject('Page_Guru TMDA (1)/input_ng-untouched ng-valid ng'), 'creme')

not_run: WebUI.setText(findTestObject('Page_Guru TMDA (1)/input_ng-untouched ng-pristine'), '1234')

'-à¸ªà¸´à¹?à¸?à¸ªà¸¸à¸”à¸?à¸²à¸£à¸—à¸”à¸ªà¸­à¸? login\r\n'
not_run: WebUI.submit(findTestObject('Page_Guru TMDA (1)/button_Login'))

'à¸?à¸”à¸?à¸¸à¹?à¸¡ Log'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/a_Log'))

'à¹€à¸­à¸²à¹€à¸?à¸­à¹€à¸?à¸­à¸£à¹?à¸?à¸µà¹?à¸—à¸µà¹?à¹?à¸?à¸¥à¹? single à¹€à¸?à¸·à¹?à¸­à¸”à¸¹ preview'
WebUI.mouseOver(findTestObject('Search history log/search history log/span_2'))

'à¸•à¸£à¸§à¸?à¸ªà¸­à¸? pop up preview à¸?à¸­à¸?à¹?à¸?à¸¥à¹? single'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__anim'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'à¸?à¸”à¸?à¸¸à¹?à¸¡ preview à¸?à¸­à¸?à¹?à¸?à¸¥à¹? multiple'
WebUI.click(findTestObject('Search history log/search history log/button_Preview'))

'à¸?à¸”à¸?à¸¸à¹?à¸¡à¸?à¸²à¸?à¸?à¸°à¸?à¸²à¸—à¸—à¸µà¹?à¸«à¸?à¹?à¸²à¸•à¹?à¸²à¸? preview'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

'à¸—à¸³à¹€à¸?à¸£à¸·à¹?à¸­à¸?à¸«à¸¡à¸²à¸¢à¸?à¸²à¸?à¸–à¸¹à¸?à¸«à¸¥à¸±à¸?à¸£à¸²à¸¢à¸?à¸²à¸£à¸—à¸µà¹?à¹€à¸¥à¸·à¸­à¸?'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-untouched ng-pristine'))

'-à¸?à¸”à¸?à¸¸à¹?à¸¡ export à¸ªà¸´à¹?à¸?à¸ªà¸¸à¸”à¸?à¸²à¸£à¸—à¸”à¸ªà¸­à¸?à¸?à¹?à¸­à¸¡à¸¹à¸¥à¸—à¸±à¹?à¸?à¸«à¸¡à¸” (All) à¸§à¸±à¸?à¸?à¸±à¸?à¸?à¸¸à¸?à¸±à¸? à¹?à¸”à¸¢à¸?à¸” preview à¸?à¸”à¹€à¸¥à¸·à¸­à¸?à¸£à¸²à¸¢à¸?à¸²à¸£  à¹?à¸¥à¸°à¸?à¸” export'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

'---à¸•à¸£à¸§à¸?à¸ªà¸­à¸?à¸?à¸¥'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/td_Survey Single'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'---à¸•à¸£à¸§à¸?à¸ªà¸­à¸?à¸?à¸¥'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log//td_Survey Multiple'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'à¹€à¸¥à¸·à¸­à¸?à¸?à¸£à¸°à¹€à¸ à¸—à¸?à¸²à¸£à¸—à¸³à¸?à¸²à¸¢ à¹€à¸?à¹?à¸? single'
WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '1', true)

'à¹€à¸­à¸²à¹€à¸?à¸­à¹€à¸?à¸­à¸£à¹?à¸?à¸µà¹?à¸—à¸µà¹?à¹?à¸?à¸¥à¹? single à¹€à¸?à¸·à¹?à¸­à¸”à¸¹ preview'
WebUI.mouseOver(findTestObject('Search history log/search history log//span_3'))

'à¸•à¸£à¸§à¸?à¸ªà¸­à¸? pop up preview à¸?à¸­à¸?à¹?à¸?à¸¥à¹? single'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__anim003'), 5, 
    FailureHandling.CONTINUE_ON_FAILURE)

'à¸—à¸³à¹€à¸?à¸£à¸·à¹?à¸­à¸?à¸«à¸¡à¸²à¸¢à¸?à¸²à¸?à¸–à¸¹à¸?à¸«à¸¥à¸±à¸?à¸£à¸²à¸¢à¸?à¸²à¸£à¸—à¸µà¹?à¹€à¸¥à¸·à¸­à¸?'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

'-à¸?à¸”à¸?à¸¸à¹?à¸¡ export à¸ªà¸´à¹?à¸?à¸ªà¸¸à¸”à¸?à¸²à¸£à¸—à¸”à¸ªà¸­à¸?à¸?à¹?à¸­à¸¡à¸¹à¸¥ single à¸§à¸±à¸?à¸?à¸±à¸?à¸?à¸¸à¸?à¸±à¸? à¹?à¸”à¸¢à¸?à¸” preview à¸?à¸”à¹€à¸¥à¸·à¸­à¸?à¸£à¸²à¸¢à¸?à¸²à¸£  à¹?à¸¥à¸°à¸?à¸” export'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

'---à¸•à¸£à¸§à¸?à¸ªà¸­à¸?à¸?à¸¥'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/td_Survey Single'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'à¹€à¸¥à¸·à¸­à¸?à¸?à¸£à¸°à¹€à¸ à¸—à¸?à¸²à¸£à¸—à¸³à¸?à¸²à¸¢ à¹€à¸?à¹?à¸? multiple'
WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '2', true)

'à¸?à¸”à¸?à¸¸à¹?à¸¡ preview à¸?à¸­à¸?à¹?à¸?à¸¥à¹? multiple'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

'à¸?à¸”à¸?à¸¸à¹?à¸¡à¸?à¸²à¸?à¸?à¸°à¸?à¸²à¸—à¸—à¸µà¹?à¸«à¸?à¹?à¸²à¸•à¹?à¸²à¸? preview'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

'à¸—à¸³à¹€à¸?à¸£à¸·à¹?à¸­à¸?à¸«à¸¡à¸²à¸¢à¸?à¸²à¸?à¸–à¸¹à¸?à¸«à¸¥à¸±à¸?à¸£à¸²à¸¢à¸?à¸²à¸£à¸—à¸µà¹?à¹€à¸¥à¸·à¸­à¸?'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

'-à¸?à¸”à¸?à¹?à¸¡ export à¸ªà¸´à¹?à¸?à¸ªà¸¸à¸”à¸?à¸²à¸£à¸—à¸”à¸ªà¸­à¸?à¸?à¹?à¸­à¸¡à¸¹à¸¥ multiple à¸§à¸±à¸?à¸?à¸±à¸?à¸?à¸¸à¸?à¸±à¸? à¹?à¸”à¸¢à¸?à¸” preview à¸?à¸”à¹€à¸¥à¸·à¸­à¸?à¸£à¸²à¸¢à¸?à¸²à¸£  à¹?à¸¥à¸°à¸?à¸” export'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

'---à¸•à¸£à¸§à¸?à¸ªà¸­à¸?à¸?à¸¥'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log//td_Survey Multiple'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'à¹€à¸¥à¸·à¸­à¸?à¸?à¸£à¸°à¹€à¸ à¸—à¸?à¸²à¸£à¸—à¸³à¸?à¸²à¸¢à¹€à¸?à¹?à¸? all'
WebUI.selectOptionByIndex(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '0', FailureHandling.STOP_ON_FAILURE)

'à¹€à¸­à¸²à¹€à¸?à¸­à¹€à¸?à¸­à¸£à¹?à¸?à¸µà¹?à¸—à¸µà¹?à¹?à¸?à¸¥à¹? single à¹€à¸?à¸·à¹?à¸­à¸”à¸¹ preview'
WebUI.mouseOver(findTestObject('Search history log/search history log//span_4'))

'à¸•à¸£à¸§à¸?à¸ªà¸­à¸? pop up preview à¸?à¸­à¸?à¹?à¸?à¸¥à¹? single'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log//div_ngxp__container ngxp__anim004'), 5, 
    FailureHandling.CONTINUE_ON_FAILURE)

'à¸?à¸”à¸?à¸¸à¹?à¸¡ preview à¸?à¸­à¸?à¹?à¸?à¸¥à¹? multiple'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

'à¸?à¸”à¸?à¸¸à¹?à¸¡à¸?à¸²à¸?à¸?à¸°à¸?à¸²à¸—à¸—à¸µà¹?à¸«à¸?à¹?à¸²à¸•à¹?à¸²à¸? preview'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

'-à¸—à¸³à¹€à¸?à¸£à¸·à¹?à¸­à¸?à¸«à¸¡à¸²à¸¢à¸?à¸²à¸?à¸–à¸¹à¸?à¸«à¸¥à¸±à¸?à¸£à¸²à¸¢à¸?à¸²à¸£à¸—à¸µà¹?à¹€à¸¥à¸·à¸­à¸? à¸ªà¸´à¹?à¸?à¸ªà¸¸à¸”à¸?à¸²à¸£à¸—à¸”à¸ªà¸­à¸?à¸?à¹?à¸­à¸¡à¸¹à¸¥à¸—à¸±à¹?à¸?à¸«à¸¡à¸” (All) à¸§à¸±à¸?à¸?à¸±à¸?à¸?à¸¸à¸?à¸±à¸? à¹?à¸”à¸¢à¸?à¸” preview à¹?à¸¥à¸°à¸?à¸”à¹€à¸¥à¸·à¸­à¸?à¸£à¸²à¸¢à¸?à¸²à¸£'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

'---à¸•à¸£à¸§à¸?à¸ªà¸­à¸?à¸?à¸¥'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/td_Survey Single'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'---à¸•à¸£à¸§à¸?à¸ªà¸­à¸?à¸?à¸¥'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log//td_Survey Multiple'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'à¹€à¸¥à¸·à¸­à¸?à¸?à¸£à¸°à¹€à¸ à¸—à¸?à¸²à¸£à¸—à¸³à¸?à¸²à¸¢ à¹€à¸?à¹?à¸? single'
WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '1', true)

'à¹€à¸­à¸²à¹€à¸?à¸­à¹€à¸?à¸­à¸£à¹?à¸?à¸µà¹?à¸—à¸µà¹?à¹?à¸?à¸¥à¹? single à¹€à¸?à¸·à¹?à¸­à¸”à¸¹ preview'
WebUI.mouseOver(findTestObject('Search history log/search history log//span_5'))

'à¸•à¸£à¸§à¸?à¸ªà¸­à¸? pop up preview à¸?à¸­à¸?à¹?à¸?à¸¥à¹? single'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__anim005'), 5, 
    FailureHandling.CONTINUE_ON_FAILURE)

'-à¸—à¸³à¹€à¸?à¸£à¸·à¹?à¸­à¸?à¸«à¸¡à¸²à¸¢à¸?à¸²à¸?à¸–à¸¹à¸?à¸«à¸¥à¸±à¸?à¸£à¸²à¸¢à¸?à¸²à¸£à¸—à¸µà¹?à¹€à¸¥à¸·à¸­à¸? à¸ªà¸´à¹?à¸?à¸ªà¸¸à¸”à¸?à¸²à¸£à¸—à¸”à¸ªà¸­à¸?à¸?à¹?à¸­à¸¡à¸¹à¸¥ single à¸§à¸±à¸?à¸?à¸±à¸?à¸?à¸¸à¸?à¸±à¸? à¹?à¸”à¸¢à¸?à¸” preview à¹?à¸¥à¸°à¸?à¸”à¹€à¸¥à¸·à¸­à¸?à¸£à¸²à¸¢à¸?à¸²à¸£'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

'---à¸•à¸£à¸§à¸?à¸ªà¸­à¸?à¸?à¸¥'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log//td_Survey Single'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'à¹€à¸¥à¸·à¸­à¸?à¸?à¸£à¸°à¹€à¸ à¸—à¸?à¸²à¸£à¸—à¸³à¸?à¸²à¸¢ à¹€à¸?à¹?à¸? multiple'
WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '2', true)

'à¸?à¸”à¸?à¸¸à¹?à¸¡ preview à¸?à¸­à¸?à¹?à¸?à¸¥à¹? multiple'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

'à¸?à¸”à¸?à¸¸à¹?à¸¡à¸?à¸²à¸?à¸?à¸°à¸?à¸²à¸—à¸—à¸µà¹?à¸«à¸?à¹?à¸²à¸•à¹?à¸²à¸? preview'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

'-à¸—à¸³à¹€à¸?à¸£à¸·à¹?à¸­à¸?à¸«à¸¡à¸²à¸¢à¸?à¸²à¸?à¸–à¸¹à¸?à¸«à¸¥à¸±à¸?à¸£à¸²à¸¢à¸?à¸²à¸£à¸—à¸µà¹?à¹€à¸¥à¸·à¸­à¸? à¸ªà¸´à¹?à¸?à¸ªà¸¸à¸”à¸?à¸²à¸£à¸—à¸”à¸ªà¸­à¸?à¸?à¹?à¸­à¸¡à¸¹à¸¥ multiple à¸§à¸±à¸?à¸?à¸±à¸?à¸?à¸¸à¸?à¸±à¸? à¹?à¸”à¸¢à¸?à¸” preview à¹?à¸¥à¸°à¸?à¸”à¹€à¸¥à¸·à¸­à¸?à¸£à¸²à¸¢à¸?à¸²à¸£'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

'---à¸•à¸£à¸§à¸?à¸ªà¸­à¸?à¸?à¸¥'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log//td_Survey Multiple'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'à¹€à¸¥à¸·à¸­à¸?à¸?à¸£à¸°à¹€à¸ à¸—à¸?à¸²à¸£à¸—à¸³à¸?à¸²à¸¢ à¹€à¸?à¹?à¸? all'
WebUI.selectOptionByIndex(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '0', FailureHandling.STOP_ON_FAILURE)

'à¹€à¸­à¸²à¹€à¸?à¸­à¹€à¸?à¸­à¸£à¹?à¸?à¸µà¹?à¸—à¸µà¹?à¹?à¸?à¸¥à¹? single à¹€à¸?à¸·à¹?à¸­à¸”à¸¹ preview'
WebUI.mouseOver(findTestObject('Search history log/search history log//span_2'))

'à¸•à¸£à¸§à¸?à¸ªà¸­à¸? pop up preview à¸?à¸­à¸?à¹?à¸?à¸¥à¹? single'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__anim'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'à¸?à¸”à¸?à¸¸à¹?à¸¡ preview à¸?à¸­à¸?à¹?à¸?à¸¥à¹? multiple'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

'à¸?à¸”à¸?à¸¸à¹?à¸¡à¸?à¸²à¸?à¸?à¸°à¸?à¸²à¸—à¸—à¸µà¹?à¸«à¸?à¹?à¸²à¸•à¹?à¸²à¸? preview'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

'-à¸?à¸”à¸?à¸¸à¹?à¸¡ export à¸ªà¸´à¹?à¸?à¸ªà¸¸à¸”à¸?à¸²à¸£à¸—à¸”à¸ªà¸­à¸?à¸?à¹?à¸­à¸¡à¸¹à¸¥à¸—à¸±à¹?à¸?à¸«à¸¡à¸” (All) à¸§à¸±à¸?à¸?à¸±à¸?à¸?à¸¸à¸?à¸±à¸? à¹?à¸”à¸¢à¸?à¸” preview à¹?à¸¥à¸°à¸?à¸” export'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

'---à¸•à¸£à¸§à¸?à¸ªà¸­à¸?à¸?à¸¥'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/td_Survey Single'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'---à¸•à¸£à¸§à¸?à¸ªà¸­à¸?à¸?à¸¥'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log//td_Survey Multiple'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'à¹€à¸¥à¸·à¸­à¸?à¸?à¸£à¸°à¹€à¸ à¸—à¸?à¸²à¸£à¸—à¸³à¸?à¸²à¸¢ à¹€à¸?à¹?à¸? single'
WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '1', true)

'à¹€à¸­à¸²à¹€à¸?à¸­à¹€à¸?à¸­à¸£à¹?à¸?à¸µà¹?à¸—à¸µà¹?à¹?à¸?à¸¥à¹? single à¹€à¸?à¸·à¹?à¸­à¸”à¸¹ preview'
WebUI.mouseOver(findTestObject('Search history log/search history log/span_8'))

'à¸•à¸£à¸§à¸?à¸ªà¸­à¸? pop up preview à¸?à¸­à¸?à¹?à¸?à¸¥à¹? single'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__anim'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'-à¸?à¸”à¸?à¸¸à¹?à¸¡ export à¸ªà¸´à¹?à¸?à¸ªà¸¸à¸”à¸?à¸²à¸£à¸—à¸”à¸ªà¸­à¸?à¸?à¹?à¸­à¸¡à¸¹à¸¥ single à¸§à¸±à¸?à¸?à¸±à¸?à¸?à¸¸à¸?à¸±à¸? à¹?à¸”à¸¢à¸?à¸” preview à¹?à¸¥à¸°à¸?à¸” export'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

'---à¸•à¸£à¸§à¸?à¸ªà¸­à¸?à¸?à¸¥'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/td_Survey Single'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'à¹€à¸¥à¸·à¸­à¸?à¸?à¸£à¸°à¹€à¸ à¸—à¸?à¸²à¸£à¸—à¸³à¸?à¸²à¸¢ multiple'
WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '2', true)

'à¸?à¸”à¸?à¸¸à¹?à¸¡ preview à¸?à¸­à¸?à¹?à¸?à¸¥à¹? multiple'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

'à¸?à¸”à¸?à¸¸à¹?à¸¡à¸?à¸²à¸?à¸?à¸°à¸?à¸²à¸—à¸—à¸µà¹?à¸«à¸?à¹?à¸²à¸•à¹?à¸²à¸? preview'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA/i_fa fa-times w3-xlarge w3-tex'))

'-à¸?à¸”à¸?à¸¸à¹?à¸¡ export à¸ªà¸´à¹?à¸?à¸ªà¸¸à¸”à¸?à¸²à¸£à¸—à¸”à¸ªà¸­à¸?à¸?à¹?à¸­à¸¡à¸¹à¸¥ multiple à¸§à¸±à¸?à¸?à¸±à¸?à¸?à¸¸à¸?à¸±à¸? à¹?à¸”à¸¢à¸?à¸” preview à¹?à¸¥à¸°à¸?à¸” export'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

'---à¸•à¸£à¸§à¸?à¸ªà¸­à¸?à¸?à¸¥'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log//td_Survey Multiple'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'à¹?à¸ªà¹?à¸?à¹?à¸­à¸¡à¸¹à¸¥à¸§à¸±à¸?à¸—à¸µà¹?à¸—à¸µà¹?à¸•à¹?à¸­à¸?à¸?à¸²à¸£à¸?à¹?à¸?à¸«à¸² à¹?à¸? input à¹?à¸£à¸?'
WebUI.setText(findTestObject('Search history log/search history log/input_selection ng-untouched n'), '02/11/2017')

'à¹€à¸¥à¸·à¸­à¸?à¸?à¸£à¸°à¹€à¸ à¸—à¸?à¸²à¸£à¸—à¸³à¸?à¸²à¸¢ all'
WebUI.selectOptionByIndex(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '0', FailureHandling.STOP_ON_FAILURE)

'à¹€à¸­à¸²à¹€à¸?à¸­à¹€à¸?à¸­à¸£à¹?à¸?à¸µà¹?à¸—à¸µà¹?à¹?à¸?à¸¥à¹? single à¹€à¸?à¸·à¹?à¸­à¸”à¸¹ preview'
WebUI.mouseOver(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/span_ (1)'))

'à¸•à¸£à¸§à¸?à¸ªà¸­à¸? pop up preview à¸?à¸­à¸?à¹?à¸?à¸¥à¹? single'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__008'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'à¹€à¸­à¸²à¹€à¸?à¸­à¹€à¸?à¸­à¸£à¹?à¸?à¸µà¹?à¸—à¸µà¹?à¹?à¸?à¸¥à¹? single à¹€à¸?à¸·à¹?à¸­à¸”à¸¹ preview'
WebUI.mouseOver(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/span_ (1)'))

'à¸•à¸£à¸§à¸?à¸ªà¸­à¸? pop up preview à¸?à¸­à¸?à¹?à¸?à¸¥à¹? single'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__008'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'à¸?à¸”à¸?à¸¸à¹?à¸¡ preview à¸?à¸­à¸?à¹?à¸?à¸¥à¹? multiple'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

'à¸?à¸”à¸?à¸¸à¹?à¸¡à¸?à¸²à¸?à¸?à¸°à¸?à¸²à¸—à¸—à¸µà¹?à¸«à¸?à¹?à¸²à¸•à¹?à¸²à¸? preview'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

'à¸—à¸³à¹€à¸?à¸£à¸·à¹?à¸­à¸?à¸«à¸¡à¸²à¸¢à¸?à¸²à¸–à¸¹à¸?à¸«à¸¥à¸±à¸?à¸£à¸²à¸¢à¸?à¸²à¸£à¸—à¸µà¹?à¹€à¸¥à¸·à¸­à¸?'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

'-à¸?à¸”à¸?à¸¸à¹?à¸¡ export à¸ªà¸´à¹?à¸?à¸ªà¸¸à¸”à¸?à¸²à¸£à¸—à¸”à¸ªà¸­à¸?à¸?à¹?à¸­à¸¡à¸¹à¸¥à¸—à¸±à¹?à¸?à¸«à¸¡à¸” (All) à¸§à¸±à¸?à¸—à¸µà¹? 11/10/2017 à¹?à¸”à¸¢à¸?à¸” preview à¸?à¸”à¹€à¸¥à¸·à¸­à¸?à¸£à¸²à¸¢à¸?à¸²à¸£ à¹?à¸¥à¸°à¸?à¸” export'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

'---à¸•à¸£à¸§à¸?à¸ªà¸­à¸?à¸?à¸¥'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/td_Survey Single'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'---à¸•à¸£à¸§à¸?à¸ªà¸­à¸?à¸?à¸¥'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log//td_Survey Multiple'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'à¹€à¸¥à¸·à¸­à¸?à¸?à¸£à¸°à¹€à¸ à¸—à¸?à¸²à¸£à¸—à¸³à¸?à¸²à¸¢ à¹€à¸?à¹?à¸? single'
WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '1', true)

'à¹€à¸­à¸²à¹€à¸?à¸­à¹€à¸?à¸­à¸£à¹?à¸?à¸µà¹?à¸—à¸µà¹?à¹?à¸?à¸¥à¹? single à¹€à¸?à¸·à¹?à¸­à¸”à¸¹ preview'
WebUI.mouseOver(findTestObject('Search history log/search history log//span_ 6'))

'à¸•à¸£à¸§à¸?à¸ªà¸­à¸? pop up preview à¸?à¸­à¸?à¹?à¸?à¸¥à¹? single'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__anim006'), 5, 
    FailureHandling.CONTINUE_ON_FAILURE)

'à¸—à¸³à¹€à¸?à¸£à¸·à¹?à¸­à¸?à¸«à¸¡à¸²à¸¢à¸?à¸²à¸–à¸¹à¸?à¸«à¸¥à¸±à¸?à¸£à¸²à¸¢à¸?à¸²à¸£à¸—à¸µà¹?à¹€à¸¥à¸·à¸­à¸?'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

'-à¸?à¸”à¸?à¸¸à¹?à¸¡ export à¸ªà¸´à¹?à¸?à¸ªà¸¸à¸”à¸?à¸²à¸£à¸—à¸”à¸ªà¸­à¸?à¸?à¹?à¸­à¸¡à¸¹à¸¥ single à¸§à¸±à¸?à¸—à¸µà¹? 11/10/2017 à¹?à¸”à¸¢à¸?à¸” preview à¸?à¸”à¹€à¸¥à¸·à¸­à¸?à¸£à¸²à¸¢à¸?à¸²à¸£ à¹?à¸¥à¸°à¸?à¸” export'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

'---à¸•à¸£à¸§à¸?à¸ªà¸­à¸?à¸?à¸¥'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/td_Survey Single'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'à¹€à¸¥à¸·à¸­à¸?à¸?à¸£à¸°à¹€à¸ à¸—à¸?à¸²à¸£à¸—à¸³à¸?à¸²à¸¢ à¹€à¸?à¹?à¸? multiple'
WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '2', true)

'à¸?à¸”à¸?à¸¸à¹?à¸¡ preview à¸?à¸­à¸?à¹?à¸?à¸¥à¹? multiple'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

'à¸?à¸”à¸?à¸¸à¹?à¸¡à¸?à¸²à¸?à¸?à¸°à¸?à¸²à¸—à¸—à¸µà¹?à¸«à¸?à¹?à¸²à¸•à¹?à¸²à¸? preview'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

'à¸—à¸³à¹€à¸?à¸£à¸·à¹?à¸­à¸?à¸«à¸¡à¸²à¸¢à¸?à¸²à¸–à¸¹à¸?à¸«à¸¥à¸±à¸?à¸£à¸²à¸¢à¸?à¸²à¸£à¸—à¸µà¹?à¹€à¸¥à¸·à¸­à¸?'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

'-à¸?à¸”à¸?à¸¸à¹?à¸¡ export à¸ªà¸´à¹?à¸?à¸ªà¸¸à¸”à¸?à¸²à¸£à¸—à¸”à¸ªà¸­à¸?à¸?à¹?à¸­à¸¡à¸¹à¸¥ multiple à¸§à¸±à¸?à¸—à¸µà¹? 11/10/2017 à¹?à¸”à¸¢à¸?à¸” preview à¸?à¸”à¹€à¸¥à¸·à¸­à¸?à¸£à¸²à¸¢à¸?à¸²à¸£ à¹?à¸¥à¸°à¸?à¸” export'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

'---à¸•à¸£à¸§à¸?à¸ªà¸­à¸?à¸?à¸¥'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log//td_Survey Multiple'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'à¹€à¸¥à¸·à¸­à¸?à¸?à¸£à¸°à¹€à¸ à¸—à¸?à¸²à¸£à¸—à¸³à¸?à¸²à¸¢ à¹€à¸?à¹?à¸? all'
WebUI.selectOptionByIndex(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '0', FailureHandling.STOP_ON_FAILURE)

'à¹€à¸­à¸²à¹€à¸?à¸­à¹€à¸?à¸­à¸£à¹?à¸?à¸µà¹?à¸—à¸µà¹?à¹?à¸?à¸¥à¹? single à¹€à¸?à¸·à¹?à¸­à¸”à¸¹ preview'
WebUI.mouseOver(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/span_ (1)'))

'à¸•à¸£à¸§à¸?à¸ªà¸­à¸? pop up preview à¸?à¸­à¸?à¹?à¸?à¸¥à¹? single'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__008'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'à¸?à¸”à¸?à¸¸à¹?à¸¡ preview à¸?à¸­à¸?à¹?à¸?à¸¥à¹? multiple'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

'à¸?à¸”à¸?à¸¸à¹?à¸¡à¸?à¸²à¸?à¸?à¸°à¸?à¸²à¸—à¸—à¸µà¹?à¸«à¸?à¹?à¸²à¸•à¹?à¸²à¸? preview'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

'-à¸—à¸³à¹€à¸?à¸£à¸·à¹?à¸­à¸?à¸«à¸¡à¸²à¸¢à¸?à¸²à¸–à¸¹à¸?à¸«à¸¥à¸±à¸?à¸£à¸²à¸¢à¸?à¸²à¸£à¸—à¸µà¹?à¹€à¸¥à¸·à¸­à¸? à¸ªà¸´à¹?à¸?à¸ªà¸¸à¸”à¸?à¸²à¸£à¸—à¸”à¸ªà¸­à¸?à¸?à¹?à¸­à¸¡à¸¹à¸¥à¸—à¸±à¹?à¸?à¸«à¸¡à¸” (All) à¸§à¸±à¸?à¸—à¸µà¹? 11/10/2017 à¹?à¸”à¸¢à¸?à¸” preview à¹?à¸¥à¸°à¸?à¸”à¹€à¸¥à¸·à¸­à¸?à¸£à¸²à¸¢à¸?à¸²à¸£'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

'---à¸•à¸£à¸§à¸?à¸ªà¸­à¸?à¸?à¸¥'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/td_Survey Single'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'---à¸•à¸£à¸§à¸?à¸ªà¸­à¸?à¸?à¸¥'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log//td_Survey Multiple'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'à¹€à¸¥à¸·à¸­à¸?à¸?à¸£à¸°à¹€à¸ à¸—à¸?à¸²à¸£à¸—à¸³à¸?à¸²à¸¢ à¹€à¸?à¹?à¸? single'
WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '1', true)

'à¹€à¸­à¸²à¹€à¸?à¸­à¹€à¸?à¸­à¸£à¹?à¸?à¸µà¹?à¸—à¸µà¹?à¹?à¸?à¸¥à¹? single à¹€à¸?à¸·à¹?à¸­à¸”à¸¹ preview'
WebUI.mouseOver(findTestObject('Search history log/search history log/span_ 11'))

'à¸•à¸£à¸§à¸?à¸ªà¸­à¸? pop up preview à¸?à¸­à¸?à¹?à¸?à¸¥à¹? single'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__008'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'-à¸—à¸³à¹€à¸?à¸£à¸·à¹?à¸­à¸?à¸«à¸¡à¸²à¸¢à¸?à¸²à¸–à¸¹à¸?à¸«à¸¥à¸±à¸?à¸£à¸²à¸¢à¸?à¸²à¸£à¸—à¸µà¹?à¹€à¸¥à¸·à¸­à¸? à¸ªà¸´à¹?à¸?à¸ªà¸¸à¸”à¸?à¸²à¸£à¸—à¸”à¸ªà¸­à¸?à¸?à¹?à¸­à¸¡à¸¹à¸¥ single à¸§à¸±à¸?à¸—à¸µà¹? 11/10/2017 à¹?à¸”à¸¢à¸?à¸” preview à¹?à¸¥à¸°à¸?à¸”à¹€à¸¥à¸·à¸­à¸?à¸£à¸²à¸¢à¸?à¸²à¸£'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

'---à¸•à¸£à¸§à¸?à¸ªà¸­à¸?à¸?à¸¥'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/td_Survey Single'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'à¹€à¸¥à¸·à¸­à¸?à¸?à¸£à¸°à¹€à¸ à¸—à¸?à¸²à¸£à¸—à¸³à¸?à¸²à¸¢  à¹€à¸?à¹?à¸? multiple'
WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '2', true)

'à¸?à¸”à¸?à¸¸à¹?à¸¡ preview à¸?à¸­à¸?à¹?à¸?à¸¥à¹? multiple'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

'à¸?à¸”à¸?à¸¸à¹?à¸¡à¸?à¸²à¸?à¸?à¸°à¸?à¸²à¸—à¸—à¸µà¹?à¸«à¸?à¹?à¸²à¸•à¹?à¸²à¸? preview'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

'-à¸—à¸³à¹€à¸?à¸£à¸·à¹?à¸­à¸?à¸«à¸¡à¸²à¸¢à¸?à¸²à¸–à¸¹à¸?à¸«à¸¥à¸±à¸?à¸£à¸²à¸¢à¸?à¸²à¸£à¸—à¸µà¹?à¹€à¸¥à¸·à¸­à¸? à¸ªà¸´à¹?à¸?à¸ªà¸¸à¸”à¸?à¸²à¸£à¸—à¸”à¸ªà¸­à¸?à¸?à¹?à¸­à¸¡à¸¹à¸¥ multiple à¸§à¸±à¸?à¸—à¸µà¹? 11/10/2017 à¹?à¸”à¸¢à¸?à¸” preview à¹?à¸¥à¸°à¸?à¸”à¹€à¸¥à¸·à¸­à¸?à¸£à¸²à¸¢à¸?à¸²à¸£'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

'---à¸•à¸£à¸§à¸?à¸ªà¸­à¸?à¸?à¸¥'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log//td_Survey Multiple'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'à¹€à¸¥à¸·à¸­à¸?à¸?à¸£à¸°à¹€à¸ à¸—à¸?à¸²à¸£à¸—à¸³à¸?à¸²à¸¢ à¹€à¸?à¹?à¸? all\r\n'
WebUI.selectOptionByIndex(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '0', FailureHandling.STOP_ON_FAILURE)

'à¹€à¸­à¸²à¹€à¸?à¸­à¹€à¸?à¸­à¸£à¹?à¸?à¸µà¹?à¸—à¸µà¹?à¹?à¸?à¸¥à¹? single à¹€à¸?à¸·à¹?à¸­à¸”à¸¹ preview'
WebUI.mouseOver(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/span_ (1)'))

'à¸•à¸£à¸§à¸?à¸ªà¸­à¸? pop up preview à¸?à¸­à¸?à¹?à¸?à¸¥à¹? single'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__008'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'à¸?à¸”à¸?à¸¸à¹?à¸¡ preview à¸?à¸­à¸?à¹?à¸?à¸¥à¹? multiple'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

'à¸?à¸”à¸?à¸¸à¹?à¸¡à¸?à¸²à¸?à¸?à¸°à¸?à¸²à¸—à¸—à¸µà¹?à¸«à¸?à¹?à¸²à¸•à¹?à¸²à¸? preview'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

'-à¸?à¸”à¸?à¸¸à¹?à¸¡ export à¸ªà¸´à¹?à¸?à¸ªà¸¸à¸”à¸?à¸²à¸£à¸—à¸”à¸ªà¸­à¸?à¸?à¹?à¸­à¸¡à¸¹à¸¥à¸—à¸±à¹?à¸?à¸«à¸¡à¸” (All) à¸§à¸±à¸?à¸—à¸µà¹? 11/10/2017 à¹?à¸”à¸¢à¸?à¸” preview à¹?à¸¥à¸°à¸?à¸” export'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

'---à¸•à¸£à¸§à¸?à¸ªà¸­à¸?à¸?à¸¥'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/td_Survey Single'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'---à¸•à¸£à¸§à¸?à¸ªà¸­à¸?à¸?à¸¥'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log//td_Survey Multiple'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'à¹€à¸¥à¸·à¸­à¸?à¸?à¸£à¸°à¹€à¸ à¸—à¸?à¸²à¸£à¸—à¸³à¸?à¸²à¸¢ à¹€à¸?à¹?à¸? single'
WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '1', true)

'à¹€à¸­à¸²à¹€à¸?à¸­à¹€à¸?à¸­à¸£à¹?à¸?à¸µà¹?à¸—à¸µà¹?à¹?à¸?à¸¥à¹? single à¹€à¸?à¸·à¹?à¸­à¸”à¸¹ preview'
WebUI.mouseOver(findTestObject('Search history log/search history log/span_ 12345689'))

'à¸•à¸£à¸§à¸?à¸ªà¸­à¸? pop up preview à¸?à¸­à¸?à¹?à¸?à¸¥à¹? single'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__008'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'-à¸?à¸”à¸?à¸¸à¹?à¸¡ export à¸ªà¸´à¹?à¸?à¸ªà¸¸à¸”à¸?à¸²à¸£à¸—à¸”à¸ªà¸­à¸?à¸?à¹?à¸­à¸¡à¸¹à¸¥ single à¸§à¸±à¸?à¸—à¸µà¹? 11/10/2017 à¹?à¸”à¸¢à¸?à¸” preview à¹?à¸¥à¸°à¸?à¸” export'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

'---à¸•à¸£à¸§à¸?à¸ªà¸­à¸?à¸?à¸¥'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/td_Survey Single'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'à¹€à¸¥à¸·à¸­à¸?à¸?à¸£à¸°à¹€à¸ à¸—à¸?à¸²à¸£à¸—à¸³à¸?à¸²à¸¢ à¹€à¸?à¹?à¸? multiple'
WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '2', true)

'à¸?à¸”à¸?à¸¸à¹?à¸¡ preview à¸?à¸­à¸?à¹?à¸?à¸¥à¹? multiple'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

'à¸?à¸”à¸?à¸¸à¹?à¸¡à¸?à¸²à¸?à¸?à¸°à¸?à¸²à¸—à¸—à¸µà¹?à¸«à¸?à¹?à¸²à¸•à¹?à¸²à¸? preview'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

'-à¸?à¸”à¸?à¸¸à¹?à¸¡ export à¸ªà¸´à¹?à¸?à¸ªà¸¸à¸”à¸?à¸²à¸£à¸—à¸”à¸ªà¸­à¸?à¸?à¹?à¸­à¸¡à¸¹à¸¥ multi à¸§à¸±à¸?à¸—à¸µà¹? 11/10/2017 à¹?à¸”à¸¢à¸?à¸” preview à¹?à¸¥à¸°à¸?à¸” export'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

'---à¸•à¸£à¸§à¸?à¸ªà¸­à¸?à¸?à¸¥'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log//td_Survey Multiple'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'à¹?à¸ªà¹?à¸?à¹?à¸­à¸¡à¸¹à¸¥à¸§à¸±à¸?à¸—à¸µà¹? à¹?à¸? input à¸«à¸¥à¸±à¸?'
WebUI.setText(findTestObject('Search history log/search history log/input_selection ng-untouched n (1)'), '02/11/2017')

'à¹€à¸¥à¸·à¸­à¸?à¸?à¸£à¸°à¹€à¸ à¸—à¸?à¸²à¸£à¸—à¸³à¸?à¸²à¸¢ à¹€à¸?à¹?à¸? all'
WebUI.selectOptionByIndex(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '0', FailureHandling.STOP_ON_FAILURE)

'à¹€à¸­à¸²à¹€à¸?à¸­à¹€à¸?à¸­à¸£à¹?à¸?à¸µà¹?à¸—à¸µà¹?à¹?à¸?à¸¥à¹? single à¹€à¸?à¸·à¹?à¸­à¸”à¸¹ preview'
WebUI.mouseOver(findTestObject('Search history log/search history log/span_ '))

'à¸•à¸£à¸§à¸?à¸ªà¸­à¸? pop up preview à¸?à¸­à¸?à¹?à¸?à¸¥à¹? single'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__008'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'à¸?à¸”à¸?à¸¸à¹?à¸¡ preview à¸?à¸­à¸?à¹?à¸?à¸¥à¹? multiple'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

'à¸?à¸”à¸?à¸¸à¹?à¸¡à¸?à¸²à¸?à¸?à¸°à¸?à¸²à¸—à¸—à¸µà¹?à¸«à¸?à¹?à¸²à¸•à¹?à¸²à¸? preview'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

'à¸—à¸³à¹€à¸?à¸£à¸·à¹?à¸­à¸?à¸«à¸¡à¸²à¸¢à¸?à¸²à¸–à¸¹à¸?à¸«à¸¥à¸±à¸?à¸£à¸²à¸¢à¸?à¸²à¸£à¸—à¸µà¹?à¹€à¸¥à¸·à¸­à¸?'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

'-à¸?à¸”à¸?à¸¸à¹?à¸¡ export à¸ªà¸´à¹?à¸?à¸ªà¸¸à¸”à¸?à¸²à¸£à¸—à¸”à¸ªà¸­à¸?à¸?à¹?à¸­à¸¡à¸¹à¸¥à¸—à¸±à¹?à¸?à¸«à¸¡à¸” (All) à¸§à¸±à¸?à¸—à¸µà¹? 11/10/2017-31/11/2017 à¹?à¸”à¸¢à¸?à¸” preview à¸?à¸”à¹€à¸¥à¸·à¸­à¸?à¸£à¸²à¸¢à¸?à¸²à¸£ à¹?à¸¥à¸°à¸?à¸” export'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

'---à¸•à¸£à¸§à¸?à¸ªà¸­à¸?à¸?à¸¥'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/td_Survey Single'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'---à¸•à¸£à¸§à¸?à¸ªà¸­à¸?à¸?à¸¥'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log//td_Survey Multiple'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'à¹€à¸¥à¸·à¸­à¸?à¸?à¸£à¸°à¹€à¸ à¸—à¸?à¸²à¸£à¸—à¸³à¸?à¸²à¸¢ à¹€à¸?à¹?à¸? single'
WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '1', true)

'à¹€à¸­à¸²à¹€à¸?à¸­à¹€à¸?à¸­à¸£à¹?à¸?à¸µà¹?à¸—à¸µà¹?à¹?à¸?à¸¥à¹? single à¹€à¸?à¸·à¹?à¸­à¸”à¸¹ preview'
WebUI.mouseOver(findTestObject('Search history log/search history log/span_10'))

'à¸•à¸£à¸§à¸?à¸ªà¸­à¸? pop up preview à¸?à¸­à¸?à¹?à¸?à¸¥à¹? single'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__008'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'à¸—à¸³à¹€à¸?à¸£à¸·à¹?à¸­à¸?à¸«à¸¡à¸²à¸¢à¸?à¸²à¸–à¸¹à¸?à¸«à¸¥à¸±à¸?à¸£à¸²à¸¢à¸?à¸²à¸£à¸—à¸µà¹?à¹€à¸¥à¸·à¸­à¸?'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

'-à¸?à¸”à¸?à¸¸à¹?à¸¡ export à¸ªà¸´à¹?à¸?à¸ªà¸¸à¸”à¸?à¸²à¸£à¸—à¸”à¸ªà¸­à¸?à¸?à¹?à¸­à¸¡à¸¹à¸¥ single à¸§à¸±à¸?à¸—à¸µà¹? 11/10/2017-31/11/2017 à¹?à¸”à¸¢à¸?à¸” preview à¸?à¸”à¹€à¸¥à¸·à¸­à¸?à¸£à¸²à¸¢à¸?à¸²à¸£ à¹?à¸¥à¸°à¸?à¸” export'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

'---à¸•à¸£à¸§à¸?à¸ªà¸­à¸?à¸?à¸¥'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/td_Survey Single'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'à¹€à¸¥à¸·à¸­à¸?à¸?à¸£à¸°à¹€à¸ à¸—à¸?à¸²à¸£à¸—à¸³à¸?à¸²à¸¢ à¹€à¸?à¹?à¸? multiple\r\n'
WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '2', true)

'à¸?à¸”à¸?à¸¸à¹?à¸¡ preview à¸?à¸­à¸?à¹?à¸?à¸¥à¹? multiple'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

'à¸?à¸”à¸?à¸¸à¹?à¸¡à¸?à¸²à¸?à¸?à¸°à¸?à¸²à¸—à¸—à¸µà¹?à¸«à¸?à¹?à¸²à¸•à¹?à¸²à¸? preview'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

'à¸—à¸³à¹€à¸?à¸£à¸·à¹?à¸­à¸?à¸«à¸¡à¸²à¸¢à¸?à¸²à¸–à¸¹à¸?à¸«à¸¥à¸±à¸?à¸£à¸²à¸¢à¸?à¸²à¸£à¸—à¸µà¹?à¹€à¸¥à¸·à¸­à¸?'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

'-à¸?à¸”à¸?à¸¸à¹?à¸¡ export à¸ªà¸´à¹?à¸?à¸ªà¸¸à¸”à¸?à¸²à¸£à¸—à¸”à¸ªà¸­à¸?à¸?à¹?à¸­à¸¡à¸¹à¸¥ multiple à¸§à¸±à¸?à¸—à¸µà¹? 11/10/2017-31/11/2017 à¹?à¸”à¸¢à¸?à¸” preview à¸?à¸”à¹€à¸¥à¸·à¸­à¸?à¸£à¸²à¸¢à¸?à¸²à¸£ à¹?à¸¥à¸°à¸?à¸” export'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

'---à¸•à¸£à¸§à¸?à¸ªà¸­à¸?à¸?à¸¥'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log//td_Survey Multiple'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'à¹€à¸¥à¸·à¸­à¸?à¸?à¸£à¸°à¹€à¸ à¸—à¸?à¸²à¸£à¸—à¸³à¸?à¸²à¸¢ à¹€à¸?à¹?à¸? all\r\n'
WebUI.selectOptionByIndex(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '0', FailureHandling.STOP_ON_FAILURE)

'à¹€à¸­à¸²à¹€à¸?à¸­à¹€à¸?à¸­à¸£à¹?à¸?à¸µà¹?à¸—à¸µà¹?à¹?à¸?à¸¥à¹? single à¹€à¸?à¸·à¹?à¸­à¸”à¸¹ preview'
WebUI.mouseOver(findTestObject('Search history log/search history log/span_  (1)'))

'à¸•à¸£à¸§à¸?à¸ªà¸­à¸? pop up preview à¸?à¸­à¸?à¹?à¸?à¸¥à¹? single'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__008'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'à¸?à¸”à¸?à¸¸à¹?à¸¡ preview à¸?à¸­à¸?à¹?à¸?à¸¥à¹? multiple'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

'à¸?à¸”à¸?à¸¸à¹?à¸¡à¸?à¸²à¸?à¸?à¸°à¸?à¸²à¸—à¸—à¸µà¹?à¸«à¸?à¹?à¸²à¸•à¹?à¸²à¸? preview'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

'-à¸—à¸³à¹€à¸?à¸£à¸·à¹?à¸­à¸?à¸«à¸¡à¸²à¸¢à¸?à¸²à¸–à¸¹à¸?à¸«à¸¥à¸±à¸?à¸£à¸²à¸¢à¸?à¸²à¸£à¸—à¸µà¹?à¹€à¸¥à¸·à¸­à¸? à¸ªà¸´à¹?à¸?à¸ªà¸¸à¸”à¸?à¸²à¸£à¸—à¸”à¸ªà¸­à¸?à¸?à¹?à¸­à¸¡à¸¹à¸¥à¸—à¸±à¹?à¸?à¸«à¸¡à¸” (All) à¸§à¸±à¸?à¸—à¸µà¹? 11/10/2017-31/10/2017 à¹?à¸”à¸¢à¸?à¸” preview à¹?à¸¥à¸°à¸?à¸”à¹€à¸¥à¸·à¸­à¸?à¸£à¸²à¸¢à¸?à¸²à¸£'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

'---à¸•à¸£à¸§à¸?à¸ªà¸­à¸?à¸?à¸¥'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/td_Survey Single'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'---à¸•à¸£à¸§à¸?à¸ªà¸­à¸?à¸?à¸¥'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log//td_Survey Multiple'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'à¹€à¸¥à¸·à¸­à¸?à¸?à¸£à¸°à¹€à¸ à¸—à¸?à¸²à¸£à¸—à¸³à¸?à¸²à¸¢ à¹€à¸?à¹?à¸? single'
WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '1', true)

'à¹€à¸­à¸²à¹€à¸?à¸­à¹€à¸?à¸­à¸£à¹?à¸?à¸µà¹?à¸—à¸µà¹?à¹?à¸?à¸¥à¹? single à¹€à¸?à¸·à¹?à¸­à¸”à¸¹ preview'
WebUI.mouseOver(findTestObject('Search history log/search history log/span_10'))

'à¸•à¸£à¸§à¸?à¸ªà¸­à¸? pop up preview à¸?à¸­à¸?à¹?à¸?à¸¥à¹? single'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__008'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'à¹€à¸­à¸²à¹€à¸?à¸­à¹€à¸?à¸­à¸£à¹?à¸?à¸µà¹?à¸—à¸µà¹?à¹?à¸?à¸¥à¹? single à¹€à¸?à¸·à¹?à¸­à¸”à¸¹ preview'
WebUI.mouseOver(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/span_'))

'à¸•à¸£à¸§à¸?à¸ªà¸­à¸? pop up preview à¸?à¸­à¸?à¹?à¸?à¸¥à¹? single'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__008'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'-à¸—à¸³à¹€à¸?à¸£à¸·à¹?à¸­à¸?à¸«à¸¡à¸²à¸¢à¸?à¸²à¸–à¸¹à¸?à¸«à¸¥à¸±à¸?à¸£à¸²à¸¢à¸?à¸²à¸£à¸—à¸µà¹?à¹€à¸¥à¸·à¸­à¸? à¸ªà¸´à¹?à¸?à¸ªà¸¸à¸”à¸?à¸²à¸£à¸—à¸”à¸ªà¸­à¸?à¸?à¹?à¸­à¸¡à¸¹à¸¥ single à¸§à¸±à¸?à¸—à¸µà¹? 11/10/2017-31/10/2017 à¹?à¸”à¸¢à¸?à¸” preview à¹?à¸¥à¸°à¸?à¸”à¹€à¸¥à¸·à¸­à¸?à¸£à¸²à¸¢à¸?à¸²à¸£'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

'---à¸•à¸£à¸§à¸?à¸ªà¸­à¸?à¸?à¸¥'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/td_Survey Single'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'à¹€à¸¥à¸·à¸­à¸?à¸?à¸£à¸°à¹€à¸ à¸—à¸?à¸²à¸£à¸—à¸³à¸?à¸²à¸¢ à¹€à¸?à¹?à¸? multiple'
WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '2', true)

'à¸?à¸”à¸?à¸¸à¹?à¸¡ preview à¸?à¸­à¸?à¹?à¸?à¸¥à¹? multiple'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

'à¸?à¸”à¸?à¸¸à¹?à¸¡à¸?à¸²à¸?à¸?à¸°à¸?à¸²à¸—à¸—à¸µà¹?à¸«à¸?à¹?à¸²à¸•à¹?à¸²à¸? preview'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

'à¸?à¸”à¸?à¸¸à¹?à¸¡ preview à¸?à¸­à¸?à¹?à¸?à¸¥à¹? multiple'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

'à¸?à¸”à¸?à¸¸à¹?à¸¡à¸?à¸²à¸?à¸?à¸°à¸?à¸²à¸—à¸—à¸µà¹?à¸«à¸?à¹?à¸²à¸•à¹?à¸²à¸? preview'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

'-à¸—à¸³à¹€à¸?à¸£à¸·à¹?à¸­à¸?à¸«à¸¡à¸²à¸¢à¸?à¸²à¸–à¸¹à¸?à¸«à¸¥à¸±à¸?à¸£à¸²à¸¢à¸?à¸²à¸£à¸—à¸µà¹?à¹€à¸¥à¸·à¸­à¸? à¸ªà¸´à¹?à¸?à¸ªà¸¸à¸”à¸?à¸²à¸£à¸—à¸”à¸ªà¸­à¸?à¸?à¹?à¸­à¸¡à¸¹à¸¥ multiple à¸§à¸±à¸?à¸—à¸µà¹? 11/10/2017-31/10/2017 à¹?à¸”à¸¢à¸?à¸” preview à¹?à¸¥à¸°à¸?à¸”à¹€à¸¥à¸·à¸­à¸?à¸£à¸²à¸¢à¸?à¸²à¸£'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

'---à¸•à¸£à¸§à¸?à¸ªà¸­à¸?à¸?à¸¥'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log//td_Survey Multiple'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'à¹€à¸¥à¸·à¸­à¸?à¸?à¸£à¸°à¹€à¸ à¸—à¸?à¸²à¸£à¸—à¸³à¸?à¸²à¸¢ à¹€à¸?à¹?à¸? all'
WebUI.selectOptionByIndex(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '0', FailureHandling.STOP_ON_FAILURE)

'à¹€à¸­à¸²à¹€à¸?à¸­à¹€à¸?à¸­à¸£à¹?à¸?à¸µà¹?à¸—à¸µà¹?à¹?à¸?à¸¥à¹? single à¹€à¸?à¸·à¹?à¸­à¸”à¸¹ preview'
WebUI.mouseOver(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/span_'))

'à¸•à¸£à¸§à¸?à¸ªà¸­à¸? pop up preview à¸?à¸­à¸?à¹?à¸?à¸¥à¹? single'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__008'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'à¸?à¸”à¸?à¸¸à¹?à¸¡ preview à¸?à¸­à¸?à¹?à¸?à¸¥à¹? multiple'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

'à¸?à¸”à¸?à¸¸à¹?à¸¡à¸?à¸²à¸?à¸?à¸°à¸?à¸²à¸—à¸—à¸µà¹?à¸«à¸?à¹?à¸²à¸•à¹?à¸²à¸? preview'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

'-à¸?à¸”à¸?à¸¸à¹?à¸¡ export à¸ªà¸´à¹?à¸?à¸ªà¸¸à¸”à¸?à¸²à¸£à¸—à¸”à¸ªà¸­à¸?à¸?à¹?à¸­à¸¡à¸¹à¸¥à¸—à¸±à¹?à¸?à¸«à¸¡à¸” (All) à¸§à¸±à¸?à¸—à¸µà¹? 11/10/2017-31/11/2017 à¹?à¸”à¸¢à¸?à¸” preview à¹?à¸¥à¸°à¸?à¸” export'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

'---à¸•à¸£à¸§à¸?à¸ªà¸­à¸?à¸?à¸¥'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/td_Survey Single'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'---à¸•à¸£à¸§à¸?à¸ªà¸­à¸?à¸?à¸¥'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log//td_Survey Multiple'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'à¹€à¸¥à¸·à¸­à¸?à¸?à¸£à¸°à¹€à¸ à¸—à¸?à¸²à¸£à¸—à¸³à¸?à¸²à¸¢ à¹€à¸?à¹?à¸? single'
WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '1', true)

'à¹€à¸­à¸²à¹€à¸?à¸­à¹€à¸?à¸­à¸£à¹?à¸?à¸µà¹?à¸—à¸µà¹?à¹?à¸?à¸¥à¹? single à¹€à¸?à¸·à¹?à¸­à¸”à¸¹ preview'
WebUI.mouseOver(findTestObject('Search history log/search history log/span_12'))

'à¸•à¸£à¸§à¸?à¸ªà¸­à¸? pop up preview à¸?à¸­à¸?à¹?à¸?à¸¥à¹? single'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__008'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'-à¸?à¸”à¸?à¸¸à¹?à¸¡ export à¸ªà¸´à¹?à¸?à¸ªà¸¸à¸”à¸?à¸²à¸£à¸—à¸”à¸ªà¸­à¸?à¸?à¹?à¸­à¸¡à¸¹à¸¥ single à¸§à¸±à¸?à¸—à¸µà¹? 11/10/2017-31/11/2017 à¹?à¸”à¸¢à¸?à¸” preview à¹?à¸¥à¸°à¸?à¸” export'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

'---à¸•à¸£à¸§à¸?à¸ªà¸­à¸?à¸?à¸¥'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/td_Survey Single'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'à¹€à¸¥à¸·à¸­à¸?à¸?à¸£à¸°à¹€à¸ à¸—à¸?à¸²à¸£à¸—à¸³à¸?à¸²à¸¢ à¹€à¸?à¹?à¸? multiple'
WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '2', true)

'à¸?à¸”à¸?à¸¸à¹?à¸¡ preview à¸?à¸­à¸?à¹?à¸?à¸¥à¹? multiple'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

'à¸?à¸”à¸?à¸¸à¹?à¸¡à¸?à¸²à¸?à¸?à¸°à¸?à¸²à¸—à¸—à¸µà¹?à¸«à¸?à¹?à¸²à¸•à¹?à¸²à¸? preview'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

'-à¸?à¸”à¸?à¸¸à¹?à¸¡ export à¸ªà¸´à¹?à¸?à¸ªà¸¸à¸”à¸?à¸²à¸£à¸—à¸”à¸ªà¸­à¸?à¸?à¹?à¸­à¸¡à¸¹à¸¥ multiple à¸§à¸±à¸?à¸—à¸µà¹? 11/10/2017-31/11/2017 à¹?à¸”à¸¢à¸?à¸” preview à¹?à¸¥à¸°à¸?à¸” export'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

'---à¸•à¸£à¸§à¸?à¸ªà¸­à¸?à¸?à¸¥'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log//td_Survey Multiple'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'à¹€à¸¥à¸·à¸­à¸?à¸?à¸£à¸°à¹€à¸ à¸—à¸?à¸²à¸£à¸—à¸³à¸?à¸²à¸¢ à¹€à¸?à¹?à¸? all'
WebUI.selectOptionByIndex(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '0')

'à¸?à¸”à¸?à¸²à¸?à¸°à¸?à¸²à¸—à¸¥à¸?à¸§à¸±à¸?à¸—à¸µà¹? input à¸?à¹?à¸²à¸?à¸«à¸?à¹?à¸²'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/span_mydpicon icon-mydpremove'))

'---à¸•à¸£à¸§à¸?à¸ªà¸­à¸?à¸?à¸¥'
WebUI.verifyElementNotPresent(findTestObject('Search history log/search history log//button_Preview'), 5)

not_run: WebUI.selectOptionByIndex(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '0', FailureHandling.STOP_ON_FAILURE)

'à¹?à¸ªà¹?à¸?à¹?à¸­à¸¡à¸¹à¸¥à¸§à¸±à¸?à¸—à¸µà¹?à¹?à¸? input à¸«à¸¥à¸±à¸?'
WebUI.setText(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_selection ng-valid ng-di'), 
    '02/11/2017')

WebUI.closeBrowser()

