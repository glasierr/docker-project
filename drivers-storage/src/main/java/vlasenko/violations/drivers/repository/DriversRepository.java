package vlasenko.violations.drivers.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import vlasenko.violations.drivers.domain.Driver;

import java.util.Optional;

@Repository
public interface DriversRepository extends MongoRepository<Driver, String> {
    Optional<Driver> findByLicenceId(String id);
}
