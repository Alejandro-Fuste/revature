from selenium.webdriver.chrome.webdriver import WebDriver
from selenium.webdriver.common.by import By
from selenium.webdriver.remote.webelement import WebElement


class DynamicDataPOM:
    def __init__(self, driver: WebDriver):
        self.driver = driver

    # ------------------- Get Random User --------------------------------

    def get_new_user(self):
        element: WebElement = self.driver.find_element(By.ID, 'save')
        return element

    def profile_image(self):
        element: WebElement = self.driver.find_element(By.XPATH, "//*[contains(@src, 'https://randomuser.me/')]")
        return element

    def first_name(self):
        element: WebElement = self.driver.find_element(By.ID, "loading")
        return element

    def last_name(self):
        element: WebElement = self.driver.find_element(By.ID, "loading")
        return element
