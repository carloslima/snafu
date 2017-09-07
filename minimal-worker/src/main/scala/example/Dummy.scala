
import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

object Dummy {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setMaster("local[4]").setAppName("Test")
    val sc = new SparkContext(conf)
    sc.makeRDD(1 to 1000, 10).map(x => Some(x)).count
    sc.stop()
  }
}
