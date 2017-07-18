import java.io._

class Resource {
  def init = println("Init...");
  def use = { println("Use..."); };
  def close = println("Close...");
}

object Ex13 {

  def main(args: Array[String]): Unit = {

    // resource-object
    /*
     *  .init()
     *  .use()
     *  .close()
     * 
     */

    //    var in = new FileInputStream("Notes.txt")
    //    var out = new FileOutputStream("Notes_backup.txt")
    //
    //    try {
    //      var c = 0;
    //      while ({ c = in.read; c != -1 }) {
    //        out.write(c);
    //      }
    //    } catch {
    //      case e: IOException =>
    //        e.printStackTrace();
    //    } finally {
    //      in.close();
    //      out.close();
    //    }

    val r = new Resource;
    r.init;
    try {
      r.use
      return ;
      //r.close
    } catch {
      case t: Throwable => { t.printStackTrace(); }
    } finally {
      r.close
    }

    println("con with other work..")

  }

}