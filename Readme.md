http://talks.codegram.com/bdd-best-practices-and-antipatterns
-------------------------------------------------------------

 Best Practices
 ==============

 1. Factories and gem helpers
 -------------------------
 * Use factories instead of clicking around your application to set the state
 * Take advantage of helpers, i.e. devise login_as to login users
 * Clean the database using database_cleaner
 
 2. Abstraction
 -------------------------
 * Describe a feature, not edge cases
 * Only BDD the happy path, there are controller/model/view tests for a reason
  
 3. Better feature files
 -------------------------
 Think twice when writing the "As a ... I want to .. so I can ..."
 * Write down any explanation you need as plain text between the header and the scenarios (see example)
 * Start with expectations instead of setting state or user actions
 * Group feature files by application domain, not actor
   
 4. Stop once you've an expectation
 -------------------------
 * No more user actions (click_link and friends) after a Then
 * Only assert on Then steps
 * Split complicated workflows in different scenarios (i.e. registration + confirmation + profile completion)
 
 Anti-patterns
 =============
 
 Cucumber features you should not use
 ------------------------------------
 * Scenario Outlines
 * Step params (Given a user named "John Doe")
 * Tables
 
 BDD != integration
 
 Don't try to emulate BDD with integration tests
 Steak and family aren't BDD frameworks, FYI