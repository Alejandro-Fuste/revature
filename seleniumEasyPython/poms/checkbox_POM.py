from selenium.webdriver.chrome.webdriver import WebDriver
from selenium.webdriver.common.by import By
from selenium.webdriver.remote.webelement import WebElement


class CheckboxPOM:
    def __init__(self, driver: WebDriver):
        self.driver = driver

    # ------------------- Single Checkbox Field --------------------------------

    def single_checkbox(self):
        element: WebElement = self.driver.find_element(By.ID, "isAgeSelected")
        return element

    def hidden_success_message(self):
        element: WebElement = self.driver.find_element(By.ID, "txtAge")
        return element

    # ------------------- Multiple Checkbox Fields --------------------------------

    def checkbox_button(self):
        element: WebElement = self.driver.find_element(By.ID, "check1")
        return element
