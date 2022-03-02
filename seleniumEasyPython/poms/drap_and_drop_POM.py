from selenium.webdriver.chrome.webdriver import WebDriver
from selenium.webdriver.common.by import By
from selenium.webdriver.remote.webelement import WebElement


class DragAndDropPOM:
    def __init__(self, driver: WebDriver):
        self.driver = driver

    # ------------------- Elements --------------------------------

    def draggable_list(self):
        element: WebElement = self.driver.find_element(By.ID, "todrag")
        return element

    def drop_zone(self):
        element: WebElement = self.driver.find_element(By.ID, "mydropzone")
        return element

    def dropped_list_div(self):
        element: WebElement = self.driver.find_element(By.ID, "droppedlist")
        return element
