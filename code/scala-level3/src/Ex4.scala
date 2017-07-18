

class Order private (private var id: Int) {

}

object Order {

  def placeOrder(): Order = {
    val order = new Order(23456789);
    order.id = 3456;
    order
  }

}

object Ex4 {

  def main(args: Array[String]): Unit = {

    var order = Order.placeOrder();

  }

}