from selenium.webdriver.chrome.webdriver import WebDriver
from selenium.webdriver.common.by import By
from selenium.webdriver.remote.webelement import WebElement


class JavascriptAlertsPOM:
    def __init__(self, driver: WebDriver):
        self.driver = driver

    # ------------------- Alert Box --------------------------------

    def alert_trigger_button(self):
        element: WebElement = self.driver.find_element(By.XPATH, '//*[@id="easycont"]/div/div[2]/div[1]/div[2]/button')
        return element

    # ------------------- Confirm Box --------------------------------

    def confirm_trigger_button(self):
        element: WebElement = self.driver.find_element(By.XPATH, '//*[@onclick="myConfirmFunction()"]')
        return element

    def confirm_success_message(self):
        element: WebElement = self.driver.find_element(By.ID, 'confirm-demo')
        return element

    # ------------------- Prompt Box --------------------------------

    def prompt_trigger_button(self):
        element: WebElement = self.driver.find_element(By.XPATH, '//button[@onclick="myPromptFunction()"]')
        return element

    def prompt_success_message(self):
        element: WebElement = self.driver.find_element(By.ID, 'prompt-demo')
        return element
