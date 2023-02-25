package com.jinyoung.springmodulith;

import org.junit.jupiter.api.Test;
import org.springframework.modulith.core.ApplicationModules;
import org.springframework.modulith.docs.Documenter;

public class ModulithTests {

    @Test
    public void writeDocumentation() {
        ApplicationModules modules = ApplicationModules.of(SpringModulithApplication.class).verify();
        new Documenter(modules)
                .writeModulesAsPlantUml();
    }
}
