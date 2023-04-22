package org.example.modulithdemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.modulith.Modulithic

@SpringBootApplication
@Modulithic(additionalPackages = ["org.example.modulithdemo.modules"], useFullyQualifiedModuleNames = true)
class ModulithDemoApplication

fun main(args: Array<String>) {
    runApplication<ModulithDemoApplication>(*args)
}
