import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BookStoreTest {

    @Test
    public void testWelcomeMessage() {
        assertEquals(
            "Welcome to Online Book Store",
            BookStore.getWelcomeMessage()
        );
    }
}