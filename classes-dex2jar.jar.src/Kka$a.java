public final class kka$a
{
  public final kka a(VY paramVY)
  {
    oXa.b(paramVY, "data");
    String str1 = paramVY.l();
    oXa.a(str1, "data.id");
    String str2 = paramVY.r();
    oXa.a(str2, "data.title");
    boolean bool1 = paramVY.n();
    Object localObject1;
    Object localObject2;
    if (paramVY.s())
    {
      localObject1 = VOa.e;
      localObject2 = paramVY.o();
      oXa.a(localObject2, "data.preview");
      localObject2 = ((daa)localObject2).m();
      oXa.a(localObject2, "data.preview.gender");
      localObject1 = ((VOa.a)localObject1).a((OZ)localObject2);
    }
    else
    {
      localObject1 = VOa.a;
    }
    boolean bool2 = paramVY.p();
    String str3 = paramVY.q();
    oXa.a(str3, "data.thumbUrl");
    String str4 = paramVY.m();
    oXa.a(str4, "data.imageUrl");
    boolean bool3 = paramVY.s();
    String str5 = null;
    if (bool3)
    {
      localObject2 = paramVY.o();
      oXa.a(localObject2, "data.preview");
      localObject2 = ((daa)localObject2).l();
    }
    else
    {
      localObject2 = null;
    }
    if (paramVY.s())
    {
      paramVY = paramVY.o();
      oXa.a(paramVY, "data.preview");
      paramVY = paramVY.n();
      oXa.a(paramVY, "data.preview.second");
      str5 = EPa.b(paramVY);
    }
    return new kka(str1, str2, bool1, (VOa)localObject1, bool2, str3, str4, (String)localObject2, str5);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/kka$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */