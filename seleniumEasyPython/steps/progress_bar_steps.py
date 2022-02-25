from behave import Given, When, Then
from selenium.common.exceptions import ElementNotVisibleException, ElementNotSelectableException
from selenium.webdriver.common.by import By
from selenium.webdriver.support import expected_conditions
from selenium.webdriver.support.wait import WebDriverWait


@Given(u'the developer is on the progress bar demo selenium easy website')
def get_selenium_checkbox_easy_website(context):
    context.driver.get("https://demo.seleniumeasy.com/bootstrap-download-progress-demo.html")


@When(u'the developer clicks on the download button')
def step_impl(context):
    context.progress_bar.download_button().click()


@Then(u'the developer will see one-hundred percentage on the page when the download completes')
def step_impl(context):
    percentage = WebDriverWait(context.driver, 30, 1, [ElementNotVisibleException, ElementNotSelectableException]).\
        until(expected_conditions.text_to_be_present_in_element((By.CLASS_NAME, "percenttext"), "100%"))
    assert percentage
