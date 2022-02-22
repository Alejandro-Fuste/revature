from behave import Given, When, Then
from selenium.webdriver.common.by import By
from selenium.webdriver.support import expected_conditions
from selenium.webdriver.support.wait import WebDriverWait


@Given(u'the developer is on the checkbox demo selenium easy website')
def get_selenium_checkbox_easy_website(context):
    context.driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html")


#     ------------------- Single Checkbox --------------------------------
@When(u'the developer clicks on single check box')
def click_single_checkbox(context):
    context.checkbox.single_checkbox().click()


@Then(u'a success message pops up on the screen')
def success_message(context):
    element = WebDriverWait(context.driver, 3).until(
        expected_conditions.text_to_be_present_in_element((By.ID, "txtAge"),
                                                          "Success - Check box is checked"))
    assert element


#     ------------------- Multiple Checkboxes --------------------------------


@When(u'the developer clicks on first check box')
def click_checkbox_1(context):
    context.checkbox.checkbox_1().click()


@When(u'the developer clicks on second check box')
def click_checkbox_2(context):
    context.checkbox.checkbox_2().click()


@When(u'the developer clicks on third check box')
def click_checkbox_3(context):
    context.checkbox.checkbox_3().click()


@Then(u'the button text changes')
def button_text_change(context):
    element = WebDriverWait(context.driver, 3).until(expected_conditions.text_to_be_present_in_element((By.ID, "check1")
                                                                                                       , "Uncheck All"))
