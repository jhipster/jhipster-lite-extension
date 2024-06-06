@mySpecificTest
Feature: Banner Extension

  Scenario: Should add banner JHipster v7
    When I apply "banner-jhipster-v7-extension" module to default project without parameters
    Then I should have files in "src/main/resources"
      | banner.txt |

  Scenario: Should add banner JHipster v7 for React
    When I apply "banner-jhipster-v7-react-extension" module to default project without parameters
    Then I should have files in "src/main/resources"
      | banner.txt |

  Scenario: Should add banner JHipster v7 for Vue
    When I apply "banner-jhipster-v7-vue-extension" module to default project without parameters
    Then I should have files in "src/main/resources"
      | banner.txt |

  Scenario: Should add banner JHipster v2
    When I apply "banner-jhipster-v2-extension" module to default project without parameters
    Then I should have files in "src/main/resources"
      | banner.txt |

  Scenario: Should add banner JHipster v3
    When I apply "banner-jhipster-v3-extension" module to default project without parameters
    Then I should have files in "src/main/resources"
      | banner.txt |
