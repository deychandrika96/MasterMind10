Feature:  Amazon Search

Scenario Outline: Search field functionality test
Given   User is am on Amazon home page
When     User entered the item name on search field "<search>"
And      User clicked on search icon button
Then    User is on searched item page


Examples: 
|search|
|iPhone 12|






