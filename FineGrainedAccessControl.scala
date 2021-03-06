package society {
    package professional {
        class Executive {
            private[professional] var workDetails = null
            private[society] var friends = null
            private[this] var secrets = null

            def help(another: Executive) = {
                println(another.workDetails)
                println(secrets)
                println(another.secrets) // ERROR
            }
        }

        class Assistant {
            def assist(anExec: Executive) = {
                println(anExc.workDetails)
                println(anExec.friends)
            }
        }
    }

    package social {
        class Acquaintance {
            def socialize(person: professional.Executive) {
                println(person.friends)
                println(person.workDetails) // ERROR
            }
        }
    }
}