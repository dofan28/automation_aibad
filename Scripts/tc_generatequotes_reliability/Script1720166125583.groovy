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

if(feeling != 'none') {
	Mobile.waitForElementPresent(findTestObject('Generate Quotes/fieldInputFeeling'), 10)
	
	Mobile.setText(findTestObject('Generate Quotes/fieldInputFeeling'), feeling, 10)
}

	Mobile.hideKeyboard()

	Mobile.tap(findTestObject('Generate Quotes/btnSendFeeling'), 10)

    switch (expectedResult) {
        case 'Invalid Format Random':
            Mobile.waitForElementPresent(findTestObject('Generate Quotes/msgInvalidFormatFeeling'), 10)

            Mobile.verifyElementVisible(findTestObject('Generate Quotes/msgInvalidFormatFeeling'), 10)

            break
        case 'Invalid Format Language':
            Mobile.waitForElementPresent(findTestObject('Generate Quotes/msgInvalidFormatLanguage'), 10)

            Mobile.verifyElementVisible(findTestObject('Generate Quotes/msgInvalidFormatLanguage'), 10)

            break
        case 'Too Short':
            Mobile.waitForElementPresent(findTestObject('Generate Quotes/msgTooShortFeeling'), 10)

            Mobile.verifyElementVisible(findTestObject('Generate Quotes/msgTooShortFeeling'), 10)

            Mobile.clearText(findTestObject('Generate Quotes/fieldInputFeeling'), 10)

            Mobile.setText(findTestObject('Generate Quotes/fieldInputFeeling'), 'Saya sangat bersyukur', 10)

            Mobile.hideKeyboard()

            Mobile.tap(findTestObject('Generate Quotes/btnSendFeeling'), 10)

            Mobile.delay(20, FailureHandling.STOP_ON_FAILURE)

            Mobile.waitForElementPresent(findTestObject('btnProfile'), 10)

            Mobile.tap(findTestObject('btnProfile'), 10)

            Mobile.waitForElementPresent(findTestObject('btnToEditName'), 10)

            Mobile.tap(findTestObject('btnToEditName'), 10)

            break
        case 'none':
            Mobile.waitForElementPresent(findTestObject('Generate Quotes/msgEmptyFeeling'), 10)

            Mobile.verifyElementVisible(findTestObject('Generate Quotes/msgEmptyFeeling'), 10)

            break
    }

