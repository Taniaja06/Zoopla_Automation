Feature: User able use zoopla application, login the application, searching the property, buy the property 

# feature= what to do 
#We write automation testcases using cucumber features file.
#BDD- behavior drive development 

Scenario:  User able to login the application & verfy the users information  

Given User able to open a any browser 
And User able to enter url 
When User able to click on sign-in button 
And User able to enter valid userName & password
And User able to click on login button
Then User can verify the user information on the grid 


Scenario:  User able to search the properties 

Given User able to open a any browser 
And User able to enter url 
When User able to click on sign-in button 
And User able to enter valid userName & password
And User able to click on login button
And User able to click on the for sale button 
And User able to type in search box location of the properties 
And user able to click on search buttion 
Then User able to see the properties on the grid 



Scenario:  User able to search the properties 

Given User able to open a any browser 
And User able to enter url 
When User able to click on sign-in button 
And User able to enter valid userName & password
And User able to click on login button
And User able to click on the for sale button 
And User able to type in search box location of the properties 
And user able to click on search buttion 
And User able to select and buy the property 
Then User able to enterd the user won house 


#after writing testcases in feature file
# ihave to create a package inside src/test/java folder 
#runner package and step-definition package with class


