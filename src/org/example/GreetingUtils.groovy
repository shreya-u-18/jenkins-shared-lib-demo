package org.example

import java.io.Serializable

class GreetingUtils implements Serializable {
    def script

    GreetingUtils(script) {
        this.script = script
    }

    def greetUser(String name) {
        script.echo "Hello ${name}, welcome to Jenkins!"
    }
}
