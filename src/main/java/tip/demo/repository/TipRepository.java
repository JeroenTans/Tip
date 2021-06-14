package tip.demo.repository;

import org.hibernate.tool.schema.extract.spi.TableInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import tip.demo.model.Tip;

@Service
public interface TipRepository extends JpaRepository<Tip, Long> {
}
