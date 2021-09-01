class Guitar {
  def manufacturer(Model: String): Unit = {
    println("Manufacturer Of the Guitar : " + Model)
  }
def Volume(volume:Int):Unit={
  println("Volume of the guitar : "+volume)
}}
class RockstarGuitar extends Guitar {
  def Color(GuitarColor: String): Unit = {
    println("Change the color of the guitar:" + GuitarColor)
  }
}
object OpenClose extends App{
  val myGuitar = new RockstarGuitar
  myGuitar.manufacturer("Yahama")
  myGuitar.Volume(55)
  myGuitar.Color("Grey")
}