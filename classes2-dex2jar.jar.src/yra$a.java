import com.google.firebase.remoteconfig.a;

public final class yra$a
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


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/yra$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */