package projetos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import projetos.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {


}
