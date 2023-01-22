Feature: Test api
  I as PO want to test the GET, PUT, POST and DELETE methods
@MethodGet
  Scenario: Methods GET
    Given Api login
    |id |
    |/2 |
    When I use the GET method
    Then I can see the confirmation code 200

  @MethodGetAll
  Scenario: Methods GET All
    Given Api login
      |id|
      |s |
    When I use the GET method
    Then I can see the confirmation code 200


  @MethodPost
  Scenario Outline: Methods POST
    Given Api login
      |name  |salary  |age  |
      |<name>|<salary>|<age>|
    When I use the POST method
    Then I can see the confirmation post code 200

    Examples:
      |name  |salary  |age|
      |camila|1000    |13 |

  @MethodPut
  Scenario Outline: Methods PUT
    Given Api login
      |id  |name  |salary  |age  |
      |<id>|<name>|<salary>|<age>|
    When I use the PUT method
    Then I can see the confirmation put code 200

    Examples:
      |id |name  |salary  |age  |
      |1  |ramiro|1000    |30   |

  @MethodDelete
  Scenario: Methods DELETE
    Given Api login
      |id|
      |8 |
    When I use the DELETE method
    Then I can see the confirmation delete code 200
