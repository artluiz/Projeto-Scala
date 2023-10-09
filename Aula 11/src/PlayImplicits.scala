import model.Usuario

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import util.ImplicitsConversion._
object PlayImplicits extends App {
  //val user = Usuario("Luiz", LocalDate.parse("13/04/2023", DateTimeFormatter.ofPattern("dd/mm/yyyy")))
  val user = Usuario("Luiz", "13/04/2023": LocalDate)
  println(user)
}