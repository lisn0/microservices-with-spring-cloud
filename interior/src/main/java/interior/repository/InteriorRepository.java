package interior.repository;

import interior.model.Interior;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface InteriorRepository extends JpaRepository<Interior, Integer> {
    Interior findByCin(Integer cin);
}