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
@Table(name = "accounts", schema = "public", catalog = "postgres")
public class Account {
    @Id
    @Column(name = "title", nullable = false, length = -1)
    private String title;
    @Basic
    @Column(name = "description_account", nullable = false, length = -1)
    private String descriptionAccount;
    @Basic
    @Column(name = "subscription_time", nullable = false, length = -1)
    private String subscriptionTime;
    @OneToMany(mappedBy = "accountsByTypeAccount")
    private Collection<Company> companiesByTitle;

}
