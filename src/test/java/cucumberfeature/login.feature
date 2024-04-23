Feature : Login Feature.

Scenario : Verify valid user login.
Given launch Application
When verify valid UserName
And verify valid password
And verify click on login button
Then verify user should display successfully logged message