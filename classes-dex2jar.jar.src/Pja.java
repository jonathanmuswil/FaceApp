import java.util.Comparator;

final class pja<T>
  implements Comparator<qja>
{
  public static final pja a = new pja();
  
  public final int a(qja paramqja1, qja paramqja2)
  {
    oXa.b(paramqja1, "sku1");
    oXa.b(paramqja2, "sku2");
    if (paramqja1 == paramqja2) {
      return 0;
    }
    boolean bool1 = gWa.a(qja.o.a(), paramqja1);
    boolean bool2 = gWa.a(qja.o.a(), paramqja2);
    int i;
    int j;
    if ((bool1) && (bool2))
    {
      i = gWa.b(qja.o.a(), paramqja1);
      j = gWa.b(qja.o.a(), paramqja2);
    }
    for (;;)
    {
      return i - j;
      i = -1;
      if (bool1 != bool2)
      {
        if (!bool1) {
          i = 1;
        }
        return i;
      }
      bool2 = gWa.a(qja.e(), paramqja1);
      bool1 = gWa.a(qja.e(), paramqja2);
      if ((bool2) && (bool1))
      {
        i = gWa.b(qja.e(), paramqja1);
        j = gWa.b(qja.e(), paramqja2);
      }
      else
      {
        if (bool2 != bool1)
        {
          if (!bool2) {
            i = 1;
          }
          return i;
        }
        i = gWa.b(qja.d(), paramqja1);
        j = gWa.b(qja.d(), paramqja2);
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/pja.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */