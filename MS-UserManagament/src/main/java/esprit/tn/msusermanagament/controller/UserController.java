package esprit.tn.msusermanagament.controller;


import esprit.tn.msusermanagament.entity.User;
import esprit.tn.msusermanagament.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user")
@CrossOrigin(origins ="http://localhost:4200")
public class UserController {


    @Autowired
    private IUserService userService;

    @GetMapping("/getuser/{id}")
    public User getUserByid(@PathVariable("id") String id)
    {
    return     userService.getUserById(id);

    }

    @PostMapping({"/signup"})
    public ResponseEntity<?> registerNewUser(@RequestBody User user)
    {
       return userService.signUp(user,false);

    }


    @PostMapping({"/addNew"})

    public ResponseEntity<?> addNewUser(@RequestBody User user)
    {
        return userService.signUp(user,true);
    }

    @GetMapping({"/getAll"})
    public ResponseEntity<?> getUsers()
    {
        return userService.getUsers();

    }

    @PutMapping({"/update/{id}"})
    public ResponseEntity<?> updateUser(@RequestBody User user,@PathVariable("id") String id)
    {
        return userService.updateUser(user,id);
    }

    @DeleteMapping({"/delete/{id}"})
    public ResponseEntity<?> deleteUser(@PathVariable("id") String id)
    {
        return userService.deleteUser(id);
    }



    @PutMapping({"/allow/{id}"})
    public ResponseEntity<?> allowUser(@PathVariable("id") String id)
    {

        return userService.allowUser(id);

    }

    @PutMapping({"/ban/{id}"})
    public ResponseEntity<?> banUser(@PathVariable("id") String id)
    {

        return userService.banUser(id);

    }

    @GetMapping("/getUserNamebyID/{id}")
    public String getUserFirstAndLast(@PathVariable String id){
        return userService.getUserFirstAndLast(id);
    }


}
