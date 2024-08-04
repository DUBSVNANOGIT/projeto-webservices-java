package projetos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import projetos.entities.OrderItem;
import projetos.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
}
