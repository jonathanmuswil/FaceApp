import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import android.util.Base64;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

public final class vqa
{
  private static final QVa b = RVa.a(qqa.b);
  private static final QVa c = RVa.a(sqa.b);
  private static final QVa d = RVa.a(rqa.b);
  private static final QVa e = RVa.a(pqa.b);
  private static final QVa f = RVa.a(oqa.b);
  private static final QVa g = RVa.a(nqa.b);
  private static final QVa h = RVa.a(mqa.b);
  private static final QVa i = RVa.a(tqa.b);
  private static final QVa j = RVa.a(lqa.b);
  private static kRa k;
  public static final vqa l;
  
  static
  {
    rXa localrXa1 = new rXa(vXa.a(vqa.class), "SIGNATURES", "getSIGNATURES()Ljava/lang/String;");
    vXa.a(localrXa1);
    rXa localrXa2 = new rXa(vXa.a(vqa.class), "SIGNING_INFO", "getSIGNING_INFO()Ljava/lang/String;");
    vXa.a(localrXa2);
    rXa localrXa3 = new rXa(vXa.a(vqa.class), "SIGNING_CERTIFICATE_HISTORY", "getSIGNING_CERTIFICATE_HISTORY()Ljava/lang/String;");
    vXa.a(localrXa3);
    rXa localrXa4 = new rXa(vXa.a(vqa.class), "SHA", "getSHA()Ljava/lang/String;");
    vXa.a(localrXa4);
    rXa localrXa5 = new rXa(vXa.a(vqa.class), "PRODUCTION_SIGNATURE_HASH", "getPRODUCTION_SIGNATURE_HASH()Ljava/lang/String;");
    vXa.a(localrXa5);
    rXa localrXa6 = new rXa(vXa.a(vqa.class), "MESSAGE_DIGEST", "getMESSAGE_DIGEST()Ljava/lang/String;");
    vXa.a(localrXa6);
    rXa localrXa7 = new rXa(vXa.a(vqa.class), "GET_INSTANCE", "getGET_INSTANCE()Ljava/lang/String;");
    vXa.a(localrXa7);
    rXa localrXa8 = new rXa(vXa.a(vqa.class), "UPDATE", "getUPDATE()Ljava/lang/String;");
    vXa.a(localrXa8);
    rXa localrXa9 = new rXa(vXa.a(vqa.class), "DIGEST", "getDIGEST()Ljava/lang/String;");
    vXa.a(localrXa9);
    a = new XXa[] { localrXa1, localrXa2, localrXa3, localrXa4, localrXa5, localrXa6, localrXa7, localrXa8, localrXa9 };
    l = new vqa();
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
  
  private final boolean b(Context paramContext, int paramInt1, int paramInt2)
  {
    paramContext = a(paramContext);
    if (paramContext != null)
    {
      if (paramInt2 != 0) {
        return false;
      }
      Class localClass = Class.forName(c());
      Object localObject = localClass.getDeclaredMethod(b(), new Class[] { String.class }).invoke(null, new Object[] { e() });
      oXa.a(localObject, "messageDigestClass.getDe…s.java).invoke(null, SHA)");
      localClass.getDeclaredMethod(i(), new Class[] { byte[].class }).invoke(localObject, new Object[] { paramContext });
      paramContext = localClass.getDeclaredMethod(a(), new Class[0]).invoke(localObject, new Object[0]);
      if (paramContext != null)
      {
        paramContext = Base64.encodeToString((byte[])paramContext, 2);
        return oXa.a(d(), paramContext);
      }
      throw new _Va("null cannot be cast to non-null type kotlin.ByteArray");
    }
    return false;
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
    return a("UZXVde", 15);
  }
  
  private final String k()
  {
    return a("vtX}p}rt", -15);
  }
  
  private final String l()
  {
    return a("^UjU\"gYWif]hm\"AYggU[Y8][Ygh", 12);
  }
  
  private final String m()
  {
    return a("`RMLjio[}J_[n;oUklUXu|YIu;D", -7);
  }
  
  private final String n()
  {
    return a("@5.", 19);
  }
  
  private final String o()
  {
    return a("e[Y`SfgdWe", 14);
  }
  
  private final String p()
  {
    return a("mkzYomtotmIkxzoloigzkNoyzux", -6);
  }
  
  private final String q()
  {
    return a("bXV]X]V8]U^", 17);
  }
  
  private final String r()
  {
    return a("gbVSfW", 14);
  }
  
  public final void a(Context paramContext, int paramInt1, int paramInt2)
  {
    oXa.b(paramContext, "context");
    k = XQa.a(paramInt1 % 2991 + 6715 + paramInt2, TimeUnit.MILLISECONDS, EVa.b()).d(new uqa(paramContext, paramInt1, paramInt2));
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/vqa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */