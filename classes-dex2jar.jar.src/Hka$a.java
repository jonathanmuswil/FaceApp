import java.util.List;

public final class hka$a
{
  public final hka a(ZY paramZY, bfa parambfa)
  {
    oXa.b(paramZY, "data");
    oXa.b(parambfa, "host");
    String str1 = paramZY.m();
    oXa.a(str1, "data.thumbnail");
    String str2 = paramZY.k();
    oXa.a(str2, "data.code");
    VOa.a locala = VOa.e;
    paramZY = paramZY.l();
    oXa.a(paramZY, "data.gender");
    return new hka(str1, str2, locala.a(paramZY), parambfa.getHost(), parambfa.getPort());
  }
  
  public final hka a(String paramString1, String paramString2)
  {
    oXa.b(paramString1, "serialized");
    oXa.b(paramString2, "separator");
    paramString1 = zYa.a(paramString1, new String[] { paramString2 }, false, 0, 6, null);
    return new hka((String)paramString1.get(0), (String)paramString1.get(1), VOa.e.a((String)paramString1.get(2)), (String)paramString1.get(3), Integer.parseInt((String)paramString1.get(4)));
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/hka$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */