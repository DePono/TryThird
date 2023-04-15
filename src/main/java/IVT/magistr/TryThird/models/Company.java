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
@Table(name = "companies", schema = "public", catalog = "postgres")
public class Company {
    @Id
    @Column(name = "phone", nullable = false)
    private String phone;
    @Basic
    @Column(name = "title", nullable = false, length = 500)
    private String title;
    @Basic
    @Column(name = "description", nullable = false, length = 400)
    private String description;
    @Basic
    @Column(name = "city", nullable = false, length = 100)
    private String city;
    @Basic
    @Column(name = "email", nullable = false, length = 50)
    private String email;
    @OneToMany(mappedBy = "owner")
    private Collection<Client> clients;
    @ManyToOne
    @JoinColumn(name = "type_account", referencedColumnName = "title", nullable = false)
    private Account accountsByTypeAccount;
}
