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
@Table(name = "laws", schema = "public", catalog = "postgres")
public class Law {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "law_type", nullable = false, length = 50)
    private String lawType;
    @Basic
    @Column(name = "time_create_law", nullable = false)
    private Timestamp timeCreateLaw;
    @Basic
    @Column(name = "time_update_law", nullable = false)
    private Timestamp timeUpdateLaw;
    @ManyToOne
    @JoinColumn(name = "id_stewart", referencedColumnName = "port", nullable = false)
    private Stewart stewartsByIdStewart;
}
