import java.util.Comparator;

final class ge
  implements Comparator<he.e>
{
  public int a(he.e parame1, he.e parame2)
  {
    int i = parame1.a - parame2.a;
    int j = i;
    if (i == 0) {
      j = parame1.b - parame2.b;
    }
    return j;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ge.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */