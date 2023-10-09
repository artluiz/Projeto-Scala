package model

import java.time.LocalDate
import util.ImplicitsConversion.localDateToString

case class Usuario(nome: String, data: LocalDate){
  override def toString: String = s"Usuario($nome, ${data: String})"
}
