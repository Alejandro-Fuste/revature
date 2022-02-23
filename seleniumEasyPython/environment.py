from behave.runner import Context
from selenium import webdriver
from poms.simple_input_POM import SimpleInputPOM
from poms.checkbox_POM import CheckboxPOM
# from poms.js_alerts_POM import
# from poms.dynamic_data_POM import


def before_all(context: Context):
    context.driver = webdriver.Chrome("/Users/alejandro/Desktop/revature/seleniumEasyPython/chromedriver")
    context.simple_input = SimpleInputPOM(context.driver)
    context.checkbox = CheckboxPOM(context.driver)
    context.driver.implicitly_wait(2)
    context.driver.maximize_window()


def after_all(context):
    context.driver.quit()
