import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(Parameterized.class)
public class AccountInvalidTests {
    @Parameterized.Parameters(name = "Имя: {0}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"ВасяПупкин"},
                {" ВасяПупкин"},
                {"ВасяПупкин "},
                {" ВасяПупкин "},
                {"Ва"},
                {"Вася ПупкинПупкинПупкинПупкин"},
                {null}
        });
    }

    private final String name;

    public AccountInvalidTests(String name) {
        this.name = name;
    }

    @Test
    public void CheckInvalidNameToEmbossTest() {
        Account account = new Account(name);
        Assert.assertFalse(account.checkNameToEmboss());
    }
}