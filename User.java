@Entity
@Data
public class User {

    @Id
    private Long id;
    private String phoneNumber;
    private String name;
    private Role role;

}
