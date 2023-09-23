package az.coders.UserManagment.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@Table(name = "user",schema = "userdb")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @NotNull
    String firstName;
    @NotNull
    String secondName;
    @NotNull
    String email;
    @NotNull
    String password;
}
