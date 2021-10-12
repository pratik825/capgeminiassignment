public class Main
{
  public static void main(String[] args)
  {
      String name ="Mary has a little dog . she call him Pun";
      System.out.println(name.toUpperCase());
      System.out.println(name.toLowerCase());
      String words[]=name.split("\\s");
      String capitalizeStr="";
      for(String word :words)
      {
          String firstLetter =word.substring(0,1);
          String remainningLetters =word.substring(1);
          capitalizeStr+=firstLetter.toUpperCase()+remainningLetters+" ";
      }
      System.out.println(capitalizeStr);
  }
}
