package finance.repository;

import finance.model.Finance;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FinanceRepository extends MongoRepository<Finance, String> {
    Finance findByCin(String cin);
}
