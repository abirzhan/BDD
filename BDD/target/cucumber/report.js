$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/NewCustomer.feature");
formatter.feature({
  "line": 2,
  "name": "Techfios bank and cash New Account Functionality",
  "description": "",
  "id": "techfios-bank-and-cash-new-account-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@AddNewAccount"
    }
  ]
});
formatter.scenarioOutline({
  "line": 8,
  "name": "User should be able to login with valid credentials",
  "description": "and open a new account",
  "id": "techfios-bank-and-cash-new-account-functionality;user-should-be-able-to-login-with-valid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@AddAccount"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "User enters the \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User should be able to see the dashboard",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User clicks on bank and cash",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "User clicks on new account",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "User fill up the form entering \"\u003caccountTitle\u003e\"and \"\u003cdescription\u003e\"and \"\u003cinitialBalance\u003e\"and \"\u003caccountNumber\u003e\"and \"\u003ccontactPerson\u003e\"and \"\u003cphone\u003e\"and \"\u003cinternetBankingUrl\u003e\" and clicks on submit",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "User should be able to see validate",
  "keyword": "Then "
});
formatter.examples({
  "line": 18,
  "name": "",
  "description": "",
  "id": "techfios-bank-and-cash-new-account-functionality;user-should-be-able-to-login-with-valid-credentials;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "",
        "accountTitle",
        "description",
        "initialBalance",
        "accountNumber",
        "contactPerson",
        "phone",
        "internetBankingUrl"
      ],
      "line": 19,
      "id": "techfios-bank-and-cash-new-account-functionality;user-should-be-able-to-login-with-valid-credentials;;1"
    },
    {
      "cells": [
        "demo@techfios.com",
        "abc123",
        "",
        "Checking account",
        "Supplies",
        "5000",
        "053333345",
        "James",
        "215-000-0000",
        "https://www.bankandcash/"
      ],
      "line": 20,
      "id": "techfios-bank-and-cash-new-account-functionality;user-should-be-able-to-login-with-valid-credentials;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2777999500,
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
  "name": "User is on the techfios login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.User_is_on_the_Techfios_login_page()"
});
formatter.result({
  "duration": 1839487200,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "User should be able to login with valid credentials",
  "description": "and open a new account",
  "id": "techfios-bank-and-cash-new-account-functionality;user-should-be-able-to-login-with-valid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@AddAccount"
    },
    {
      "line": 1,
      "name": "@AddNewAccount"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "User enters the \"demo@techfios.com\" and \"abc123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User should be able to see the dashboard",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User clicks on bank and cash",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "User clicks on new account",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "User fill up the form entering \"Checking account\"and \"Supplies\"and \"5000\"and \"053333345\"and \"James\"and \"215-000-0000\"and \"https://www.bankandcash/\" and clicks on submit",
  "matchedColumns": [
    3,
    4,
    5,
    6,
    7,
    8,
    9
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "User should be able to see validate",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "demo@techfios.com",
      "offset": 17
    },
    {
      "val": "abc123",
      "offset": 41
    }
  ],
  "location": "StepDefinitions.user_enters_the_and(String,String)"
});
formatter.result({
  "duration": 301678500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.User_clicks_on_login_button()"
});
formatter.result({
  "duration": 3742148100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_should_be_able_to_see_the_dashboard()"
});
formatter.result({
  "duration": 415432900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.User_clicks_on_bank_and_cash()"
});
formatter.result({
  "duration": 96061400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.User_clicks_on_new_account()"
});
formatter.result({
  "duration": 3826225800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Checking account",
      "offset": 32
    },
    {
      "val": "Supplies",
      "offset": 54
    },
    {
      "val": "5000",
      "offset": 68
    },
    {
      "val": "053333345",
      "offset": 78
    },
    {
      "val": "James",
      "offset": 93
    },
    {
      "val": "215-000-0000",
      "offset": 104
    },
    {
      "val": "https://www.bankandcash/",
      "offset": 122
    }
  ],
  "location": "StepDefinitions.user_fill_up_the_form_entering_and_and_and_and_and_and_and_clicks_on_submit(String,String,String,String,String,String,String)"
});
formatter.result({
  "duration": 2117109500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.User_should_be_able_to_see_validate()"
});
formatter.result({
  "duration": 2811477000,
  "status": "passed"
});
formatter.after({
  "duration": 730532100,
  "status": "passed"
});
});