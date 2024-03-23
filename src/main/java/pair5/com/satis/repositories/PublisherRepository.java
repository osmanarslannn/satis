package pair5.com.satis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pair5.com.satis.entities.Publisher;

public interface PublisherRepository extends JpaRepository<Publisher,Integer> {
}
