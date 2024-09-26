package ee.ivkhkdev;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.verification.VerificationMode;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static jdk.internal.org.objectweb.asm.util.CheckClassAdapter.verify;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class AppTest {
    @Test
    public void testExitProgram() {
        Scanner ScannerMock = Mockito.mock(Scanner.class);
        Scanner scannerMock;
        when(scannerMock.nextInt()).thenReturn(0);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        App app = new App();
        app.scanner = scannerMock;

        app.run();

        verify(scannerMock, atLeastOnce()).nextInt();

        String expectedOutput = "List of tasks:\n" +
                "0. leave program\n" +
                "enter task number: \n" +
                "Exiting program...\n" +
                "Choose number from the list of tasks!\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testInvalidTaskNumber() {
        Scanner scannerMock = Mockito.mock(Scanner.class);
        when(scannerMock.nextInt()).thenReturn(5, 0);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        App app = new App();
        app.scanner = scannerMock;

        app.run();

        verify(scannerMock, times(2)).nextInt();

        String expectedOutput = "List of tasks:\n" +
                "0. leave program\n" +
                "enter task number: \n" +
                "Exiting program...\n" +
                "Choose number from the list of tasks!\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    private Scanner verify(Scanner scannerMock, VerificationMode times) {
    }


}