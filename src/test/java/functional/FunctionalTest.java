package functional;

import static testutils.TestUtils.businessTestFile;
import static testutils.TestUtils.currentTest;
import static testutils.TestUtils.testReport;
import static testutils.TestUtils.yakshaAssert;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import testutils.AutoGrader;

public class FunctionalTest {

	// Provide the path to the SwitchCaseAssignment class file
	String filePath = "src/main/java/com/yaksha/assignment/SwitchCaseAssignment.java";

	@AfterAll
	public static void afterAll() {
		testReport();
	}

	@Test
	public void testSwitchCaseOnly() throws Exception {
		AutoGrader autoGrader = new AutoGrader();
		boolean result = autoGrader.testSwitchCaseOnly(filePath);
		yakshaAssert(currentTest(), result, businessTestFile);
	}
}
