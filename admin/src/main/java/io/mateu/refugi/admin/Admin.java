package io.mateu.refugi.admin;

import io.mateu.erp.model.authentication.User;
import io.mateu.ui.core.client.app.AbstractModule;
import io.mateu.ui.core.client.app.MenuEntry;
import io.mateu.ui.mdd.client.MDDAction;

import java.util.ArrayList;
import java.util.List;

public class Admin extends AbstractModule {
    @Override
    public String getName() {
        return "Admin";
    }

    @Override
    public List<MenuEntry> getMenu() {
        List<MenuEntry> m = new ArrayList<>();

        m.add(new MDDAction("Users", User.class));

        return m;
    }
}