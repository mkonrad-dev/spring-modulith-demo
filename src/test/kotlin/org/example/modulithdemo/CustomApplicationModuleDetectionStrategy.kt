package org.example.modulithdemo

import org.springframework.modulith.core.ApplicationModuleDetectionStrategy
import org.springframework.modulith.core.JavaPackage
import java.util.stream.Stream

class CustomApplicationModuleDetectionStrategy : ApplicationModuleDetectionStrategy {

    /**
     * Identifies the following two modules:
     * - org.example.modulithdemo.modules.one
     * - org.example.modulithdemo.modules.two
     *
     * Check target/spring-modulith-docs/components.puml after running ApplicationModuleTest.kt
     */
    override fun getModuleBasePackages(basePackage: JavaPackage): Stream<JavaPackage> =
        when (basePackage.name) {
            "org.example.modulithdemo.modules" -> basePackage.directSubPackages.stream().flatMap { getModuleBasePackages(it) }
            "org.example.modulithdemo.modules.root", "org.example.modulithdemo.modules.one", "org.example.modulithdemo.modules.two" -> Stream.of(basePackage)
            else -> Stream.empty()
        }
}