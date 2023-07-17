package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class AnimalSoundsTest {

    @Test
    public void testPrintCow() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        AnimalSounds.printCow();

        String expectedOutput = "Here's a cow:\n" +
                "        (__)\n" +
                "        (oo)\n" +
                " /------\\/ \n" +
                "/ |    ||  \n" +
                "*  /\\---/\\ \n" +
                "   ~~   ~~ \n";

        Assertions.assertEquals(expectedOutput, outputStream.toString());
    }

    @Test
    public void testPrintDog() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        AnimalSounds.printDog();

        String expectedOutput = "Here's a dog:\n" +
                " / \\_____/ \\\n" +
                "|  0   0  |\n" +
                " (   V   )\n" +
                "  /     \\\n" +
                " /_/ | \\_\\\n" +
                "    \\_|_/ \n";

        Assertions.assertEquals(expectedOutput, outputStream.toString());
    }

    @Test
    public void testMenuOptionCow() {
        ByteArrayInputStream inputStream = new ByteArrayInputStream("1\n3\n".getBytes());
        System.setIn(inputStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        AnimalSounds.main(new String[]{});

        String expectedOutput = "====== Animal Sounds ======\n" +
                "1. Cow\n" +
                "2. Dog\n" +
                "3. Exit\n" +
                "Enter your choice: \n" +
                "Here's a cow:\n" +
                "        (__)\n" +
                "        (oo)\n" +
                " /------\\/ \n" +
                "/ |    ||  \n" +
                "*  /\\---/\\ \n" +
                "   ~~   ~~ \n" +
                "====== Animal Sounds ======\n" +
                "1. Cow\n" +
                "2. Dog\n" +
                "3. Exit\n" +
                "Enter your choice: \n" +
                "Exiting...\n";

        Assertions.assertEquals(expectedOutput, outputStream.toString());
    }

    @Test
    public void testMenuOptionDog() {
        ByteArrayInputStream inputStream = new ByteArrayInputStream("2\n3\n".getBytes());
        System.setIn(inputStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        AnimalSounds.main(new String[]{});

        String expectedOutput = "====== Animal Sounds ======\n" +
                "1. Cow\n" +
                "2. Dog\n" +
                "3. Exit\n" +
                "Enter your choice: \n" +
                "Here's a dog:\n" +
                " / \\_____/ \\\n" +
                "|  0   0  |\n" +
                " (   V   )\n" +
                "  /     \\\n" +
                " /_/ | \\_\\\n" +
                "    \\_|_/ \n" +
                "====== Animal Sounds ======\n" +
                "1. Cow\n" +
                "2. Dog\n" +
                "3. Exit\n" +
                "Enter your choice: \n" +
                "Exiting...\n";

        Assertions.assertEquals(expectedOutput, outputStream.toString());
    }

    @Test
    public void testMenuOptionExit() {
        ByteArrayInputStream inputStream = new ByteArrayInputStream("3\n".getBytes());
        System.setIn(inputStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        AnimalSounds.main(new String[]{});

        String expectedOutput = "====== Animal Sounds ======\n" +
                "1. Cow\n" +
                "2. Dog\n" +
                "3. Exit\n" +
                "Enter your choice: \n" +
                "Exiting...\n";

        Assertions.assertEquals(expectedOutput, outputStream.toString());
    }
}
