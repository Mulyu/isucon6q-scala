import isuda.Web
import org.openjdk.jmh.annotations.Benchmark

/**
  * Created by mulyu on 2016/12/04.
  */
class IsudaBench {

  @Benchmark
  def htmlify(): Unit = {
    Web.htmlify("test string")
  }
}
