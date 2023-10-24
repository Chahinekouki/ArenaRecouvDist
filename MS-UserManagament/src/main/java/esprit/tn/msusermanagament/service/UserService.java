package esprit.tn.msusermanagament.service;


import esprit.tn.msusermanagament.entity.Role;
import esprit.tn.msusermanagament.entity.User;
import esprit.tn.msusermanagament.repository.RoleDao;
import esprit.tn.msusermanagament.repository.UserDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.regex.Pattern;

@Service
@Slf4j
public class UserService implements  IUserService {



    @Autowired
    private UserDao userDao;

    @Autowired
    private RoleDao roleDao;


    @Autowired
    private LoginAttemptService loginAttemptService;

    @PostConstruct
    public void initRoleAndUser() {
        Role user = new Role();
        user.setRoleName("user");
        user.setRoleDescription("user");
        roleDao.save(user);


        Role admin = new Role();
        admin.setRoleName("admin");
        admin.setRoleDescription("admin");
        roleDao.save(admin);

        User adminUser = new User();
        adminUser.setId("1234");
        adminUser.setUserPassword(("assyl123"));
        adminUser.setUserFirstName("Assyl");
        adminUser.setUserLastName("kriaa");
        adminUser.setAdress("Urbain Nord");
        adminUser.setEmail("assyl.kriaa@gmail.com");
        adminUser.setTel("+21699000000");
        Set<Role> adminRoles = new HashSet<>();
        adminRoles.add(admin);
        adminUser.setRole(adminRoles);
        userDao.save(adminUser);

        User simpleUser = new User();
        simpleUser.setId("12345");
        simpleUser.setUserPassword(("chiheb123"));
        simpleUser.setUserFirstName("chiheb");
        simpleUser.setUserLastName("aroua");
        simpleUser.setAdress("Urbain Nord");
        simpleUser.setEmail("chiheb.aroua@gmail.com");
        simpleUser.setTel("+21699000000");
        Set<Role> userRoles = new HashSet<>();
        userRoles.add(user);
        simpleUser.setRole(userRoles);
        userDao.save(simpleUser);

        User simpleUser1 = new User();
        simpleUser1.setId("123456");
        simpleUser1.setUserPassword(("chahine123"));
        simpleUser1.setUserFirstName("chahine");
        simpleUser1.setUserLastName("kouki");
        simpleUser1.setAdress("Urbain Nord");
        simpleUser1.setEmail("chahine.kouki@gmail.com");
        simpleUser1.setTel("+21699454400");
        Set<Role> userRoles1 = new HashSet<>();
        userRoles1.add(user);
        simpleUser1.setRole(userRoles1);
        userDao.save(simpleUser1);

        User simpleUser2 = new User();
        simpleUser2.setId("123478");
        simpleUser2.setUserPassword(("chahine123"));
        simpleUser2.setUserFirstName("chahine");
        simpleUser2.setUserLastName("kouki");
        simpleUser2.setAdress("Urbain Nord");
        simpleUser2.setEmail("chahine.kouki@gmail.com");
        simpleUser2.setTel("+21699454400");

        simpleUser2.setRole(userRoles1);
        userDao.save(simpleUser2);

        User simpleUser3 = new User();
        simpleUser3.setId("123478");
        simpleUser3.setUserPassword(("fourat123"));
        simpleUser3.setUserFirstName("fourat");
        simpleUser3.setUserLastName("halaoua");
        simpleUser3.setAdress("Urbain Nord");
        simpleUser3.setEmail("fourat.halaoua@esprit.tn");
        simpleUser3.setTel("+21699454490");
        simpleUser3.setRole(userRoles1);
        userDao.save(simpleUser3);
    }
    public ResponseEntity<?> getUsers( ) {

       List<User> users = (List<User>) userDao.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(users);

    }

    @Override
    public ResponseEntity<?> signUp (User user  ){
        if (user.getId() ==null || user.getId().length() !=8  ) {
            return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body("veuillez corriger le champs CIN");
        }
        else if (  user.getUserFirstName() ==null || user.getUserFirstName().length() <2   ) {
            return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body("veuillez saisir un prenom correcte");
        }  else if (  user.getUserLastName() ==null || user.getUserLastName().length() <2  ) {
            return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body("veuillez saisir un nom correcte");
        }
        else if ( user.getAdress() == null  ) {
            return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body("veuillez saisir une  adresse correcte");
        }
        else if ( user.getTel() == null || !Pattern.matches("\\b\\d{8}\\b", user.getTel()) ) {
            return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body("veuillez saisir un num tel correcte");
        }
        else if ( user.getEmail() == null || !Pattern.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$", user.getEmail()) ) {
            return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body("veuillez saisir un email  correcte");
        }

        else {

                Role role = roleDao.findById("user").get();

                Set<Role> userRoles = new HashSet<>();
                userRoles.add(role);
                user.setRole(userRoles);

            user.setUserPassword((user.getUserPassword()));
            userDao.save(user);
            return ResponseEntity.status(HttpStatus.CREATED).body(user);
        }
    }


    public ResponseEntity<?> updateUser(User user ,String id ) {
        User oldUser=userDao.findById(id).get();
        if (user.getTel() != null) {
            if (!Pattern.matches("\\b\\d{8}\\b", user.getTel())) {
                return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body("veuillez saisir un num tel correcte");
            }
            oldUser.setTel(user.getTel());
        }
         if (user.getEmail() != null) {
            if (!Pattern.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$", user.getEmail())) {
                return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body("veuillez saisir un email  correcte");
            }
            oldUser.setEmail(user.getEmail());
        }
         if (user.getAdress() != null) {
            oldUser.setAdress(user.getAdress());
        }

            userDao.save(oldUser);
            return ResponseEntity.status(HttpStatus.OK).body(oldUser);

    }
    @Transactional
    public ResponseEntity<?> deleteUser(String id ) {

        Optional<User> user = userDao.findById(id);
         if(!user.isPresent()) {
             return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body("there is no such user with this id: "+id);
         }

        userDao.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).body("User deleted");

    }

    public ResponseEntity<?> banUser(String id)  {
        Optional<User> user = userDao.findById(id);
        if(user.isPresent() ){
            user.get().setIsBanned(Boolean.TRUE);
            userDao.save(user.get());
            log.debug("User banned", user);
            return  ResponseEntity.status(HttpStatus.OK).body("");
        }
        else return  ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body("");
    }

    public ResponseEntity<?> allowUser(String id) {

        Optional<User> user = userDao.findById(id);
        if(user.isPresent() ){
            user.get().setIsBanned(Boolean.FALSE);
            userDao.save(user.get());
            loginAttemptService.evictUserFromLoginAttemptCache(user.get().getId());
            log.debug("User allowed", user);

            return  ResponseEntity.status(HttpStatus.OK).body("user authorized ");

        } else  return ResponseEntity.status(HttpStatus.OK).body("Invalid Id ");
    }

    /*

test fourat

*/
public User getUserById(String id)

    {
        return userDao.findById(id).get();
    }

    @Override
    public String getUserFirstAndLast(String id) {
    String result ="";
        for(User user:userDao.findAll()){
            if(user.getId().equals(id)){
                result = user.getUserFirstName()+"  "+user.getUserLastName() ;
            }
        }
        return result;
    }


}
