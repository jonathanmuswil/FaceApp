public final class Eka$a
{
  public final Eka a(JZ paramJZ)
  {
    oXa.b(paramJZ, "data");
    String str1 = paramJZ.m();
    oXa.a(str1, "data.id");
    String str2 = paramJZ.o();
    oXa.a(str2, "data.title");
    Object localObject = paramJZ.k();
    oXa.a(localObject, "data.editorFilterId");
    String str3 = EPa.b((String)localObject);
    localObject = paramJZ.n();
    boolean bool = paramJZ.p();
    Lka localLka = null;
    if (!bool) {
      localObject = null;
    }
    if (localObject != null) {
      localLka = Lka.a.a((raa)localObject);
    }
    paramJZ = paramJZ.l();
    oXa.a(paramJZ, "data.iconUrl");
    return new Eka(str1, str2, str3, localLka, paramJZ);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Eka$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */