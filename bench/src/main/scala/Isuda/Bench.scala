package Isuda

import isuda.Web
import org.openjdk.jmh.annotations.Benchmark

/**
  * Created by mulyu on 2016/12/04.
  */
class Bench {

  @Benchmark
  def htmlify(): Unit = {
    Web.setup()
    Web.htmlify("test string")
  }
}
