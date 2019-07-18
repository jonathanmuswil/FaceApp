public final class yka$a
{
  public final yka a(BZ paramBZ)
  {
    oXa.b(paramBZ, "data");
    String str1 = paramBZ.m();
    oXa.a(str1, "data.id");
    String str2 = paramBZ.q();
    oXa.a(str2, "data.title");
    boolean bool1 = paramBZ.n();
    Object localObject1 = paramBZ.o();
    oXa.a(localObject1, "data.matchingPaidFilterId");
    String str3 = EPa.b((String)localObject1);
    Object localObject2;
    if (paramBZ.r())
    {
      localObject1 = VOa.e;
      localObject2 = paramBZ.p();
      oXa.a(localObject2, "data.preview");
      localObject2 = ((daa)localObject2).m();
      oXa.a(localObject2, "data.preview.gender");
      localObject1 = ((VOa.a)localObject1).a((OZ)localObject2);
    }
    else
    {
      localObject1 = VOa.a;
    }
    String str4 = paramBZ.l();
    oXa.a(str4, "data.iconUrl");
    boolean bool2 = paramBZ.r();
    String str5 = null;
    if (bool2)
    {
      localObject2 = paramBZ.p();
      oXa.a(localObject2, "data.preview");
      localObject2 = ((daa)localObject2).l();
    }
    else
    {
      localObject2 = null;
    }
    if (paramBZ.r())
    {
      paramBZ = paramBZ.p();
      oXa.a(paramBZ, "data.preview");
      paramBZ = paramBZ.n();
      oXa.a(paramBZ, "data.preview.second");
      str5 = EPa.b(paramBZ);
    }
    return new yka(str1, str2, bool1, str3, (VOa)localObject1, str4, (String)localObject2, str5);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/yka$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */