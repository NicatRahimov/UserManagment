package az.coders.UserManagment.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @NotNull
    @Column(name = "first_name")
    String username;
    @NotNull
    @Column(name = "email")
    String email;
    @NotNull
    @Column(name = "pass")
    String password;
}
