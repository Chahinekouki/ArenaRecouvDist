package esprit.tn.msusermanagament.repository;

import esprit.tn.msusermanagament.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleDao extends JpaRepository<Role, String> {

}
