import java.util.List;

public final class pda$a
{
  public final pda a()
  {
    return pda.a();
  }
  
  public final pda a(String paramString1, String paramString2)
  {
    oXa.b(paramString1, "serialized");
    oXa.b(paramString2, "separator");
    paramString1 = zYa.a(paramString1, new String[] { paramString2 }, false, 0, 6, null);
    return new pda(VOa.e.a((String)paramString1.get(0)), (String)paramString1.get(1));
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/pda$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */