package esprit.tn.msusermanagament.repository;

import esprit.tn.msusermanagament.entity.Agent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AgentDao extends JpaRepository<Agent,Long> {
    public Agent getAgentByIdAgent(Long idAgent);

}
