package org.example

class HelloUtils implements Serializable {
    def script

    HelloUtils(script) {
        this.script = script
    }

    def sayHelloJenkins() {
        script.echo "Hello Jenkins"
    }
}
