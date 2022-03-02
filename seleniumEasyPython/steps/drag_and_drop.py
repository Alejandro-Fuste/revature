from behave import Given, When, Then


@Given(u'the developer is on the drag and drop demo selenium easy website')
def get_website(context):
    raise NotImplementedError(u'STEP: Given the developer is on the drag and drop demo selenium easy website')


@When(u'the developer clicks, drags, and drops the box in the drop zone')
def perform_drag_and_drop(context):
    raise NotImplementedError(u'STEP: When the developer clicks, drags, and drops the box in the drop zone')


@Then(u'the box gets added to the items list')
def check_items_list(context):
    raise NotImplementedError(u'STEP: Then the box gets added to the items list')
