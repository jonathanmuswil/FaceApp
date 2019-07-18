public final class Bea$b
{
  public final Bea a(String paramString)
  {
    oXa.b(paramString, "serialized");
    if (oXa.a(paramString, Bea.d.h.c()))
    {
      paramString = Bea.d.h;
    }
    else if (oXa.a(paramString, Bea.a.g.c()))
    {
      paramString = Bea.a.g;
    }
    else
    {
      paramString = paramString.substring(7);
      oXa.a(paramString, "(this as java.lang.String).substring(startIndex)");
      paramString = new Bea.c(paramString);
    }
    return paramString;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Bea$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */