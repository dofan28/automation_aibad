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

if(name != 'none') {	
	Mobile.setText(findTestObject('Form Input Name/fieldName'), name, 10)
}

Mobile.tap(findTestObject('Form Input Name/btnNextName'), 10)

switch (expectedResult) {
    case 'Invalid Format':
        Mobile.waitForElementPresent(findTestObject('Form Input Name/msgInvalidFormatName'), 10)

        Mobile.verifyElementVisible(findTestObject('Form Input Name/msgInvalidFormatName'), 10)

        break
    case 'Too Long':
        Mobile.waitForElementPresent(findTestObject('Form Input Name/msgTooLongName'), 10)

        Mobile.verifyElementVisible(findTestObject('Form Input Name/msgTooLongName'), 10)

        Mobile.clearText(findTestObject('Form Input Name/fieldName'), 10)

        Mobile.setText(findTestObject('Form Input Name/fieldName'), 'John Doe', 10)

        Mobile.tap(findTestObject('Form Input Name/btnNextName'), 10)
		
		Mobile.tap(findTestObject('Form Select Gender/selectedGenderMale'), 10)
		
		Mobile.tap(findTestObject('Form Select Gender/btnNextGender'), 10)

        break
    case 'none':
        Mobile.waitForElementPresent(findTestObject('Form Input Name/msgEmptyName'), 10)

        Mobile.verifyElementVisible(findTestObject('Form Input Name/msgEmptyName'), 10)

        break
}

