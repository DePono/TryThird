package IVT.magistr.TryThird.repositories;

import IVT.magistr.TryThird.models.Cyctem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CyctemRepository extends JpaRepository<Cyctem, Integer> {
    List<Cyctem> findByTitle(String title);
}
