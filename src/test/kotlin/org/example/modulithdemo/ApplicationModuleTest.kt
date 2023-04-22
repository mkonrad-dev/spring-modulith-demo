package org.example.modulithdemo

import org.junit.jupiter.api.Test
import org.springframework.modulith.core.ApplicationModules
import org.springframework.modulith.docs.Documenter

class ApplicationModuleTest {

    @Test
    fun verifyModules() {
        val modules = ApplicationModules.of(ModulithDemoApplication::class.java)
        Documenter(modules).writeModulesAsPlantUml()
        modules.verify()
    }
}