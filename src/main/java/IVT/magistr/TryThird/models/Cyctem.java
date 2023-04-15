package IVT.magistr.TryThird.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "cyctems", schema = "public", catalog = "postgres")
public class Cyctem {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "title", nullable = false, length = 50)
    private String title;
    @Basic
    @Column(name = "description", nullable = false, length = 100)
    private String description;
    @Basic
    @Column(name = "time_create", nullable = false)
    private Timestamp timeCreate;
    @Basic
    @Column(name = "time_update", nullable = false)
    private Timestamp timeUpdate;
    @ManyToOne
    @JoinColumn(name = "id_client", referencedColumnName = "phone", nullable = false)
    private Client clientsByIdClient;
    @ManyToOne
    @JoinColumn(name = "id_stewart_platform", referencedColumnName = "port", nullable = false)
    private Stewart stewartsByIdStewartPlatform;

}
