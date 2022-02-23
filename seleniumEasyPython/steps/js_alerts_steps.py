from behave import Given, When, Then
from selenium.webdriver.support import wait, expected_conditions


@Given(u'the developer is on the javascript alert demo selenium easy website')
def get_website(context):
    context.driver.get('https://demo.seleniumeasy.com/javascript-alert-box-demo.html')


@When(u'the developer clicks on the button to display an alert box')
def trigger_alert(context):
    context.js_alert.alert_trigger_button().click()


@Then(u'a javascript alert should pop up at the top of the page')
def alert_message(context):
    alert = wait.until(expected_conditions.alert_is_present())

    assert alert.text == "I am an alert box!"


@Given(u'the previous alert is closed')
def close_alert(context):
    raise NotImplementedError(u'STEP: Given the previous alert is closed')


@When(u'the developer clicks on the button to display a confirm alert')
def step_impl(context):
    raise NotImplementedError(u'STEP: When the developer clicks on the button to display a confirm alert')


@When(u'the developer clicks the ok button')
def step_impl(context):
    raise NotImplementedError(u'STEP: When the developer clicks the ok button')


@Then(u'a message should be display on the page')
def step_impl(context):
    raise NotImplementedError(u'STEP: Then a message should be display on the page')


@When(u'the developer clicks on the prompt box button')
def step_impl(context):
    raise NotImplementedError(u'STEP: When the developer clicks on the prompt box button')


@When(u'the developer enters a name')
def step_impl(context):
    raise NotImplementedError(u'STEP: When the developer enters a name')


@When(u'the developer clicks on the ok button')
def step_impl(context):
    raise NotImplementedError(u'STEP: When the developer clicks on the ok button')


@Then(u'the name should be displayed on the page')
def step_impl(context):
    raise NotImplementedError(u'STEP: Then the name should be displayed on the page')
