object UseFunction {

  def main(args: Array[String]): Unit = {
    def test():Unit ={
      print("test function")
    }
    test()
  }
  def test(): Unit = {
    print("test method")
  }
  test()
}
