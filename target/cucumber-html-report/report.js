$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AboutUsSmokeTest.feature");
formatter.feature({
  "line": 2,
  "name": "Smoketest to make sure about us page is functioning",
  "description": "",
  "id": "smoketest-to-make-sure-about-us-page-is-functioning",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@NoInput"
    },
    {
      "line": 1,
      "name": "@All"
    }
  ]
});
formatter.before({
  "duration": 4038912163,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Navigating to about us page",
  "description": "",
  "id": "smoketest-to-make-sure-about-us-page-is-functioning;navigating-to-about-us-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "client website has an about us page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on the about us link",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I am taken to the about us page",
  "keyword": "Then "
});
formatter.match({
  "location": "AboutUsStepDefinitions.client_website_has_an_about_us_page()"
});
formatter.result({
  "duration": 226352320,
  "status": "passed"
});
formatter.match({
  "location": "AboutUsStepDefinitions.i_click_on_the_about_us_link()"
});
formatter.result({
  "duration": 846654473,
  "status": "passed"
});
formatter.match({
  "location": "AboutUsStepDefinitions.i_am_taken_to_the_about_us_page()"
});
formatter.result({
  "duration": 147616393,
  "status": "passed"
});
formatter.after({
  "duration": 11153,
  "status": "passed"
});
formatter.uri("AdvancedSearchSmokeTest.feature");
formatter.feature({
  "line": 2,
  "name": "smoke test to make sure advanced search is functioning",
  "description": "",
  "id": "smoke-test-to-make-sure-advanced-search-is-functioning",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@NoInput"
    },
    {
      "line": 1,
      "name": "@All"
    }
  ]
});
formatter.before({
  "duration": 838073924,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Navigating to Advanced Search",
  "description": "",
  "id": "smoke-test-to-make-sure-advanced-search-is-functioning;navigating-to-advanced-search",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on Advanced Search link",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I am taken to the Advanced Search page",
  "keyword": "Then "
});
formatter.match({
  "location": "CommonPageStepDefinitons.i_am_on_home_page()"
});
formatter.result({
  "duration": 957643643,
  "status": "passed"
});
formatter.match({
  "location": "AdvancedSearchStepDefinitions.i_click_on_Advanced_Search_link()"
});
formatter.result({
  "duration": 874784002,
  "status": "passed"
});
formatter.match({
  "location": "AdvancedSearchStepDefinitions.i_am_taken_to_the_Advanced_Search_page()"
});
formatter.result({
  "duration": 164387150,
  "status": "passed"
});
formatter.after({
  "duration": 18031,
  "status": "passed"
});
formatter.before({
  "duration": 795342466,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Searching for something and getting results",
  "description": "",
  "id": "smoke-test-to-make-sure-advanced-search-is-functioning;searching-for-something-and-getting-results",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "I am on Advanced Search page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I search for a product",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "my search terms are good",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "search results should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "AdvancedSearchStepDefinitions.i_am_on_Advanced_Search_page()"
});
formatter.result({
  "duration": 1145182850,
  "status": "passed"
});
formatter.match({
  "location": "AdvancedSearchStepDefinitions.i_search_for_a_product()"
});
formatter.result({
  "duration": 413714171,
  "status": "passed"
});
formatter.match({
  "location": "AdvancedSearchStepDefinitions.my_search_terms_are_good()"
});
formatter.result({
  "duration": 1236178464,
  "status": "passed"
});
formatter.match({
  "location": "AdvancedSearchStepDefinitions.search_results_should_be_displayed()"
});
formatter.result({
  "duration": 191882985,
  "status": "passed"
});
formatter.after({
  "duration": 14219,
  "status": "passed"
});
formatter.before({
  "duration": 791536590,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Searching for something and there are no results",
  "description": "",
  "id": "smoke-test-to-make-sure-advanced-search-is-functioning;searching-for-something-and-there-are-no-results",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 16,
  "name": "I am on Advanced Search page",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "I search for a product",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "my search terms are bad",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "no results should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "AdvancedSearchStepDefinitions.i_am_on_Advanced_Search_page()"
});
formatter.result({
  "duration": 1046465159,
  "status": "passed"
});
formatter.match({
  "location": "AdvancedSearchStepDefinitions.i_search_for_a_product()"
});
formatter.result({
  "duration": 382386318,
  "status": "passed"
});
formatter.match({
  "location": "AdvancedSearchStepDefinitions.my_search_terms_are_bad()"
});
formatter.result({
  "duration": 1004432307,
  "status": "passed"
});
formatter.match({
  "location": "AdvancedSearchStepDefinitions.no_results_should_be_displayed()"
});
formatter.result({
  "duration": 170658022,
  "status": "passed"
});
formatter.after({
  "duration": 8724,
  "status": "passed"
});
formatter.uri("BundledProductSMokeTest.feature");
formatter.feature({
  "line": 2,
  "name": "Smoke test to make sure bundled product page is working",
  "description": "",
  "id": "smoke-test-to-make-sure-bundled-product-page-is-working",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@NoInput"
    },
    {
      "line": 1,
      "name": "@All"
    }
  ]
});
formatter.before({
  "duration": 881906580,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "I am on a bundled product page",
  "description": "",
  "id": "smoke-test-to-make-sure-bundled-product-page-is-working;i-am-on-a-bundled-product-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on a bundled product page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "product name, price range, and availability should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "BundledProductStepDefinitions.i_am_on_a_bundled_product_page()"
});
formatter.result({
  "duration": 3568025779,
  "status": "passed"
});
formatter.match({
  "location": "BundledProductStepDefinitions.product_name_price_range_and_availability_should_be_displayed()"
});
formatter.result({
  "duration": 43056318,
  "status": "passed"
});
formatter.after({
  "duration": 8673,
  "status": "passed"
});
formatter.before({
  "duration": 729403959,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Bundled product is in stock",
  "description": "",
  "id": "smoke-test-to-make-sure-bundled-product-page-is-working;bundled-product-is-in-stock",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "I am on a bundled product page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "the product is in stock",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Price as configured, editable quantity field, and Add to Cart button should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "BundledProductStepDefinitions.i_am_on_a_bundled_product_page()"
});
formatter.result({
  "duration": 30450877567,
  "error_message": "org.openqa.selenium.ElementNotVisibleException: Element is not currently visible and so may not be interacted with\nBuild info: version: \u00272.47.1\u0027, revision: \u0027411b314\u0027, time: \u00272015-07-30 03:03:16\u0027\nSystem info: host: \u0027DCSA-PARTRIDGE-MAC.local\u0027, ip: \u002710.1.255.86\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.10.5\u0027, java.version: \u00271.8.0_25\u0027\nDriver info: driver.version: unknown\nCommand duration or timeout: 30.29 seconds\nBuild info: version: \u00272.39.0\u0027, revision: \u002714fa800511cc5d66d426e08b0b2ab926c7ed7398\u0027, time: \u00272013-12-16 13:18:38\u0027\nSystem info: host: \u0027DCSA-PARTRIDGE-MAC.local\u0027, ip: \u002710.1.255.86\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.10.5\u0027, java.version: \u00271.8.0_25\u0027\nDriver info: org.openqa.selenium.remote.RemoteWebDriver\nCapabilities [{applicationCacheEnabled\u003dtrue, rotatable\u003dfalse, handlesAlerts\u003dtrue, databaseEnabled\u003dtrue, version\u003d40.0.3, platform\u003dMAC, nativeEvents\u003dfalse, acceptSslCerts\u003dtrue, webdriver.remote.sessionid\u003db802b2c6-28b3-45f3-8ad3-dd69351fce24, webStorageEnabled\u003dtrue, locationContextEnabled\u003dtrue, browserName\u003dfirefox, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: b802b2c6-28b3-45f3-8ad3-dd69351fce24\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:408)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:193)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:145)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:554)\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:268)\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:79)\n\tat DemoSite.SmokeTests.BundledProductStepDefinitions.i_am_on_a_bundled_product_page(BundledProductStepDefinitions.java:42)\n\tat ✽.Given I am on a bundled product page(BundledProductSMokeTest.feature:9)\nCaused by: org.openqa.selenium.remote.ScreenshotException: Screen shot has been taken\nBuild info: version: \u00272.39.0\u0027, revision: \u002714fa800511cc5d66d426e08b0b2ab926c7ed7398\u0027, time: \u00272013-12-16 13:18:38\u0027\nSystem info: host: \u0027DCSA-PARTRIDGE-MAC.local\u0027, ip: \u002710.1.255.86\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.10.5\u0027, java.version: \u00271.8.0_25\u0027\nDriver info: driver.version: RemoteWebDriver\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:125)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:554)\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:268)\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:79)\n\tat DemoSite.SmokeTests.BundledProductStepDefinitions.i_am_on_a_bundled_product_page(BundledProductStepDefinitions.java:42)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:483)\n\tat cucumber.runtime.Utils$1.call(Utils.java:37)\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:13)\n\tat cucumber.runtime.Utils.invoke(Utils.java:31)\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:37)\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:298)\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:48)\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:91)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:93)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:37)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:98)\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:86)\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:459)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:675)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:382)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:192)\nCaused by: org.openqa.selenium.ElementNotVisibleException: Element is not currently visible and so may not be interacted with\nBuild info: version: \u00272.47.1\u0027, revision: \u0027411b314\u0027, time: \u00272015-07-30 03:03:16\u0027\nSystem info: host: \u0027DCSA-PARTRIDGE-MAC.local\u0027, ip: \u002710.1.255.86\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.10.5\u0027, java.version: \u00271.8.0_25\u0027\nDriver info: driver.version: unknown\nBuild info: version: \u00272.39.0\u0027, revision: \u002714fa800511cc5d66d426e08b0b2ab926c7ed7398\u0027, time: \u00272013-12-16 13:18:38\u0027\nSystem info: host: \u0027DCSA-PARTRIDGE-MAC.local\u0027, ip: \u002710.1.255.86\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.10.5\u0027, java.version: \u00271.8.0_25\u0027\nDriver info: driver.version: unknown\n\tat \u003canonymous class\u003e.fxdriver.preconditions.visible(file:///var/folders/s6/rj7sq04n1j71qbdxw9wg5sgc0000gp/T/anonymous3221033977483181779webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:9982)\n\tat \u003canonymous class\u003e.DelayedCommand.prototype.checkPreconditions_(file:///var/folders/s6/rj7sq04n1j71qbdxw9wg5sgc0000gp/T/anonymous3221033977483181779webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12626)\n\tat \u003canonymous class\u003e.DelayedCommand.prototype.executeInternal_/h(file:///var/folders/s6/rj7sq04n1j71qbdxw9wg5sgc0000gp/T/anonymous3221033977483181779webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12643)\n\tat \u003canonymous class\u003e.fxdriver.Timer.prototype.setTimeout/\u003c.notify(file:///var/folders/s6/rj7sq04n1j71qbdxw9wg5sgc0000gp/T/anonymous3221033977483181779webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:623)\n",
  "status": "failed"
});
formatter.match({
  "location": "ConfigurableProductStepDefinitions.the_product_is_in_stock()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BundledProductStepDefinitions.price_as_configured_editable_quantity_field_and_Add_to_Cart_button_should_be_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 10734,
  "status": "passed"
});
formatter.before({
  "duration": 804853278,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Configuring child product of bundled product",
  "description": "",
  "id": "smoke-test-to-make-sure-bundled-product-page-is-working;configuring-child-product-of-bundled-product",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "I am on a bundled product page",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "the child product of the bundled product is configurable",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I configure the child product to my liking",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "price as configured and availability should update accordingly",
  "keyword": "Then "
});
formatter.match({
  "location": "BundledProductStepDefinitions.i_am_on_a_bundled_product_page()"
});
formatter.result({
  "duration": 3278634446,
  "status": "passed"
});
formatter.match({
  "location": "BundledProductStepDefinitions.the_child_product_of_the_bundled_product_is_configurable()"
});
formatter.result({
  "duration": 41293074,
  "status": "passed"
});
formatter.match({
  "location": "BundledProductStepDefinitions.i_configure_the_child_product_to_my_liking()"
});
formatter.result({
  "duration": 370167239,
  "status": "passed"
});
formatter.match({
  "location": "BundledProductStepDefinitions.price_as_configured_and_availability_should_update_accordingly()"
});
formatter.result({
  "duration": 156841106,
  "status": "passed"
});
formatter.after({
  "duration": 10256,
  "status": "passed"
});
formatter.before({
  "duration": 745383963,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Adding bundled product to cart",
  "description": "",
  "id": "smoke-test-to-make-sure-bundled-product-page-is-working;adding-bundled-product-to-cart",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 20,
  "name": "I am on a bundled product page",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "my configuration of the bundled product is in stock",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I click the Add to Cart button",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "product should be added to my cart",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "a page notification should be displayed saying product successfully added to cart",
  "keyword": "And "
});
formatter.match({
  "location": "BundledProductStepDefinitions.i_am_on_a_bundled_product_page()"
});
formatter.result({
  "duration": 3241622371,
  "status": "passed"
});
formatter.match({
  "location": "BundledProductStepDefinitions.my_configuration_of_the_bundled_product_is_in_stock()"
});
formatter.result({
  "duration": 521330973,
  "status": "passed"
});
formatter.match({
  "location": "SimpleProductPageStepDefinitions.i_click_the_Add_to_Cart_button()"
});
formatter.result({
  "duration": 3340273566,
  "status": "passed"
});
formatter.match({
  "location": "SimpleProductPageStepDefinitions.product_should_be_added_to_my_cart()"
});
formatter.result({
  "duration": 230103395,
  "status": "passed"
});
formatter.match({
  "location": "SimpleProductPageStepDefinitions.a_page_notification_should_be_displayed_saying_product_successfully_added_to_cart()"
});
formatter.result({
  "duration": 21049553,
  "status": "passed"
});
formatter.after({
  "duration": 8978,
  "status": "passed"
});
formatter.uri("CategoryPageStaticOnlySmokeTest.feature");
formatter.feature({
  "line": 2,
  "name": "Smoke tests to test static content category pages",
  "description": "",
  "id": "smoke-tests-to-test-static-content-category-pages",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@NoInput"
    },
    {
      "line": 1,
      "name": "@All"
    }
  ]
});
formatter.before({
  "duration": 758768198,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Navigating to static content category page",
  "description": "",
  "id": "smoke-tests-to-test-static-content-category-pages;navigating-to-static-content-category-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on the homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I select a category with static content from the main navigation",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should be directed to that category page",
  "keyword": "Then "
});
formatter.match({
  "location": "CommonPageStepDefinitons.i_am_on_the_homepage()"
});
formatter.result({
  "duration": 10791156,
  "status": "passed"
});
formatter.match({
  "location": "CategoryPageStepDefinitions.i_select_a_category_with_static_content_from_the_main_navigation()"
});
formatter.result({
  "duration": 2082501918,
  "status": "passed"
});
formatter.match({
  "location": "CategoryPageStepDefinitions.i_should_be_directed_to_that_category_page()"
});
formatter.result({
  "duration": 135325924,
  "status": "passed"
});
formatter.after({
  "duration": 8706,
  "status": "passed"
});
formatter.before({
  "duration": 758835590,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Navigating to subcategory pages from static content category page",
  "description": "",
  "id": "smoke-tests-to-test-static-content-category-pages;navigating-to-subcategory-pages-from-static-content-category-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "I am on a static content category page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I select a subcategory image",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I should be directed to that subcategory",
  "keyword": "Then "
});
formatter.match({
  "location": "CategoryPageStepDefinitions.i_am_on_a_static_content_category_page()"
});
formatter.result({
  "duration": 1711535754,
  "status": "passed"
});
formatter.match({
  "location": "CategoryPageStepDefinitions.i_select_a_subcategory_image()"
});
formatter.result({
  "duration": 10536683253,
  "status": "passed"
});
formatter.match({
  "location": "CategoryPageStepDefinitions.i_should_be_directed_to_that_subcategory()"
});
formatter.result({
  "duration": 18743,
  "status": "passed"
});
formatter.after({
  "duration": 5967,
  "status": "passed"
});
formatter.uri("CategoryPageStaticandProductSmokeTest.feature");
formatter.feature({
  "line": 2,
  "name": "Smoke testing to make sure a basic category page works",
  "description": "",
  "id": "smoke-testing-to-make-sure-a-basic-category-page-works",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@NoInput"
    },
    {
      "line": 1,
      "name": "@All"
    }
  ]
});
formatter.before({
  "duration": 1840733212,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on the homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "CommonPageStepDefinitons.i_am_on_the_homepage()"
});
formatter.result({
  "duration": 15546860,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Navigating to Category product page from home page",
  "description": "",
  "id": "smoke-testing-to-make-sure-a-basic-category-page-works;navigating-to-category-product-page-from-home-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "I select a category with product from the main navigation",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I should be directed to that category page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "the category page should have product on it",
  "keyword": "And "
});
formatter.match({
  "location": "CategoryPageStepDefinitions.i_select_a_category_with_product_from_the_main_navigation()"
});
formatter.result({
  "duration": 2456563838,
  "status": "passed"
});
formatter.match({
  "location": "CategoryPageStepDefinitions.i_should_be_directed_to_that_category_page()"
});
formatter.result({
  "duration": 130243934,
  "status": "passed"
});
formatter.match({
  "location": "CategoryPageStepDefinitions.the_category_page_should_have_product_on_it()"
});
formatter.result({
  "duration": 193002620,
  "status": "passed"
});
formatter.after({
  "duration": 9379,
  "status": "passed"
});
formatter.before({
  "duration": 876433068,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on the homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "CommonPageStepDefinitons.i_am_on_the_homepage()"
});
formatter.result({
  "duration": 748643444,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Navigating to Product detail page from Category page",
  "description": "",
  "id": "smoke-testing-to-make-sure-a-basic-category-page-works;navigating-to-product-detail-page-from-category-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "that I am on a category page with product",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "I select a product Image/Name",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "I should be directed to that product’s detail page",
  "keyword": "Then "
});
formatter.match({
  "location": "CategoryPageStepDefinitions.that_I_am_on_a_category_page_with_product()"
});
formatter.result({
  "duration": 2335465289,
  "status": "passed"
});
formatter.match({
  "location": "SearchStepDefinitions.i_select_a_product_Image_Name()"
});
formatter.result({
  "duration": 1688556009,
  "status": "passed"
});
formatter.match({
  "location": "SearchStepDefinitions.i_should_be_directed_to_that_product_s_detail_page()"
});
formatter.result({
  "duration": 19243,
  "status": "passed"
});
formatter.after({
  "duration": 6793,
  "status": "passed"
});
formatter.before({
  "duration": 735590776,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on the homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "CommonPageStepDefinitons.i_am_on_the_homepage()"
});
formatter.result({
  "duration": 34739125,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Adding simple product to cart on category page",
  "description": "",
  "id": "smoke-testing-to-make-sure-a-basic-category-page-works;adding-simple-product-to-cart-on-category-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 18,
  "name": "that I am on a category page with product",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "there is simple product on the page",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I click the add to cart button",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "Product is added to cart",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "page notification displays saying product was added to cart",
  "keyword": "And "
});
formatter.match({
  "location": "CategoryPageStepDefinitions.that_I_am_on_a_category_page_with_product()"
});
formatter.result({
  "duration": 2792442356,
  "status": "passed"
});
formatter.match({
  "location": "SearchStepDefinitions.there_is_simple_product_on_the_page()"
});
formatter.result({
  "duration": 1682782887,
  "status": "passed"
});
formatter.match({
  "location": "SearchStepDefinitions.i_click_the_add_to_cart_button()"
});
formatter.result({
  "duration": 2574780772,
  "status": "passed"
});
formatter.match({
  "location": "SearchStepDefinitions.product_is_added_to_cart()"
});
formatter.result({
  "duration": 190989878,
  "status": "passed"
});
formatter.match({
  "location": "SearchStepDefinitions.page_notification_displays_saying_product_was_added_to_cart()"
});
formatter.result({
  "duration": 40639934,
  "status": "passed"
});
formatter.after({
  "duration": 8599,
  "status": "passed"
});
formatter.uri("CompanyLogoImageSmokeTest.feature");
formatter.feature({
  "line": 2,
  "name": "Smoke test to make sure home logo is working",
  "description": "",
  "id": "smoke-test-to-make-sure-home-logo-is-working",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@NoInput"
    },
    {
      "line": 1,
      "name": "@All"
    }
  ]
});
formatter.before({
  "duration": 907442416,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Clicking company logo image",
  "description": "",
  "id": "smoke-test-to-make-sure-home-logo-is-working;clicking-company-logo-image",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on any page on the site",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click the company logo",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I am taken to site homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "HomeLogoStepDefinitons.i_am_on_any_page_on_the_site()"
});
formatter.result({
  "duration": 3698103501,
  "status": "passed"
});
formatter.match({
  "location": "HomeLogoStepDefinitons.i_click_the_company_logo()"
});
formatter.result({
  "duration": 954622800,
  "status": "passed"
});
formatter.match({
  "location": "HomeLogoStepDefinitons.i_am_taken_to_site_homepage()"
});
formatter.result({
  "duration": 116604059,
  "status": "passed"
});
formatter.after({
  "duration": 10651,
  "status": "passed"
});
formatter.uri("CompareSmokeTest.feature");
formatter.feature({
  "line": 2,
  "name": "Smoketest to make sure compare function is working",
  "description": "",
  "id": "smoketest-to-make-sure-compare-function-is-working",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@NoInput"
    },
    {
      "line": 1,
      "name": "@All"
    }
  ]
});
formatter.before({
  "duration": 835724326,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "Compare function is enabled",
  "keyword": "Given "
});
formatter.match({
  "location": "CompareStepDefinitions.compare_function_is_enabled()"
});
formatter.result({
  "duration": 58103,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Adding product to compare list",
  "description": "",
  "id": "smoketest-to-make-sure-compare-function-is-working;adding-product-to-compare-list",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "I am logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I am on product detail page",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on the Add to Compare link",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "a page notification should be displayed saying product was added to comparison list",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "that product should be added to comparison list",
  "keyword": "And "
});
formatter.match({
  "location": "RegisteredUserCheckoutStepDefinitions.i_am_logged_in()"
});
formatter.result({
  "duration": 6316632107,
  "status": "passed"
});
formatter.match({
  "location": "CompareStepDefinitions.i_am_on_product_detail_page()"
});
formatter.result({
  "duration": 7646608934,
  "status": "passed"
});
formatter.match({
  "location": "CompareStepDefinitions.i_click_on_the_Add_to_Compare_link()"
});
formatter.result({
  "duration": 3576479229,
  "status": "passed"
});
formatter.match({
  "location": "CompareStepDefinitions.a_page_notification_should_be_displayed_saying_product_was_added_to_comparison_list()"
});
formatter.result({
  "duration": 139815496,
  "status": "passed"
});
formatter.match({
  "location": "CompareStepDefinitions.that_product_should_be_added_to_comparison_list()"
});
formatter.result({
  "duration": 3708039124,
  "status": "passed"
});
formatter.after({
  "duration": 10453,
  "status": "passed"
});
formatter.before({
  "duration": 1048071769,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "Compare function is enabled",
  "keyword": "Given "
});
formatter.match({
  "location": "CompareStepDefinitions.compare_function_is_enabled()"
});
formatter.result({
  "duration": 29862,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Viewing comparison list",
  "description": "",
  "id": "smoketest-to-make-sure-compare-function-is-working;viewing-comparison-list",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "I am logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "I am on a category page",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I have product in my comparison list",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I click the compare button",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "Comparison page should be displayed with products in my comparison list",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisteredUserCheckoutStepDefinitions.i_am_logged_in()"
});
formatter.result({
  "duration": 7375719732,
  "status": "passed"
});
formatter.match({
  "location": "SubcategoryStepDefinitions.i_am_on_a_category_page()"
});
formatter.result({
  "duration": 3756979540,
  "status": "passed"
});
formatter.match({
  "location": "CompareStepDefinitions.i_have_product_in_my_comparison_list()"
});
formatter.result({
  "duration": 19843679104,
  "status": "passed"
});
formatter.match({
  "location": "CompareStepDefinitions.i_click_the_compare_button()"
});
formatter.result({
  "duration": 1660935597,
  "status": "passed"
});
formatter.match({
  "location": "CompareStepDefinitions.comparison_page_should_be_displayed_with_products_in_my_comparison_list()"
});
formatter.result({
  "duration": 2248384780,
  "status": "passed"
});
formatter.after({
  "duration": 243693,
  "status": "passed"
});
formatter.before({
  "duration": 823270303,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "Compare function is enabled",
  "keyword": "Given "
});
formatter.match({
  "location": "CompareStepDefinitions.compare_function_is_enabled()"
});
formatter.result({
  "duration": 32253,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Removing product from compare list",
  "description": "",
  "id": "smoketest-to-make-sure-compare-function-is-working;removing-product-from-compare-list",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 22,
  "name": "I am logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "I want to remove product",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I click on the Clear All link under compare products section",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "All products are removed from compare section",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisteredUserCheckoutStepDefinitions.i_am_logged_in()"
});
formatter.result({
  "duration": 5267600256,
  "status": "passed"
});
formatter.match({
  "location": "CompareStepDefinitions.i_want_to_remove_product()"
});
formatter.result({
  "duration": 19731,
  "status": "passed"
});
formatter.match({
  "location": "CompareStepDefinitions.i_click_on_the_Clear_All_link_under_compare_products_section()"
});
formatter.result({
  "duration": 2547089025,
  "status": "passed"
});
formatter.match({
  "location": "CompareStepDefinitions.all_products_are_removed_from_compare_section()"
});
formatter.result({
  "duration": 1994566204,
  "status": "passed"
});
formatter.after({
  "duration": 19163,
  "status": "passed"
});
formatter.uri("ConfigurableProductSmokeTest.feature");
formatter.feature({
  "line": 2,
  "name": "Smoke testing to make sure configurable product page works",
  "description": "",
  "id": "smoke-testing-to-make-sure-configurable-product-page-works",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@NoInput"
    },
    {
      "line": 1,
      "name": "@All"
    }
  ]
});
formatter.before({
  "duration": 791924120,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "I am on a configurable product page",
  "description": "",
  "id": "smoke-testing-to-make-sure-configurable-product-page-works;i-am-on-a-configurable-product-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on a configurable product page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "product name, price, and availability should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "ConfigurableProductStepDefinitions.i_am_on_a_configurable_product_page()"
});
formatter.result({
  "duration": 3792058078,
  "status": "passed"
});
formatter.match({
  "location": "SimpleProductPageStepDefinitions.product_name_price_and_availability_should_be_displayed()"
});
formatter.result({
  "duration": 44909870,
  "status": "passed"
});
formatter.after({
  "duration": 7673,
  "status": "passed"
});
formatter.before({
  "duration": 814261942,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Configuring configurable product",
  "description": "",
  "id": "smoke-testing-to-make-sure-configurable-product-page-works;configuring-configurable-product",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "I am on a configurable product page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I configure the product to my liking",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "image, availability, and price should update accordingly",
  "keyword": "Then "
});
formatter.match({
  "location": "ConfigurableProductStepDefinitions.i_am_on_a_configurable_product_page()"
});
formatter.result({
  "duration": 3776909324,
  "status": "passed"
});
formatter.match({
  "location": "ConfigurableProductStepDefinitions.i_configure_the_product_to_my_liking()"
});
formatter.result({
  "duration": 260398969,
  "status": "passed"
});
formatter.match({
  "location": "ConfigurableProductStepDefinitions.image_availability_and_price_should_update_accordingly()"
});
formatter.result({
  "duration": 305772072,
  "status": "passed"
});
formatter.after({
  "duration": 34424,
  "status": "passed"
});
formatter.before({
  "duration": 885170382,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Configurable product is in stock",
  "description": "",
  "id": "smoke-testing-to-make-sure-configurable-product-page-works;configurable-product-is-in-stock",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "I am on a configurable product page",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "the product is in stock",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Add to Cart button should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "editable quantity field should be displayed",
  "keyword": "And "
});
formatter.match({
  "location": "ConfigurableProductStepDefinitions.i_am_on_a_configurable_product_page()"
});
formatter.result({
  "duration": 4049326928,
  "status": "passed"
});
formatter.match({
  "location": "ConfigurableProductStepDefinitions.the_product_is_in_stock()"
});
formatter.result({
  "duration": 17963865,
  "status": "passed"
});
formatter.match({
  "location": "SimpleProductPageStepDefinitions.add_to_Cart_button_should_be_displayed()"
});
formatter.result({
  "duration": 14632655,
  "status": "passed"
});
formatter.match({
  "location": "SimpleProductPageStepDefinitions.editable_quantity_field_should_be_displayed()"
});
formatter.result({
  "duration": 15170201,
  "status": "passed"
});
formatter.after({
  "duration": 5279,
  "status": "passed"
});
formatter.before({
  "duration": 746739089,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Adding configurable product to cart",
  "description": "",
  "id": "smoke-testing-to-make-sure-configurable-product-page-works;adding-configurable-product-to-cart",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 20,
  "name": "I am on a configurable product page",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "configuration of configurable product is in stock",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I click the Add to Cart button",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "product should be added to my cart",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "a page notification should be displayed saying product successfully added to cart",
  "keyword": "And "
});
formatter.match({
  "location": "ConfigurableProductStepDefinitions.i_am_on_a_configurable_product_page()"
});
formatter.result({
  "duration": 3711338906,
  "status": "passed"
});
formatter.match({
  "location": "ConfigurableProductStepDefinitions.configuration_of_configurable_product_is_in_stock()"
});
formatter.result({
  "duration": 159519503,
  "status": "passed"
});
formatter.match({
  "location": "SimpleProductPageStepDefinitions.i_click_the_Add_to_Cart_button()"
});
formatter.result({
  "duration": 4000548461,
  "status": "passed"
});
formatter.match({
  "location": "SimpleProductPageStepDefinitions.product_should_be_added_to_my_cart()"
});
formatter.result({
  "duration": 224131909,
  "status": "passed"
});
formatter.match({
  "location": "SimpleProductPageStepDefinitions.a_page_notification_should_be_displayed_saying_product_successfully_added_to_cart()"
});
formatter.result({
  "duration": 15462556,
  "status": "passed"
});
formatter.after({
  "duration": 5504,
  "status": "passed"
});
formatter.uri("ContactUsSmokeTest.feature");
formatter.feature({
  "line": 2,
  "name": "Smoketest to make sure contact us is working",
  "description": "",
  "id": "smoketest-to-make-sure-contact-us-is-working",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@NoInput"
    },
    {
      "line": 1,
      "name": "@All"
    }
  ]
});
formatter.before({
  "duration": 870431923,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Navigating to Contact page",
  "description": "",
  "id": "smoketest-to-make-sure-contact-us-is-working;navigating-to-contact-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on the Contact link",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I am taken to contact page",
  "keyword": "Then "
});
formatter.match({
  "location": "CommonPageStepDefinitons.i_am_on_homepage()"
});
formatter.result({
  "duration": 886842894,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsStepDefinitions.i_click_on_the_Contact_link()"
});
formatter.result({
  "duration": 731391816,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsStepDefinitions.i_am_taken_to_contact_page()"
});
formatter.result({
  "duration": 129243603,
  "status": "passed"
});
formatter.after({
  "duration": 6350,
  "status": "passed"
});
formatter.before({
  "duration": 930448198,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Submitting contact form",
  "description": "",
  "id": "smoketest-to-make-sure-contact-us-is-working;submitting-contact-form",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "I am on Contact page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I fill out all the contact fields correctly",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "press the Submit button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "contact form is successfully submitted",
  "keyword": "Then "
});
formatter.match({
  "location": "ContactUsStepDefinitions.i_am_on_Contact_page()"
});
formatter.result({
  "duration": 1420791772,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsStepDefinitions.i_fill_out_all_the_contact_fields_correctly()"
});
formatter.result({
  "duration": 311485827,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsStepDefinitions.press_the_Submit_button()"
});
formatter.result({
  "duration": 1492381599,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsStepDefinitions.contact_form_is_successfully_submitted()"
});
formatter.result({
  "duration": 140488904,
  "status": "passed"
});
formatter.after({
  "duration": 6021,
  "status": "passed"
});
formatter.uri("CrumbTraySmokeTest.feature");
formatter.feature({
  "line": 2,
  "name": "Smoketest to make sure crumb tray is functioning",
  "description": "",
  "id": "smoketest-to-make-sure-crumb-tray-is-functioning",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@NoInput"
    },
    {
      "line": 1,
      "name": "@All"
    }
  ]
});
formatter.before({
  "duration": 929747055,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Click on links in crumb tray",
  "description": "",
  "id": "smoketest-to-make-sure-crumb-tray-is-functioning;click-on-links-in-crumb-tray",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on any page on the site",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click a link in the crumb tray",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I am taken to the correct page",
  "keyword": "Then "
});
formatter.match({
  "location": "HomeLogoStepDefinitons.i_am_on_any_page_on_the_site()"
});
formatter.result({
  "duration": 3700728346,
  "status": "passed"
});
formatter.match({
  "location": "CrumbTrayStepDefinitions.i_click_a_link_in_the_crumb_tray()"
});
formatter.result({
  "duration": 8672826383,
  "status": "passed"
});
formatter.match({
  "location": "SiteMapStepDefinitions.i_am_taken_to_the_correct_page()"
});
formatter.result({
  "duration": 63089,
  "status": "passed"
});
formatter.after({
  "duration": 4251,
  "status": "passed"
});
formatter.uri("CustomerReviewsSmokeTest.feature");
formatter.feature({
  "line": 2,
  "name": "Smoke tests to test reviews functionality",
  "description": "",
  "id": "smoke-tests-to-test-reviews-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@NoInput"
    },
    {
      "line": 1,
      "name": "@All"
    }
  ]
});
formatter.before({
  "duration": 898770739,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Product has reviews",
  "description": "",
  "id": "smoke-tests-to-test-reviews-functionality;product-has-reviews",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on a product detail page with at least one review",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "number of review(s) and Add Your Review links should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "CustomerReviewsStepDefinitons.i_am_on_a_product_detail_page_with_at_least_one_review()"
});
formatter.result({
  "duration": 3604068417,
  "status": "passed"
});
formatter.match({
  "location": "CustomerReviewsStepDefinitons.number_of_review_s_and_Add_Your_Review_links_should_be_displayed()"
});
formatter.result({
  "duration": 127533240,
  "status": "passed"
});
formatter.after({
  "duration": 5878,
  "status": "passed"
});
formatter.before({
  "duration": 887526135,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Product does not have reviews",
  "description": "",
  "id": "smoke-tests-to-test-reviews-functionality;product-does-not-have-reviews",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "I am on a product detail page with no reviews",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "number of review(s) and Add Your Review links should not be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Be the first to review this product link should be displayed under Reviews tab",
  "keyword": "And "
});
formatter.match({
  "location": "CustomerReviewsStepDefinitons.i_am_on_a_product_detail_page_with_no_reviews()"
});
formatter.result({
  "duration": 34059707448,
  "status": "passed"
});
formatter.match({
  "location": "CustomerReviewsStepDefinitons.number_of_review_s_and_Add_Your_Review_links_should_not_be_displayed()"
});
formatter.result({
  "duration": 30312939658,
  "status": "passed"
});
formatter.match({
  "location": "CustomerReviewsStepDefinitons.be_the_first_to_review_this_product_link_should_be_displayed_under_Reviews_tab()"
});
formatter.result({
  "duration": 89707168,
  "status": "passed"
});
formatter.after({
  "duration": 5767,
  "status": "passed"
});
formatter.before({
  "duration": 904228729,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Navigating to review page when product has at least one review",
  "description": "",
  "id": "smoke-tests-to-test-reviews-functionality;navigating-to-review-page-when-product-has-at-least-one-review",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "I am on a product detail page with at least one review",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I click on the number of Review(s) link",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I should be directed to product review page",
  "keyword": "Then "
});
formatter.match({
  "location": "CustomerReviewsStepDefinitons.i_am_on_a_product_detail_page_with_at_least_one_review()"
});
formatter.result({
  "duration": 3711871291,
  "status": "passed"
});
formatter.match({
  "location": "CustomerReviewsStepDefinitons.i_click_on_the_number_of_Review_s_link()"
});
formatter.result({
  "duration": 1611521517,
  "status": "passed"
});
formatter.match({
  "location": "CustomerReviewsStepDefinitons.i_should_be_directed_to_product_review_page()"
});
formatter.result({
  "duration": 156566891,
  "status": "passed"
});
formatter.after({
  "duration": 5677,
  "status": "passed"
});
formatter.before({
  "duration": 934817205,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Adding your review when product has at least one review",
  "description": "",
  "id": "smoke-tests-to-test-reviews-functionality;adding-your-review-when-product-has-at-least-one-review",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 19,
  "name": "I am on a product detail page with at least one review",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "I click on the Add Your Review link",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "I should be directed to product review page",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "anchored to the write your review section",
  "keyword": "And "
});
formatter.match({
  "location": "CustomerReviewsStepDefinitons.i_am_on_a_product_detail_page_with_at_least_one_review()"
});
formatter.result({
  "duration": 3643613857,
  "status": "passed"
});
formatter.match({
  "location": "CustomerReviewsStepDefinitons.i_click_on_the_Add_Your_Review_link()"
});
formatter.result({
  "duration": 1692837969,
  "status": "passed"
});
formatter.match({
  "location": "CustomerReviewsStepDefinitons.i_should_be_directed_to_product_review_page()"
});
formatter.result({
  "duration": 144243121,
  "status": "passed"
});
formatter.match({
  "location": "CustomerReviewsStepDefinitons.anchored_to_the_write_your_review_section()"
});
formatter.result({
  "duration": 13711977,
  "status": "passed"
});
formatter.after({
  "duration": 5475,
  "status": "passed"
});
formatter.before({
  "duration": 944670062,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "Adding your review when product has no reviews",
  "description": "",
  "id": "smoke-tests-to-test-reviews-functionality;adding-your-review-when-product-has-no-reviews",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 25,
  "name": "I am on a product detail page with no reviews",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "I click on the Be the first to review this product link under the Reviews tab",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "I should be directed to product review page",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "anchored to the write your review section",
  "keyword": "And "
});
formatter.match({
  "location": "CustomerReviewsStepDefinitons.i_am_on_a_product_detail_page_with_no_reviews()"
});
formatter.result({
  "duration": 33932730568,
  "status": "passed"
});
formatter.match({
  "location": "CustomerReviewsStepDefinitons.i_click_on_the_Be_the_first_to_review_this_product_link_under_the_Reviews_tab()"
});
formatter.result({
  "duration": 1606625566,
  "status": "passed"
});
formatter.match({
  "location": "CustomerReviewsStepDefinitons.i_should_be_directed_to_product_review_page()"
});
formatter.result({
  "duration": 161081972,
  "status": "passed"
});
formatter.match({
  "location": "CustomerReviewsStepDefinitons.anchored_to_the_write_your_review_section()"
});
formatter.result({
  "duration": 14284125,
  "status": "passed"
});
formatter.after({
  "duration": 6622,
  "status": "passed"
});
formatter.before({
  "duration": 736451955,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "Writing a review",
  "description": "",
  "id": "smoke-tests-to-test-reviews-functionality;writing-a-review",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 31,
  "name": "I am on review page",
  "keyword": "Given "
});
formatter.step({
  "line": 32,
  "name": "I want to write a review",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I fill out the review sections",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "press Submit Review button",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "my review is submitted and saved",
  "keyword": "Then "
});
formatter.match({
  "location": "CustomerReviewsStepDefinitons.i_am_on_review_page()"
});
formatter.result({
  "duration": 5442068172,
  "status": "passed"
});
formatter.match({
  "location": "CustomerReviewsStepDefinitons.i_want_to_write_a_review()"
});
formatter.result({
  "duration": 15880,
  "status": "passed"
});
formatter.match({
  "location": "CustomerReviewsStepDefinitons.i_fill_out_the_review_sections()"
});
formatter.result({
  "duration": 358339490,
  "status": "passed"
});
formatter.match({
  "location": "CustomerReviewsStepDefinitons.press_Submit_Review_button()"
});
formatter.result({
  "duration": 2576244048,
  "status": "passed"
});
formatter.match({
  "location": "CustomerReviewsStepDefinitons.my_review_is_submitted_and_saved()"
});
formatter.result({
  "duration": 132623553,
  "status": "passed"
});
formatter.after({
  "duration": 6147,
  "status": "passed"
});
formatter.uri("CustomerServiceSmokeTest.feature");
formatter.feature({
  "line": 2,
  "name": "Smoketest to make sure customer service page is functioning",
  "description": "",
  "id": "smoketest-to-make-sure-customer-service-page-is-functioning",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@NoInput"
    },
    {
      "line": 1,
      "name": "@All"
    }
  ]
});
formatter.before({
  "duration": 735027666,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Navigating to customer service page",
  "description": "",
  "id": "smoketest-to-make-sure-customer-service-page-is-functioning;navigating-to-customer-service-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "client website has a customer service page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on the customer service link",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I am taken to the customer service page",
  "keyword": "Then "
});
formatter.match({
  "location": "CustomerServiceStepDefinitions.client_website_has_a_customer_service_page()"
});
formatter.result({
  "duration": 120841166,
  "status": "passed"
});
formatter.match({
  "location": "CustomerServiceStepDefinitions.i_click_on_the_customer_service_link()"
});
formatter.result({
  "duration": 746977286,
  "status": "passed"
});
formatter.match({
  "location": "CustomerServiceStepDefinitions.i_am_taken_to_the_customer_service_page()"
});
formatter.result({
  "duration": 130158054,
  "status": "passed"
});
formatter.after({
  "duration": 4848,
  "status": "passed"
});
formatter.uri("EmailToAFriendSmokeTest.feature");
formatter.feature({
  "line": 2,
  "name": "Smoketesting to make sure email to a friend is working",
  "description": "",
  "id": "smoketesting-to-make-sure-email-to-a-friend-is-working",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@NoInput"
    },
    {
      "line": 1,
      "name": "@All"
    }
  ]
});
formatter.before({
  "duration": 708176398,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Navigating to Email to a friend page",
  "description": "",
  "id": "smoketesting-to-make-sure-email-to-a-friend-is-working;navigating-to-email-to-a-friend-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on a product detail page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on the Email to a Friend icon",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should be directed to Email to a Friend page",
  "keyword": "Then "
});
formatter.match({
  "location": "EmailtoaFriendStepDefinitions.i_am_on_a_product_detail_page()"
});
formatter.result({
  "duration": 3441571909,
  "status": "passed"
});
formatter.match({
  "location": "EmailtoaFriendStepDefinitions.i_click_on_the_Email_to_a_Friend_icon()"
});
formatter.result({
  "duration": 1051065422,
  "status": "passed"
});
formatter.match({
  "location": "EmailtoaFriendStepDefinitions.i_should_be_directed_to_Email_to_a_Friend_page()"
});
formatter.result({
  "duration": 116673063,
  "status": "passed"
});
formatter.after({
  "duration": 5966,
  "status": "passed"
});
formatter.before({
  "duration": 769498084,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Emailing link to a friend",
  "description": "",
  "id": "smoketesting-to-make-sure-email-to-a-friend-is-working;emailing-link-to-a-friend",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "I am on Email to a Friend page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I fill out required fields",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I click Send Email button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Email should be sent successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I should be back on previous product detail page",
  "keyword": "And "
});
formatter.match({
  "location": "EmailtoaFriendStepDefinitions.i_am_on_Email_to_a_Friend_page()"
});
formatter.result({
  "duration": 5779499666,
  "status": "passed"
});
formatter.match({
  "location": "EmailtoaFriendStepDefinitions.i_fill_out_required_fields()"
});
formatter.result({
  "duration": 340039546,
  "status": "passed"
});
formatter.match({
  "location": "EmailtoaFriendStepDefinitions.i_click_Send_Email_button()"
});
formatter.result({
  "duration": 2671050349,
  "status": "passed"
});
formatter.match({
  "location": "EmailtoaFriendStepDefinitions.email_should_be_sent_successfully()"
});
formatter.result({
  "duration": 133633115,
  "status": "passed"
});
formatter.match({
  "location": "EmailtoaFriendStepDefinitions.i_should_be_back_on_previous_product_detail_page()"
});
formatter.result({
  "duration": 71775846,
  "status": "passed"
});
formatter.after({
  "duration": 4710,
  "status": "passed"
});
formatter.before({
  "duration": 946266111,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Adding and removing recipients",
  "description": "",
  "id": "smoketesting-to-make-sure-email-to-a-friend-is-working;adding-and-removing-recipients",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 17,
  "name": "I am on Email to a Friend page",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "I click the Add Recipient button",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "Another recipient field is added",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "I click on the remove recipient link",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "recipient is removed",
  "keyword": "Then "
});
formatter.match({
  "location": "EmailtoaFriendStepDefinitions.i_am_on_Email_to_a_Friend_page()"
});
formatter.result({
  "duration": 5472500787,
  "status": "passed"
});
formatter.match({
  "location": "EmailtoaFriendStepDefinitions.i_click_the_Add_Recipient_button()"
});
formatter.result({
  "duration": 432686109,
  "status": "passed"
});
formatter.match({
  "location": "EmailtoaFriendStepDefinitions.another_recipient_field_is_added()"
});
formatter.result({
  "duration": 17006,
  "status": "passed"
});
formatter.match({
  "location": "EmailtoaFriendStepDefinitions.i_click_on_the_remove_recipient_link()"
});
formatter.result({
  "duration": 306305694,
  "status": "passed"
});
formatter.match({
  "location": "EmailtoaFriendStepDefinitions.recipient_is_removed()"
});
formatter.result({
  "duration": 30403598855,
  "status": "passed"
});
formatter.after({
  "duration": 4990,
  "status": "passed"
});
formatter.before({
  "duration": 810838537,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "Going back to product detail page",
  "description": "",
  "id": "smoketesting-to-make-sure-email-to-a-friend-is-working;going-back-to-product-detail-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 24,
  "name": "I am on Email to a Friend page",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "I click the back link",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "I should be back on previous product detail page",
  "keyword": "Then "
});
formatter.match({
  "location": "EmailtoaFriendStepDefinitions.i_am_on_Email_to_a_Friend_page()"
});
formatter.result({
  "duration": 5713268375,
  "status": "passed"
});
formatter.match({
  "location": "EmailtoaFriendStepDefinitions.i_click_the_back_link()"
});
formatter.result({
  "duration": 1470960117,
  "status": "passed"
});
formatter.match({
  "location": "EmailtoaFriendStepDefinitions.i_should_be_back_on_previous_product_detail_page()"
});
formatter.result({
  "duration": 182422398,
  "status": "passed"
});
formatter.after({
  "duration": 5145,
  "status": "passed"
});
formatter.uri("GiftCardSmokeTest.feature");
formatter.feature({
  "line": 3,
  "name": "Smoke testing for Gift Card page",
  "description": "",
  "id": "smoke-testing-for-gift-card-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@All"
    },
    {
      "line": 1,
      "name": "@NoInput"
    }
  ]
});
formatter.before({
  "duration": 963736343,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Adding gift card to cart",
  "description": "",
  "id": "smoke-testing-for-gift-card-page;adding-gift-card-to-cart",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I am on a gift card page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I select the Gift Card I want",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I fill out all the required fields",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "click the Add to Cart button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "product should be added to my cart",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "a page notification should be displayed saying product successfully added to cart",
  "keyword": "And "
});
formatter.match({
  "location": "GiftCardStepDefinitions.i_am_on_a_gift_card_page()"
});
formatter.result({
  "duration": 1483582762,
  "status": "passed"
});
formatter.match({
  "location": "GiftCardStepDefinitions.i_select_the_gift_card_i_want()"
});
formatter.result({
  "duration": 5451961613,
  "status": "passed"
});
formatter.match({
  "location": "GiftCardStepDefinitions.i_fill_out_all_the_required_fields()"
});
formatter.result({
  "duration": 524639850,
  "status": "passed"
});
formatter.match({
  "location": "GiftCardStepDefinitions.click_the_Add_to_Cart_button()"
});
formatter.result({
  "duration": 2522989894,
  "status": "passed"
});
formatter.match({
  "location": "SimpleProductPageStepDefinitions.product_should_be_added_to_my_cart()"
});
formatter.result({
  "duration": 229579415,
  "status": "passed"
});
formatter.match({
  "location": "SimpleProductPageStepDefinitions.a_page_notification_should_be_displayed_saying_product_successfully_added_to_cart()"
});
formatter.result({
  "duration": 13803999,
  "status": "passed"
});
formatter.after({
  "duration": 6038,
  "status": "passed"
});
formatter.uri("GroupedProductSmokeTest.feature");
formatter.feature({
  "line": 2,
  "name": "Smoke testing to make sure grouped product page works",
  "description": "",
  "id": "smoke-testing-to-make-sure-grouped-product-page-works",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@NoInput"
    },
    {
      "line": 1,
      "name": "@All"
    }
  ]
});
formatter.before({
  "duration": 772711424,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "I am on a grouped product page",
  "description": "",
  "id": "smoke-testing-to-make-sure-grouped-product-page-works;i-am-on-a-grouped-product-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "that I am on a grouped product page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "grouped product name, price, and availability should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "child product individual name, price, and availability should be displayed",
  "keyword": "And "
});
formatter.match({
  "location": "GroupedProductStepDefinitions.that_I_am_on_a_grouped_product_page()"
});
formatter.result({
  "duration": 3430384912,
  "status": "passed"
});
formatter.match({
  "location": "GroupedProductStepDefinitions.product_name_price_and_availability_should_be_displayed()"
});
formatter.result({
  "duration": 155924627,
  "status": "passed"
});
formatter.match({
  "location": "GroupedProductStepDefinitions.child_product_individual_name_price_and_availability_should_be_displayed()"
});
formatter.result({
  "duration": 271319554,
  "status": "passed"
});
formatter.after({
  "duration": 5389,
  "status": "passed"
});
formatter.before({
  "duration": 768734507,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "I am on a grouped product page and child product is in stock",
  "description": "",
  "id": "smoke-testing-to-make-sure-grouped-product-page-works;i-am-on-a-grouped-product-page-and-child-product-is-in-stock",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "that I am on a grouped product page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "all child product is in stock",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Add to Cart button should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "editable quantity fields should be displayed",
  "keyword": "And "
});
formatter.match({
  "location": "GroupedProductStepDefinitions.that_I_am_on_a_grouped_product_page()"
});
formatter.result({
  "duration": 3508268474,
  "status": "passed"
});
formatter.match({
  "location": "GroupedProductStepDefinitions.all_child_product_is_in_stock()"
});
formatter.result({
  "duration": 235269885,
  "status": "passed"
});
formatter.match({
  "location": "SimpleProductPageStepDefinitions.add_to_Cart_button_should_be_displayed()"
});
formatter.result({
  "duration": 12976672,
  "status": "passed"
});
formatter.match({
  "location": "GroupedProductStepDefinitions.editable_quantity_fields_should_be_displayed()"
});
formatter.result({
  "duration": 109284918,
  "status": "passed"
});
formatter.after({
  "duration": 4985,
  "status": "passed"
});
formatter.before({
  "duration": 848702776,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Adding grouped product to cart",
  "description": "",
  "id": "smoke-testing-to-make-sure-grouped-product-page-works;adding-grouped-product-to-cart",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 16,
  "name": "that I am on a grouped product page",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "all child product is in stock",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I edit the quantity fields",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "I click the Add to Cart button",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "grouped product should be added to my cart",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "a page notification should be displayed saying product successfully added to cart",
  "keyword": "And "
});
formatter.match({
  "location": "GroupedProductStepDefinitions.that_I_am_on_a_grouped_product_page()"
});
formatter.result({
  "duration": 3256253502,
  "status": "passed"
});
formatter.match({
  "location": "GroupedProductStepDefinitions.all_child_product_is_in_stock()"
});
formatter.result({
  "duration": 246916520,
  "status": "passed"
});
formatter.match({
  "location": "GroupedProductStepDefinitions.i_edit_the_quantity_fields()"
});
formatter.result({
  "duration": 433911321,
  "status": "passed"
});
formatter.match({
  "location": "SimpleProductPageStepDefinitions.i_click_the_Add_to_Cart_button()"
});
formatter.result({
  "duration": 3475420539,
  "status": "passed"
});
formatter.match({
  "location": "GroupedProductStepDefinitions.product_should_be_added_to_my_cart()"
});
formatter.result({
  "duration": 124092832,
  "status": "passed"
});
formatter.match({
  "location": "SimpleProductPageStepDefinitions.a_page_notification_should_be_displayed_saying_product_successfully_added_to_cart()"
});
formatter.result({
  "duration": 16809014,
  "status": "passed"
});
formatter.after({
  "duration": 5616,
  "status": "passed"
});
formatter.uri("GuestCheckoutSmokeTest.feature");
formatter.feature({
  "line": 2,
  "name": "Guest Checkout Smoke Test",
  "description": "",
  "id": "guest-checkout-smoke-test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Input"
    },
    {
      "line": 1,
      "name": "@All"
    }
  ]
});
formatter.before({
  "duration": 830535687,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am not a registered user",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I am on the homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "GuestCheckoutSmokeTestStepDefinitions.i_am_not_a_registered_user()"
});
formatter.result({
  "duration": 67327,
  "status": "passed"
});
formatter.match({
  "location": "CommonPageStepDefinitons.i_am_on_the_homepage()"
});
formatter.result({
  "duration": 19443376,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Navigating to Checkout page",
  "description": "",
  "id": "guest-checkout-smoke-test;navigating-to-checkout-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "I have product in my cart",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I click on the shopping cart icon",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "click on the checkout button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I am taken to Checkout page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "options are displayed to checkout as guest, register and checkout, or login as a returning customer.",
  "keyword": "And "
});
formatter.match({
  "location": "MiniCartStepDefinitions.i_have_product_in_my_cart()"
});
formatter.result({
  "duration": 16899098097,
  "status": "passed"
});
formatter.match({
  "location": "MiniCartStepDefinitions.i_click_on_the_shopping_cart_icon()"
});
formatter.result({
  "duration": 72778821,
  "status": "passed"
});
formatter.match({
  "location": "GuestCheckoutSmokeTestStepDefinitions.click_on_the_checkout_button()"
});
formatter.result({
  "duration": 2969718478,
  "status": "passed"
});
formatter.match({
  "location": "GuestCheckoutSmokeTestStepDefinitions.i_am_taken_to_Checkout_page()"
});
formatter.result({
  "duration": 111908088,
  "status": "passed"
});
formatter.match({
  "location": "GuestCheckoutSmokeTestStepDefinitions.options_are_displayed_to_checkout_as_guest_register_and_checkout_or_login_as_a_returning_customer()"
});
formatter.result({
  "duration": 124226549,
  "status": "passed"
});
formatter.after({
  "duration": 5188,
  "status": "passed"
});
formatter.before({
  "duration": 782148907,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am not a registered user",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I am on the homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "GuestCheckoutSmokeTestStepDefinitions.i_am_not_a_registered_user()"
});
formatter.result({
  "duration": 22894,
  "status": "passed"
});
formatter.match({
  "location": "CommonPageStepDefinitons.i_am_on_the_homepage()"
});
formatter.result({
  "duration": 34617082,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Checking out as guest",
  "description": "",
  "id": "guest-checkout-smoke-test;checking-out-as-guest",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 16,
  "name": "I have product in my cart",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "I am on checkout page",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I checkout as a guest",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "I am able to complete my purchase",
  "keyword": "Then "
});
formatter.match({
  "location": "MiniCartStepDefinitions.i_have_product_in_my_cart()"
});
formatter.result({
  "duration": 16793951015,
  "status": "passed"
});
formatter.match({
  "location": "GuestCheckoutSmokeTestStepDefinitions.i_am_on_checkout_page()"
});
formatter.result({
  "duration": 2678269653,
  "status": "passed"
});
formatter.match({
  "location": "GuestCheckoutSmokeTestStepDefinitions.i_checkout_as_a_guest()"
});
formatter.result({
  "duration": 155091246,
  "status": "passed"
});
formatter.match({
  "location": "GuestCheckoutSmokeTestStepDefinitions.i_am_able_to_complete_my_purchase()"
});
formatter.result({
  "duration": 41609327368,
  "status": "passed"
});
formatter.after({
  "duration": 5419,
  "status": "passed"
});
formatter.uri("LoginorCreateanAccountSmokeTest.feature");
formatter.feature({
  "line": 2,
  "name": "Smoke testing to make sure login page is working",
  "description": "",
  "id": "smoke-testing-to-make-sure-login-page-is-working",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@NoInput"
    },
    {
      "line": 1,
      "name": "@All"
    }
  ]
});
formatter.before({
  "duration": 817855624,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Navigating to Login or Create an Account page",
  "description": "",
  "id": "smoke-testing-to-make-sure-login-page-is-working;navigating-to-login-or-create-an-account-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on client website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I am not logged into an account",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I click on login/register link",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I am taken to login or create an Account page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinitions.i_am_on_client_website()"
});
formatter.result({
  "duration": 22405503,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinitions.i_am_not_logged_into_an_account()"
});
formatter.result({
  "duration": 935697390,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinitions.i_click_on_login_register_link()"
});
formatter.result({
  "duration": 805594819,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinitions.i_am_taken_to_login_or_create_an_Account_page()"
});
formatter.result({
  "duration": 134624970,
  "status": "passed"
});
formatter.after({
  "duration": 5827,
  "status": "passed"
});
formatter.before({
  "duration": 817248425,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Logging in",
  "description": "",
  "id": "smoke-testing-to-make-sure-login-page-is-working;logging-in",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "I am on Login or Create an Account page",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I am a registered user",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I put in my credentials",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "click on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I am able to successfully log in",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinitions.i_am_on_Login_or_Create_an_Account_page()"
});
formatter.result({
  "duration": 1043898448,
  "status": "passed"
});
formatter.match({
  "location": "RegisteredUserCheckoutStepDefinitions.i_am_a_registered_user()"
});
formatter.result({
  "duration": 26979,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinitions.i_put_in_my_credentials()"
});
formatter.result({
  "duration": 239117322,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinitions.click_on_the_login_button()"
});
formatter.result({
  "duration": 2659140536,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinitions.i_am_able_to_successfully_log_in()"
});
formatter.result({
  "duration": 150328757,
  "status": "passed"
});
formatter.after({
  "duration": 23054,
  "status": "passed"
});
formatter.uri("MainNavigationSmokeTest.feature");
formatter.feature({
  "line": 2,
  "name": "Smoke testing to make sure the Main Navigation works",
  "description": "",
  "id": "smoke-testing-to-make-sure-the-main-navigation-works",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@NoInput"
    },
    {
      "line": 1,
      "name": "@All"
    }
  ]
});
formatter.before({
  "duration": 750736252,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Hovering over Main Navigation links",
  "description": "",
  "id": "smoke-testing-to-make-sure-the-main-navigation-works;hovering-over-main-navigation-links",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Runme"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on a page where Main Navigation is visible",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I hover over main navigation links",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "corresponding menu dropdown displays",
  "keyword": "Then "
});
formatter.match({
  "location": "MainNavStepDefinitions.i_am_on_a_page_where_Main_Navigation_is_visible()"
});
formatter.result({
  "duration": 21137790,
  "status": "passed"
});
formatter.match({
  "location": "MainNavStepDefinitions.i_hover_over_main_navigation_links()"
});
formatter.result({
  "duration": 1135485360,
  "status": "passed"
});
formatter.match({
  "location": "MainNavStepDefinitions.corresponding_menu_dropdown_displays()"
});
formatter.result({
  "duration": 21086,
  "status": "passed"
});
formatter.after({
  "duration": 5500,
  "status": "passed"
});
formatter.before({
  "duration": 767419422,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "clicking on category link from main navigation",
  "description": "",
  "id": "smoke-testing-to-make-sure-the-main-navigation-works;clicking-on-category-link-from-main-navigation",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@Runme"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "I am on a page where Main Navigation is visible",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "I click on product category link",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "I am taken to product category page",
  "keyword": "Then "
});
formatter.match({
  "location": "MainNavStepDefinitions.i_am_on_a_page_where_Main_Navigation_is_visible()"
});
formatter.result({
  "duration": 12308166,
  "status": "passed"
});
formatter.match({
  "location": "MainNavStepDefinitions.i_click_on_product_category_link()"
});
formatter.result({
  "duration": 13564334814,
  "status": "passed"
});
formatter.match({
  "location": "MainNavStepDefinitions.i_am_taken_to_product_category_page()"
});
formatter.result({
  "duration": 20869,
  "status": "passed"
});
formatter.after({
  "duration": 4703,
  "status": "passed"
});
formatter.before({
  "duration": 770602300,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "clicking on subcategory link from main navigation",
  "description": "",
  "id": "smoke-testing-to-make-sure-the-main-navigation-works;clicking-on-subcategory-link-from-main-navigation",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 18,
      "name": "@Runme"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "I am on a page where Main Navigation is visible",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "I click on product subcategory link",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "I am taken to product subcategory page",
  "keyword": "Then "
});
formatter.match({
  "location": "MainNavStepDefinitions.i_am_on_a_page_where_Main_Navigation_is_visible()"
});
formatter.result({
  "duration": 24789129,
  "status": "passed"
});
formatter.match({
  "location": "MainNavStepDefinitions.i_click_on_product_subcategory_link()"
});
formatter.result({
  "duration": 43588726402,
  "status": "passed"
});
formatter.match({
  "location": "MainNavStepDefinitions.i_am_taken_to_product_subcategory_page()"
});
formatter.result({
  "duration": 20911,
  "status": "passed"
});
formatter.after({
  "duration": 4977,
  "status": "passed"
});
formatter.uri("MiniCartSmokeTest.feature");
formatter.feature({
  "line": 2,
  "name": "Smoke tests to make sure mini cart is functioning",
  "description": "",
  "id": "smoke-tests-to-make-sure-mini-cart-is-functioning",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@NoInput"
    },
    {
      "line": 1,
      "name": "@All"
    }
  ]
});
formatter.before({
  "duration": 809759908,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on the homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "mini cart function is enabled",
  "keyword": "Given "
});
formatter.match({
  "location": "CommonPageStepDefinitons.i_am_on_the_homepage()"
});
formatter.result({
  "duration": 34340330,
  "status": "passed"
});
formatter.match({
  "location": "MiniCartStepDefinitions.mini_cart_function_is_enabled()"
});
formatter.result({
  "duration": 1064771712,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Viewing mini cart",
  "description": "",
  "id": "smoke-tests-to-make-sure-mini-cart-is-functioning;viewing-mini-cart",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "I am on any page of client website",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I click on the shopping cart icon",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "the mini cart should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "MiniCartStepDefinitions.i_am_on_any_page_of_client_website()"
});
formatter.result({
  "duration": 783165227,
  "status": "passed"
});
formatter.match({
  "location": "MiniCartStepDefinitions.i_click_on_the_shopping_cart_icon()"
});
formatter.result({
  "duration": 184960600,
  "status": "passed"
});
formatter.match({
  "location": "MiniCartStepDefinitions.the_mini_cart_should_be_displayed()"
});
formatter.result({
  "duration": 3061573620,
  "status": "passed"
});
formatter.after({
  "duration": 4677,
  "status": "passed"
});
formatter.before({
  "duration": 818462170,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on the homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "mini cart function is enabled",
  "keyword": "Given "
});
formatter.match({
  "location": "CommonPageStepDefinitons.i_am_on_the_homepage()"
});
formatter.result({
  "duration": 826392921,
  "status": "passed"
});
formatter.match({
  "location": "MiniCartStepDefinitions.mini_cart_function_is_enabled()"
});
formatter.result({
  "duration": 265858537,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Viewing mini cart with product",
  "description": "",
  "id": "smoke-tests-to-make-sure-mini-cart-is-functioning;viewing-mini-cart-with-product",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "I am on any page of client website",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I have product in my cart",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I click on the shopping cart icon",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "the mini cart should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "up to the last three items added to the cart should be displayed",
  "keyword": "And "
});
formatter.match({
  "location": "MiniCartStepDefinitions.i_am_on_any_page_of_client_website()"
});
formatter.result({
  "duration": 687130608,
  "status": "passed"
});
formatter.match({
  "location": "MiniCartStepDefinitions.i_have_product_in_my_cart()"
});
formatter.result({
  "duration": 15987376499,
  "status": "passed"
});
formatter.match({
  "location": "MiniCartStepDefinitions.i_click_on_the_shopping_cart_icon()"
});
formatter.result({
  "duration": 73457279,
  "status": "passed"
});
formatter.match({
  "location": "MiniCartStepDefinitions.the_mini_cart_should_be_displayed()"
});
formatter.result({
  "duration": 3026202869,
  "status": "passed"
});
formatter.match({
  "location": "MiniCartStepDefinitions.up_to_the_last_three_items_added_to_the_cart_should_be_displayed()"
});
formatter.result({
  "duration": 88785225,
  "status": "passed"
});
formatter.after({
  "duration": 5890,
  "status": "passed"
});
formatter.before({
  "duration": 842082842,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on the homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "mini cart function is enabled",
  "keyword": "Given "
});
formatter.match({
  "location": "CommonPageStepDefinitons.i_am_on_the_homepage()"
});
formatter.result({
  "duration": 800679073,
  "status": "passed"
});
formatter.match({
  "location": "MiniCartStepDefinitions.mini_cart_function_is_enabled()"
});
formatter.result({
  "duration": 275171658,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Viewing mini cart without product",
  "description": "",
  "id": "smoke-tests-to-make-sure-mini-cart-is-functioning;viewing-mini-cart-without-product",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 21,
  "name": "I am on any page of client website",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "I don’t have product in my cart",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I click on the shopping cart icon",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "the mini cart should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "a message stating you have no items in your cart should be displayed",
  "keyword": "And "
});
formatter.match({
  "location": "MiniCartStepDefinitions.i_am_on_any_page_of_client_website()"
});
formatter.result({
  "duration": 863465173,
  "status": "passed"
});
formatter.match({
  "location": "MiniCartStepDefinitions.i_don_t_have_product_in_my_cart()"
});
formatter.result({
  "duration": 16799,
  "status": "passed"
});
formatter.match({
  "location": "MiniCartStepDefinitions.i_click_on_the_shopping_cart_icon()"
});
formatter.result({
  "duration": 182859889,
  "status": "passed"
});
formatter.match({
  "location": "MiniCartStepDefinitions.the_mini_cart_should_be_displayed()"
});
formatter.result({
  "duration": 3023258469,
  "status": "passed"
});
formatter.match({
  "location": "MiniCartStepDefinitions.a_message_stating_you_have_no_items_in_your_cart_should_be_displayed()"
});
formatter.result({
  "duration": 35773080,
  "status": "passed"
});
formatter.after({
  "duration": 4856,
  "status": "passed"
});
formatter.before({
  "duration": 861723597,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on the homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "mini cart function is enabled",
  "keyword": "Given "
});
formatter.match({
  "location": "CommonPageStepDefinitons.i_am_on_the_homepage()"
});
formatter.result({
  "duration": 17570955,
  "status": "passed"
});
formatter.match({
  "location": "MiniCartStepDefinitions.mini_cart_function_is_enabled()"
});
formatter.result({
  "duration": 982258700,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "Editing items in mini cart",
  "description": "",
  "id": "smoke-tests-to-make-sure-mini-cart-is-functioning;editing-items-in-mini-cart",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 28,
  "name": "I have product in my cart",
  "keyword": "Given "
});
formatter.step({
  "line": 29,
  "name": "I am in mini cart",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I click on the edit link for one of the products",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "I am taken to product detail page",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "an update cart button is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "MiniCartStepDefinitions.i_have_product_in_my_cart()"
});
formatter.result({
  "duration": 16162956527,
  "status": "passed"
});
formatter.match({
  "location": "MiniCartStepDefinitions.i_am_in_mini_cart()"
});
formatter.result({
  "duration": 74283157,
  "status": "passed"
});
formatter.match({
  "location": "MiniCartStepDefinitions.i_click_on_the_edit_link_for_one_of_the_products()"
});
formatter.result({
  "duration": 1841243434,
  "status": "passed"
});
formatter.match({
  "location": "MiniCartStepDefinitions.i_am_taken_to_product_detail_page()"
});
formatter.result({
  "duration": 273894023,
  "status": "passed"
});
formatter.match({
  "location": "MiniCartStepDefinitions.an_update_cart_button_is_displayed()"
});
formatter.result({
  "duration": 40555871,
  "status": "passed"
});
formatter.after({
  "duration": 5057,
  "status": "passed"
});
formatter.before({
  "duration": 758305990,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on the homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "mini cart function is enabled",
  "keyword": "Given "
});
formatter.match({
  "location": "CommonPageStepDefinitons.i_am_on_the_homepage()"
});
formatter.result({
  "duration": 853484996,
  "status": "passed"
});
formatter.match({
  "location": "MiniCartStepDefinitions.mini_cart_function_is_enabled()"
});
formatter.result({
  "duration": 275729256,
  "status": "passed"
});
formatter.scenario({
  "line": 34,
  "name": "Removing items in mini cart",
  "description": "",
  "id": "smoke-tests-to-make-sure-mini-cart-is-functioning;removing-items-in-mini-cart",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 35,
  "name": "I have product in my cart",
  "keyword": "Given "
});
formatter.step({
  "line": 36,
  "name": "I am in mini cart",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "I click on the remove item link",
  "keyword": "When "
});
formatter.step({
  "line": 38,
  "name": "click on the OK button in the following alert",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "product is removed from my cart",
  "keyword": "Then "
});
formatter.step({
  "line": 40,
  "name": "a message stating product was successfully removed is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "MiniCartStepDefinitions.i_have_product_in_my_cart()"
});
formatter.result({
  "duration": 16512990595,
  "status": "passed"
});
formatter.match({
  "location": "MiniCartStepDefinitions.i_am_in_mini_cart()"
});
formatter.result({
  "duration": 71463081,
  "status": "passed"
});
formatter.match({
  "location": "MiniCartStepDefinitions.i_click_on_the_remove_item_link()"
});
formatter.result({
  "duration": 340057711,
  "status": "passed"
});
formatter.match({
  "location": "MiniCartStepDefinitions.click_on_the_OK_button_in_the_following_alert()"
});
formatter.result({
  "duration": 299144371,
  "status": "passed"
});
formatter.match({
  "location": "MiniCartStepDefinitions.product_is_removed_from_my_cart()"
});
formatter.result({
  "duration": 30368773257,
  "status": "passed"
});
formatter.match({
  "location": "MiniCartStepDefinitions.a_message_stating_product_was_successfully_removed_is_displayed()"
});
formatter.result({
  "duration": 19307070,
  "status": "passed"
});
formatter.after({
  "duration": 5203,
  "status": "passed"
});
formatter.uri("MyAccountSmokeTest.feature");
formatter.feature({
  "line": 2,
  "name": "Smoke testing to make sure my account is functioning",
  "description": "",
  "id": "smoke-testing-to-make-sure-my-account-is-functioning",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@NoInput"
    },
    {
      "line": 1,
      "name": "@All"
    }
  ]
});
formatter.before({
  "duration": 878238444,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Navigating to my account page",
  "description": "",
  "id": "smoke-testing-to-make-sure-my-account-is-functioning;navigating-to-my-account-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am a registered user",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I am logged in",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I click on the My Account link",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I am taken to the My Account page",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisteredUserCheckoutStepDefinitions.i_am_a_registered_user()"
});
formatter.result({
  "duration": 27198,
  "status": "passed"
});
formatter.match({
  "location": "RegisteredUserCheckoutStepDefinitions.i_am_logged_in()"
});
formatter.result({
  "duration": 5376281872,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountStepDefinitions.i_click_on_the_My_Account_link()"
});
formatter.result({
  "duration": 3142107523,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountStepDefinitions.i_am_taken_to_the_My_Account_page()"
});
formatter.result({
  "duration": 139537941,
  "status": "passed"
});
formatter.after({
  "duration": 4603,
  "status": "passed"
});
formatter.before({
  "duration": 843482300,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Editing contact information",
  "description": "",
  "id": "smoke-testing-to-make-sure-my-account-is-functioning;editing-contact-information",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "I am logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I am on My Account Dashboard page",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I want to Edit my contact information",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click on the edit contact link",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "I am able to successfully edit my contact information",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisteredUserCheckoutStepDefinitions.i_am_logged_in()"
});
formatter.result({
  "duration": 5324372635,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountStepDefinitions.i_am_on_My_Account_Dashboard_page()"
});
formatter.result({
  "duration": 1956383160,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountStepDefinitions.i_want_to_Edit_my_contact_information()"
});
formatter.result({
  "duration": 16382,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountStepDefinitions.i_click_on_the_edit_contact_link()"
});
formatter.result({
  "duration": 1530180674,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountStepDefinitions.i_am_able_to_successfully_edit_my_contact_information()"
});
formatter.result({
  "duration": 4776869407,
  "status": "passed"
});
formatter.after({
  "duration": 5128,
  "status": "passed"
});
formatter.before({
  "duration": 859432908,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Editing address information",
  "description": "",
  "id": "smoke-testing-to-make-sure-my-account-is-functioning;editing-address-information",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 18,
  "name": "I am logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "I am on My Account Dashboard page",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I want to Edit my address information",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I click on the edit address link",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "I am able to successfully edit my address information",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisteredUserCheckoutStepDefinitions.i_am_logged_in()"
});
formatter.result({
  "duration": 5518150406,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountStepDefinitions.i_am_on_My_Account_Dashboard_page()"
});
formatter.result({
  "duration": 1849757788,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountStepDefinitions.i_want_to_Edit_my_address_information()"
});
formatter.result({
  "duration": 23683,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountStepDefinitions.i_click_on_the_edit_address_link()"
});
formatter.result({
  "duration": 1616777434,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountStepDefinitions.i_am_able_to_successfully_edit_my_address_information()"
});
formatter.result({
  "duration": 6325161050,
  "status": "passed"
});
formatter.after({
  "duration": 5408,
  "status": "passed"
});
formatter.uri("NewsletterSmokeTest.feature");
formatter.feature({
  "line": 2,
  "name": "Smoke test to make sure newsletter function is working",
  "description": "",
  "id": "smoke-test-to-make-sure-newsletter-function-is-working",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@NoInput"
    },
    {
      "line": 1,
      "name": "@All"
    }
  ]
});
formatter.before({
  "duration": 843038163,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Subscribing to newsletter",
  "description": "",
  "id": "smoke-test-to-make-sure-newsletter-function-is-working;subscribing-to-newsletter",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on client website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I want to subscribe to their newsletter",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I type in my email address",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "click the subscribe button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I am successfully subscribed to their newsletter",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinitions.i_am_on_client_website()"
});
formatter.result({
  "duration": 799616780,
  "status": "passed"
});
formatter.match({
  "location": "NewsLetterStepDefinitions.i_want_to_subscribe_to_their_newsletter()"
});
formatter.result({
  "duration": 83957,
  "status": "passed"
});
formatter.match({
  "location": "NewsLetterStepDefinitions.i_type_in_my_email_address()"
});
formatter.result({
  "duration": 201115280,
  "status": "passed"
});
formatter.match({
  "location": "NewsLetterStepDefinitions.click_the_subscribe_button()"
});
formatter.result({
  "duration": 1429789358,
  "status": "passed"
});
formatter.match({
  "location": "NewsLetterStepDefinitions.i_am_successfully_subscribed_to_their_newsletter()"
});
formatter.result({
  "duration": 170193364,
  "status": "passed"
});
formatter.after({
  "duration": 8227,
  "status": "passed"
});
formatter.uri("OrdersSmokeTest.feature");
formatter.feature({
  "line": 2,
  "name": "Smoketest to make sure orders page is functioning",
  "description": "",
  "id": "smoketest-to-make-sure-orders-page-is-functioning",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@NoInput"
    },
    {
      "line": 1,
      "name": "@All"
    }
  ]
});
formatter.before({
  "duration": 760221727,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Navigating to Orders page",
  "description": "",
  "id": "smoketest-to-make-sure-orders-page-is-functioning;navigating-to-orders-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I am on my account page",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I click on the orders link",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I am taken to my orders page",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisteredUserCheckoutStepDefinitions.i_am_logged_in()"
});
formatter.result({
  "duration": 5252388779,
  "status": "passed"
});
formatter.match({
  "location": "OrdersStepDefinitions.i_am_on_my_account_page()"
});
formatter.result({
  "duration": 2027727796,
  "status": "passed"
});
formatter.match({
  "location": "OrdersStepDefinitions.i_click_on_the_orders_link()"
});
formatter.result({
  "duration": 1507016023,
  "status": "passed"
});
formatter.match({
  "location": "OrdersStepDefinitions.i_am_taken_to_my_orders_page()"
});
formatter.result({
  "duration": 144132347,
  "status": "passed"
});
formatter.after({
  "duration": 5493,
  "status": "passed"
});
formatter.before({
  "duration": 931657114,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "I have not placed any orders",
  "description": "",
  "id": "smoketest-to-make-sure-orders-page-is-functioning;i-have-not-placed-any-orders",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "I am logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I am on my orders page",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I have not placed any orders",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "a message displays saying I have not placed any orders",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisteredUserCheckoutStepDefinitions.i_am_logged_in()"
});
formatter.result({
  "duration": 5503916374,
  "status": "passed"
});
formatter.match({
  "location": "OrdersStepDefinitions.i_am_on_my_orders_page()"
});
formatter.result({
  "duration": 3395142304,
  "status": "passed"
});
formatter.match({
  "location": "OrdersStepDefinitions.i_have_not_placed_any_orders()"
});
formatter.result({
  "duration": 16900,
  "status": "passed"
});
formatter.match({
  "location": "OrdersStepDefinitions.a_message_displays_saying_I_have_not_placed_any_orders()"
});
formatter.result({
  "duration": 51289540,
  "status": "passed"
});
formatter.after({
  "duration": 5293,
  "status": "passed"
});
formatter.before({
  "duration": 839160610,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Viewing order",
  "description": "",
  "id": "smoketest-to-make-sure-orders-page-is-functioning;viewing-order",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 17,
  "name": "I am logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "I am on my orders page",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I have placed an order",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I click on the View Order Link",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "I am taken to order detail page",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisteredUserCheckoutStepDefinitions.i_am_logged_in()"
});
formatter.result({
  "duration": 5391390312,
  "status": "passed"
});
formatter.match({
  "location": "OrdersStepDefinitions.i_am_on_my_orders_page()"
});
formatter.result({
  "duration": 3475758908,
  "status": "passed"
});
formatter.match({
  "location": "OrdersStepDefinitions.i_have_placed_an_order()"
});
formatter.result({
  "duration": 18572,
  "status": "passed"
});
formatter.match({
  "location": "OrdersStepDefinitions.i_click_on_the_View_Order_Link()"
});
formatter.result({
  "duration": 11922,
  "status": "passed"
});
formatter.match({
  "location": "OrdersStepDefinitions.i_am_taken_to_order_detail_page()"
});
formatter.result({
  "duration": 9849,
  "status": "passed"
});
formatter.after({
  "duration": 4010,
  "status": "passed"
});
formatter.uri("PageNotFound.feature");
formatter.feature({
  "line": 2,
  "name": "Smoketest to make sure page not found is functioning",
  "description": "",
  "id": "smoketest-to-make-sure-page-not-found-is-functioning",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@NoInput"
    },
    {
      "line": 1,
      "name": "@All"
    }
  ]
});
formatter.before({
  "duration": 895504716,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User is on page with invalid URL",
  "description": "",
  "id": "smoketest-to-make-sure-page-not-found-is-functioning;user-is-on-page-with-invalid-url",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on client website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I type in invalid URL for website",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "press enter",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I am taken to Page not found page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinitions.i_am_on_client_website()"
});
formatter.result({
  "duration": 13736565,
  "status": "passed"
});
formatter.match({
  "location": "PageNotFoundStepDefinitions.i_type_in_invalid_URL_for_website()"
});
formatter.result({
  "duration": 21301958,
  "status": "passed"
});
formatter.match({
  "location": "PageNotFoundStepDefinitions.press_enter()"
});
formatter.result({
  "duration": 41406,
  "status": "passed"
});
formatter.match({
  "location": "PageNotFoundStepDefinitions.i_am_taken_to_Page_not_found_page()"
});
formatter.result({
  "duration": 1431629202,
  "status": "passed"
});
formatter.after({
  "duration": 4818,
  "status": "passed"
});
formatter.before({
  "duration": 845822443,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Navigating to homepage from page not found",
  "description": "",
  "id": "smoketest-to-make-sure-page-not-found-is-functioning;navigating-to-homepage-from-page-not-found",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "I am on Page not found page",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I click the homepage link",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I am taken to homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "PageNotFoundStepDefinitions.i_am_on_Page_not_found_page()"
});
formatter.result({
  "duration": 795557787,
  "status": "passed"
});
formatter.match({
  "location": "PageNotFoundStepDefinitions.i_click_the_homepage_link()"
});
formatter.result({
  "duration": 866636023,
  "status": "passed"
});
formatter.match({
  "location": "PageNotFoundStepDefinitions.i_am_taken_to_homepage()"
});
formatter.result({
  "duration": 117926125,
  "status": "passed"
});
formatter.after({
  "duration": 5655,
  "status": "passed"
});
formatter.uri("PrivacyPolicySmokeTest.feature");
formatter.feature({
  "line": 2,
  "name": "smoketest to make sure privacy policy page is functioning",
  "description": "",
  "id": "smoketest-to-make-sure-privacy-policy-page-is-functioning",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@NoInput"
    },
    {
      "line": 1,
      "name": "@All"
    }
  ]
});
formatter.before({
  "duration": 777872375,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Navigating to privacy policy page",
  "description": "",
  "id": "smoketest-to-make-sure-privacy-policy-page-is-functioning;navigating-to-privacy-policy-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "client website has a privacy policy page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on the privacy policy link",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I am taken to the privacy policy page",
  "keyword": "Then "
});
formatter.match({
  "location": "PrivacyPolicyStepDefinitions.client_website_has_a_privacy_policy_page()"
});
formatter.result({
  "duration": 124091294,
  "status": "passed"
});
formatter.match({
  "location": "PrivacyPolicyStepDefinitions.i_click_on_the_privacy_policy_link()"
});
formatter.result({
  "duration": 803118780,
  "status": "passed"
});
formatter.match({
  "location": "PrivacyPolicyStepDefinitions.i_am_taken_to_the_privacy_policy_page()"
});
formatter.result({
  "duration": 158166520,
  "status": "passed"
});
formatter.after({
  "duration": 5996,
  "status": "passed"
});
formatter.uri("RegisteredUserCheckoutSmokeTest.feature");
formatter.feature({
  "line": 2,
  "name": "Smoketesting to test registered user checkout",
  "description": "",
  "id": "smoketesting-to-test-registered-user-checkout",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@NoInput"
    },
    {
      "line": 1,
      "name": "@All"
    }
  ]
});
formatter.before({
  "duration": 723485813,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am a registered user",
  "keyword": "Given "
});
formatter.match({
  "location": "RegisteredUserCheckoutStepDefinitions.i_am_a_registered_user()"
});
formatter.result({
  "duration": 30261,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Navigating to Checkout page when I’m a registered user and logged in",
  "description": "",
  "id": "smoketesting-to-test-registered-user-checkout;navigating-to-checkout-page-when-i’m-a-registered-user-and-logged-in",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "I am logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I have product in my cart",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on the shopping cart icon",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "click on the checkout button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I am taken to Checkout page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "There is no option for guest checkout",
  "keyword": "And "
});
formatter.match({
  "location": "RegisteredUserCheckoutStepDefinitions.i_am_logged_in()"
});
formatter.result({
  "duration": 5428751998,
  "status": "passed"
});
formatter.match({
  "location": "MiniCartStepDefinitions.i_have_product_in_my_cart()"
});
formatter.result({
  "duration": 22231359858,
  "status": "passed"
});
formatter.match({
  "location": "MiniCartStepDefinitions.i_click_on_the_shopping_cart_icon()"
});
formatter.result({
  "duration": 74054323,
  "status": "passed"
});
formatter.match({
  "location": "GuestCheckoutSmokeTestStepDefinitions.click_on_the_checkout_button()"
});
formatter.result({
  "duration": 2346361307,
  "status": "passed"
});
formatter.match({
  "location": "GuestCheckoutSmokeTestStepDefinitions.i_am_taken_to_Checkout_page()"
});
formatter.result({
  "duration": 110552968,
  "status": "passed"
});
formatter.match({
  "location": "RegisteredUserCheckoutStepDefinitions.there_is_no_option_for_guest_checkout()"
});
formatter.result({
  "duration": 30418282238,
  "status": "passed"
});
formatter.after({
  "duration": 5519,
  "status": "passed"
});
formatter.before({
  "duration": 888683582,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am a registered user",
  "keyword": "Given "
});
formatter.match({
  "location": "RegisteredUserCheckoutStepDefinitions.i_am_a_registered_user()"
});
formatter.result({
  "duration": 24018,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Navigating to Checkout page when I’m a registered user and not logged in",
  "description": "",
  "id": "smoketesting-to-test-registered-user-checkout;navigating-to-checkout-page-when-i’m-a-registered-user-and-not-logged-in",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 16,
  "name": "I am not logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "I have product in my cart",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I click on the shopping cart icon",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "click on the checkout button",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I am taken to Checkout page",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "options are displayed to checkout as guest, register and checkout, or login as a returning customer.",
  "keyword": "And "
});
formatter.match({
  "location": "RegisteredUserCheckoutStepDefinitions.i_am_not_logged_in()"
});
formatter.result({
  "duration": 194116912,
  "status": "passed"
});
formatter.match({
  "location": "MiniCartStepDefinitions.i_have_product_in_my_cart()"
});
formatter.result({
  "duration": 15885595749,
  "status": "passed"
});
formatter.match({
  "location": "MiniCartStepDefinitions.i_click_on_the_shopping_cart_icon()"
});
formatter.result({
  "duration": 82747533,
  "status": "passed"
});
formatter.match({
  "location": "GuestCheckoutSmokeTestStepDefinitions.click_on_the_checkout_button()"
});
formatter.result({
  "duration": 2213398257,
  "status": "passed"
});
formatter.match({
  "location": "GuestCheckoutSmokeTestStepDefinitions.i_am_taken_to_Checkout_page()"
});
formatter.result({
  "duration": 113614999,
  "status": "passed"
});
formatter.match({
  "location": "GuestCheckoutSmokeTestStepDefinitions.options_are_displayed_to_checkout_as_guest_register_and_checkout_or_login_as_a_returning_customer()"
});
formatter.result({
  "duration": 113631994,
  "status": "passed"
});
formatter.after({
  "duration": 6568,
  "status": "passed"
});
formatter.before({
  "duration": 820227913,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am a registered user",
  "keyword": "Given "
});
formatter.match({
  "location": "RegisteredUserCheckoutStepDefinitions.i_am_a_registered_user()"
});
formatter.result({
  "duration": 25274,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "Checking out as a registered user",
  "description": "",
  "id": "smoketesting-to-test-registered-user-checkout;checking-out-as-a-registered-user",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 24,
  "name": "I am logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "I have product in my cart",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I checkout as a registered user",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "I am able to complete my purchase as a registered user",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisteredUserCheckoutStepDefinitions.i_am_logged_in()"
});
formatter.result({
  "duration": 5365509023,
  "status": "passed"
});
formatter.match({
  "location": "MiniCartStepDefinitions.i_have_product_in_my_cart()"
});
formatter.result({
  "duration": 22128633276,
  "status": "passed"
});
formatter.match({
  "location": "RegisteredUserCheckoutStepDefinitions.i_checkout_as_a_registered_user()"
});
formatter.result({
  "duration": 3307347092,
  "status": "passed"
});
formatter.match({
  "location": "RegisteredUserCheckoutStepDefinitions.i_am_able_to_complete_my_purchase_as_a_registered_user()"
});
formatter.result({
  "duration": 11673201033,
  "status": "passed"
});
formatter.after({
  "duration": 6978,
  "status": "passed"
});
formatter.uri("Search.feature");
formatter.feature({
  "line": 2,
  "name": "Smoke testing to make sure search works",
  "description": "",
  "id": "smoke-testing-to-make-sure-search-works",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@NoInput"
    },
    {
      "line": 1,
      "name": "@All"
    },
    {
      "line": 1,
      "name": "@Example"
    }
  ]
});
formatter.before({
  "duration": 878452710,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Searching for product",
  "description": "",
  "id": "smoke-testing-to-make-sure-search-works;searching-for-product",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Runme"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "you are on any page in the website",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I search for \"BASKETBALL\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "search results page should be displayed with related product",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchStepDefinitions.you_are_on_any_page_in_the_website()"
});
formatter.result({
  "duration": 15613440,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BASKETBALL",
      "offset": 14
    }
  ],
  "location": "SearchStepDefinitions.i_search_for(String)"
});
formatter.result({
  "duration": 3043868752,
  "status": "passed"
});
formatter.match({
  "location": "SearchStepDefinitions.search_results_page_should_be_displayed_with_related_product()"
});
formatter.result({
  "duration": 18613,
  "status": "passed"
});
formatter.after({
  "duration": 4972,
  "status": "passed"
});
formatter.before({
  "duration": 836893736,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Navigating to Product detail page from search results page",
  "description": "",
  "id": "smoke-testing-to-make-sure-search-works;navigating-to-product-detail-page-from-search-results-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@Runme"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "that I am on a search results page",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I select a product Image/Name",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I should be directed to that product’s detail page",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchStepDefinitions.that_I_am_on_a_search_results_page()"
});
formatter.result({
  "duration": 2580747958,
  "status": "passed"
});
formatter.match({
  "location": "SearchStepDefinitions.i_select_a_product_Image_Name()"
});
formatter.result({
  "duration": 1733904111,
  "status": "passed"
});
formatter.match({
  "location": "SearchStepDefinitions.i_should_be_directed_to_that_product_s_detail_page()"
});
formatter.result({
  "duration": 21440,
  "status": "passed"
});
formatter.after({
  "duration": 4320,
  "status": "passed"
});
formatter.before({
  "duration": 852771827,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Adding simple product to cart on search results page",
  "description": "",
  "id": "smoke-testing-to-make-sure-search-works;adding-simple-product-to-cart-on-search-results-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@Runme"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "that I am on a search results page",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "there is simple product on the page",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I click the add to cart button",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "page notification displays saying product was added to cart",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "Product is added to cart",
  "keyword": "And "
});
formatter.match({
  "location": "SearchStepDefinitions.that_I_am_on_a_search_results_page()"
});
formatter.result({
  "duration": 2617977787,
  "status": "passed"
});
formatter.match({
  "location": "SearchStepDefinitions.there_is_simple_product_on_the_page()"
});
formatter.result({
  "duration": 1848909907,
  "status": "passed"
});
formatter.match({
  "location": "SearchStepDefinitions.i_click_the_add_to_cart_button()"
});
formatter.result({
  "duration": 2823221405,
  "status": "passed"
});
formatter.match({
  "location": "SearchStepDefinitions.page_notification_displays_saying_product_was_added_to_cart()"
});
formatter.result({
  "duration": 129943150,
  "status": "passed"
});
formatter.match({
  "location": "SearchStepDefinitions.product_is_added_to_cart()"
});
formatter.result({
  "duration": 97840343,
  "status": "passed"
});
formatter.after({
  "duration": 5727,
  "status": "passed"
});
formatter.uri("SearchTermsSmokeTest.feature");
formatter.feature({
  "line": 2,
  "name": "Smoketest to make sure search terms page is functioning",
  "description": "",
  "id": "smoketest-to-make-sure-search-terms-page-is-functioning",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@NoInput"
    },
    {
      "line": 1,
      "name": "@All"
    }
  ]
});
formatter.before({
  "duration": 909755332,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Navigating to search terms page",
  "description": "",
  "id": "smoketest-to-make-sure-search-terms-page-is-functioning;navigating-to-search-terms-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I Click on the search terms link",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I am taken to search terms page",
  "keyword": "Then "
});
formatter.match({
  "location": "CommonPageStepDefinitons.i_am_on_home_page()"
});
formatter.result({
  "duration": 829026123,
  "status": "passed"
});
formatter.match({
  "location": "SearchTermsStepDefinitions.i_Click_on_the_search_terms_link()"
});
formatter.result({
  "duration": 759186121,
  "status": "passed"
});
formatter.match({
  "location": "SearchTermsStepDefinitions.i_am_taken_to_search_terms_page()"
});
formatter.result({
  "duration": 151141640,
  "status": "passed"
});
formatter.after({
  "duration": 5819,
  "status": "passed"
});
formatter.before({
  "duration": 895507547,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Clicking on a search term",
  "description": "",
  "id": "smoketest-to-make-sure-search-terms-page-is-functioning;clicking-on-a-search-term",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "I am on search terms page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I click on a search term",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "search results page for that search term is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchTermsStepDefinitions.i_am_on_search_terms_page()"
});
formatter.result({
  "duration": 963235178,
  "status": "passed"
});
formatter.match({
  "location": "SearchTermsStepDefinitions.i_click_on_a_search_term()"
});
formatter.result({
  "duration": 2179451140,
  "status": "passed"
});
formatter.match({
  "location": "SearchTermsStepDefinitions.search_results_page_for_that_search_term_is_displayed()"
});
formatter.result({
  "duration": 153007857,
  "status": "passed"
});
formatter.after({
  "duration": 5959,
  "status": "passed"
});
formatter.uri("ShoppingCartSmokeTest.feature");
formatter.feature({
  "line": 2,
  "name": "Smoke tests to make sure shopping cart is working",
  "description": "",
  "id": "smoke-tests-to-make-sure-shopping-cart-is-working",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@NoInput"
    },
    {
      "line": 1,
      "name": "@All"
    }
  ]
});
formatter.before({
  "duration": 819789131,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Navigating to shopping cart page",
  "description": "",
  "id": "smoke-tests-to-make-sure-shopping-cart-is-working;navigating-to-shopping-cart-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I have product in my cart",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I am on any page in client website",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I click on the shopping cart icon",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "click on the view shopping cart link",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I am taken to shopping cart page",
  "keyword": "Then "
});
formatter.match({
  "location": "MiniCartStepDefinitions.i_have_product_in_my_cart()"
});
formatter.result({
  "duration": 15976769745,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingCartStepDefinitions.i_am_on_any_page_in_client_website()"
});
formatter.result({
  "duration": 3703857162,
  "status": "passed"
});
formatter.match({
  "location": "MiniCartStepDefinitions.i_click_on_the_shopping_cart_icon()"
});
formatter.result({
  "duration": 286774461,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingCartStepDefinitions.click_on_the_view_shopping_cart_link()"
});
formatter.result({
  "duration": 1968246547,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingCartStepDefinitions.i_am_taken_to_shopping_cart_page()"
});
formatter.result({
  "duration": 170190707,
  "status": "passed"
});
formatter.after({
  "duration": 6728,
  "status": "passed"
});
formatter.before({
  "duration": 830541851,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Proceeding to checkout from shopping cart page",
  "description": "",
  "id": "smoke-tests-to-make-sure-shopping-cart-is-working;proceeding-to-checkout-from-shopping-cart-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "I have product in my cart",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I am on shopping cart page",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click on the Proceed to Checkout button",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "I am taken to the Checkout page",
  "keyword": "Then "
});
formatter.match({
  "location": "MiniCartStepDefinitions.i_have_product_in_my_cart()"
});
formatter.result({
  "duration": 15728841326,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingCartStepDefinitions.i_am_on_shopping_cart_page()"
});
formatter.result({
  "duration": 2262502233,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingCartStepDefinitions.i_click_on_the_Proceed_to_Checkout_button()"
});
formatter.result({
  "duration": 2235425394,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingCartStepDefinitions.i_am_taken_to_the_Checkout_page()"
});
formatter.result({
  "duration": 133740971,
  "status": "passed"
});
formatter.after({
  "duration": 5631,
  "status": "passed"
});
formatter.before({
  "duration": 844153473,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Editing item in shopping cart",
  "description": "",
  "id": "smoke-tests-to-make-sure-shopping-cart-is-working;editing-item-in-shopping-cart",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 18,
  "name": "I have product in my cart",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "I am on shopping cart page",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I click on the edit link for a product on the shopping cart page",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "I am taken to product detail page",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "an update cart button is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "MiniCartStepDefinitions.i_have_product_in_my_cart()"
});
formatter.result({
  "duration": 15970752292,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingCartStepDefinitions.i_am_on_shopping_cart_page()"
});
formatter.result({
  "duration": 2330922151,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingCartStepDefinitions.i_click_on_the_edit_link_for_a_product_on_the_shopping_cart_page()"
});
formatter.result({
  "duration": 1772110192,
  "status": "passed"
});
formatter.match({
  "location": "MiniCartStepDefinitions.i_am_taken_to_product_detail_page()"
});
formatter.result({
  "duration": 283907873,
  "status": "passed"
});
formatter.match({
  "location": "MiniCartStepDefinitions.an_update_cart_button_is_displayed()"
});
formatter.result({
  "duration": 41072108,
  "status": "passed"
});
formatter.after({
  "duration": 6696,
  "status": "passed"
});
formatter.before({
  "duration": 800770754,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "Removing items in shopping cart",
  "description": "",
  "id": "smoke-tests-to-make-sure-shopping-cart-is-working;removing-items-in-shopping-cart",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 25,
  "name": "I have product in my cart",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "I am on shopping cart page",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I click on the remove item icon",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "product is removed from shopping cart page",
  "keyword": "Then "
});
formatter.match({
  "location": "MiniCartStepDefinitions.i_have_product_in_my_cart()"
});
formatter.result({
  "duration": 16105644486,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingCartStepDefinitions.i_am_on_shopping_cart_page()"
});
formatter.result({
  "duration": 2294609483,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingCartStepDefinitions.i_click_on_the_remove_item_icon()"
});
formatter.result({
  "duration": 7688722416,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingCartStepDefinitions.product_is_removed_from_shopping_cart_page()"
});
formatter.result({
  "duration": 30620887384,
  "status": "passed"
});
formatter.after({
  "duration": 7761,
  "status": "passed"
});
formatter.before({
  "duration": 943685889,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "Emptying cart",
  "description": "",
  "id": "smoke-tests-to-make-sure-shopping-cart-is-working;emptying-cart",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 31,
  "name": "I have product in my cart",
  "keyword": "Given "
});
formatter.step({
  "line": 32,
  "name": "I am on shopping cart page",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I click on the Empty Cart link",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "all product should be removed from my cart",
  "keyword": "Then "
});
formatter.match({
  "location": "MiniCartStepDefinitions.i_have_product_in_my_cart()"
});
formatter.result({
  "duration": 15861220716,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingCartStepDefinitions.i_am_on_shopping_cart_page()"
});
formatter.result({
  "duration": 2271775311,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingCartStepDefinitions.i_click_on_the_Empty_Cart_link()"
});
formatter.result({
  "duration": 1671209209,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingCartStepDefinitions.all_product_should_be_removed_from_my_cart()"
});
formatter.result({
  "duration": 30608617699,
  "status": "passed"
});
formatter.after({
  "duration": 4186,
  "status": "passed"
});
formatter.before({
  "duration": 905644437,
  "status": "passed"
});
formatter.scenario({
  "line": 37,
  "name": "Updating shopping cart",
  "description": "",
  "id": "smoke-tests-to-make-sure-shopping-cart-is-working;updating-shopping-cart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 36,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 38,
  "name": "I have product in my cart",
  "keyword": "Given "
});
formatter.step({
  "line": 39,
  "name": "I am on shopping cart page",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "I edit the quantity of a product",
  "keyword": "When "
});
formatter.step({
  "line": 41,
  "name": "click on the update button",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "The the product is updated accordingly",
  "keyword": "And "
});
formatter.match({
  "location": "MiniCartStepDefinitions.i_have_product_in_my_cart()"
});
formatter.result({
  "duration": 17081374589,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingCartStepDefinitions.i_am_on_shopping_cart_page()"
});
formatter.result({
  "duration": 2242293545,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingCartStepDefinitions.i_edit_the_quantity_of_a_product()"
});
formatter.result({
  "duration": 3599847055,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingCartStepDefinitions.click_on_the_update_button()"
});
formatter.result({
  "duration": 3282450108,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingCartStepDefinitions.the_the_product_is_updated_accordingly()"
});
formatter.result({
  "duration": 463929866,
  "status": "passed"
});
formatter.after({
  "duration": 5337,
  "status": "passed"
});
formatter.before({
  "duration": 826816722,
  "status": "passed"
});
formatter.scenario({
  "line": 44,
  "name": "Continue shopping",
  "description": "",
  "id": "smoke-tests-to-make-sure-shopping-cart-is-working;continue-shopping",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 45,
  "name": "I have product in my cart",
  "keyword": "Given "
});
formatter.step({
  "line": 46,
  "name": "I am on shopping cart page",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "I want to continue shopping",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "I click on the Continue Shopping link",
  "keyword": "When "
});
formatter.step({
  "line": 49,
  "name": "I am directed to site homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "MiniCartStepDefinitions.i_have_product_in_my_cart()"
});
formatter.result({
  "duration": 16050349903,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingCartStepDefinitions.i_am_on_shopping_cart_page()"
});
formatter.result({
  "duration": 2268283242,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingCartStepDefinitions.i_want_to_continue_shopping()"
});
formatter.result({
  "duration": 19407,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingCartStepDefinitions.i_click_on_the_Continue_Shopping_link()"
});
formatter.result({
  "duration": 1476225194,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingCartStepDefinitions.i_am_directed_to_site_homepage()"
});
formatter.result({
  "duration": 119888643,
  "status": "passed"
});
formatter.after({
  "duration": 6680,
  "status": "passed"
});
formatter.before({
  "duration": 769423120,
  "status": "passed"
});
formatter.scenario({
  "line": 51,
  "name": "Verifying Price",
  "description": "",
  "id": "smoke-tests-to-make-sure-shopping-cart-is-working;verifying-price",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 52,
  "name": "I have product in my cart",
  "keyword": "Given "
});
formatter.step({
  "line": 53,
  "name": "I am on shopping cart page",
  "keyword": "And "
});
formatter.step({
  "line": 54,
  "name": "All subtotal and total prices are correct",
  "keyword": "Then "
});
formatter.match({
  "location": "MiniCartStepDefinitions.i_have_product_in_my_cart()"
});
formatter.result({
  "duration": 16319326883,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingCartStepDefinitions.i_am_on_shopping_cart_page()"
});
formatter.result({
  "duration": 2381495724,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingCartStepDefinitions.all_subtotal_and_total_prices_are_correct()"
});
formatter.result({
  "duration": 321226382,
  "status": "passed"
});
formatter.after({
  "duration": 6769,
  "status": "passed"
});
formatter.uri("SimpleProductSmokeTest.feature");
formatter.feature({
  "line": 2,
  "name": "smoke tests to test simple product page",
  "description": "",
  "id": "smoke-tests-to-test-simple-product-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@NoInput"
    },
    {
      "line": 1,
      "name": "@All"
    }
  ]
});
formatter.before({
  "duration": 851055420,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on a simple product page",
  "keyword": "Given "
});
formatter.match({
  "location": "SimpleProductPageStepDefinitions.i_am_on_a_simple_product_page()"
});
formatter.result({
  "duration": 3183473860,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "I am on a simple product page",
  "description": "",
  "id": "smoke-tests-to-test-simple-product-page;i-am-on-a-simple-product-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@Done1"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "product name, price, and availability should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "SimpleProductPageStepDefinitions.product_name_price_and_availability_should_be_displayed()"
});
formatter.result({
  "duration": 44223554,
  "status": "passed"
});
formatter.after({
  "duration": 6385,
  "status": "passed"
});
formatter.before({
  "duration": 856247921,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on a simple product page",
  "keyword": "Given "
});
formatter.match({
  "location": "SimpleProductPageStepDefinitions.i_am_on_a_simple_product_page()"
});
formatter.result({
  "duration": 3288871490,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "I am on simple product page and product is in stock",
  "description": "",
  "id": "smoke-tests-to-test-simple-product-page;i-am-on-simple-product-page-and-product-is-in-stock",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@Done2"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "that product is in stock",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Add to Cart button should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "editable quantity field should be displayed",
  "keyword": "And "
});
formatter.match({
  "location": "SimpleProductPageStepDefinitions.that_product_is_in_stock()"
});
formatter.result({
  "duration": 15711458,
  "status": "passed"
});
formatter.match({
  "location": "SimpleProductPageStepDefinitions.add_to_Cart_button_should_be_displayed()"
});
formatter.result({
  "duration": 14280282,
  "status": "passed"
});
formatter.match({
  "location": "SimpleProductPageStepDefinitions.editable_quantity_field_should_be_displayed()"
});
formatter.result({
  "duration": 13566671,
  "status": "passed"
});
formatter.after({
  "duration": 5516,
  "status": "passed"
});
formatter.before({
  "duration": 822190347,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on a simple product page",
  "keyword": "Given "
});
formatter.match({
  "location": "SimpleProductPageStepDefinitions.i_am_on_a_simple_product_page()"
});
formatter.result({
  "duration": 3164101828,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Adding simple product to cart",
  "description": "",
  "id": "smoke-tests-to-test-simple-product-page;adding-simple-product-to-cart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@Done3"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "that product is in stock",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I click the Add to Cart button",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "a page notification should be displayed saying product successfully added to cart",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "product should be added to my cart",
  "keyword": "And "
});
formatter.match({
  "location": "SimpleProductPageStepDefinitions.that_product_is_in_stock()"
});
formatter.result({
  "duration": 16327608,
  "status": "passed"
});
formatter.match({
  "location": "SimpleProductPageStepDefinitions.i_click_the_Add_to_Cart_button()"
});
formatter.result({
  "duration": 2604694772,
  "status": "passed"
});
formatter.match({
  "location": "SimpleProductPageStepDefinitions.a_page_notification_should_be_displayed_saying_product_successfully_added_to_cart()"
});
formatter.result({
  "duration": 124385007,
  "status": "passed"
});
formatter.match({
  "location": "SimpleProductPageStepDefinitions.product_should_be_added_to_my_cart()"
});
formatter.result({
  "duration": 108866930,
  "status": "passed"
});
formatter.after({
  "duration": 6047,
  "status": "passed"
});
formatter.uri("SiteMapSmokeTest.feature");
formatter.feature({
  "line": 2,
  "name": "Smoketest to make sure sitemap is functioning",
  "description": "",
  "id": "smoketest-to-make-sure-sitemap-is-functioning",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@NoInput"
    },
    {
      "line": 1,
      "name": "@All"
    }
  ]
});
formatter.before({
  "duration": 778456311,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "there is a site map page",
  "keyword": "Given "
});
formatter.match({
  "location": "SiteMapStepDefinitions.there_is_a_site_map_page()"
});
formatter.result({
  "duration": 29940,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Navigating to site map",
  "description": "",
  "id": "smoketest-to-make-sure-sitemap-is-functioning;navigating-to-site-map",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "there is a site map link",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on the site map link",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I am taken to site map",
  "keyword": "Then "
});
formatter.match({
  "location": "CommonPageStepDefinitons.i_am_on_homepage()"
});
formatter.result({
  "duration": 937305920,
  "status": "passed"
});
formatter.match({
  "location": "SiteMapStepDefinitions.there_is_a_site_map_link()"
});
formatter.result({
  "duration": 20009500,
  "status": "passed"
});
formatter.match({
  "location": "SiteMapStepDefinitions.i_click_on_the_site_map_link()"
});
formatter.result({
  "duration": 1042537568,
  "status": "passed"
});
formatter.match({
  "location": "SiteMapStepDefinitions.i_am_taken_to_site_map()"
});
formatter.result({
  "duration": 56993048,
  "status": "passed"
});
formatter.after({
  "duration": 5691,
  "status": "passed"
});
formatter.before({
  "duration": 942352888,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "there is a site map page",
  "keyword": "Given "
});
formatter.match({
  "location": "SiteMapStepDefinitions.there_is_a_site_map_page()"
});
formatter.result({
  "duration": 33747,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Navigation to page from site map",
  "description": "",
  "id": "smoketest-to-make-sure-sitemap-is-functioning;navigation-to-page-from-site-map",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "I am on site map",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I click a link on the site map",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I am taken to the correct page",
  "keyword": "Then "
});
formatter.match({
  "location": "SiteMapStepDefinitions.i_am_on_site_map()"
});
formatter.result({
  "duration": 1133743286,
  "status": "passed"
});
formatter.match({
  "location": "SiteMapStepDefinitions.i_click_a_link_on_the_site_map()"
});
formatter.result({
  "duration": 90863344551,
  "status": "passed"
});
formatter.match({
  "location": "SiteMapStepDefinitions.i_am_taken_to_the_correct_page()"
});
formatter.result({
  "duration": 12123,
  "status": "passed"
});
formatter.after({
  "duration": 4091,
  "status": "passed"
});
formatter.uri("SubcategorySmokeTest.feature");
formatter.feature({
  "line": 2,
  "name": "Smoketests to test subcategory page",
  "description": "",
  "id": "smoketests-to-test-subcategory-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@NoInput"
    },
    {
      "line": 1,
      "name": "@All"
    }
  ]
});
formatter.before({
  "duration": 1914014170,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Navigating to subcategory page",
  "description": "",
  "id": "smoketests-to-test-subcategory-page;navigating-to-subcategory-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on a category page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on a subcategory link",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should be directed to corresponding subcategory page",
  "keyword": "Then "
});
formatter.match({
  "location": "SubcategoryStepDefinitions.i_am_on_a_category_page()"
});
formatter.result({
  "duration": 1462343957,
  "status": "passed"
});
formatter.match({
  "location": "SubcategoryStepDefinitions.i_click_on_a_subcategory_link()"
});
formatter.result({
  "duration": 9683862065,
  "status": "passed"
});
formatter.match({
  "location": "SubcategoryStepDefinitions.i_should_be_directed_to_corresponding_subcategory_page()"
});
formatter.result({
  "duration": 15580,
  "status": "passed"
});
formatter.after({
  "duration": 3898,
  "status": "passed"
});
formatter.before({
  "duration": 1823036938,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Navigating to Product detail page from subcategory page",
  "description": "",
  "id": "smoketests-to-test-subcategory-page;navigating-to-product-detail-page-from-subcategory-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "that I am on a subcategory page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I select a product Image/Name from the subcategory page",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I should be directed to that product’s detail page",
  "keyword": "Then "
});
formatter.match({
  "location": "SubcategoryStepDefinitions.that_I_am_on_a_subcategory_page()"
});
formatter.result({
  "duration": 2760329756,
  "status": "passed"
});
formatter.match({
  "location": "SubcategoryStepDefinitions.i_select_a_product_Image_Name_from_the_subcategory_page()"
});
formatter.result({
  "duration": 1629247380,
  "status": "passed"
});
formatter.match({
  "location": "SearchStepDefinitions.i_should_be_directed_to_that_product_s_detail_page()"
});
formatter.result({
  "duration": 22907,
  "status": "passed"
});
formatter.after({
  "duration": 4022,
  "status": "passed"
});
formatter.before({
  "duration": 908129508,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Adding simple product to cart on subcategory page",
  "description": "",
  "id": "smoketests-to-test-subcategory-page;adding-simple-product-to-cart-on-subcategory-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "that I am on a subcategory page",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "there is simple product on the subcategory page",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I click the add to cart button",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "Product is added to cart",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "page notification displays saying product was added to cart",
  "keyword": "And "
});
formatter.match({
  "location": "SubcategoryStepDefinitions.that_I_am_on_a_subcategory_page()"
});
formatter.result({
  "duration": 2879462073,
  "status": "passed"
});
formatter.match({
  "location": "SubcategoryStepDefinitions.there_is_simple_product_on_the_subcategory_page()"
});
formatter.result({
  "duration": 14820,
  "status": "passed"
});
formatter.match({
  "location": "SearchStepDefinitions.i_click_the_add_to_cart_button()"
});
formatter.result({
  "duration": 2698029169,
  "status": "passed"
});
formatter.match({
  "location": "SearchStepDefinitions.product_is_added_to_cart()"
});
formatter.result({
  "duration": 311217897,
  "status": "passed"
});
formatter.match({
  "location": "SearchStepDefinitions.page_notification_displays_saying_product_was_added_to_cart()"
});
formatter.result({
  "duration": 16367940,
  "status": "passed"
});
formatter.after({
  "duration": 5776,
  "status": "passed"
});
formatter.uri("WishlistSmokeTest.feature");
formatter.feature({
  "line": 2,
  "name": "Smoke test to make sure wishlist is working properly",
  "description": "",
  "id": "smoke-test-to-make-sure-wishlist-is-working-properly",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@NoInput"
    },
    {
      "line": 1,
      "name": "@All"
    }
  ]
});
formatter.before({
  "duration": 816188927,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Adding to wishlist when user is not logged in",
  "description": "",
  "id": "smoke-test-to-make-sure-wishlist-is-working-properly;adding-to-wishlist-when-user-is-not-logged-in",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on a product detail page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I am not logged in",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I click on the Add to Wishlist link",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I am directed to login/create an account page",
  "keyword": "Then "
});
formatter.match({
  "location": "EmailtoaFriendStepDefinitions.i_am_on_a_product_detail_page()"
});
formatter.result({
  "duration": 3292726791,
  "status": "passed"
});
formatter.match({
  "location": "RegisteredUserCheckoutStepDefinitions.i_am_not_logged_in()"
});
formatter.result({
  "duration": 150701510,
  "status": "passed"
});
formatter.match({
  "location": "WishlistStepDefinitions.i_click_on_the_Add_to_Wishlist_link()"
});
formatter.result({
  "duration": 1323630223,
  "status": "passed"
});
formatter.match({
  "location": "WishlistStepDefinitions.i_am_directed_to_login_create_an_account_page()"
});
formatter.result({
  "duration": 127539729,
  "status": "passed"
});
formatter.after({
  "duration": 5977,
  "status": "passed"
});
formatter.before({
  "duration": 833964546,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Adding to wishlist when user is logged in",
  "description": "",
  "id": "smoke-test-to-make-sure-wishlist-is-working-properly;adding-to-wishlist-when-user-is-logged-in",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "I am logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I am on Category page",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click on the Add to Wishlist link under a product",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I am directed to my wishlist page",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "that product is added to my wishlist",
  "keyword": "And "
});
formatter.match({
  "location": "RegisteredUserCheckoutStepDefinitions.i_am_logged_in()"
});
formatter.result({
  "duration": 5512082929,
  "status": "passed"
});
formatter.match({
  "location": "WishlistStepDefinitions.i_am_on_Category_page()"
});
formatter.result({
  "duration": 3280301288,
  "status": "passed"
});
formatter.match({
  "location": "WishlistStepDefinitions.i_click_on_the_Add_to_Wishlist_link_under_a_product()"
});
formatter.result({
  "duration": 4031115976,
  "status": "passed"
});
formatter.match({
  "location": "WishlistStepDefinitions.i_am_directed_to_my_wishlist_page()"
});
formatter.result({
  "duration": 132173777,
  "status": "passed"
});
formatter.match({
  "location": "WishlistStepDefinitions.that_product_is_added_to_my_wishlist()"
});
formatter.result({
  "duration": 49802349,
  "status": "passed"
});
formatter.after({
  "duration": 6022,
  "status": "passed"
});
});