# Some Scala Examples
I just store some simple examples to record the process of studying scala

## DSL 

 a simple scala DSL code to calculate  different current expression
 
 - `US` , `POU` , `RMB` , the currency you define
 - `>` the result will be convert to the kind of currency
 - `->` return the result (Double)
 - you can use `|` or `()` to use the currency
 
 ```scala   
     5(US)*5 + 3 (POU)/2 - 2 (RMB) > RMB

     (5 | US)*5 + (3 | EUR)/2 - 5 (RMB) > RMB

     (5 | US)*10 + 3 (EUR) -> RMB 
 ```

## Updating....


