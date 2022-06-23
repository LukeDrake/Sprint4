import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(Parameterized.class)
public class AccountValidTests {
    @Parameterized.Parameters(name = "Имя: {0}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"Вася Пупкин"},
                {"В П"},
                {"Вася Пупкиннннннннн"},
        });
    }
    private final String name;

    public AccountValidTests(String name) {
        this.name = name;
    }

    @Test
    public void CheckValidNameToEmbossTest() {
        Account account = new Account(name);
        Assert.assertTrue(account.checkNameToEmboss());
    }
}