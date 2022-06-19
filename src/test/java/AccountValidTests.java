import org.junit.Assert;
import org.junit.Test;

public class AccountValidTests {
    @Test
    public void CheckValidNameToEmbossTest() {
        String NAME = "Вася Пупкин";
        Account account = new Account(NAME);
        Assert.assertTrue(account.checkNameToEmboss());
    }
}