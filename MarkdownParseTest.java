import static org.junit.Assert.*;
import org.junit.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

//javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar MarkdownParseTest.java

//java -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore MarkdownParseTest

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testFile() throws IOException{

        assertEquals(List.of("https://something.com","some-page.html"), MarkdownParse.getLinks(Files.readString(Path.of("test-file.md"))));
    }

    @Test
    public void test2() throws IOException{

        assertEquals(List.of("link1.html"), MarkdownParse.getLinks(Files.readString(Path.of("test2.md"))));
    }

    @Test
    public void test3() throws IOException{
        assertEquals(List.of(), MarkdownParse.getLinks(Files.readString(Path.of("test3.md"))));
    }

    @Test
    public void testFile2() throws IOException{
        assertEquals(List.of("https://something.com","some-page.html"), MarkdownParse.getLinks(Files.readString(Path.of("test-file2.md"))));
    }

    @Test
    public void testFile3() throws IOException{
        assertEquals(List.of(), MarkdownParse.getLinks(Files.readString(Path.of("test-file3.md"))));
    }

    @Test
    public void testFile4() throws IOException{
        assertEquals(List.of(), MarkdownParse.getLinks(Files.readString(Path.of("test-file4.md"))));
    }

    @Test
    public void testFile5() throws IOException{
        assertEquals(List.of(), MarkdownParse.getLinks(Files.readString(Path.of("test-file5.md"))));
    }

    @Test
    public void testFile7() throws IOException{
        assertEquals(List.of(), MarkdownParse.getLinks(Files.readString(Path.of("test-file7.md"))));
    }

    @Test
    public void testFile6() throws IOException{
        assertEquals(List.of(), MarkdownParse.getLinks(Files.readString(Path.of("test-file6.md"))));
    }

    @Test
    public void testFile8() throws IOException{
        assertEquals(List.of(), MarkdownParse.getLinks(Files.readString(Path.of("test-file8.md"))));
    }



}