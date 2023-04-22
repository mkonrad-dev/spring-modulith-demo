package org.example.modulithdemo.modules.two

import org.example.modulithdemo.modules.one.ComponentOne
import org.example.modulithdemo.modules.three.ComponentThree
import org.springframework.stereotype.Component

@Component
class ComponentTwo(private val componentOne: ComponentOne, private val componentThree: ComponentThree) {

    fun callOne() {
        componentOne.callTwo()
    }

    fun callThree() {
        componentThree.callTwo()
    }
}
