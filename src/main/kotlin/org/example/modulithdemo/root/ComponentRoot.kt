package org.example.modulithdemo.root

import org.example.modulithdemo.modules.one.ComponentOne
import org.springframework.stereotype.Component

@Component
class ComponentRoot(private val componentOne: ComponentOne) {
    fun callOne() {
        componentOne.callRoot()
    }
}