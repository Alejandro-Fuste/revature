from selenium.webdriver.chrome.webdriver import WebDriver
from selenium.webdriver.common.by import By
from selenium.webdriver.remote.webelement import WebElement


class SimpleInputPOM:
    def __init__(self, driver: WebDriver):
        self.driver = driver

    # pop-up window
    def pop_up_window(self):
        element: WebElement = self.driver.find_element(By.ID, "at-cv-lightbox-close")
        return element

    # ------------------- Single Input Field --------------------------------

    # message input
    def message_input(self):
        element: WebElement = self.driver.find_element(By.ID, "user-message")
        return element

    # show message button
    def show_message_button(self):
        element: WebElement = self.driver.find_element(By.XPATH, '//*[@id="get-input"]/button')
        return element

    # display message
    def display_message_span(self):
        element: WebElement = self.driver.find_element(By.ID, "display")
        return element

    # ------------------- Two Input Fields --------------------------------

    # input A
    def input_a(self):
        element: WebElement = self.driver.find_element(By.ID, "sum1")
        return element

    # input B
    def input_b(self):
        element: WebElement = self.driver.find_element(By.ID, "sum2")
        return element

    # total button
    def show_value_button(self):
        element: WebElement = self.driver.find_element(By.XPATH, '//*[@id="gettotal"]/button')
        return element

    # display value button
    def value_button(self):
        element: WebElement = self.driver.find_element(By.ID, "displayvalue")
        return element
