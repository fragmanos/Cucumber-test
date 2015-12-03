package steps;

import java.util.List;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import features.Statement;

import static org.junit.Assert.assertEquals;

/**
 * @author fragkakise on 27/11/2015.
 */
public class StatementSteps {

 private static final double DOUBLE_DELTA = 1e-15;

 List<Statement> statementList;
 double balance;

 @Given("^the bank statement system initialized with the following data$")
 public void the_bank_statement_system_initialized_with_the_following_data(final List<Statement> statementList) throws Throwable {
  this.statementList = statementList;
 }

 @When("^i summarize the list$")
 public void i_summarize_the_list() throws Throwable {
   for (Statement statement : statementList){
    balance += statement.getCost();
   }
 }



 @Then("^the result should be (\\d+)$")
 public void the_result_should_be(int balance) throws Throwable {
  assertEquals(balance, this.balance, DOUBLE_DELTA);
 }
}
