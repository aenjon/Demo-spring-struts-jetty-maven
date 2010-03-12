package org.jdogma.springstrutstest.action;

import com.opensymphony.xwork2.Action;
import org.apache.struts2.config.Namespace;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

/**
 * @author <a href="mailto:kristian@zenior.no">Kristian Rosenvold</a>
 */
@Controller
@Scope("request")
@Namespace("test")
public class AnotherTestPageAction {
    public AnotherTestPageAction getController(){
        return this;
    }

    public String execute() {
        return Action.SUCCESS;
    }

}
