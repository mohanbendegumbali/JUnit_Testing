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


    @Test
    void whenGivenValidPhoneNumberShouldReturnTrue() {
        boolean validatePhoneNumber = userReg.validatePhoneNumber("+91 9919819801");
        Assertions.assertEquals(true, validatePhoneNumber);
    }


    @Test
    void whenGivenValidPasswordShouldReturnTrue() {
        boolean validatePassword = userReg.validatePassword("Rj&123456");
        Assertions.assertEquals(true, validatePassword);

    }

}