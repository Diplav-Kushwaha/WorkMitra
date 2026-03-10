@Entity
@Data
public class User {

    @Id
    private Long id;
    private String phoneNumber;
    private String name;
    private Role role;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private WorkerProfile workerProfile;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private Organization organization;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Message> message=new ArrayList<>();

}
