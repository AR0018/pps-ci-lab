package interoperability

import example.*

@main
def hello() =
  val h:Hello = new Hello()
  h.sayHello()