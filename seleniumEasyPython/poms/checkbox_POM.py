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

    def checkbox_1(self):
        element: WebElement = self.driver.find_element(By.XPATH,
                                                       '//*[@id="easycont"]/div/div[2]/div[2]/div[2]/div[1]/label'
                                                       '/input')
        return element

    def checkbox_2(self):
        element: WebElement = self.driver.find_element(By.XPATH,
                                                       '//*[@id="easycont"]/div/div[2]/div[2]/div[2]/div[2]/label'
                                                       '/input')
        return element

    def checkbox_3(self):
        element: WebElement = self.driver.find_element(By.XPATH, '//*[@id="easycont"]/div/div[2]/div[2]/div[2]/div[3]'
                                                                 '/label/input')
        return element

    def checkbox_4(self):
        element: WebElement = self.driver.find_element(By.XPATH, '//*[@id="easycont"]/div/div[2]/div[2]/div[2]/div[4]'
                                                                 '/label/input')
        return element

    def checkbox_button(self):
        element: WebElement = self.driver.find_element(By.ID, "check1")
        return element
