package projetos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import projetos.entities.Order;
import projetos.entities.User;


public interface OrderRepository extends JpaRepository<Order, Long> {


}
