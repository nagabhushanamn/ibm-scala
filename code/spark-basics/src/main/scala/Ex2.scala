

import org.apache.spark.SparkContext
import org.apache.spark.SparkConf

object Ex2 {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("WordCounter")
    val sc = new SparkContext(conf)
    val textFile = sc.textFile("/Users/Training/derby.log")
    println("sparked...")
    //    val tokenizedFileData = textFile.flatMap(line => line.split(" "))
    //    val countPrep = tokenizedFileData.map(word => (word, 1))
    //    val counts = countPrep.reduceByKey((accumValue, newValue) => accumValue + newValue)
    //    val sortedCounts = counts.sortBy(kvPair => kvPair._2, false)
    //    sortedCounts.saveAsTextFile("file:///PluralsightData/ReadMeWordCountViaApp")
  }
}