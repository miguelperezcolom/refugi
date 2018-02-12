package io.mateu.refugi.admin;

import io.mateu.erp.model.util.Helper;
import io.mateu.ui.core.client.app.AbstractApplication;
import io.mateu.ui.core.client.app.AbstractArea;

import java.util.ArrayList;
import java.util.List;

public class AdminApp extends AbstractApplication
{
    static {
        Helper.loadProperties();
    }


    @Override
    public String getName() {
        return "Es refugi";
    }

    @Override
    public List<AbstractArea> getAreas() {
        List<AbstractArea> l = new ArrayList<>();
        l.add(new Area());
        return l;
    }

}