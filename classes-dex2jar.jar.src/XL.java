import java.io.File;
import java.util.Comparator;

final class xl
  implements Comparator<File>
{
  public int a(File paramFile1, File paramFile2)
  {
    return paramFile1.getName().compareTo(paramFile2.getName());
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/xl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */