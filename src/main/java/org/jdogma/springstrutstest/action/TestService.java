package org.jdogma.springstrutstest.action;

import org.apache.struts2.dispatcher.ServletDispatcherResult;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 * @author Kristian Rosenvold
 */
@Service
public class TestService {


    private String namespace;
    private String action;
    private String method;

    public void setXnamespace(String namespace) {
        this.namespace = namespace;
    }

    public void setXaction(String action) {
        this.action = action;
    }

    public void setXmethod(String method) {
        this.method = method;
    }

    public String getXnamespace() {
        return this.namespace;
    }

    public String getXactionAndMethod() {
        return this.action + "!" + this.method;
    }


}