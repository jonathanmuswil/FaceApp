import java.util.List;

public final class dsa$a$a
{
  public final dsa.a a()
  {
    return dsa.a.a();
  }
  
  public final dsa.a a(String paramString1, String paramString2)
  {
    oXa.b(paramString1, "serialized");
    oXa.b(paramString2, "separator");
    int i = 1;
    paramString2 = zYa.a(paramString1, new String[] { paramString2 }, false, 0, 6, null);
    long l = Long.parseLong((String)paramString2.get(0));
    paramString1 = Integer.valueOf(Integer.parseInt((String)paramString2.get(1)));
    if (paramString1.intValue() <= 0) {
      i = 0;
    }
    if (i == 0) {
      paramString1 = null;
    }
    return new dsa.a(l, paramString1, (String)paramString2.get(2), Integer.parseInt((String)paramString2.get(3)), Integer.parseInt((String)paramString2.get(4)), Boolean.parseBoolean((String)paramString2.get(5)));
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/dsa$a$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */