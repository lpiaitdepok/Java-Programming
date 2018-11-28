import java.io.PrintWriter;
public class PrintWriterExample {
  public static void main(String[] args) throws Exception {
    //Data to write on Console using PrintWriter
    PrintWriter writer = new PrintWriter(System.out);
    writer.write("hello world");
    writer.flush();
    writer.close();
  }
}
