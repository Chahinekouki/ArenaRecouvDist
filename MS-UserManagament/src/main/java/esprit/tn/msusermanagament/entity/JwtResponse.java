package esprit.tn.msusermanagament.entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class JwtResponse {

    private User user;
    private String jwtToken;


}
