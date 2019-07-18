import android.os.Build;
import android.os.Build.VERSION;

public final class vda
{
  private static kRa a;
  public static final vda b = new vda();
  
  public final QQa<String> a()
  {
    QQa localQQa = QQa.a(Uma.qa.c().b().e(qda.a).e(), Uma.qa.r().b().a(rda.a).e(), sda.a).b(EVa.b());
    oXa.a(localQQa, "Observable.combineLatest…scribeOn(Schedulers.io())");
    return localQQa;
  }
  
  public final void a(String paramString)
  {
    oXa.b(paramString, "firebaseToken");
    Object localObject1 = a;
    if (localObject1 != null) {
      ((kRa)localObject1).i();
    }
    localObject1 = sia.f.b();
    Object localObject2 = Uma.qa.m().get();
    oXa.a(localObject2, "AppPreferences.deviceId.get()");
    String str1 = (String)localObject2;
    String str2 = Build.MODEL;
    oXa.a(str2, "Build.MODEL");
    String str3 = KOa.b.d();
    localObject2 = Build.VERSION.RELEASE;
    oXa.a(localObject2, "Build.VERSION.RELEASE");
    a = RPa.a(RPa.a(((dia)localObject1).a(new yfa(str1, paramString, false, "3.4.8", str2, str3, (String)localObject2, null, 128, null))), new Rfa.f[0]).b(EVa.b()).g(new jPa(10, 5000L)).a(tda.a, uda.a);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/vda.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */