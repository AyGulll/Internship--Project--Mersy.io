package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Methods;
import pages.body;
import pages.header;
import utilities.BaseDriver;

import java.time.Duration;

public class US016Steps {
    header hp=new header();
    body bp = new body();
    Methods mt = new Methods();
    public WebDriverWait wait = new WebDriverWait(BaseDriver.getDriver(), Duration.ofSeconds(15));
    @When("the evaluation page should be a link \\(Grading) that the student can access.")
    public void theEvaluationPageShouldBeALinkGradingThatTheStudentCanAccess() {

    }

    @Then("the student can select Course Grade , Student Transcript,Transcript by Subject buttons")
    public void theStudentCanSelectCourseGradeStudentTranscriptTranscriptBySubjectButtons() {

    }
}
