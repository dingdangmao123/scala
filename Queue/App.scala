/**
  * Created by suxiaohui on 2018/1/11.
  */
object App {

  def main(argv: Array[String]) {

    var ins = new Queen()

    while (true) {
      print("输入阶数 >> ")
      var n = Console.readInt()
      if(n==0)
        return
      ins.set(n)
      ins.run
      1 to 2
      println("total "+ins.count)
    }
  }
}
