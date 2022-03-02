from behave import Given, When, Then
from selenium.webdriver.common.by import By


@Given(u'the developer is on the drag and drop demo selenium easy website')
def get_website(context):
    context.driver.get("https://demo.seleniumeasy.com/drag-and-drop-demo.html")


@When(u'the developer clicks, drags, and drops the box in the drop zone')
def perform_drag_and_drop(context):
    elements = context.drag_and_drop.draggable_elements()
    context.draggable_count += len(elements)
    for element in elements:
        context.action.drag_and_drop(element, context.drag_and_drop.drop_zone()).perform()


@Then(u'the box gets added to the items list')
def check_items_list(context):
    elements = context.drag_and_drop.drop_zone().find_elements(By.XPATH, '//span[@draggable="true"]')
    assert context.draggable_count == len(elements)
