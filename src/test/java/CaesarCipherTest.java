import org.junit.Test;
import static org.junit.Assert.*;

public class CaesarCipherTest {
    @Test
    public void testEncrypt1() {
        CaesarCipher classUnderTest = new CaesarCipher();
        int e = 1;
        String m = "abcdefghijklmnopqrstuvwxyz ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String c = "bcdefghijklmnopqrstuvwxyza BCDEFGHIJKLMNOPQRSTUVWXYZA";
        assertEquals(c,classUnderTest.encrypt(m,e));
    }

    @Test
    public void testDecrypt1() {
        CaesarCipher classUnderTest = new CaesarCipher();
        int e = 1;
        String c = "bcdefghijklmnopqrstuvwxyza BCDEFGHIJKLMNOPQRSTUVWXYZA";
        String m = "abcdefghijklmnopqrstuvwxyz ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        assertEquals(m,classUnderTest.decrypt(c,e));
    }

    @Test(expected = InvalidInputException.class)
    public void testEncryptException() {
        CaesarCipher classUnderTest = new CaesarCipher();
        int e = 1;
        String m = "4";
        classUnderTest.encrypt(m,e);
    }

    @Test
    public void testRecovery() {
        CaesarCipher classUnderTest = new CaesarCipher();
        String m = "abcdefghijklmnopqrstuvwxyz ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int e = 1; e < 40; e++) {
            if (e % 26 != 0) { // Ignore cases where no shifting will take place
                String c = classUnderTest.encrypt(m,e);
                assertNotEquals(m,c); // After encryption, the cipher text should not match the plain text
                String d = classUnderTest.decrypt(c,e);
                assertEquals(m,d); // The decrypted cipher text should match the original plain text
            }
        }
    }
}