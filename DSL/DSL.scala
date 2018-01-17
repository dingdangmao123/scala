package DSL

/**
  * Created by suxiaohui on 2018/1/16.
  */
/**
  * Created by suxiaohui on 2018/1/16.
  */
object DSL {

  implicit def convert(v: Double) = new DSL(v)

}

class DSL(v: Double) {

  var value = 0.0

  var currentName=""

  def getValue = {

    value

  }

  def apply(ins: Money): DSL = {

    value = v * ins.getValue

    this
  }

  def |(ins: Money): DSL = {

    value = v * ins.getValue

    this
  }

  def +(ins: DSL): DSL = {

    value = value + ins.getValue
    this
  }

  def -(ins: DSL): DSL = {

    value = value - ins.getValue
    this
  }


  def *(mul:Double):DSL={
    value=value*mul
    this
  }

  def /(div:Double):DSL={
    if(div==0.0)
      throw new IllegalArgumentException("the arg can't be zero!")
    value=value/div
    this
  }

  def ->(ins: Money): Double = {

    currentName=ins.getName

    value=value / ins.getValue

    value

  }

  def >(ins: Money):Unit= {

    currentName=ins.getName

    value=value / ins.getValue

    println("the result is "+value+" "+currentName)

  }

}

abstract class Money {
  def getValue: Double;
  def getName:String;
}


object US extends Money {
  def getValue= 6
  def getName: String = "US"
}

object POU extends Money {
  def getValue=10

  def getName: String = "POU"
}

object RMB extends Money {
  def getValue =1
  def getName: String = "RMB"

}

object EUR extends Money {
  def getValue = 8
  def getName = "EUR"
}


