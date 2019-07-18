import java.util.List;

public final class ika$a
{
  public final ika a(afa paramafa)
  {
    oXa.b(paramafa, "data");
    return new ika(paramafa.getSource(), paramafa.getWidth(), paramafa.getHeight());
  }
  
  public final ika a(String paramString1, String paramString2)
  {
    oXa.b(paramString1, "serialized");
    oXa.b(paramString2, "separator");
    paramString1 = zYa.a(paramString1, new String[] { paramString2 }, false, 0, 6, null);
    return new ika((String)paramString1.get(0), Integer.parseInt((String)paramString1.get(1)), Integer.parseInt((String)paramString1.get(2)));
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ika$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */