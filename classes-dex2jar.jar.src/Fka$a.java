import java.util.List;

public final class fka$a
{
  public final fka a(Rea paramRea)
  {
    oXa.b(paramRea, "data");
    Object localObject = paramRea.getUser();
    if (localObject != null)
    {
      localObject = dka.b.a((Qea)localObject);
      if (localObject != null) {}
    }
    else
    {
      localObject = dka.b.a();
    }
    return new fka((dka)localObject, gka.b.a(paramRea));
  }
  
  public final fka a(String paramString1, String paramString2, String paramString3)
  {
    oXa.b(paramString1, "serialized");
    oXa.b(paramString2, "separator");
    oXa.b(paramString3, "subSeparator");
    paramString1 = zYa.a(paramString1, new String[] { paramString2 }, false, 0, 6, null);
    return new fka(dka.b.a((String)paramString1.get(0), paramString3), gka.b.a((String)paramString1.get(1), paramString3));
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/fka$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */