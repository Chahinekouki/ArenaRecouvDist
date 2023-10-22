package esprit.tn.msusermanagament.service;

import esprit.tn.msusermanagament.entity.Agent;
import esprit.tn.msusermanagament.repository.AgentDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Slf4j
@Service
public class AgentService implements IAgentService{
    @Autowired
    AgentDao agentDao;

    @Override
    public Agent ajoutAgent(Agent agent) {
        for(Agent a:agentDao.findAll()){
            if(a.getIdAgent()==agent.getIdAgent()){
                a.setNomPrenom(agent.getNomPrenom());
                a.setProfil(agent.getProfil());
                a.setQuery(agent.getQuery());

                return agentDao.save(a);
            }else{
                return agentDao.save(agent);
            }
        }
        return agent;
    }
}
