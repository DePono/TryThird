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
@Table(name = "stewarts", schema = "public", catalog = "postgres")
public class Stewart {
    @Id
    @Column(name = "port", nullable = false)
    private int port;
    @Basic
    @Column(name = "title", nullable = false, length = 50)
    private String title;
    @Basic
    @Column(name = "description", nullable = false, length = 100)
    private String description;
    @Basic
    @Column(name = "ip_address", nullable = false, length = 50)
    private String ipAddress;
    @OneToMany(mappedBy = "stewartsByIdStewartPlatform")
    private Collection<Cyctem> cyctemsByPort;
    @OneToMany(mappedBy = "stewartsByIdStewart")
    private Collection<Law> lawsByPort;
}
