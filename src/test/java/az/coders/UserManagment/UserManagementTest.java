package az.coders.UserManagment;

import az.coders.UserManagment.model.User;
import az.coders.UserManagment.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(value = false)
public class UserManagementTest {
@Autowired
    UserRepository userRepository;
@Test
    public void addNewTest(){
User u = new User();

u.setEmail("nicat123@mail.ru");
u.setPassword("Nicat123123");
u.setFirstName("Nicat");
u.setSecondName("Rahimov");

userRepository.save(u);
    }

}
