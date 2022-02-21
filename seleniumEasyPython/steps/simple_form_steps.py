from behave import Given, When, Then
from selenium.webdriver.common.by import By
from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.support import expected_conditions


@Given(u'the developer is on the demo selenium easy website')
def get_selenium_easy_website(context):
    context.driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html")


@When(u'the developer closes the pop-up advertisement')
def close_pop_up_advertisement(context):
    context.simple_input.pop_up_window().click()


#     ------------------- Single Input Fields --------------------------------


@When(u'the developer enters a message into the input box')
def enter_message_in_input(context):
    context.simple_input.message_input().send_keys("I entered this message with Selenium.")


@When(u'the developer clicks on the show message button')
def click_show_message_button(context):
    context.simple_input.show_message_button().click()


@Then(u'the message typed in the input box will display on the page')
def message_displayed(context):
    element = WebDriverWait(context.driver, 4).until(
        expected_conditions.text_to_be_present_in_element((By.ID, "display"),
                                                          "I entered this message with Selenium."))
    # assert element.text == "I entered this message with Selenium."
    assert element


# ------------------- Two Input Fields --------------------------------
@When(u'the developer enters a value into the a input box')
def enter_first_value(context):
    context.simple_input.input_a().send_keys("2")


@When(u'the developer enters a value into the b input box')
def enter_second_value(context):
    context.simple_input.input_b().send_keys("2")


@When(u'the developer clicks on the total button')
def click_total_button(context):
    context.simple_input.show_value_button().click()


@Then(u'the total will display on the page')
def total_displayed(context):
    element = WebDriverWait(context.driver, 4).until(
        expected_conditions.text_to_be_present_in_element((By.ID, "displayvalue"),
                                                          "4"))
    # assert element.text == "4"
    assert element
