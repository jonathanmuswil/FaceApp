import java.io.File;
import java.util.Comparator;

final class nba
  implements Comparator<File>
{
  public int a(File paramFile1, File paramFile2)
  {
    return (int)(paramFile1.lastModified() - paramFile2.lastModified());
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/nba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */