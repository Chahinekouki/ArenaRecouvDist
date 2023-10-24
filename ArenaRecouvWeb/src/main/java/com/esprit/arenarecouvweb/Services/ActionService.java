package com.esprit.arenarecouvweb.Services;
import com.esprit.arenarecouvweb.Repository.ActionDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.esprit.arenarecouvweb.Entity.Action;

import java.util.List;

@Service
@Slf4j
public class ActionService implements IActionService {
    @Autowired
    ActionDao actionDao;


    @Override
    public List<Action> returnActionsByIdClient(String idClient) {

        return actionDao.returnActionsByIdClient(idClient);
    }

    @Override
    public List<Action> allAction() {
        return actionDao.findAll();
    }
}
