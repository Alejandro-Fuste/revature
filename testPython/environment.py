from behave.runner import Context
from selenium import webdriver
from poms.simple_input_POM import SimpleInputPOM


def before_all(context: Context):
    context.driver = webdriver.Chrome("/Users/alejandro/Desktop/testPython/chromedriver")
    context.simple_input = SimpleInputPOM(context.driver)
    context.driver.implicitly_wait(2)
    context.driver.maximize_window()


def after_all(context):
    context.driver.quit()
