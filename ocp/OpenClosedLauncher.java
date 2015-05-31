import java.io.IOException;

public class OpenClosedLauncher{

  public static void main(String args[]) throws IOException{
    String simpleScript =
      "$foo=314 \n"+
      "$bar=42 \n"+
      "command1\n"+
      "!execute\n"+
      "!single_line_directive\n"+
      "!execute\n"+
      "$fooBar=42314\n"+
      "";
    Parser.parse(simpleScript);
  }
}
