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

'-สิ�?�?สุด�?ารทดสอ�? login\r\n'
not_run: WebUI.submit(findTestObject('Page_Guru TMDA (1)/button_Login'))

'�?ด�?ุ�?ม Log'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/a_Log'))

'เอาเ�?อเ�?อร�?�?ี�?ที�?�?�?ล�? single เ�?ื�?อดู preview'
WebUI.mouseOver(findTestObject('Search history log/search history log/span_2'))

'ตรว�?สอ�? pop up preview �?อ�?�?�?ล�? single'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__anim'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'�?ด�?ุ�?ม preview �?อ�?�?�?ล�? multiple'
WebUI.click(findTestObject('Search history log/search history log/button_Preview'))

'�?ด�?ุ�?ม�?า�?�?ะ�?าทที�?ห�?�?าต�?า�? preview'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

'ทำเ�?รื�?อ�?หมาย�?า�?ถู�?หลั�?ราย�?ารที�?เลือ�?'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-untouched ng-pristine'))

'-�?ด�?ุ�?ม export สิ�?�?สุด�?ารทดสอ�?�?�?อมูลทั�?�?หมด (All) วั�?�?ั�?�?ุ�?ั�? �?ดย�?ด preview �?ดเลือ�?ราย�?าร  �?ละ�?ด export'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

'---ตรว�?สอ�?�?ล'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/td_Survey Single'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'---ตรว�?สอ�?�?ล'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log//td_Survey Multiple'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'เลือ�?�?ระเภท�?ารทำ�?าย เ�?�?�? single'
WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '1', true)

'เอาเ�?อเ�?อร�?�?ี�?ที�?�?�?ล�? single เ�?ื�?อดู preview'
WebUI.mouseOver(findTestObject('Search history log/search history log//span_3'))

'ตรว�?สอ�? pop up preview �?อ�?�?�?ล�? single'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__anim003'), 5, 
    FailureHandling.CONTINUE_ON_FAILURE)

'ทำเ�?รื�?อ�?หมาย�?า�?ถู�?หลั�?ราย�?ารที�?เลือ�?'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

'-�?ด�?ุ�?ม export สิ�?�?สุด�?ารทดสอ�?�?�?อมูล single วั�?�?ั�?�?ุ�?ั�? �?ดย�?ด preview �?ดเลือ�?ราย�?าร  �?ละ�?ด export'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

'---ตรว�?สอ�?�?ล'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/td_Survey Single'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'เลือ�?�?ระเภท�?ารทำ�?าย เ�?�?�? multiple'
WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '2', true)

'�?ด�?ุ�?ม preview �?อ�?�?�?ล�? multiple'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

'�?ด�?ุ�?ม�?า�?�?ะ�?าทที�?ห�?�?าต�?า�? preview'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

'ทำเ�?รื�?อ�?หมาย�?า�?ถู�?หลั�?ราย�?ารที�?เลือ�?'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

'-�?ด�?�?ม export สิ�?�?สุด�?ารทดสอ�?�?�?อมูล multiple วั�?�?ั�?�?ุ�?ั�? �?ดย�?ด preview �?ดเลือ�?ราย�?าร  �?ละ�?ด export'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

'---ตรว�?สอ�?�?ล'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log//td_Survey Multiple'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'เลือ�?�?ระเภท�?ารทำ�?ายเ�?�?�? all'
WebUI.selectOptionByIndex(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '0', FailureHandling.STOP_ON_FAILURE)

'เอาเ�?อเ�?อร�?�?ี�?ที�?�?�?ล�? single เ�?ื�?อดู preview'
WebUI.mouseOver(findTestObject('Search history log/search history log//span_4'))

'ตรว�?สอ�? pop up preview �?อ�?�?�?ล�? single'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log//div_ngxp__container ngxp__anim004'), 5, 
    FailureHandling.CONTINUE_ON_FAILURE)

'�?ด�?ุ�?ม preview �?อ�?�?�?ล�? multiple'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

'�?ด�?ุ�?ม�?า�?�?ะ�?าทที�?ห�?�?าต�?า�? preview'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

'-ทำเ�?รื�?อ�?หมาย�?า�?ถู�?หลั�?ราย�?ารที�?เลือ�? สิ�?�?สุด�?ารทดสอ�?�?�?อมูลทั�?�?หมด (All) วั�?�?ั�?�?ุ�?ั�? �?ดย�?ด preview �?ละ�?ดเลือ�?ราย�?าร'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

'---ตรว�?สอ�?�?ล'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/td_Survey Single'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'---ตรว�?สอ�?�?ล'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log//td_Survey Multiple'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'เลือ�?�?ระเภท�?ารทำ�?าย เ�?�?�? single'
WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '1', true)

'เอาเ�?อเ�?อร�?�?ี�?ที�?�?�?ล�? single เ�?ื�?อดู preview'
WebUI.mouseOver(findTestObject('Search history log/search history log//span_5'))

'ตรว�?สอ�? pop up preview �?อ�?�?�?ล�? single'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__anim005'), 5, 
    FailureHandling.CONTINUE_ON_FAILURE)

'-ทำเ�?รื�?อ�?หมาย�?า�?ถู�?หลั�?ราย�?ารที�?เลือ�? สิ�?�?สุด�?ารทดสอ�?�?�?อมูล single วั�?�?ั�?�?ุ�?ั�? �?ดย�?ด preview �?ละ�?ดเลือ�?ราย�?าร'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

'---ตรว�?สอ�?�?ล'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log//td_Survey Single'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'เลือ�?�?ระเภท�?ารทำ�?าย เ�?�?�? multiple'
WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '2', true)

'�?ด�?ุ�?ม preview �?อ�?�?�?ล�? multiple'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

'�?ด�?ุ�?ม�?า�?�?ะ�?าทที�?ห�?�?าต�?า�? preview'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

'-ทำเ�?รื�?อ�?หมาย�?า�?ถู�?หลั�?ราย�?ารที�?เลือ�? สิ�?�?สุด�?ารทดสอ�?�?�?อมูล multiple วั�?�?ั�?�?ุ�?ั�? �?ดย�?ด preview �?ละ�?ดเลือ�?ราย�?าร'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

'---ตรว�?สอ�?�?ล'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log//td_Survey Multiple'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'เลือ�?�?ระเภท�?ารทำ�?าย เ�?�?�? all'
WebUI.selectOptionByIndex(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '0', FailureHandling.STOP_ON_FAILURE)

'เอาเ�?อเ�?อร�?�?ี�?ที�?�?�?ล�? single เ�?ื�?อดู preview'
WebUI.mouseOver(findTestObject('Search history log/search history log//span_2'))

'ตรว�?สอ�? pop up preview �?อ�?�?�?ล�? single'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__anim'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'�?ด�?ุ�?ม preview �?อ�?�?�?ล�? multiple'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

'�?ด�?ุ�?ม�?า�?�?ะ�?าทที�?ห�?�?าต�?า�? preview'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

'-�?ด�?ุ�?ม export สิ�?�?สุด�?ารทดสอ�?�?�?อมูลทั�?�?หมด (All) วั�?�?ั�?�?ุ�?ั�? �?ดย�?ด preview �?ละ�?ด export'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

'---ตรว�?สอ�?�?ล'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/td_Survey Single'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'---ตรว�?สอ�?�?ล'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log//td_Survey Multiple'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'เลือ�?�?ระเภท�?ารทำ�?าย เ�?�?�? single'
WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '1', true)

'เอาเ�?อเ�?อร�?�?ี�?ที�?�?�?ล�? single เ�?ื�?อดู preview'
WebUI.mouseOver(findTestObject('Search history log/search history log/span_8'))

'ตรว�?สอ�? pop up preview �?อ�?�?�?ล�? single'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__anim'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'-�?ด�?ุ�?ม export สิ�?�?สุด�?ารทดสอ�?�?�?อมูล single วั�?�?ั�?�?ุ�?ั�? �?ดย�?ด preview �?ละ�?ด export'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

'---ตรว�?สอ�?�?ล'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/td_Survey Single'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'เลือ�?�?ระเภท�?ารทำ�?าย multiple'
WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '2', true)

'�?ด�?ุ�?ม preview �?อ�?�?�?ล�? multiple'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

'�?ด�?ุ�?ม�?า�?�?ะ�?าทที�?ห�?�?าต�?า�? preview'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA/i_fa fa-times w3-xlarge w3-tex'))

'-�?ด�?ุ�?ม export สิ�?�?สุด�?ารทดสอ�?�?�?อมูล multiple วั�?�?ั�?�?ุ�?ั�? �?ดย�?ด preview �?ละ�?ด export'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

'---ตรว�?สอ�?�?ล'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log//td_Survey Multiple'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'�?ส�?�?�?อมูลวั�?ที�?ที�?ต�?อ�?�?าร�?�?�?หา �?�? input �?ร�?'
WebUI.setText(findTestObject('Search history log/search history log/input_selection ng-untouched n'), '02/11/2017')

'เลือ�?�?ระเภท�?ารทำ�?าย all'
WebUI.selectOptionByIndex(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '0', FailureHandling.STOP_ON_FAILURE)

'เอาเ�?อเ�?อร�?�?ี�?ที�?�?�?ล�? single เ�?ื�?อดู preview'
WebUI.mouseOver(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/span_ (1)'))

'ตรว�?สอ�? pop up preview �?อ�?�?�?ล�? single'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__008'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'เอาเ�?อเ�?อร�?�?ี�?ที�?�?�?ล�? single เ�?ื�?อดู preview'
WebUI.mouseOver(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/span_ (1)'))

'ตรว�?สอ�? pop up preview �?อ�?�?�?ล�? single'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__008'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'�?ด�?ุ�?ม preview �?อ�?�?�?ล�? multiple'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

'�?ด�?ุ�?ม�?า�?�?ะ�?าทที�?ห�?�?าต�?า�? preview'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

'ทำเ�?รื�?อ�?หมาย�?าถู�?หลั�?ราย�?ารที�?เลือ�?'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

'-�?ด�?ุ�?ม export สิ�?�?สุด�?ารทดสอ�?�?�?อมูลทั�?�?หมด (All) วั�?ที�? 11/10/2017 �?ดย�?ด preview �?ดเลือ�?ราย�?าร �?ละ�?ด export'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

'---ตรว�?สอ�?�?ล'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/td_Survey Single'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'---ตรว�?สอ�?�?ล'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log//td_Survey Multiple'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'เลือ�?�?ระเภท�?ารทำ�?าย เ�?�?�? single'
WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '1', true)

'เอาเ�?อเ�?อร�?�?ี�?ที�?�?�?ล�? single เ�?ื�?อดู preview'
WebUI.mouseOver(findTestObject('Search history log/search history log//span_ 6'))

'ตรว�?สอ�? pop up preview �?อ�?�?�?ล�? single'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__anim006'), 5, 
    FailureHandling.CONTINUE_ON_FAILURE)

'ทำเ�?รื�?อ�?หมาย�?าถู�?หลั�?ราย�?ารที�?เลือ�?'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

'-�?ด�?ุ�?ม export สิ�?�?สุด�?ารทดสอ�?�?�?อมูล single วั�?ที�? 11/10/2017 �?ดย�?ด preview �?ดเลือ�?ราย�?าร �?ละ�?ด export'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

'---ตรว�?สอ�?�?ล'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/td_Survey Single'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'เลือ�?�?ระเภท�?ารทำ�?าย เ�?�?�? multiple'
WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '2', true)

'�?ด�?ุ�?ม preview �?อ�?�?�?ล�? multiple'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

'�?ด�?ุ�?ม�?า�?�?ะ�?าทที�?ห�?�?าต�?า�? preview'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

'ทำเ�?รื�?อ�?หมาย�?าถู�?หลั�?ราย�?ารที�?เลือ�?'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

'-�?ด�?ุ�?ม export สิ�?�?สุด�?ารทดสอ�?�?�?อมูล multiple วั�?ที�? 11/10/2017 �?ดย�?ด preview �?ดเลือ�?ราย�?าร �?ละ�?ด export'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

'---ตรว�?สอ�?�?ล'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log//td_Survey Multiple'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'เลือ�?�?ระเภท�?ารทำ�?าย เ�?�?�? all'
WebUI.selectOptionByIndex(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '0', FailureHandling.STOP_ON_FAILURE)

'เอาเ�?อเ�?อร�?�?ี�?ที�?�?�?ล�? single เ�?ื�?อดู preview'
WebUI.mouseOver(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/span_ (1)'))

'ตรว�?สอ�? pop up preview �?อ�?�?�?ล�? single'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__008'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'�?ด�?ุ�?ม preview �?อ�?�?�?ล�? multiple'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

'�?ด�?ุ�?ม�?า�?�?ะ�?าทที�?ห�?�?าต�?า�? preview'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

'-ทำเ�?รื�?อ�?หมาย�?าถู�?หลั�?ราย�?ารที�?เลือ�? สิ�?�?สุด�?ารทดสอ�?�?�?อมูลทั�?�?หมด (All) วั�?ที�? 11/10/2017 �?ดย�?ด preview �?ละ�?ดเลือ�?ราย�?าร'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

'---ตรว�?สอ�?�?ล'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/td_Survey Single'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'---ตรว�?สอ�?�?ล'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log//td_Survey Multiple'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'เลือ�?�?ระเภท�?ารทำ�?าย เ�?�?�? single'
WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '1', true)

'เอาเ�?อเ�?อร�?�?ี�?ที�?�?�?ล�? single เ�?ื�?อดู preview'
WebUI.mouseOver(findTestObject('Search history log/search history log/span_ 11'))

'ตรว�?สอ�? pop up preview �?อ�?�?�?ล�? single'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__008'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'-ทำเ�?รื�?อ�?หมาย�?าถู�?หลั�?ราย�?ารที�?เลือ�? สิ�?�?สุด�?ารทดสอ�?�?�?อมูล single วั�?ที�? 11/10/2017 �?ดย�?ด preview �?ละ�?ดเลือ�?ราย�?าร'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

'---ตรว�?สอ�?�?ล'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/td_Survey Single'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'เลือ�?�?ระเภท�?ารทำ�?าย  เ�?�?�? multiple'
WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '2', true)

'�?ด�?ุ�?ม preview �?อ�?�?�?ล�? multiple'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

'�?ด�?ุ�?ม�?า�?�?ะ�?าทที�?ห�?�?าต�?า�? preview'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

'-ทำเ�?รื�?อ�?หมาย�?าถู�?หลั�?ราย�?ารที�?เลือ�? สิ�?�?สุด�?ารทดสอ�?�?�?อมูล multiple วั�?ที�? 11/10/2017 �?ดย�?ด preview �?ละ�?ดเลือ�?ราย�?าร'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

'---ตรว�?สอ�?�?ล'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log//td_Survey Multiple'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'เลือ�?�?ระเภท�?ารทำ�?าย เ�?�?�? all\r\n'
WebUI.selectOptionByIndex(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '0', FailureHandling.STOP_ON_FAILURE)

'เอาเ�?อเ�?อร�?�?ี�?ที�?�?�?ล�? single เ�?ื�?อดู preview'
WebUI.mouseOver(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/span_ (1)'))

'ตรว�?สอ�? pop up preview �?อ�?�?�?ล�? single'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__008'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'�?ด�?ุ�?ม preview �?อ�?�?�?ล�? multiple'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

'�?ด�?ุ�?ม�?า�?�?ะ�?าทที�?ห�?�?าต�?า�? preview'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

'-�?ด�?ุ�?ม export สิ�?�?สุด�?ารทดสอ�?�?�?อมูลทั�?�?หมด (All) วั�?ที�? 11/10/2017 �?ดย�?ด preview �?ละ�?ด export'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

'---ตรว�?สอ�?�?ล'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/td_Survey Single'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'---ตรว�?สอ�?�?ล'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log//td_Survey Multiple'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'เลือ�?�?ระเภท�?ารทำ�?าย เ�?�?�? single'
WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '1', true)

'เอาเ�?อเ�?อร�?�?ี�?ที�?�?�?ล�? single เ�?ื�?อดู preview'
WebUI.mouseOver(findTestObject('Search history log/search history log/span_ 12345689'))

'ตรว�?สอ�? pop up preview �?อ�?�?�?ล�? single'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__008'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'-�?ด�?ุ�?ม export สิ�?�?สุด�?ารทดสอ�?�?�?อมูล single วั�?ที�? 11/10/2017 �?ดย�?ด preview �?ละ�?ด export'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

'---ตรว�?สอ�?�?ล'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/td_Survey Single'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'เลือ�?�?ระเภท�?ารทำ�?าย เ�?�?�? multiple'
WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '2', true)

'�?ด�?ุ�?ม preview �?อ�?�?�?ล�? multiple'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

'�?ด�?ุ�?ม�?า�?�?ะ�?าทที�?ห�?�?าต�?า�? preview'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

'-�?ด�?ุ�?ม export สิ�?�?สุด�?ารทดสอ�?�?�?อมูล multi วั�?ที�? 11/10/2017 �?ดย�?ด preview �?ละ�?ด export'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

'---ตรว�?สอ�?�?ล'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log//td_Survey Multiple'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'�?ส�?�?�?อมูลวั�?ที�? �?�? input หลั�?'
WebUI.setText(findTestObject('Search history log/search history log/input_selection ng-untouched n (1)'), '02/11/2017')

'เลือ�?�?ระเภท�?ารทำ�?าย เ�?�?�? all'
WebUI.selectOptionByIndex(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '0', FailureHandling.STOP_ON_FAILURE)

'เอาเ�?อเ�?อร�?�?ี�?ที�?�?�?ล�? single เ�?ื�?อดู preview'
WebUI.mouseOver(findTestObject('Search history log/search history log/span_ '))

'ตรว�?สอ�? pop up preview �?อ�?�?�?ล�? single'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__008'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'�?ด�?ุ�?ม preview �?อ�?�?�?ล�? multiple'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

'�?ด�?ุ�?ม�?า�?�?ะ�?าทที�?ห�?�?าต�?า�? preview'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

'ทำเ�?รื�?อ�?หมาย�?าถู�?หลั�?ราย�?ารที�?เลือ�?'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

'-�?ด�?ุ�?ม export สิ�?�?สุด�?ารทดสอ�?�?�?อมูลทั�?�?หมด (All) วั�?ที�? 11/10/2017-31/11/2017 �?ดย�?ด preview �?ดเลือ�?ราย�?าร �?ละ�?ด export'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

'---ตรว�?สอ�?�?ล'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/td_Survey Single'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'---ตรว�?สอ�?�?ล'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log//td_Survey Multiple'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'เลือ�?�?ระเภท�?ารทำ�?าย เ�?�?�? single'
WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '1', true)

'เอาเ�?อเ�?อร�?�?ี�?ที�?�?�?ล�? single เ�?ื�?อดู preview'
WebUI.mouseOver(findTestObject('Search history log/search history log/span_10'))

'ตรว�?สอ�? pop up preview �?อ�?�?�?ล�? single'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__008'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'ทำเ�?รื�?อ�?หมาย�?าถู�?หลั�?ราย�?ารที�?เลือ�?'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

'-�?ด�?ุ�?ม export สิ�?�?สุด�?ารทดสอ�?�?�?อมูล single วั�?ที�? 11/10/2017-31/11/2017 �?ดย�?ด preview �?ดเลือ�?ราย�?าร �?ละ�?ด export'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

'---ตรว�?สอ�?�?ล'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/td_Survey Single'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'เลือ�?�?ระเภท�?ารทำ�?าย เ�?�?�? multiple\r\n'
WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '2', true)

'�?ด�?ุ�?ม preview �?อ�?�?�?ล�? multiple'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

'�?ด�?ุ�?ม�?า�?�?ะ�?าทที�?ห�?�?าต�?า�? preview'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

'ทำเ�?รื�?อ�?หมาย�?าถู�?หลั�?ราย�?ารที�?เลือ�?'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

'-�?ด�?ุ�?ม export สิ�?�?สุด�?ารทดสอ�?�?�?อมูล multiple วั�?ที�? 11/10/2017-31/11/2017 �?ดย�?ด preview �?ดเลือ�?ราย�?าร �?ละ�?ด export'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

'---ตรว�?สอ�?�?ล'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log//td_Survey Multiple'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'เลือ�?�?ระเภท�?ารทำ�?าย เ�?�?�? all\r\n'
WebUI.selectOptionByIndex(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '0', FailureHandling.STOP_ON_FAILURE)

'เอาเ�?อเ�?อร�?�?ี�?ที�?�?�?ล�? single เ�?ื�?อดู preview'
WebUI.mouseOver(findTestObject('Search history log/search history log/span_  (1)'))

'ตรว�?สอ�? pop up preview �?อ�?�?�?ล�? single'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__008'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'�?ด�?ุ�?ม preview �?อ�?�?�?ล�? multiple'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

'�?ด�?ุ�?ม�?า�?�?ะ�?าทที�?ห�?�?าต�?า�? preview'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

'-ทำเ�?รื�?อ�?หมาย�?าถู�?หลั�?ราย�?ารที�?เลือ�? สิ�?�?สุด�?ารทดสอ�?�?�?อมูลทั�?�?หมด (All) วั�?ที�? 11/10/2017-31/10/2017 �?ดย�?ด preview �?ละ�?ดเลือ�?ราย�?าร'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

'---ตรว�?สอ�?�?ล'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/td_Survey Single'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'---ตรว�?สอ�?�?ล'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log//td_Survey Multiple'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'เลือ�?�?ระเภท�?ารทำ�?าย เ�?�?�? single'
WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '1', true)

'เอาเ�?อเ�?อร�?�?ี�?ที�?�?�?ล�? single เ�?ื�?อดู preview'
WebUI.mouseOver(findTestObject('Search history log/search history log/span_10'))

'ตรว�?สอ�? pop up preview �?อ�?�?�?ล�? single'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__008'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'เอาเ�?อเ�?อร�?�?ี�?ที�?�?�?ล�? single เ�?ื�?อดู preview'
WebUI.mouseOver(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/span_'))

'ตรว�?สอ�? pop up preview �?อ�?�?�?ล�? single'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__008'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'-ทำเ�?รื�?อ�?หมาย�?าถู�?หลั�?ราย�?ารที�?เลือ�? สิ�?�?สุด�?ารทดสอ�?�?�?อมูล single วั�?ที�? 11/10/2017-31/10/2017 �?ดย�?ด preview �?ละ�?ดเลือ�?ราย�?าร'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

'---ตรว�?สอ�?�?ล'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/td_Survey Single'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'เลือ�?�?ระเภท�?ารทำ�?าย เ�?�?�? multiple'
WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '2', true)

'�?ด�?ุ�?ม preview �?อ�?�?�?ล�? multiple'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

'�?ด�?ุ�?ม�?า�?�?ะ�?าทที�?ห�?�?าต�?า�? preview'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

'�?ด�?ุ�?ม preview �?อ�?�?�?ล�? multiple'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

'�?ด�?ุ�?ม�?า�?�?ะ�?าทที�?ห�?�?าต�?า�? preview'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

'-ทำเ�?รื�?อ�?หมาย�?าถู�?หลั�?ราย�?ารที�?เลือ�? สิ�?�?สุด�?ารทดสอ�?�?�?อมูล multiple วั�?ที�? 11/10/2017-31/10/2017 �?ดย�?ด preview �?ละ�?ดเลือ�?ราย�?าร'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_ng-valid ng-dirty ng-tou'))

'---ตรว�?สอ�?�?ล'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log//td_Survey Multiple'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'เลือ�?�?ระเภท�?ารทำ�?าย เ�?�?�? all'
WebUI.selectOptionByIndex(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '0', FailureHandling.STOP_ON_FAILURE)

'เอาเ�?อเ�?อร�?�?ี�?ที�?�?�?ล�? single เ�?ื�?อดู preview'
WebUI.mouseOver(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/span_'))

'ตรว�?สอ�? pop up preview �?อ�?�?�?ล�? single'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__008'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'�?ด�?ุ�?ม preview �?อ�?�?�?ล�? multiple'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

'�?ด�?ุ�?ม�?า�?�?ะ�?าทที�?ห�?�?าต�?า�? preview'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

'-�?ด�?ุ�?ม export สิ�?�?สุด�?ารทดสอ�?�?�?อมูลทั�?�?หมด (All) วั�?ที�? 11/10/2017-31/11/2017 �?ดย�?ด preview �?ละ�?ด export'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

'---ตรว�?สอ�?�?ล'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/td_Survey Single'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'---ตรว�?สอ�?�?ล'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log//td_Survey Multiple'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'เลือ�?�?ระเภท�?ารทำ�?าย เ�?�?�? single'
WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '1', true)

'เอาเ�?อเ�?อร�?�?ี�?ที�?�?�?ล�? single เ�?ื�?อดู preview'
WebUI.mouseOver(findTestObject('Search history log/search history log/span_12'))

'ตรว�?สอ�? pop up preview �?อ�?�?�?ล�? single'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/div_ngxp__container ngxp__008'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'-�?ด�?ุ�?ม export สิ�?�?สุด�?ารทดสอ�?�?�?อมูล single วั�?ที�? 11/10/2017-31/11/2017 �?ดย�?ด preview �?ละ�?ด export'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

'---ตรว�?สอ�?�?ล'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log/td_Survey Single'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'เลือ�?�?ระเภท�?ารทำ�?าย เ�?�?�? multiple'
WebUI.selectOptionByValue(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '2', true)

'�?ด�?ุ�?ม preview �?อ�?�?�?ล�? multiple'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Preview'))

'�?ด�?ุ�?ม�?า�?�?ะ�?าทที�?ห�?�?าต�?า�? preview'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/i_fa fa-times w3-xlarge w3-tex'))

'-�?ด�?ุ�?ม export สิ�?�?สุด�?ารทดสอ�?�?�?อมูล multiple วั�?ที�? 11/10/2017-31/11/2017 �?ดย�?ด preview �?ละ�?ด export'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/button_Export'))

'---ตรว�?สอ�?�?ล'
WebUI.verifyElementPresent(findTestObject('Search history log/search history log//td_Survey Multiple'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'เลือ�?�?ระเภท�?ารทำ�?าย เ�?�?�? all'
WebUI.selectOptionByIndex(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '0')

'�?ด�?า�?ะ�?าทล�?วั�?ที�? input �?�?า�?ห�?�?า'
WebUI.click(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/span_mydpicon icon-mydpremove'))

'---ตรว�?สอ�?�?ล'
WebUI.verifyElementNotPresent(findTestObject('Search history log/search history log//button_Preview'), 5)

not_run: WebUI.selectOptionByIndex(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/select_serach_type'), 
    '0', FailureHandling.STOP_ON_FAILURE)

'�?ส�?�?�?อมูลวั�?ที�?�?�? input หลั�?'
WebUI.setText(findTestObject('Search history log/search history log/Page_Guru TMDA (1)/input_selection ng-valid ng-di'), 
    '02/11/2017')

WebUI.closeBrowser()

