package esprit.tn.msusermanagament.service;

import esprit.tn.msusermanagament.entity.User;
import org.springframework.http.ResponseEntity;


public interface IUserService {

    public ResponseEntity<?> getUsers( );

    public ResponseEntity<?> signUp(User user , boolean isStaff );

    public ResponseEntity<?> updateUser(User user ,String id );

    public ResponseEntity<?> deleteUser(String id ) ;



    public ResponseEntity<?> allowUser(String id);

    public ResponseEntity<?> banUser(String id);
    public User getUserById(String id);

    public String getUserFirstAndLast(String id);
}
