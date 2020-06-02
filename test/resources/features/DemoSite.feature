#Autor: willian concepcion
@stories
Feature: Automation Demo Site
  The user, must enter the page Automation Demo Site to register as a user of the page and verify that the registration is correct
  @scenario1
  Scenario: Search the page Automation Demo Site
    Given Carlos wants to access the web Automation Demo Site
    When he performs the registration on the page
      |name     |last      |address        |email        |number     |language|skill  |contry|selecontry|year|month|day|password     |confirpassword|
      |willian  |concepcion|brisas del golf|wcd@mail.com |1234567895 |Catalan |Android|Angola|Japan     |1986|April|20 |WC20201986**k|WC20201986**k|
    Then he verifies that the screen is loaded with the text - Double Click on Edit Icon to EDIT the Table Row.
