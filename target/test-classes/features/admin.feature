Feature: Admin Smoke Test for Magento Security Patch Test Cases for SUPEE 6285

  Background: 
    Given I am on the admin login page
    When I provide useranme "devuser"
    And I provide the password "grandriver1"
    Then I should be successfully logged in

  @Done2
  Scenario: Admin CMS page - Create New CMS Page
    When I Navigate to CMS > Pages > Manage Content
    And Create a New CMS Page "TestPage"
    Then a Success message "The page has been saved." should be displayed

  @Done2
  Scenario: Admin CMS page - Edit A CMS Page
    When I Navigate to CMS > Pages > Manage Content
    And Searching for CMS page "TestPage"
    And Click on the CMS page "TestPage" in the table
    And Update the information on the CMS page "TestPage"
    And Click Save
    Then a Success message "The page has been saved." should be displayed

  @Done2
  Scenario: Admin WYSIWYG editor
    When I Navigate to CMS > Pages > Manage Content
    And Searching for CMS page "TestPage"
    And Click on the CMS page "TestPage" in the table
    And I enter "Test" WYSIWYG editor using "Bold" font
    And Click on the "Save and Continue Edit" button
    Then a Success message "The page has been saved." should be displayed
    And the Page Content HTML should be "<p><strong>Test</strong></p>"

  @Done2
  Scenario: Admin CMS page - Delete A CMS Page
    When I Navigate to CMS > Pages > Manage Content
    And Searching for CMS page "TestPage"
    And Click on the CMS page "TestPage" in the table
    And Click Delete
    Then a Success message "The page has been deleted." should be displayed

  @Done
  Scenario: Admin CMS hierarchy - Follows the same default hierarchy
    When I Navigate to CMS > Pages > Manage Hierarchy
    And Add "TestPage" node to parent node.
    And Click Save
    Then a Success message "The hierarchy has been saved." should be displayed
    And Node "TestPage" will be displayed in the hierarchy tree

  @Done
  Scenario: Admin CMS hierarchy - Delete Node
    When I Navigate to CMS > Pages > Manage Hierarchy
    And Delete the "TestPage" node
    And Click Save
    Then a Success message "The hierarchy has been saved." should be displayed
    And Node "TestPage" will not be displayed in the hierarchy tree

  @Done
  Scenario: Admin CMS Widgets - Create New CMS Widgets
    When I Navigate to CMS > Widgets
    And Click on the "Add New Widget Instance" button
    And Enter the mandatory fields the New Widget Instance > Settings form
    And Click on the "Continue" button
    Then The "New Instance" page will be open
    When I enter the Widget Instance Title "TestWidget"
    And Click on the "Save" button
    Then a Success message "The widget instance has been saved." should be displayed

  @Done
  Scenario: Admin CMS Widgets - Edit CMS Widgets
    When I Navigate to CMS > Widgets
    And Click on the "TestWidget" widget on the Widget Instance Grid
    And Update Restrict by Banner Types to "Content Area"
    And Click Save
    Then a Success message "The widget instance has been saved." should be displayed

  @Done
  Scenario: Admin CMS Widget - Delete CMS Widgets
    When I Navigate to CMS > Widgets
    And Searching for "TestWidget" widget
    And Click on the "TestWidget" widget on the Widget Instance Grid
    And Click Delete
    Then a Success message "The widget instance has been deleted." should be displayed

  Scenario: Admin Catalog Product - Create Product
    When I Navigate to Catalog > Manage Products
    And Click on the "Add New Product" button
    And Select "Attribute Set" from the provided dropdown
    And Select "Product Type" from the provided dropdown
    And Click Continue
    Then "Product Information" page should be open
    And Fill-up the mandatory fields
    And Click Save
    Then a Success message "The product has been saved." should be displayed
    And product should be added to "Manage product" list

  Scenario: Admin Catalog Product - Edit Product
    When I Navigate to Catalog > Manage Products
    And Click on the product displayed in "Manage Product"  list
    And Update the fields
    And Click Save
    Then updated product should be displayed in the "Manage product" list along with Success message

  @Done
  Scenario: Admin Catalog Product Review - Approved Reviews
    When I Navigate to Catalog > Reviews and Ratings > Customer Reviews > All Reviews
    And Select the product
    And change the status "Approved"
    And click on Save Reviews
    Then Status should show "Approved" in the list

  @Done
  Scenario: Admin Catalog Product Review - Not Approved Reviews
    When I Navigate to Catalog > Reviews and Ratings > Customer Reviews > All Reviews
    And Select the product
    And change the status "Not Approved"
    And click on Save Reviews
    Then Status should show "Not Approved" in the list

  @Done
  Scenario: Admin Catalog Categories - Create a Root Category
    When I Navigate to Catalog > Categories > Manage Categories
    And Click on the "Add Root Category" button
    And Enter "Test Root Category" for the Name
    And Enter "Test" for the Description
    And Click on the "Save Category" button
    Then a Success message "The category has been saved." should be displayed
    And Node "Test Root Category" will be displayed in the hierarchy tree

  @Done
  Scenario: Admin Catalog Categories - Edit a Root Category
    When I Navigate to Catalog > Categories > Manage Categories
    And Click node "Test Root Category" in tree
    And Enter "Updated Description" for the Description
    And Click on the "Save Category" button
    Then a Success message "The category has been saved." should be displayed
    When Click node "Test Root Category" in tree
    And "Updated Description" is displayed for Description

  @Done
  Scenario: Admin Catalog Categories - Delete a Root Category
    When I Navigate to Catalog > Categories > Manage Categories
    And Click node "Test Root Category" in tree
    And Click Delete
    Then a Success message "The category has been deleted." should be displayed

  @Done
  Scenario: Admin Catalog Categories - Edit Category
    When I Navigate to Catalog > Categories > Manage Categories
    And Click on the Category/Subcategory
    And I Update the fields
    And Click on the "Save Category" button
    Then a Success message "The category has been saved." should be displayed

  @Done
  Scenario: Admin Catalog Event - Create Event
    When I Navigate to Catalog > Categories > Catalog Events
    And Click on the "Add Catalog Event" button
    And Select Category from the hierarchy
    And Fill date fields
    And Click Save
    Then a Success message "Event has been saved." should be displayed

  @Done
  Scenario: Admin Catalog Event - Edit a Catalog Event
    When I Navigate to Catalog > Categories > Catalog Events
    When I select the Catalog event
    And update the information
    And Click Save
    Then a Success message "Event has been saved." should be displayed

  @Done
  Scenario: Admin Catalog Event - Delete a Catalog Event
    When I Navigate to Catalog > Categories > Catalog Events
    When I select the Catalog event
    And Click Delete
    Then a Success message "Event has been deleted." should be displayed

  @Done
  Scenario: Admin Customer - Create Customer
    When I Navigate to Customers > Manage Customers
    And Click on the "Add New Customer" button
    And Fill-up the customer data in fields
    And Click Save
    Then a Success message "The customer has been saved." should be displayed

  @Done
  Scenario: Admin Customer - Edit Customer
    When I Navigate to Customers > Manage Customers
    And Select customer
    And Update customer field
    And Click Save
    Then a Success message "The customer has been saved." should be displayed

  @Done
  Scenario: Admin Customer - Delete Customer
    When I Navigate to Customers > Manage Customers
    And Select customer
    And Click Delete
    Then a Success message "The customer has been deleted." should be displayed

  Scenario: Admin Data Import
    When I Navigate to System > Import/Export > Import
    And Select proper entity from the drop down
    And Select file type from drop down
    And click Continue
    And Click Save
    Then File should Import properly

  Scenario: Admin Data Export
    When I Navigate to System > Import/Export > Export
    And Select proper entity from the drop down
    And Select file type from drop down
    And click Continue
    And Click Save
    Then File should Export properly

  Scenario: Admin Reports - Sales Reports Filter
    When I Navigate to Reports > Sales > Orders/ Tax/ Invoiced/ Shipping/ Refund/ Coupons
    And Fill-up all the mandatory fields
    And Click Show Report
    Then Report should be display
    And Click on Export to Csv or XML
    Then Report should be created in selected format

  Scenario: Admin Reports - Products Reports Filter
    When I Navigate to Reports > Products > Bestseller/ Products Ordered/ Most Viewed/ Low Stocks/ Download
    And Fill-up all the mandatory fields
    And Click Show Report
    Then Report should be display
    # Applicable for Bestsellers/Most viewed
    And Click on Export to Csv or XML
    Then Report should be created in selected format

  Scenario: Admin Notifications
    When I Navigate to Navigate to Systems > Notifications
    And Check the Message Inbox.
    Then Megento notifications should be display

  Scenario: Order - Placed
    When I Navigate to Sales > Orders
    And Click New Order button
    And Select customer
    And Click Add Product Button
    And Select and add product
    And Select Billing and shipping information
    And Place Order Button
    Then Order should get placed form admin section
    And Order should display in Manage Order section

  Scenario: Order - Invoice
    When I Navigate to Sales > Orders
    And Select One Order from list
    And Click Invoice Button at top
    And Check for Invoice tab
    Then Order Invoice should get created for that order

  Scenario: Order - Shipment
    When I Navigate to Sales > Orders
    And Select One Order from list
    And Click Ship Button at top
    And Check for Shipment tab
    Then Order Shipment should get created for that order

  Scenario: Order - Credit memo
    When I Navigate to Sales > Orders
    And Select One Order from list
    And Go to invoice tab
    And Select Invoice
    And Click Credit Memo Button
    And Click Refund Button
    Then Credit memo (Refund)should genrate for that selected order

  Scenario: Admin Promotions - Catalog price rules
    When I Navigate to Promotions
    And Go to Catalog price rules
    And Click Add New Rules
    And Enter data in Mandatory fields and Click Save and Apply Button
    And Check for rule in Catalog Price rules
    Then Catalog price rules should get created
    And Catlog price rules should applied in front end

  Scenario: Admin Promotions - Shopping cart price rules
    When I Navigate to Promotions
    And Go to Shopping cart price rules
    And Click Add New Rule Button
    And Enter data in Mandatory fields and Click Save Rule Button
    And Check for Shopping cart Price rules
    Then Shopping cart price rules should get created
    And Shopping cart price rules should applied in front end

  Scenario: Admin Promotions - Automated Email Marketing Reminder
    When I Navigate to Promotions
    And Go to Automated Email Marketing Reminder Rules
    And Click Add New Rules
    And Enter data in Mandatory fields and Click Save Button
    And Check for Automated Email Marketing Reminder Rules
    Then Automated Email Marketing Reminder Rule should get created
    And Mail should receive as per rules

  Scenario: Admin Panel URL Rewrite - Category
    When I Navigate to Catalog
    And Select URL Rewrite Management
    And Click Add URL rewrite button
    And Select option For Category
    And Provide mandatory data
    And Click Save button
    And Check for URL write in URL management
    Then URL rewrite should get created
    And URL should redierct to New assigned URL

  Scenario: Admin Panel URL Rewrite - Products
    When I Navigate to Catalog
    And Select URL Rewrite Management
    And Click Add URL rewrite button
    And Select option For Products
    And Provide mandatory data
    And Click Save button
    And Check for URL write in URL management
    Then URL rewrite should get created
    And URL should redierct to New assigned URL

  Scenario: Admin Panel URL Rewrite - Custom
    When I Navigate to Catalog
    And Select URL Rewrite Management
    And Click Add URL rewrite button
    And Select option For Products
    And Provide mandatory data
    And Click Save button
    And Check for URL write in URL management
    Then URL rewrite should get created
    And URL should redierct to New assigned URL

  Scenario: Admin Permissions - User Creation and Assign role
    When I Navigate to System
    And Go to Permissions
    And Select Users
    And Click Add New User Button
    And Enter Manadatory data in field and assign role
    And Click Save User Button
    And Check for User in Users list
    Then New user should get created
    And User should able to login
    And Selected user should get assign role

  Scenario: Admin Permissions - Role Creation
    When I Navigate to System
    And Go to Permissions
    And Select Roles
    And Click Add New Roles Button
    And Enter Manadatory data in field and Select Roles Resourses option
    And Click Save Role Button
    And Check for Role in Roles list
    Then New user should get created

  Scenario: Admin RSS feeds
    When I Navigate to System
    And Go to Configuration
    And Select RSS feeds option in Catalog
    And Enable it
    And Save Config
    Then RSS feed should get activated

  Scenario: Admin Sales Transactions
    When I Navigate to Sales
    And Go to Transactions
    And Check for Transactions
    Then All payment transaction should be displayed in Transactions

  Scenario: Admin Tax rates - Manage Tax Rules
    When I Navigate to Sales
    And Go to Tax
    And Go to Manage Tax Rules
    And Click Add New Tax Rule
    And Add Mandatory Details and Click Save Rule
    And Check for Manage Tax Rules
    Then New Tax rules should get created and displayed in Manage tax rules

  Scenario: Admin Tax rates - Manage Tax Rates
    When I Navigate to Sales
    And Go to Tax
    And Go to Manage Tax zones and Rates
    And Click Add New Tax Rate
    And Add Mandatory Details and Click Save Rate
    And Check for Manage Tax Rates
    Then New Tax rates should get created and displayed in Manage tax rates

  Scenario: Admin Tax rates - Import Tax rates
    When I Navigate to Sales
    And Go to Tax
    And Click Import / Export Tax Rates
    And Select file and upload and click Import Tax Rates
    Then New Tax rates should get imported

  Scenario: Admin Tax rates - Export Tax rates
    When I Navigate to Sales
    And Go to Tax
    And Click Import / Export Tax Rates
    And Click Export Tax Rates button
    Then Existing Tax rates file should get downloaded
