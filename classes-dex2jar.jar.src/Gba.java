import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;

class gba
{
  private final Context a;
  private final Fca b;
  
  public gba(Context paramContext)
  {
    this.a = paramContext.getApplicationContext();
    this.b = new Gca(paramContext, "TwitterAdvertisingInfoPreferences");
  }
  
  private boolean a(eba parameba)
  {
    boolean bool;
    if ((parameba != null) && (!TextUtils.isEmpty(parameba.a))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private void b(eba parameba)
  {
    new Thread(new fba(this, parameba)).start();
  }
  
  @SuppressLint({"CommitPrefEdits"})
  private void c(eba parameba)
  {
    if (a(parameba))
    {
      Fca localFca = this.b;
      localFca.a(localFca.edit().putString("advertising_id", parameba.a).putBoolean("limit_ad_tracking_enabled", parameba.b));
    }
    else
    {
      parameba = this.b;
      parameba.a(parameba.edit().remove("advertising_id").remove("limit_ad_tracking_enabled"));
    }
  }
  
  private eba e()
  {
    eba localeba = c().a();
    if (!a(localeba))
    {
      localeba = d().a();
      if (!a(localeba)) {
        Naa.e().d("Fabric", "AdvertisingInfo not present");
      } else {
        Naa.e().d("Fabric", "Using AdvertisingInfo from Service Provider");
      }
    }
    else
    {
      Naa.e().d("Fabric", "Using AdvertisingInfo from Reflection Provider");
    }
    return localeba;
  }
  
  public eba a()
  {
    eba localeba = b();
    if (a(localeba))
    {
      Naa.e().d("Fabric", "Using AdvertisingInfo from Preference Store");
      b(localeba);
      return localeba;
    }
    localeba = e();
    c(localeba);
    return localeba;
  }
  
  protected eba b()
  {
    return new eba(this.b.get().getString("advertising_id", ""), this.b.get().getBoolean("limit_ad_tracking_enabled", false));
  }
  
  public kba c()
  {
    return new hba(this.a);
  }
  
  public kba d()
  {
    return new jba(this.a);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/gba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */