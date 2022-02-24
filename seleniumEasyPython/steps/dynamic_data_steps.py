from behave import Given, When, Then
from selenium.webdriver.common.by import By
from selenium.webdriver.support import expected_conditions
from selenium.webdriver.support.wait import WebDriverWait


@Given(u'the developer is on the dynamic data demo selenium easy website')
def step_impl(context):
    context.driver.get('https://demo.seleniumeasy.com/dynamic-data-loading-demo.html')


@When(u'the developer clicks on get new user button')
def step_impl(context):
    context.dynamic_data.get_new_user().click()


@Then(u'a profile picture will be present on the page')
def step_impl(context):
    image = WebDriverWait(context.driver, 4).until(expected_conditions.visibility_of_element_located(
        (By.XPATH, "//*[contains(@src, 'https://randomuser.me/')]")))
    assert image


@Then(u'a first name will be present on the page')
def step_impl(context):
    image = WebDriverWait(context.driver, 4).until(expected_conditions.visibility_of_element_located(
        (By.XPATH, "//*[contains(@src, 'https://randomuser.me/')]")))
    text = context.dynamic_data.first_name().text
    assert text


@Then(u'a last name will be present on the page')
def step_impl(context):
    image = WebDriverWait(context.driver, 4).until(expected_conditions.visibility_of_element_located(
        (By.XPATH, "//*[contains(@src, 'https://randomuser.me/')]")))
    text = context.dynamic_data.last_name()
    assert text
    print(text)
