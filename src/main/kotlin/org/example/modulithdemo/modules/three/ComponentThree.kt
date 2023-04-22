package org.example.modulithdemo.modules.three

import org.example.modulithdemo.modules.two.ComponentTwo
import org.springframework.stereotype.Component

@Component
class ComponentThree(private val componentTwo: ComponentTwo) {

    fun callTwo() {
        componentTwo.callThree()
    }
}