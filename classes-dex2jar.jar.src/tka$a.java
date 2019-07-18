public final class tka$a
{
  public final tka a(oaa paramoaa)
  {
    oXa.b(paramoaa, "data");
    String str1 = paramoaa.l();
    oXa.a(str1, "data.id");
    String str2 = paramoaa.o();
    oXa.a(str2, "data.title");
    boolean bool1 = paramoaa.m();
    Object localObject1;
    Object localObject2;
    if (paramoaa.p())
    {
      localObject1 = VOa.e;
      localObject2 = paramoaa.n();
      oXa.a(localObject2, "data.preview");
      localObject2 = ((daa)localObject2).m();
      oXa.a(localObject2, "data.preview.gender");
      localObject1 = ((VOa.a)localObject1).a((OZ)localObject2);
    }
    else
    {
      localObject1 = VOa.a;
    }
    boolean bool2 = paramoaa.p();
    String str3 = null;
    if (bool2)
    {
      localObject2 = paramoaa.n();
      oXa.a(localObject2, "data.preview");
      localObject2 = ((daa)localObject2).l();
    }
    else
    {
      localObject2 = null;
    }
    if (paramoaa.p())
    {
      paramoaa = paramoaa.n();
      oXa.a(paramoaa, "data.preview");
      paramoaa = paramoaa.n();
      oXa.a(paramoaa, "data.preview.second");
      str3 = EPa.b(paramoaa);
    }
    return new tka(str1, str2, bool1, (VOa)localObject1, (String)localObject2, str3);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/tka$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */