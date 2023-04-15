package IVT.magistr.TryThird.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "clients", schema = "public", catalog = "postgres")
public class Client {
    @Id
    @Column(name = "phone", nullable = false, length = -1)
    private String phone;
    @Basic
    @Column(name = "username", nullable = false, length = 50)
    private String username;
    @Basic
    @Column(name = "name", nullable = false, length = 50)
    private String name;
    @Basic
    @Column(name = "surname", nullable = false, length = 50)
    private String surname;
    @Basic
    @Column(name = "email", nullable = false, length = 50)
    private String email;
    @ManyToOne
    @JoinColumn(name = "id_company", referencedColumnName = "phone", nullable = false)
    private Company owner;
    @OneToMany(mappedBy = "clientsByIdClient")
    private Collection<Cyctem> cyctemsByPhone;
}
