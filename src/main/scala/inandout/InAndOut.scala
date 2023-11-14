package inandout

import java.io.PrintWriter
import scala.io.{BufferedSource, Source}

object InAndOut {

  def main(args: Array[String]): Unit = {

    // 从控制台获取输入
//    val age: Int = scala.io.StdIn.readInt()
//    println(age)

    // 从文件中获取输入
//    val source: BufferedSource = Source.fromFile("D:\\Spark\\scala\\study_demo\\maven-scala\\scala-language\\data")
//    val strings: Iterator[String] = source.getLines()
//    while (strings.hasNext) {
//      println(strings.next())
//    }
//    source.close()
  }

  // 输出到文件
  val out = new PrintWriter("D:\\Spark\\scala\\study_demo\\maven-scala\\scala-language\\dataout")
  out.println("test")
  out.println("scala")
  out.println("out")

  out.close()
}
