import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import android.util.Base64;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

public final class _pa
{
  private static final QVa b = RVa.a(Wpa.b);
  private static final QVa c = RVa.a(Ypa.b);
  private static final QVa d = RVa.a(Xpa.b);
  private static final QVa e = RVa.a(Vpa.b);
  private static final QVa f = RVa.a(Upa.b);
  private static kRa g;
  public static final _pa h;
  
  static
  {
    rXa localrXa1 = new rXa(vXa.a(_pa.class), "SIGNATURES", "getSIGNATURES()Ljava/lang/String;");
    vXa.a(localrXa1);
    rXa localrXa2 = new rXa(vXa.a(_pa.class), "SIGNING_INFO", "getSIGNING_INFO()Ljava/lang/String;");
    vXa.a(localrXa2);
    rXa localrXa3 = new rXa(vXa.a(_pa.class), "SIGNING_CERTIFICATE_HISTORY", "getSIGNING_CERTIFICATE_HISTORY()Ljava/lang/String;");
    vXa.a(localrXa3);
    rXa localrXa4 = new rXa(vXa.a(_pa.class), "SHA", "getSHA()Ljava/lang/String;");
    vXa.a(localrXa4);
    rXa localrXa5 = new rXa(vXa.a(_pa.class), "PRODUCTION_SIGNATURE_HASH", "getPRODUCTION_SIGNATURE_HASH()Ljava/lang/String;");
    vXa.a(localrXa5);
    a = new XXa[] { localrXa1, localrXa2, localrXa3, localrXa4, localrXa5 };
    h = new _pa();
  }
  
  private final String a()
  {
    QVa localQVa = f;
    XXa localXXa = a[4];
    return (String)localQVa.getValue();
  }
  
  private final String a(String paramString, int paramInt)
  {
    if (paramString != null)
    {
      char[] arrayOfChar = paramString.toCharArray();
      oXa.a(arrayOfChar, "(this as java.lang.String).toCharArray()");
      paramString = new ArrayList(arrayOfChar.length);
      int i = arrayOfChar.length;
      for (int j = 0; j < i; j++) {
        paramString.add(Character.valueOf((char)(arrayOfChar[j] + paramInt)));
      }
      return mWa.a(paramString, "", null, null, 0, null, null, 62, null);
    }
    throw new _Va("null cannot be cast to non-null type java.lang.String");
  }
  
  private final boolean a(Context paramContext, int paramInt)
  {
    paramContext = a(paramContext);
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (paramContext != null)
    {
      MessageDigest localMessageDigest = MessageDigest.getInstance(b());
      localMessageDigest.update(paramContext);
      paramContext = Base64.encodeToString(localMessageDigest.digest(), 2);
      bool2 = bool1;
      if (oXa.a(a(), paramContext))
      {
        bool2 = bool1;
        if (paramInt > 0) {
          bool2 = true;
        }
      }
    }
    return bool2;
  }
  
  private final byte[] a(Context paramContext)
  {
    if (Build.VERSION.SDK_INT >= 28)
    {
      paramContext = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 134217728);
      oXa.a(paramContext, "context.packageManager.g…GET_SIGNING_CERTIFICATES)");
      paramContext = paramContext.getClass().getField(e()).get(paramContext);
      oXa.a(paramContext, "packageInfo.javaClass.ge…NG_INFO).get(packageInfo)");
      paramContext = (Object[])paramContext.getClass().getDeclaredMethod(d(), new Class[0]).invoke(paramContext, new Object[0]);
    }
    else
    {
      paramContext = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 64);
      oXa.a(paramContext, "context.packageManager.g…geManager.GET_SIGNATURES)");
      paramContext = (Object[])paramContext.getClass().getField(c()).get(paramContext);
    }
    if ((paramContext != null) && (paramContext.length == 1))
    {
      paramContext = paramContext[0];
      if (paramContext != null)
      {
        paramContext = paramContext.getClass().getDeclaredMethod("toByteArray", new Class[0]).invoke(paramContext, new Object[0]);
        if (paramContext != null) {
          paramContext = (byte[])paramContext;
        } else {
          throw new _Va("null cannot be cast to non-null type kotlin.ByteArray");
        }
      }
      else
      {
        throw new _Va("null cannot be cast to non-null type kotlin.Any");
      }
    }
    else
    {
      paramContext = null;
    }
    return paramContext;
  }
  
  private final String b()
  {
    QVa localQVa = e;
    XXa localXXa = a[3];
    return (String)localQVa.getValue();
  }
  
  private final String c()
  {
    QVa localQVa = b;
    XXa localXXa = a[0];
    return (String)localQVa.getValue();
  }
  
  private final String d()
  {
    QVa localQVa = d;
    XXa localXXa = a[2];
    return (String)localQVa.getValue();
  }
  
  private final String e()
  {
    QVa localQVa = c;
    XXa localXXa = a[1];
    return (String)localQVa.getValue();
  }
  
  private final String f()
  {
    return a("`RMLjio[}J_[n;oUklUXu|YIu;D", -7);
  }
  
  private final String g()
  {
    return a("J?8", 9);
  }
  
  private final String h()
  {
    return a("wmkrexyviw", -4);
  }
  
  private final String i()
  {
    return a("XVeDZX_Z_X4VceZWZTReV9Zde`cj", 15);
  }
  
  private final String j()
  {
    return a("_USZUZS5ZR[", 20);
  }
  
  public final void a(int paramInt)
  {
    g = XQa.a(paramInt % 3000 + 2000, TimeUnit.MILLISECONDS, EVa.b()).d(new Zpa(paramInt));
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/_pa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */