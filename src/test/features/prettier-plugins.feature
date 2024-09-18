Feature: Prettier Plugins

  Scenario: Should apply properties plugin
    When I apply modules to default project
      | init                       |
      | prettier                   |
      | prettier-plugin-properties |
    Then I should have "prettier-plugin-properties" in "package.json"
