package scala.OOP.constructor

class Person0(var name: String, var age: Int) {

  def this (age: Int){
    this(Person0.DEFAULT_NAME, age)
  }

  def this(name:String){
    this( name, Person0.DEFAULT_AGE)
  }

  def this(){
    this(Person0.DEFAULT_NAME, Person0.DEFAULT_AGE)
  }
}

// Companion object - хранение констант
object Person0{
  val DEFAULT_NAME = "Dima"
  val DEFAULT_AGE = 29
}

object DemoPer extends App{
  println(new Person0("Dima").age)

  //  TODO - вывести
  println(new Person0("Dima").toString)
}