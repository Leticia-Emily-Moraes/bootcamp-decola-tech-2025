package leticia_Moraes.projeto_spring_boot.domain.repository;
import leticia_Moraes.projeto_spring_boot.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
