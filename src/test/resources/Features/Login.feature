Feature: Validation of Login Page of Facebook

Scenario Outline: Validate the Login Functionality
			Given Launch the browser 
			And 	open the facebook application
			When 	Enter the "<username>" and "<password>" 
			And 	click the login button
			Then  Validate the login message 
			And 	close the browser
			
	Examples:
					|username|password|	
					|rocky|r12345|
					
