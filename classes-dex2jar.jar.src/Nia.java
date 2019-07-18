final class nia
  implements qZa
{
  public static final nia a = new nia();
  
  public final BZa a(qZa.a parama)
  {
    Object localObject1 = parama.N();
    if (ePa.a.b())
    {
      Object localObject2 = sia.f;
      oXa.a(localObject1, "original");
      sia.a((sia)localObject2, (xZa)localObject1);
      xZa.a locala = ((xZa)localObject1).f();
      locala.b("X-FaceApp-DeviceID", sia.c(sia.f));
      locala.b("X-FaceApp-AppLaunched", String.valueOf(sia.b(sia.f)));
      localObject2 = Uma.qa.c().get();
      int i = ((fka)localObject2).a().b().length();
      int j = 0;
      if (i > 0) {
        i = 1;
      } else {
        i = 0;
      }
      if (i == 0) {
        localObject2 = null;
      }
      localObject2 = (fka)localObject2;
      if (localObject2 != null)
      {
        localObject1 = ((xZa)localObject1).a("X-FaceApp-UserToken");
        if (localObject1 != null)
        {
          i = j;
          if (((CharSequence)localObject1).length() != 0) {}
        }
        else
        {
          i = 1;
        }
        if ((i ^ 0x1) == 0) {
          locala.b("X-FaceApp-UserToken", ((fka)localObject2).a().b());
        }
      }
      locala.b("User-Agent", sia.d(sia.f));
      locala.b("Accept-Language", sia.a(sia.f));
      return parama.a(locala.a());
    }
    throw Rfa.b.c;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/nia.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */