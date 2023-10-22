package esprit.tn.msusermanagament.controller;

import esprit.tn.msusermanagament.entity.Agent;
import esprit.tn.msusermanagament.repository.AgentDao;
import esprit.tn.msusermanagament.service.IAgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/agent")
public class AgentController {
    @Autowired
    AgentDao agentDao;
    @Autowired
    IAgentService agentService;

    @PostMapping("/addAgent")
    @ResponseBody
    public Agent ajoutAgent(@RequestBody Agent agent){
        return agentService.ajoutAgent(agent);
    }

    @GetMapping("/getAgentById/{idAgent}")
    public Agent getAgent(@PathVariable Long idAgent){
        return agentDao.getAgentByIdAgent(idAgent);
    }

    @GetMapping("/getAllAgents")
    public List<Agent> getAllAgent(){
        return agentDao.findAll();
    }

}
