package org.example.modulithdemo.modules.one

import org.example.modulithdemo.modules.two.ComponentTwo
import org.springframework.stereotype.Component

@Component
class ComponentOne(private val componentTwo: ComponentTwo) {

    fun callTwo() {
        componentTwo.callOne()
    }
}