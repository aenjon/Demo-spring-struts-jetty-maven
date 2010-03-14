package org.jdogma.springstrutstest.action;

import com.opensymphony.xwork2.Action;
import org.apache.struts2.config.Namespace;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope("request")
public class AnotherTestPageAction {
    public AnotherTestPageAction getController(){
        return this;
    }

    public String execute() {
        return Action.SUCCESS;
    }

}
