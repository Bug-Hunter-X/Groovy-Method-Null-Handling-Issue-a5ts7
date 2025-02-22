```groovy
def myMethod(a, b) {
  if (a == null || b == null) {
    throw new IllegalArgumentException("Null values are not allowed.") //Throw an exception for better error handling
  }
  return a + b
}

println myMethod(5, 5)   //Prints 10

try {
  println myMethod(null, 5) 
} catch (IllegalArgumentException e) {
  println "Exception caught: ${e.message}"
}

try {
  println myMethod(5, null) 
} catch (IllegalArgumentException e) {
  println "Exception caught: ${e.message}"
}
```