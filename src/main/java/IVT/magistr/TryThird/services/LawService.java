package IVT.magistr.TryThird.services;


import IVT.magistr.TryThird.models.Law;
import IVT.magistr.TryThird.repositories.LawRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class LawService {
    private final LawRepository lawRepository;
    public List<Law> findAll() {
        return lawRepository.findAll();
    }

    public void save(Law law) {
        String lawType = law.getLawType();
        log.info("Saving new Laws with title: {}", lawType);
        lawRepository.save(law);
    }

    public Law getLawById(Integer id) {
        return lawRepository.findById(id).orElse(null);
    }

    public void delete(Integer id) {
        lawRepository.deleteById(id);
    }
}
