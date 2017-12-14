import org.apache.spark.{SparkConf, SparkContext}

/**
  *
  * Author hustxq.
  * Date 2017/12/14 11:07
  */
object WordCountTest {
  def main(args: Array[String]) {
    val conf = new SparkConf()
    conf.setAppName("WordCount").setMaster("local[2]")
    val sc = new SparkContext(conf)
    //    read file
    /*val rdd = sc.textFile("D:\\scala-data\\wc.txt")
    rdd.flatMap(line => line.split(" ")).map(w => (w, 1)).reduceByKey((x, y) => x + 1).foreach(println)*/
    //    from list to rdd
    /*val s = List("1","2");
    val srdd = sc.parallelize(s)
    println(srdd.map(i => i.toInt).reduce((s, i) => s + i))
    */
    val a = sc.parallelize(1 to 9, 3)
    println(a.collect())
    val b = a.map(_*2)
    println(b.collect())
  }
}