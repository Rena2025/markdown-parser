import static org.junit.Assert.*;
import org.junit.*;
public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testGetLinks() {
        assertEquals(["https://something.com, some-page.html"], getLinks(Files.readString(test-file.md)));
    }
}