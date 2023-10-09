package util

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import scala.language.implicitConversions

object ImplicitsConversion {
  val pattern = DateTimeFormatter.ofPattern("dd/MM/yyyy")
//  implicit def stringToLocalDate(dataStr: String): LocalDate ={
//    LocalDate.parse(dataStr, pattern)
//  }
//
//  implicit def localDateToString(localDate: LocalDate): String =
//    localDate.format(pattern)
  implicit class StringUtils(str: String){
    implicit def stringToLocalDate = {
      LocalDate.parse(str, pattern)
    }
  }

  implicit class localDateUtils(localDate: LocalDate) {
    implicit def localDateToString =
    localDate.format(pattern)
  }
}
