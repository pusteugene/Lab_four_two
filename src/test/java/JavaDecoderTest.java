import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class JavaDecoderTest {

    @Test
    void testDecodeMessage() {
        // Arrange
        String encodedMessage = "t2st3ng ufttjoh";
        String expectedDecodedMessage = "testing testing";

        // Act
        String actualDecodedMessage = JavaDecoder.decodeMessage(encodedMessage);

        // Assert
        assertEquals(expectedDecodedMessage, actualDecodedMessage);
    }
}
