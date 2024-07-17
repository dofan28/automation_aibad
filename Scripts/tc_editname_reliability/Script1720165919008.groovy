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

if (name != 'none') {
    Mobile.setText(findTestObject('Edit Name/fieldEditName'), name, 10)
}

if (name == 'none') {
    Mobile.setText(findTestObject('Edit Name/fieldEditName'), 'Clear Text Events', 10)

    Mobile.clearText(findTestObject('Edit Name/fieldEditName'), 10)
}

Mobile.tap(findTestObject('Edit Name/btnSaveChangeEditName'), 10)

switch (expectedResult) {
    case 'Invalid Format':
        Mobile.waitForElementPresent(findTestObject('Edit Name/msgInvalidFormatEditName'), 10)

        Mobile.verifyElementVisible(findTestObject('Edit Name/msgInvalidFormatEditName'), 10)

        break
    case 'Too Long':
        Mobile.waitForElementPresent(findTestObject('Edit Name/msgTooLongEditName'), 10)

        Mobile.verifyElementVisible(findTestObject('Edit Name/msgTooLongEditName'), 10)

        Mobile.tap(findTestObject('btnBackEditPreferensiUser'), 10)

        Mobile.waitForElementPresent(findTestObject('btnToAge'), 10)

        Mobile.tap(findTestObject('btnToAge'), 10)

        break
    case 'none':
        Mobile.waitForElementPresent(findTestObject('Edit Name/msgEmptyEditName'), 10)

        Mobile.verifyElementVisible(findTestObject('Edit Name/msgEmptyEditName'), 10)

        break
}

