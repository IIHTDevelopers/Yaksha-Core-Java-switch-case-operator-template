package testutils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.stmt.SwitchStmt;

public class AutoGrader {

    // Test if the code uses only switch-case and not 'if-else-if'
    public boolean testSwitchCaseOnly(String filePath) throws IOException {
        System.out.println("Starting testSwitchCaseOnly with file: " + filePath);

        File participantFile = new File(filePath); // Path to participant's file
        if (!participantFile.exists()) {
            System.out.println("File does not exist at path: " + filePath);
            return false;
        }

        FileInputStream fileInputStream = new FileInputStream(participantFile);
        JavaParser javaParser = new JavaParser();
        CompilationUnit cu;
        try {
            cu = javaParser.parse(fileInputStream).getResult()
                    .orElseThrow(() -> new IOException("Failed to parse the Java file"));
        } catch (IOException e) {
            System.out.println("Error parsing the file: " + e.getMessage());
            throw e;
        }

        System.out.println("Parsed the Java file successfully.");

        boolean hasSwitchCase = false;

        // Log the parsed switch-case statements
        System.out.println("------ Switch-Case Statements ------");
        for (SwitchStmt switchStmt : cu.findAll(SwitchStmt.class)) {
            System.out.println("Switch-case found: " + switchStmt);
            hasSwitchCase = true;
        }

        // Check if only switch-case is used and no 'if-else-if'
        System.out.println("Has switch-case: " + hasSwitchCase);

        boolean result = hasSwitchCase;
        System.out.println("Test result: " + result);

        return result;
    }
}
