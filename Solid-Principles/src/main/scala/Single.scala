class AddUser {
  def createUser(user: String): Unit = {
    println(user + " Created Succesfully")
  }
}
class Booking {
  def Bookingdone(amount: Int): Unit = {
    println("You have deposited the amount:  " + amount + " Your Booking is Successful")
  }
}

object Single extends App{


  val AllData1 = new AddUser
  AllData1.createUser("Rahul")
  AllData1.createUser("Raviyanshu")
  AllData1.createUser("Aditya")
  AllData1.createUser("Rituraj")

  val AllData = new Booking
  AllData.Bookingdone(5000)
  AllData.Bookingdone(6000)
  AllData.Bookingdone(7000)
  AllData.Bookingdone(8000)
}