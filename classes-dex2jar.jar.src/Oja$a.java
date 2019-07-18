import java.util.List;

public final class oja$a
{
  public final oja a()
  {
    return oja.a();
  }
  
  public final oja a(String paramString1, String paramString2, String paramString3)
  {
    oXa.b(paramString1, "serialized");
    oXa.b(paramString2, "separator");
    oXa.b(paramString3, "subSeparator");
    paramString1 = zYa.a(paramString1, new String[] { paramString2 }, false, 0, 6, null);
    return new oja(lja.a.a((String)paramString1.get(0), paramString3), nja.b.a((String)paramString1.get(1), paramString3));
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/oja$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */