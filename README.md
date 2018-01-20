# Some Scala Examples
I just store some simple examples to record the process of studying scala

## DSL 

 This section is a simple scala DSL code to calculate  different current expression. 
 I think scala is the most powerful tool to program internal DSL because scala has implicit convertion that means you can use
 simple code to achieve your goal
 
 - `US` , `POU` , `RMB` , the currency you define
 - `>` the result will be convert to the kind of currency
 - `->` return the result (Double)
 - you can use `|` or `()` to use the currency
 
 ```scala   
     5(US)*5 + 3 (POU)/2 - 2 (RMB) > RMB

     (5 | US)*5 + (3 | EUR)/2 - 5 (RMB) > RMB

     (5 | US)*10 + 3 (EUR) -> RMB 
 ```

## Json

A very simple code to parse json 

```scala
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
```

the result : Map("student" -> Map("name" -> "ZY", "address" -> Map("country" -> "China", "city" -> "FZ"), "data" -> Set(160, 85)))



