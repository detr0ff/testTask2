
import com.example.Pages.GreatingPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.open;

public class TestGreatingPage {

    private static final String url = "https://n2oapp.net/sandbox/view/examples_greeting/";
    private static final String name = "Андрей";

    @Test
    public void testGreating(){
        String greatingName = open(url, GreatingPage.class)
                .enterName(name)
                .enterButtonClick()
                .getGreatingName();
        Assertions.assertEquals("Привет, " + name, greatingName, "Имена не совпадают");
    }
}
