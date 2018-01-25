/**
  * Created by suxiaohui on 2018/1/11.
  */

import Array._

class Queen{

  var n=0

  var count=0

  var data = ofDim[Boolean](0, 0)

  def set(n:Int): Unit ={
    data=ofDim[Boolean](n, n)
    this.n=n
    count=0
    val b=data(2)
  }


  def check(m: Int, n: Int): Boolean = {

    for (i <- 0 to this.n - 1)
      if (data(m)(i))
        return false

    for (i <- 0 to this.n - 1)
      if (data(i)(n))
        return false

    var i = m
    var j = n
    while (i < this.n && j < this.n) {
      if (data(i)(j))
        return false
      i = i + 1
      j = j + 1
    }

    i = m
    j = n
    while (i >= 0 && j >= 0) {
      if (data(i)(j))
        return false
      i = i - 1
      j = j - 1
    }

    i = m
    j = n
    while (i >= 0 && j < this.n) {
      if (data(i)(j))
        return false
      i = i - 1
      j = j + 1
    }
    i = m
    j = n
    while (i < this.n && j >= 0) {
      if (data(i)(j))
        return false
      i = i + 1
      j = j - 1
    }

    return true
  }

  def run(): Unit = {

    dp(0)
    // println("run....")
  }

  def dp(l: Int): Unit = {

    if (l == n) {
      count+=1
      show()
      return
    }

    for (i <- 0 to n - 1) {
      if (check(l, i)) {

        data(l)(i) = true
        dp(l + 1)
        data(l)(i) = false
      }
    }
  }

  def show(): Unit = {

    for (i <- 0 to n - 1) {
      for (j <- 0 to n - 1) {
        if (data(i)(j))
          print(" Q ")
        else
          print(" N ")
      }
      println()
    }
    println()
  }
}

