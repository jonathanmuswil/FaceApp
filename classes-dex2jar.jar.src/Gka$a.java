import java.util.List;

public final class gka$a
{
  public final gka a()
  {
    return gka.a();
  }
  
  public final gka a(Rea paramRea)
  {
    oXa.b(paramRea, "data");
    Object localObject = Uma.qa.k().get();
    oXa.a(localObject, "AppPreferences.debugTokenLifetime30Sec.get()");
    long l;
    if (((Boolean)localObject).booleanValue()) {
      l = 30L;
    } else {
      l = Long.parseLong(paramRea.getUser_token_lifetime());
    }
    return new gka(paramRea.getUser_token(), System.currentTimeMillis() + l * 'Ϩ');
  }
  
  public final gka a(String paramString1, String paramString2)
  {
    oXa.b(paramString1, "serialized");
    oXa.b(paramString2, "separator");
    paramString1 = zYa.a(paramString1, new String[] { paramString2 }, false, 0, 6, null);
    return new gka((String)paramString1.get(0), Long.parseLong((String)paramString1.get(1)));
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/gka$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */