from selenium.webdriver.chrome.webdriver import WebDriver
from selenium.webdriver.common.by import By


class ProgressBarPOM:
    def __init__(self, driver: WebDriver):
        self.driver = driver

# ------------------- Elements --------------------------------

    def download_button(self):
        element = self.driver.find_element(By.ID, "cricle-btn")
        return element

    def percentage_text(self):
        element = self.driver.find_element(By.CLASS_NAME, "percenttext")
        return element
