
import scala.util.parsing.combinator.JavaTokenParsers

object Json extends JavaTokenParsers{


    val obj:Parser[Map[String,Any]]="{"~>repsep(key,",")<~"}"   ^^  {l=>var m=Map[String,Any](); l.foreach(x=>m=m++x);m}

    var arr:Parser[Any]="["~>repsep(value,",")<~"]" ^^ {l=>  var s=Set[Any]();l.foreach(i=>s=s+i);s}

    var key:Parser[Map[String,Any]]=stringLiteral ~":" ~ value ^^{ case str~":"~v =>Map[String,Any](str->v)}

    val value:Parser[Any]= floatingPointNumber | stringLiteral | obj | arr  | key

    def main(args: Array[String]): Unit = {

        var js=
            """{
         "student":{
         "name":"ZY",
         "address":{
         "country":"China",
         "city": "FZ"
         }, "data":[
         160,
         85]
          }}
            """
        println(Json.parseAll(value,js))
    }
}