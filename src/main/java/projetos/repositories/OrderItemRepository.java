package projetos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import projetos.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
