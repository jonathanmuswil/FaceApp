import android.annotation.SuppressLint;
import android.content.Context;
import com.google.android.gms.common.e;
import java.nio.charset.Charset;

public final class msa
{
  public static final msa a = new msa();
  
  private final String a()
  {
    Object localObject = Uma.qa.m().get();
    oXa.a(localObject, "AppPreferences.deviceId.get()");
    return (String)localObject;
  }
  
  private final String b()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("wVy2c");
    localStringBuilder.append(EPa.a("4FRuF", 3));
    localStringBuilder.append(zYa.e("Znn9M").toString());
    return localStringBuilder.toString();
  }
  
  private final void b(Context paramContext)
  {
    icb.a("SafetyNet").a("Starting request", new Object[0]);
    byte[] arrayOfByte = c();
    paramContext = BO.a(paramContext).a(arrayOfByte, "AIzaSyBuUgD4-WVyRBKIMbBFrOJqNihb8396CUs");
    paramContext.a(ksa.a);
    paramContext.a(lsa.a);
    asa.d.j("Token requested");
  }
  
  private final byte[] c()
  {
    String str = a();
    Object localObject1 = b();
    Object localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append(str);
    ((StringBuilder)localObject2).append((String)localObject1);
    localObject1 = ((StringBuilder)localObject2).toString();
    localObject1 = Loa.a.c((String)localObject1);
    localObject2 = nYa.a;
    if (localObject1 != null)
    {
      localObject1 = ((String)localObject1).getBytes((Charset)localObject2);
      oXa.a(localObject1, "(this as java.lang.String).getBytes(charset)");
      return (byte[])localObject1;
    }
    throw new _Va("null cannot be cast to non-null type java.lang.String");
  }
  
  @SuppressLint({"CheckResult"})
  public final void a(Context paramContext)
  {
    oXa.b(paramContext, "appContext");
    Object localObject = Uma.qa.ha().get();
    oXa.a(localObject, "AppPreferences.safetyNetAttestationToken.get()");
    int i;
    if (((CharSequence)localObject).length() > 0) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0)
    {
      icb.a("SafetyNet").a("Token already exists, don't request again", new Object[0]);
      return;
    }
    if (e.a().c(paramContext) != 0)
    {
      icb.a("SafetyNet").a("Google Play Services are outdated for SafetyNet call. Don't request token", new Object[0]);
      asa.d.j("Play Services outdated");
      return;
    }
    ePa.a.c().b(new jsa(paramContext));
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/msa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */