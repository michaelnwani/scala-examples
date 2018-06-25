import scala.beans.BeanProperty // generates Java-style getters/setters (non-idiomatic)

class Dude(@BeanProperty val firstName: String, val lastName: String) {
    @BeanProperty var position: String = _
}