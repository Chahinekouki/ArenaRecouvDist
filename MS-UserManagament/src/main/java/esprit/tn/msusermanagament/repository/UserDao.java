package esprit.tn.msusermanagament.repository;

import esprit.tn.msusermanagament.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface UserDao extends CrudRepository<User, String> {


}
