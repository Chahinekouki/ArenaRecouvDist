package tn.gti.recouvgtiproject.Entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
@Getter
@Setter
@ToString
public class Role {

    @Id
    private String roleName;
    private String roleDescription;

}
