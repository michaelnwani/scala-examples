import scala.collection.mutable._

class Marker private (val color: String) {
    println(s"Creating ${this}")
    override def toString = s"marker color $color"
}

object Marker {
    private val markers = Map(
        "red" -> new Marker("red"),
        "blue" -> new Marker("blue"),
        "yellow" -> new Marker("yellow")
    )

    def supportedColors = markers.keys
    def apply(color: String) = markers.getOrElseUpdate(color, new Marker(color))
}

println(s"Supported colors are: ${Marker.supportedColors}")
println(Marker("blue"))
println(Marker("red"))