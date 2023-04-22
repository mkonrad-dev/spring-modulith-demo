package org.example.modulithdemo.modules.one

import org.example.modulithdemo.modules.ComponentRoot
import org.example.modulithdemo.modules.two.ComponentTwo
import org.springframework.stereotype.Component

@Component
class ComponentOne(private val componentTwo: ComponentTwo, private val componentRoot: ComponentRoot) {

    fun callTwo() {
        componentTwo.callOne()
    }

    fun callRoot() {
        componentRoot.callOne()
    }
}