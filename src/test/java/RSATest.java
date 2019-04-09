import org.junit.Assert;
import org.junit.Test;
import org.springframework.security.crypto.encrypt.Encryptors;
import org.springframework.security.crypto.encrypt.TextEncryptor;

/**
 * @author Jhun
 * 2019-04-09
 */
public class RSATest {

    /**
     * @see <a href ="https://docs.spring.io/spring-security/site/docs/3.1.x/reference/crypto.html">ref</a>
     */
    @Test
    public void name() {
        String privateKey = "skaksdmlqlalfzl";
        String salt = "5c0744940b5c369b"; // hex
        TextEncryptor encryptor = Encryptors.text(privateKey, salt);
        String enc = encryptor.encrypt("HelloWorld");
        Assert.assertEquals("HelloWorld", encryptor.decrypt(enc));
    }
}
