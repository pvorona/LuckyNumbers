object Main {
  def main (args: Array[String]){
    println(LuckyScala.isLucky("123600"))
    println(LuckyScala.countLucky(123456123456L, 123456123465L))
    println(LuckyScala.countLucky("00123456123456", "000000123456123465"))
  }
}