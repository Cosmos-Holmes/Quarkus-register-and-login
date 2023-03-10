package org.acme;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class SimpleApplication implements QuarkusApplication {
    public static void main(String[] args){
        Quarkus.run(SimpleApplication.class,args);
    }
    @Override
    public int run(String... args){
        Quarkus.waitForExit();
        return 0;
    }

}
