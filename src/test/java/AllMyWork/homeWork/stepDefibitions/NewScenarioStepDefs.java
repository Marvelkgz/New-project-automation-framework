package AllMyWork.homeWork.stepDefibitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class NewScenarioStepDefs {
    @Given("^user on  web \"([^\"]*)\"$")
    public void user_on_web(String arg)  {
        System.out.println(arg);

        
    }

    @When("^user input  field \"([^\"]*)\" with following credentials$")
    public void user_input_field_with_following_credentials(String arg1) {
        System.out.println(arg1);


    }

}
