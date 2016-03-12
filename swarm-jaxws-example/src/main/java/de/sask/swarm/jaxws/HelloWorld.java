package de.sask.swarm.jaxws;

import javax.jws.WebService;

@WebService
public class HelloWorld {

    public String sayHello(String name) {
        return "Hello " + name + "!!!";
    }

}
