import scala.io.Source
import scala.xml._

// requires an api key
def getWeatherData(city: String) = {
  val url = "http://api.openweathermap.org/data/2.5/weather"
  var key = "fd546fe5bcd81ffaede9925b082bcd6e"
  val response = Source.fromURL(s"$url?q=$city&units=imperial&mode=xml&APPID=$key")
  val xmlResponse = XML.loadString(response.mkString)

  val cityName = (xmlResponse \\ "city" \ "@name").text
  val temperature = (xmlResponse \\ "temperature" \ "@value").text
  val condition = (xmlResponse \\ "weather" \ "@value").text

  (cityName, temperature, condition)
}

def printWeatherData(weatherData: (String, String, String)) = {
  val (cityName, temperature, condition) = weatherData

  println(f"$cityName%-15s $temperature%-6s $condition")
}

def timeSample(getData: List[String] => List[(String, String, String)]) = {
  val cities = List("Houston,us", "Chicago,us", "Boston,us", "Minneapolis,us",
    "Oslo,norway","Tromso,norway","Sydney,australia","Berlin,germany",
    "London,uk","Krakow,poland","Rome,italy","Stockholm,sweden",
    "Bangalore,india","Brussels,belgium","Reykjavik,iceland")
  
  val start = System.nanoTime
  getData(cities) sortBy { _._1 } foreach printWeatherData
  val end = System.nanoTime
  println(s"Time taken: ${(end - start)/1.0e9} sec")
}

// convert to parallel collection, then back to sequential collection
timeSample { cities => (cities.par map getWeatherData).toList }
