import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class UserRegTest {
    static UserReg userReg = new UserReg();

    @Test
    void whenGivenValidFirstShouldReturnTrue() {
        boolean validName = userReg.validateFirstName("Mohan");
        Assertions.assertEquals(true,validName );
    }

    @Test
    void whenGivenValidLastNameShouldReturnTrue() {
        boolean validName = userReg.validateFirstName("Kumar");
        Assertions.assertEquals(true, validName);
    }


    @Test
    void whenGivenValidEmailShouldReturnTrue() {
        boolean validateEmail = userReg.validateEmail("mohanb0311@gmail.com");
        Assertions.assertEquals(true, validateEmail);
    }


}