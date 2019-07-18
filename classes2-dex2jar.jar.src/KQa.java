import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import android.util.Base64;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

public final class kqa
{
  private static final QVa b = RVa.a(fqa.b);
  private static final QVa c = RVa.a(hqa.b);
  private static final QVa d = RVa.a(gqa.b);
  private static final QVa e = RVa.a(eqa.b);
  private static final QVa f = RVa.a(dqa.b);
  private static final QVa g = RVa.a(cqa.b);
  private static final QVa h = RVa.a(bqa.b);
  private static final QVa i = RVa.a(iqa.b);
  private static final QVa j = RVa.a(aqa.b);
  private static kRa k;
  public static final kqa l;
  
  static
  {
    rXa localrXa1 = new rXa(vXa.a(kqa.class), "SIGNATURES", "getSIGNATURES()Ljava/lang/String;");
    vXa.a(localrXa1);
    rXa localrXa2 = new rXa(vXa.a(kqa.class), "SIGNING_INFO", "getSIGNING_INFO()Ljava/lang/String;");
    vXa.a(localrXa2);
    rXa localrXa3 = new rXa(vXa.a(kqa.class), "SIGNING_CERTIFICATE_HISTORY", "getSIGNING_CERTIFICATE_HISTORY()Ljava/lang/String;");
    vXa.a(localrXa3);
    rXa localrXa4 = new rXa(vXa.a(kqa.class), "SHA", "getSHA()Ljava/lang/String;");
    vXa.a(localrXa4);
    rXa localrXa5 = new rXa(vXa.a(kqa.class), "PRODUCTION_SIGNATURE_HASH", "getPRODUCTION_SIGNATURE_HASH()Ljava/lang/String;");
    vXa.a(localrXa5);
    rXa localrXa6 = new rXa(vXa.a(kqa.class), "MESSAGE_DIGEST", "getMESSAGE_DIGEST()Ljava/lang/String;");
    vXa.a(localrXa6);
    rXa localrXa7 = new rXa(vXa.a(kqa.class), "GET_INSTANCE", "getGET_INSTANCE()Ljava/lang/String;");
    vXa.a(localrXa7);
    rXa localrXa8 = new rXa(vXa.a(kqa.class), "UPDATE", "getUPDATE()Ljava/lang/String;");
    vXa.a(localrXa8);
    rXa localrXa9 = new rXa(vXa.a(kqa.class), "DIGEST", "getDIGEST()Ljava/lang/String;");
    vXa.a(localrXa9);
    a = new XXa[] { localrXa1, localrXa2, localrXa3, localrXa4, localrXa5, localrXa6, localrXa7, localrXa8, localrXa9 };
    l = new kqa();
  }
  
  private final String a()
  {
    QVa localQVa = j;
    XXa localXXa = a[8];
    return (String)localQVa.getValue();
  }
  
  private final String a(String paramString, int paramInt)
  {
    if (paramString != null)
    {
      char[] arrayOfChar = paramString.toCharArray();
      oXa.a(arrayOfChar, "(this as java.lang.String).toCharArray()");
      paramString = new ArrayList(arrayOfChar.length);
      int m = arrayOfChar.length;
      for (int n = 0; n < m; n++) {
        paramString.add(Character.valueOf((char)(arrayOfChar[n] + paramInt)));
      }
      return mWa.a(paramString, "", null, null, 0, null, null, 62, null);
    }
    throw new _Va("null cannot be cast to non-null type java.lang.String");
  }
  
  private final boolean a(Context paramContext, String paramString)
  {
    byte[] arrayOfByte = a(paramContext);
    boolean bool1 = false;
    if (arrayOfByte != null)
    {
      paramContext = Class.forName(c());
      Object localObject = paramContext.getDeclaredMethod(b(), new Class[] { String.class }).invoke(null, new Object[] { e() });
      oXa.a(localObject, "messageDigestClass.getDe…s.java).invoke(null, SHA)");
      paramContext.getDeclaredMethod(i(), new Class[] { byte[].class }).invoke(localObject, new Object[] { arrayOfByte });
      paramContext = paramContext.getDeclaredMethod(a(), new Class[0]).invoke(localObject, new Object[0]);
      if (paramContext != null)
      {
        paramContext = Base64.encodeToString((byte[])paramContext, 2);
        boolean bool2 = bool1;
        if (oXa.a(d(), paramContext))
        {
          bool2 = bool1;
          if (oXa.a(paramString, (String)Uma.qa.m().get())) {
            bool2 = true;
          }
        }
        return bool2;
      }
      throw new _Va("null cannot be cast to non-null type kotlin.ByteArray");
    }
    return false;
  }
  
  private final byte[] a(Context paramContext)
  {
    if (Build.VERSION.SDK_INT >= 28)
    {
      paramContext = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 134217728);
      oXa.a(paramContext, "context.packageManager.g…GET_SIGNING_CERTIFICATES)");
      paramContext = paramContext.getClass().getField(h()).get(paramContext);
      oXa.a(paramContext, "packageInfo.javaClass.ge…NG_INFO).get(packageInfo)");
      paramContext = (Object[])paramContext.getClass().getDeclaredMethod(g(), new Class[0]).invoke(paramContext, new Object[0]);
    }
    else
    {
      paramContext = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 64);
      oXa.a(paramContext, "context.packageManager.g…geManager.GET_SIGNATURES)");
      paramContext = (Object[])paramContext.getClass().getField(f()).get(paramContext);
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
    QVa localQVa = h;
    XXa localXXa = a[6];
    return (String)localQVa.getValue();
  }
  
  private final String c()
  {
    QVa localQVa = g;
    XXa localXXa = a[5];
    return (String)localQVa.getValue();
  }
  
  private final String d()
  {
    QVa localQVa = f;
    XXa localXXa = a[4];
    return (String)localQVa.getValue();
  }
  
  private final String e()
  {
    QVa localQVa = e;
    XXa localXXa = a[3];
    return (String)localQVa.getValue();
  }
  
  private final String f()
  {
    QVa localQVa = b;
    XXa localXXa = a[0];
    return (String)localQVa.getValue();
  }
  
  private final String g()
  {
    QVa localQVa = d;
    XXa localXXa = a[2];
    return (String)localQVa.getValue();
  }
  
  private final String h()
  {
    QVa localQVa = c;
    XXa localXXa = a[1];
    return (String)localQVa.getValue();
  }
  
  private final String i()
  {
    QVa localQVa = i;
    XXa localXXa = a[7];
    return (String)localQVa.getValue();
  }
  
  private final String j()
  {
    return a("Xe[if`[%Xgg%8Zk`m`kp", 9);
  }
  
  private final String k()
  {
    return a("TYWUcd", 16);
  }
  
  private final String l()
  {
    return a("adidnc<i_M`hjq`O\\nf", 5);
  }
  
  private final String m()
  {
    return a("wuY~q~su", -16);
  }
  
  private final String n()
  {
    return a("tkk8}om|s~8Wo}}kqoNsqo}~", -10);
  }
  
  private final String o()
  {
    return a("[MHGedjVx{EZVi6jPfgPSpwTDp6?", -2);
  }
  
  private final String p()
  {
    return a("E:3", 14);
  }
  
  private final String q()
  {
    return a("qgel_rspcq", 2);
  }
  
  private final String r()
  {
    return a("capOecjejc?anpebe_]paDeopknu", 4);
  }
  
  private final String s()
  {
    return a("vt{v{tV{s|", -13);
  }
  
  private final String t()
  {
    return a("snb_rc", 2);
  }
  
  public final void a(Activity paramActivity, String paramString)
  {
    oXa.b(paramActivity, "activity");
    oXa.b(paramString, "saltIsDeviceId");
    if (Build.VERSION.SDK_INT < 21) {
      return;
    }
    k = XQa.a(paramString.hashCode() % 6794 + 1400, TimeUnit.MILLISECONDS, EVa.b()).d(new jqa(paramActivity, paramString));
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/kqa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */