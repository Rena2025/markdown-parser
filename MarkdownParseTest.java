import static org.junit.Assert.*;
import org.junit.*;
public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testGetLinks() {
        ArrayList<String> arr = new ArrayList<String>();
        arr = MarkdownParse.getLinks(Files.readString(Path.of("test-file.md")));
        assertEquals(List.of("https://something.com", "some-page.html"), arr);
    }
}