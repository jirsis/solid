import java.io.BufferedReader;
import java.io.StringReader;
import java.io.IOException;

public class Parser{
  public static void parse(String scriptTextToProcess) throws IOException{
      BufferedReader reader = new BufferedReader(new StringReader(scriptTextToProcess));
      StringBuilder scope = new StringBuilder();
      String line = reader.readLine();
      while (line != null){
        switch (line.charAt(0)){
            case '$':
                addToVariables(line);
                break;
            case '!':
                if ("!execute".equals(line))
                    executeScope(scope);
                else if (line.startsWith("!custom_command"))
                    runCustomCommand(line, scope);
                else if ("!single_line_directive".equals(line))
                    processDirective(line);
                scope = new StringBuilder();
                break;
            default:
                scope.append(line);
                break;
        }
        line = reader.readLine();
      }
  }

  private static void executeScope(StringBuilder scope){
    System.out.println("scope executed: "+ scope.toString());
  }

  private static void addToVariables(String line){
    System.out.println("variable added: "+ line);
  }

  private static void runCustomCommand(String line, StringBuilder scope){
    System.out.println("run custom command: "+ scope.toString()+" -> "+line);
  }

  private static void processDirective(String line){
    System.out.println("processed: " + line);
  }

}
