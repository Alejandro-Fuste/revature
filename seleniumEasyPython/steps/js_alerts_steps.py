from behave import Given, When, Then
from selenium.webdriver.common.alert import Alert
from selenium.webdriver.support import  expected_conditions
from selenium.webdriver.support.wait import WebDriverWait


# ------------------- Alert Box --------------------------------
@Given(u'the developer is on the javascript alert demo selenium easy website')
def get_website(context):
    context.driver.get('https://demo.seleniumeasy.com/javascript-alert-box-demo.html')


@When(u'the developer clicks on the button to display an alert box')
def trigger_alert(context):
    context.js_alert.alert_trigger_button().click()


@Then(u'a javascript alert should pop up at the top of the page')
def alert_message(context):
    alert = WebDriverWait(context.driver, 3).until(expected_conditions.alert_is_present())
    assert alert.text == "I am an alert box!"


@Then(u'the alert is closed')
def close_alert(context):
    alert = WebDriverWait(context.driver, 3).until(expected_conditions.alert_is_present())
    alert.accept()


# ------------------- Confirm Box --------------------------------

@When(u'the developer clicks on the button to display a confirm alert')
def trigger_confirm(context):
    context.js_alert.confirm_trigger_button().click()


@When(u'the developer clicks the ok button')
def close_confirm(context):
    WebDriverWait(context.driver, 3).until(expected_conditions.alert_is_present())
    alert = context.driver.switch_to.alert
    alert.accept()


@Then(u'a message should be display on the page')
def confirm_success_message(context):
    message = context.js_alert.confirm_success_message()
    assert message.text == "You pressed OK!"


# ------------------- Prompt Box --------------------------------

@When(u'the developer clicks on the prompt box button')
def trigger_prompt(context):
    context.js_alert.prompt_trigger_button().click()


@When(u'the developer enters a name')
def enter_name(context):
    WebDriverWait(context.driver, 3).until(expected_conditions.alert_is_present())
    alert = Alert(context.driver)
    alert.send_keys("Luke Skywalker Fuste")


@When(u'the developer clicks on the ok button')
def step_impl(context):
    alert = Alert(context.driver)
    alert.accept()


@Then(u'the name should be displayed on the page')
def step_impl(context):
    message = context.js_alert.prompt_success_message()
    assert message.text == "You have entered 'Luke Skywalker Fuste' !"
