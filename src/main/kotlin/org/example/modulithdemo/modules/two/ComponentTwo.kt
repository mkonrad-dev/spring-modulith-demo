package org.example.modulithdemo.modules.two

import org.example.modulithdemo.modules.one.ComponentOne
import org.springframework.stereotype.Component

@Component
class ComponentTwo(private val componentOne: ComponentOne) {

    fun callOne() {
        componentOne.callTwo()
    }
}
