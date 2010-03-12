package org.jdogma.springstrutstest;

import com.opensymphony.xwork2.Action;

/**
 * @author <a href="mailto:kristian@zenior.no">Kristian Rosenvold</a>
 */
public class AnotherTestPageAction {


    public AnotherTestPageAction getController(){
        return this;
    }
    public String execute() {
        return Action.SUCCESS;
    }

}
