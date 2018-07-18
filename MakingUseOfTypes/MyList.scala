class MyList[+T] //...

var list1 = new MyList[Int]
var list2 : MyList[Any] = null
list2 = list1 // OK

// whatever I assign to list2, it must be a subtype or equal in type to list2 ^

// if class MyList[-T]: whatever I assign to list2, list2 would have to be a subtype or equal to that type.
