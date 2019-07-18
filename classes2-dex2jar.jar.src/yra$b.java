import com.google.firebase.remoteconfig.a;

public final class yra$b
{
  private static final yra.b.a a = yra.b.a.a;
  public static final b b = new b();
  
  private final yra.b.a b()
  {
    String str = isa.d.a().a("android_onboarding_free_trial");
    for (locala : yra.b.a.values()) {
      if (oXa.a(locala.a(), str)) {
        break label58;
      }
    }
    yra.b.a locala = null;
    label58:
    if (locala == null) {
      locala = a;
    }
    return locala;
  }
  
  public final QQa<yra.b.a> a()
  {
    QQa localQQa = isa.d.b().e(Ara.a);
    oXa.a(localQQa, "RemoteConfig.observeUpdates().map { getConfig() }");
    return localQQa;
  }
  
  public final void a(String paramString)
  {
    oXa.b(paramString, "variantName");
    paramString = yra.a(yra.a, "onboard_trial_", paramString);
    asa.d.a("ab_test", paramString);
    asa.d.f("ab_test", paramString);
  }
  
  public static enum a
  {
    private final String e;
    
    static
    {
      a locala1 = new a("DISABLED", 0, "disabled");
      a = locala1;
      a locala2 = new a("YEARLY_TRIAL", 1, "yearly");
      b = locala2;
      a locala3 = new a("YEARLY", 2, "yearly_no_trial");
      c = locala3;
      d = new a[] { locala1, locala2, locala3 };
    }
    
    private a(String paramString)
    {
      this.e = paramString;
    }
    
    public final String a()
    {
      return this.e;
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/yra$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */