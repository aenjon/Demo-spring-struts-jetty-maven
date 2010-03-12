package org.jdogma.springstrutstest;

import org.springframework.stereotype.Controller;
import org.springframework.context.annotation.Scope;
import org.springframework.beans.factory.annotation.Autowired;
import org.apache.struts2.config.Namespace;
import org.apache.struts2.config.Result;
import org.apache.struts2.dispatcher.ServletDispatcherResult;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Action;

/**
 * @author <a href="mailto:maja@zenior.no">Maja S Bratseth</a>
 */
@Controller
@Scope("request")
@Namespace("test")
@Result(name = Action.SUCCESS, value= "/WEB-INF/testPage.jspx", type= ServletDispatcherResult.class)
public class TestAction {


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

    public String execute() {
        return ActionSupport.SUCCESS;
    }

    public TestAction getController() {
        return this;
    }

}
