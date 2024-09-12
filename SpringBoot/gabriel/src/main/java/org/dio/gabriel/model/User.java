package org.dio.gabriel.model;


 
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Integer id;
    @Column(length = 50, nullable = false)
    private String nome;
    @Column(length = 20, nullable = false)
    private String username;
    @Column(length = 100, nullable = false)
    private String password;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
