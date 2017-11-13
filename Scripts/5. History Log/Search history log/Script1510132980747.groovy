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

'login'
not_run: WebUI.click(findTestObject('Page_Guru TMDA/span_Login'))

',,'
not_run: WebUI.setText(findTestObject('Page_Guru TMDA (1)/input_ng-untouched ng-valid ng'), 'creme')

',,'
not_run: WebUI.setText(findTestObject('Page_Guru TMDA (1)/input_ng-untouched ng-pristine'), '1234')

'login'
not_run: WebUI.submit(findTestObject('Page_Guru TMDA (1)/button_Login'))

'click log buttom'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/a_Log'))

'Show preview ----> Cursor mouse at sigle file '
WebUI.mouseOver(findTestObject('Search history log/search history log/span_2'))

'verify pop up preview -->sigle file'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__anim'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'click preview button -->multiple file'
WebUI.click(findTestObject('Search history log/search history log/button_Preview'))

'click X preview showing'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

'select file on checkbox '
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-untouched ng-pristine'))

'click export button'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

'verify file'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/td_Survey Single'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'verify file'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log//td_Survey Multiple'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'select precit type -->single'
WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '1', true)

'Show preview ----> Cursor mouse at sigle file '
WebUI.mouseOver(findTestObject('Search history log/search history log//span_3'))

'verify pop up preview -->sigle file'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__anim003'), 5, 
    FailureHandling.CONTINUE_ON_FAILURE)

'select file on checkbox '
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

'click export button'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

'verify file'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/td_Survey Single'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'select precit type --> multipel'
WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '2', true)

'click preview button -->multiple file'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

'click X preview showing'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

'select file on checkbox '
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

'click export button'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

'verify file'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log//td_Survey Multiple'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'select precit type -->all'
WebUI.selectOptionByIndex(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '0', FailureHandling.STOP_ON_FAILURE)

'Show preview ----> Cursor mouse at sigle file '
WebUI.mouseOver(findTestObject('Search history log/search history log//span_4'))

'verify pop up preview -->sigle file'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log//div_ngxp__container ngxp__anim004'), 5, 
    FailureHandling.CONTINUE_ON_FAILURE)

'click preview button -->multiple file'
WebUI.click(findTestObject('Search history log/search history log/button_Preview'))

'click X preview showing'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

'select file on checkbox '
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

'verify file'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/td_Survey Single'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'verify file'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log//td_Survey Multiple'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'select precit type -->single'
WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '1', true)

'Show preview ----> Cursor mouse at sigle file '
WebUI.mouseOver(findTestObject('Search history log/search history log//span_5'))

'verify pop up preview -->sigle file'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__anim005'), 5, 
    FailureHandling.CONTINUE_ON_FAILURE)

'select file on checkbox '
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

'verify file'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log//td_Survey Single'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'select precit type --> multiple'
WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '2', true)

'click preview button -->multiple file'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

'click X preview showing'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

'select file on checkbox '
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

'verify file'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log//td_Survey Multiple'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'select precit type --> all'
WebUI.selectOptionByIndex(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '0', FailureHandling.STOP_ON_FAILURE)

'Show preview ----> Cursor mouse at sigle file '
WebUI.mouseOver(findTestObject('Search history log/search history log//span_2'))

'verify pop up preview -->sigle file'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__anim'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'click preview button -->multiple file'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

'click X preview showing'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

'click export button'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

'verify file'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/td_Survey Single'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'verify file'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log//td_Survey Multiple'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'select precit type -->single'
WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '1', true)

'Show preview ----> Cursor mouse at sigle file '
WebUI.mouseOver(findTestObject('Search history log/search history log/span_8'))

'verify pop up preview -->sigle file'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__anim'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'click export button'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

'verify file'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/td_Survey Single'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'select precit type --> multiple'
WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '2', true)

'click preview button -->multiple file'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

'click X preview showing'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA/i_fa fa-times w3-xlarge w3-tex'))

'click export button'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

'verify file'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log//td_Survey Multiple'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'input date -->input1'
WebUI.setText(findTestObject('Search history log/search history log/input_selection ng-untouched n'), '02/11/2017')

'select precit type --> all'
WebUI.selectOptionByIndex(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '0', FailureHandling.STOP_ON_FAILURE)

'Show preview ----> Cursor mouse at sigle file '
WebUI.mouseOver(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/span_ (1)'))

'verify pop up preview -->sigle file'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__008'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'Show preview ----> Cursor mouse at sigle file '
WebUI.mouseOver(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/span_ (1)'))

'verify pop up preview -->sigle file'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__008'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'click preview button -->multiple file'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

'click X preview showing'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

'select file on checkbox '
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

'click export button'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

'verify file'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/td_Survey Single'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'verify file'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log//td_Survey Multiple'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'select precit type -->single'
WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '1', true)

'Show preview ----> Cursor mouse at sigle file '
WebUI.mouseOver(findTestObject('Search history log/search history log//span_ 6'))

'verify pop up preview -->sigle file'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__anim006'), 5, 
    FailureHandling.CONTINUE_ON_FAILURE)

'select file on checkbox '
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

'click export button'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

'verify file'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/td_Survey Single'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'select precit type --> multiple'
WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '2', true)

'click preview button -->multiple file'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

'click X preview showing'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

'select file on checkbox '
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

'click export button'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

'verify file'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log//td_Survey Multiple'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'select precit type --> all'
WebUI.selectOptionByIndex(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '0', FailureHandling.STOP_ON_FAILURE)

'Show preview ----> Cursor mouse at sigle file '
WebUI.mouseOver(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/span_ (1)'))

'verify pop up preview -->sigle file'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__008'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'click preview button -->multiple file'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

'click X preview showing'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

'select file on checkbox '
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

'verify file'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/td_Survey Single'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'verify file'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log//td_Survey Multiple'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'select precit type -->single'
WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '1', true)

'Show preview ----> Cursor mouse at sigle file '
WebUI.mouseOver(findTestObject('Search history log/search history log/span_ 11'))

'verify pop up preview -->sigle file'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__008'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'select file on checkbox '
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

'verify file'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/td_Survey Single'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'select precit type --> multiple'
WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '2', true)

'click preview button -->multiple file'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

'click X preview showing'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

'select file on checkbox '
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

'verify file'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log//td_Survey Multiple'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'select precit type --> all'
WebUI.selectOptionByIndex(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '0', FailureHandling.STOP_ON_FAILURE)

'Show preview ----> Cursor mouse at sigle file '
WebUI.mouseOver(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/span_ (1)'))

'verify pop up preview -->sigle file'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__008'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'click preview button -->multiple file'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

'click X preview showing'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

'click export button'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

'verify file'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/td_Survey Single'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'verify file'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log//td_Survey Multiple'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'select precit type -->single'
WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '1', true)

'Show preview ----> Cursor mouse at sigle file '
WebUI.mouseOver(findTestObject('Search history log/search history log/span_ 12345689'))

'verify pop up preview -->sigle file'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__008'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'click export button'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

'verify file'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/td_Survey Single'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'select precit type --> multiple'
WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '2', true)

'click preview button -->multiple file'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

'click X preview showing'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

'click export button'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

'verify file'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log//td_Survey Multiple'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'input date --> input2'
WebUI.setText(findTestObject('Search history log/search history log/input_selection ng-untouched n (1)'), '02/11/2017')

'select precit type --> all'
WebUI.selectOptionByIndex(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '0', FailureHandling.STOP_ON_FAILURE)

'Show preview ----> Cursor mouse at sigle file '
WebUI.mouseOver(findTestObject('Search history log/search history log/span_ '))

'verify pop up preview -->sigle file'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__008'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'click preview button -->multiple file'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

'click X preview showing'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

'select file on checkbox '
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

'click export button'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

'verify file'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/td_Survey Single'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'verify file'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log//td_Survey Multiple'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'verify file'
WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '1', true)

'Show preview ----> Cursor mouse at sigle file '
WebUI.mouseOver(findTestObject('Search history log/search history log/span_10'))

'verify pop up preview -->sigle file'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__008'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'select file on checkbox '
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

'click export button'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

'verify file'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/td_Survey Single'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'select precit type --> multiple'
WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '2', true)

'click preview button -->multiple file'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

'click X preview showing'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

'select file on checkbox '
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

'click export button'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

'verify file'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log//td_Survey Multiple'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'select precit type --> all'
WebUI.selectOptionByIndex(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '0', FailureHandling.STOP_ON_FAILURE)

'Show preview ----> Cursor mouse at sigle file '
WebUI.mouseOver(findTestObject('Search history log/search history log/span_  (1)'))

'verify pop up preview -->sigle file'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__008'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'click preview button -->multiple file'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

'click X preview showing'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

'select file on checkbox '
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

'verify file'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/td_Survey Single'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'verify file'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log//td_Survey Multiple'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'select precit type -->single'
WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '1', true)

'Show preview ----> Cursor mouse at sigle file '
WebUI.mouseOver(findTestObject('Search history log/search history log/span_10'))

'verify pop up preview -->sigle file'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__008'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'Show preview ----> Cursor mouse at sigle file '
WebUI.mouseOver(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/span_'))

'verify pop up preview -->sigle file'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__008'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'click X preview showing'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

'verify file'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/td_Survey Single'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'select precit type --> multiple'
WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '2', true)

'click preview button -->multiple file'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

'click X preview showing'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

'click preview button -->multiple file'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

'click X preview showing'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

'select file on checkbox '
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

'verify file'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log//td_Survey Multiple'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'select precit type --> all'
WebUI.selectOptionByIndex(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '0', FailureHandling.STOP_ON_FAILURE)

'Show preview ----> Cursor mouse at sigle file '
WebUI.mouseOver(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/span_'))

'verify pop up preview -->sigle file'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__008'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'click preview button -->multiple file'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

'click X preview showing'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

'click export button'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

'verify file'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/td_Survey Single'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'verify file'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log//td_Survey Multiple'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'select precit type -->single'
WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '1', true)

'Show preview ----> Cursor mouse at sigle file '
WebUI.mouseOver(findTestObject('Search history log/search history log/span_12'))

'verify pop up preview -->sigle file'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__008'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'click export button'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

'verify file'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/td_Survey Single'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'select precit type --> multiple'
WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '2', true)

'click preview button -->multiple file'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

'click X preview showing'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

'click export button'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

'verify file'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log//td_Survey Multiple'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'select precit type --> all'
WebUI.selectOptionByIndex(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '0')

'click calenda icon after input1'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/span_mydpicon icon-mydpremove'))

'verify file'
WebUI.verifyElementNotPresent(findTestObject('Search history log/search history log//button_Preview'), 5)

not_run: WebUI.selectOptionByIndex(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '0', FailureHandling.STOP_ON_FAILURE)

'input date --> input2'
WebUI.setText(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_selection ng-valid ng-di'), 
    '02/11/2017')

not_run: WebUI.closeBrowser()

