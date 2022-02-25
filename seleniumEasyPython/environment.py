from behave.runner import Context
from selenium import webdriver
from poms.simple_input_POM import SimpleInputPOM
from poms.checkbox_POM import CheckboxPOM
from poms.js_alerts_POM import JavascriptAlertsPOM
from poms.dynamic_data_POM import DynamicDataPOM
from poms.progress_bar_POM import ProgressBarPOM


def before_all(context: Context):
    # ------------ driver ------------
    context.driver = webdriver.Chrome("/Users/alejandro/Desktop/revature/seleniumEasyPython/chromedriver")

    # ------------ POMs ------------
    context.simple_input = SimpleInputPOM(context.driver)
    context.checkbox = CheckboxPOM(context.driver)
    context.js_alert = JavascriptAlertsPOM(context.driver)
    context.dynamic_data = DynamicDataPOM(context.driver)
    context.progress_bar = ProgressBarPOM(context.driver)

    # ------------ wait and maximize window ------------
    context.driver.maximize_window()


def after_all(context):
    context.driver.quit()
