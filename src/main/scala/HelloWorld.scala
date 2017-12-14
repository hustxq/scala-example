import java.io.{FileNotFoundException, FileReader, IOException}

/**
  *
  * Author hustxq.
  * Date 2017/12/14 11:25
  */
object HelloWorld {
  //extends App
  //  override def main(args: Array[String]): Unit = super.main(args)
  def main(args: Array[String]) {
    //    cmd
    //    structure array
    /*val arr = new Array[String](3);
    arr(0) = "a"
    arr(1) = "b"
    arr.update(2, "c")
    arr.foreach(println)
    val sarr = Array(1, 2, 3)
    sarr.foreach(println)*/
    //    list
    /*val one = List(1, 2, 3)
    val two = List(2,3,4)
    val three = one:::two
    three.foreach(println)
    val four = one::two::Nil
    println(four)*/
    //    four.foreach(println)
    //    Tuples 元组
    val pair = (1, "two")
    println(pair)
    println(pair._2)
    //    Set immutable
    var set = Set(1, 2)
    println(set)
    set += 3
    println(set.contains(3))
    //    map
    val roman = Map(1 -> "I", 2 -> "II")
//    roman += 3 -> "III"
    println(roman.apply(3))
  }

  def cmd: Unit = {
    println("Hello World!")
    val a = 12
    var b = 5
    println(b)
    b = 6
    println(a + ":" + b + ",max:" + max(a, b))
    for (i <- 1 to 3)
      println(i)
    for (i <- 1 until 3)
      println(i)
    //    switch case  match
    val m = "gyt"
    m match {
      case "gyt" => println("ok")
      case "cyan" => println("no")
    }
    //    try catch
    try {
      val file = new FileReader("d:\\scala-data\\in.txt")
    } catch {
      case ex: FileNotFoundException => println(ex.getMessage)
      case ex: IOException => println(ex.getMessage)
    } finally {
      println("end")
    }
    //    readLine
    val name = readLine("Your name:\n")
    println(name)
  }

  def max(a: Int, b: Int): Int = {
    if (a > b) a
    else b
  }
}
