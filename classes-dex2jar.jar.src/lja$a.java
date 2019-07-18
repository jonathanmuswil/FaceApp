import java.util.List;

public final class lja$a
{
  public final lja a(String paramString1, String paramString2)
  {
    oXa.b(paramString1, "serialized");
    oXa.b(paramString2, "separator");
    paramString2 = zYa.a(paramString1, new String[] { paramString2 }, false, 0, 6, null);
    paramString1 = lja.e.e.a(Integer.parseInt((String)paramString2.get(0)));
    if (paramString1 == null) {
      paramString1 = lja.e.a;
    }
    int i = kja.a[paramString1.ordinal()];
    if (i != 1)
    {
      if (i != 2)
      {
        if (i == 3) {
          return new lja.c(qja.o.a((String)paramString2.get(1)), (String)paramString2.get(2));
        }
        throw new UVa();
      }
      paramString1 = lja.b.c;
    }
    else
    {
      paramString1 = lja.d.c;
    }
    return paramString1;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/lja$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */