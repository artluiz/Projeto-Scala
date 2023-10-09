package Classes
import scala.util.Try
object UsandoOption extends App{

  val calc = new Calculadora
  val res = Try(10/0).toOption match{
    case Some(value) => value
    case None => "Divisão inválida"
  }

  println(res)
}
