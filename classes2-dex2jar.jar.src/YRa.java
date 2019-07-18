import com.google.firebase.remoteconfig.a;

public final class yra
{
  public static final yra a = new yra();
  
  private final String a(String paramString1, String paramString2)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("and_");
    localStringBuilder.append(paramString1);
    localStringBuilder.append(paramString2);
    return localStringBuilder.toString();
  }
  
  public static final class a
  {
    private static final yra.a.a a = yra.a.a.a;
    public static final a b = new a();
    
    private final yra.a.a b()
    {
      String str = isa.d.a().a("android_ad_mode");
      for (locala : yra.a.a.values()) {
        if (oXa.a(locala.a(), str)) {
          break label58;
        }
      }
      yra.a.a locala = null;
      label58:
      if (locala == null) {
        locala = a;
      }
      KOa.b.b(new zra(locala));
      return locala;
    }
    
    private final boolean c()
    {
      Object localObject = Uma.qa.t().get();
      oXa.a(localObject, "AppPreferences.firstLaunchVersionName.get()");
      localObject = (String)localObject;
      boolean bool;
      if ((((String)localObject).compareTo("3.3.0") >= 0) && (((String)localObject).compareTo("3.3.2") < 0)) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public final boolean a()
    {
      boolean bool;
      if ((c()) && (!b().b())) {
        bool = false;
      } else {
        bool = true;
      }
      return bool;
    }
    
    public static enum a
    {
      private final String d;
      private final boolean e;
      
      static
      {
        a locala1 = new a("ONLY_SAVE_IMAGE", 0, "only_save_image", true);
        a = locala1;
        a locala2 = new a("ALL_DISABLED", 1, "all_disabled", false);
        b = locala2;
        c = new a[] { locala1, locala2 };
      }
      
      private a(String paramString, boolean paramBoolean)
      {
        this.d = paramString;
        this.e = paramBoolean;
      }
      
      public final String a()
      {
        return this.d;
      }
      
      public final boolean b()
      {
        return this.e;
      }
    }
  }
  
  public static final class b
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
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/yra.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */