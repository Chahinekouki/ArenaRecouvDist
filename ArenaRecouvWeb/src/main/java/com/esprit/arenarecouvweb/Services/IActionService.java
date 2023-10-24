package com.esprit.arenarecouvweb.Services;

import com.esprit.arenarecouvweb.Entity.Action;

import java.util.List;

public interface IActionService {
    public List<Action> returnActionsByIdClient(String idClient);
    public List<Action> allAction();
}
