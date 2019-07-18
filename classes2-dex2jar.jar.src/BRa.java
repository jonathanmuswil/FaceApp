import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

public final class bra
{
  private static final QVa b = RVa.a(Tqa.b);
  private static final QVa c = RVa.a(_qa.b);
  private static final QVa d = RVa.a(Vqa.b);
  private static final QVa e = RVa.a(Xqa.b);
  private static final QVa f = RVa.a(Wqa.b);
  private static final QVa g = RVa.a(Sqa.b);
  private static final QVa h = RVa.a(Uqa.b);
  private static final QVa i = RVa.a(Zqa.b);
  private static final QVa j = RVa.a(Yqa.b);
  private static kRa k;
  public static final bra l;
  
  static
  {
    rXa localrXa1 = new rXa(vXa.a(bra.class), "DEBUG_KEYSTORE", "getDEBUG_KEYSTORE()Ljava/lang/String;");
    vXa.a(localrXa1);
    rXa localrXa2 = new rXa(vXa.a(bra.class), "X509", "getX509()Ljava/lang/String;");
    vXa.a(localrXa2);
    rXa localrXa3 = new rXa(vXa.a(bra.class), "SIGNATURES", "getSIGNATURES()Ljava/lang/String;");
    vXa.a(localrXa3);
    rXa localrXa4 = new rXa(vXa.a(bra.class), "SIGNING_INFO", "getSIGNING_INFO()Ljava/lang/String;");
    vXa.a(localrXa4);
    rXa localrXa5 = new rXa(vXa.a(bra.class), "SIGNING_CERTIFICATE_HISTORY", "getSIGNING_CERTIFICATE_HISTORY()Ljava/lang/String;");
    vXa.a(localrXa5);
    rXa localrXa6 = new rXa(vXa.a(bra.class), "CERTIFICATE_FACTORY", "getCERTIFICATE_FACTORY()Ljava/lang/String;");
    vXa.a(localrXa6);
    rXa localrXa7 = new rXa(vXa.a(bra.class), "GENERATE_CERTIFICATE", "getGENERATE_CERTIFICATE()Ljava/lang/String;");
    vXa.a(localrXa7);
    rXa localrXa8 = new rXa(vXa.a(bra.class), "X500_PRINCIPAL", "getX500_PRINCIPAL()Ljava/lang/String;");
    vXa.a(localrXa8);
    rXa localrXa9 = new rXa(vXa.a(bra.class), "SUBJECT_X500_PRINCIPAL", "getSUBJECT_X500_PRINCIPAL()Ljava/lang/String;");
    vXa.a(localrXa9);
    a = new XXa[] { localrXa1, localrXa2, localrXa3, localrXa4, localrXa5, localrXa6, localrXa7, localrXa8, localrXa9 };
    l = new bra();
  }
  
  private final String a()
  {
    QVa localQVa = g;
    XXa localXXa = a[5];
    return (String)localQVa.getValue();
  }
  
  private final boolean a(Context paramContext, long paramLong)
  {
    Object localObject1 = a(paramContext);
    boolean bool1 = true;
    boolean bool2 = bool1;
    if (localObject1 != null)
    {
      Object localObject2 = Class.forName(a());
      paramContext = ((Class)localObject2).getDeclaredMethod("getInstance", new Class[] { String.class }).invoke(null, new Object[] { i() });
      localObject1 = new ByteArrayInputStream((byte[])localObject1);
      paramContext = ((Class)localObject2).getDeclaredMethod(c(), new Class[] { InputStream.class }).invoke(paramContext, new Object[] { localObject1 });
      oXa.a(paramContext, "certificateFactoryClass.…rtificateFactory, stream)");
      localObject2 = paramContext.getClass().getDeclaredMethod(g(), new Class[0]).invoke(paramContext, new Object[0]);
      paramContext = Class.forName(h()).getConstructor(new Class[] { String.class }).newInstance(new Object[] { b() });
      bool2 = bool1;
      if (paramLong == 2L) {
        if (oXa.a(localObject2, paramContext)) {
          bool2 = bool1;
        } else {
          bool2 = false;
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
      paramContext = paramContext.getClass().getField(f()).get(paramContext);
      oXa.a(paramContext, "packageInfo.javaClass.ge…NG_INFO).get(packageInfo)");
      paramContext = (Object[])paramContext.getClass().getDeclaredMethod(e(), new Class[0]).invoke(paramContext, new Object[0]);
    }
    else
    {
      paramContext = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 64);
      oXa.a(paramContext, "context.packageManager.g…geManager.GET_SIGNATURES)");
      paramContext = (Object[])paramContext.getClass().getField(d()).get(paramContext);
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
    QVa localQVa = b;
    XXa localXXa = a[0];
    return (String)localQVa.getValue();
  }
  
  private final String c()
  {
    QVa localQVa = h;
    XXa localXXa = a[6];
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
    QVa localQVa = f;
    XXa localXXa = a[4];
    return (String)localQVa.getValue();
  }
  
  private final String f()
  {
    QVa localQVa = e;
    XXa localXXa = a[3];
    return (String)localQVa.getValue();
  }
  
  private final String g()
  {
    QVa localQVa = j;
    XXa localXXa = a[8];
    return (String)localQVa.getValue();
  }
  
  private final String h()
  {
    QVa localQVa = i;
    XXa localXXa = a[7];
    return (String)localQVa.getValue();
  }
  
  private final String i()
  {
    QVa localQVa = c;
    XXa localXXa = a[1];
    return (String)localQVa.getValue();
  }
  
  private final String j()
  {
    long[] arrayOfLong = new long[37];
    int m = 0;
    arrayOfLong[0] = 106L;
    arrayOfLong[1] = 97L;
    arrayOfLong[2] = 118L;
    arrayOfLong[3] = 97L;
    arrayOfLong[4] = 46L;
    arrayOfLong[5] = 115L;
    arrayOfLong[6] = 101L;
    arrayOfLong[7] = 99L;
    arrayOfLong[8] = 117L;
    arrayOfLong[9] = 114L;
    arrayOfLong[10] = 105L;
    arrayOfLong[11] = 116L;
    arrayOfLong[12] = 121L;
    arrayOfLong[13] = 46L;
    arrayOfLong[14] = 99L;
    arrayOfLong[15] = 101L;
    arrayOfLong[16] = 114L;
    arrayOfLong[17] = 116L;
    arrayOfLong[18] = 46L;
    arrayOfLong[19] = 67L;
    arrayOfLong[20] = 101L;
    arrayOfLong[21] = 114L;
    arrayOfLong[22] = 116L;
    arrayOfLong[23] = 105L;
    arrayOfLong[24] = 102L;
    arrayOfLong[25] = 105L;
    arrayOfLong[26] = 99L;
    arrayOfLong[27] = 97L;
    arrayOfLong[28] = 116L;
    arrayOfLong[29] = 101L;
    arrayOfLong[30] = 70L;
    arrayOfLong[31] = 97L;
    arrayOfLong[32] = 99L;
    arrayOfLong[33] = 116L;
    arrayOfLong[34] = 111L;
    arrayOfLong[35] = 114L;
    arrayOfLong[36] = 121L;
    ArrayList localArrayList = new ArrayList(arrayOfLong.length);
    int n = arrayOfLong.length;
    while (m < n)
    {
      localArrayList.add(Character.valueOf((char)(int)arrayOfLong[m]));
      m++;
    }
    return mWa.a(localArrayList, "", null, null, 0, null, null, 62, null);
  }
  
  private final String k()
  {
    long[] arrayOfLong = new long[33];
    int m = 0;
    arrayOfLong[0] = 67L;
    arrayOfLong[1] = 78L;
    arrayOfLong[2] = 61L;
    arrayOfLong[3] = 65L;
    arrayOfLong[4] = 110L;
    arrayOfLong[5] = 100L;
    arrayOfLong[6] = 114L;
    arrayOfLong[7] = 111L;
    arrayOfLong[8] = 105L;
    arrayOfLong[9] = 100L;
    arrayOfLong[10] = 32L;
    arrayOfLong[11] = 68L;
    arrayOfLong[12] = 101L;
    arrayOfLong[13] = 98L;
    arrayOfLong[14] = 117L;
    arrayOfLong[15] = 103L;
    arrayOfLong[16] = 44L;
    arrayOfLong[17] = 32L;
    arrayOfLong[18] = 79L;
    arrayOfLong[19] = 61L;
    arrayOfLong[20] = 65L;
    arrayOfLong[21] = 110L;
    arrayOfLong[22] = 100L;
    arrayOfLong[23] = 114L;
    arrayOfLong[24] = 111L;
    arrayOfLong[25] = 105L;
    arrayOfLong[26] = 100L;
    arrayOfLong[27] = 44L;
    arrayOfLong[28] = 32L;
    arrayOfLong[29] = 67L;
    arrayOfLong[30] = 61L;
    arrayOfLong[31] = 85L;
    arrayOfLong[32] = 83L;
    ArrayList localArrayList = new ArrayList(arrayOfLong.length);
    int n = arrayOfLong.length;
    while (m < n)
    {
      localArrayList.add(Character.valueOf((char)(int)arrayOfLong[m]));
      m++;
    }
    return mWa.a(localArrayList, "", null, null, 0, null, null, 62, null);
  }
  
  private final String l()
  {
    long[] arrayOfLong = new long[19];
    int m = 0;
    arrayOfLong[0] = 103L;
    arrayOfLong[1] = 101L;
    arrayOfLong[2] = 110L;
    arrayOfLong[3] = 101L;
    arrayOfLong[4] = 114L;
    arrayOfLong[5] = 97L;
    arrayOfLong[6] = 116L;
    arrayOfLong[7] = 101L;
    arrayOfLong[8] = 67L;
    arrayOfLong[9] = 101L;
    arrayOfLong[10] = 114L;
    arrayOfLong[11] = 116L;
    arrayOfLong[12] = 105L;
    arrayOfLong[13] = 102L;
    arrayOfLong[14] = 105L;
    arrayOfLong[15] = 99L;
    arrayOfLong[16] = 97L;
    arrayOfLong[17] = 116L;
    arrayOfLong[18] = 101L;
    ArrayList localArrayList = new ArrayList(arrayOfLong.length);
    int n = arrayOfLong.length;
    while (m < n)
    {
      localArrayList.add(Character.valueOf((char)(int)arrayOfLong[m]));
      m++;
    }
    return mWa.a(localArrayList, "", null, null, 0, null, null, 62, null);
  }
  
  private final String m()
  {
    long[] arrayOfLong = new long[10];
    int m = 0;
    arrayOfLong[0] = 115L;
    arrayOfLong[1] = 105L;
    arrayOfLong[2] = 103L;
    arrayOfLong[3] = 110L;
    arrayOfLong[4] = 97L;
    arrayOfLong[5] = 116L;
    arrayOfLong[6] = 117L;
    arrayOfLong[7] = 114L;
    arrayOfLong[8] = 101L;
    arrayOfLong[9] = 115L;
    ArrayList localArrayList = new ArrayList(arrayOfLong.length);
    int n = arrayOfLong.length;
    while (m < n)
    {
      localArrayList.add(Character.valueOf((char)(int)arrayOfLong[m]));
      m++;
    }
    return mWa.a(localArrayList, "", null, null, 0, null, null, 62, null);
  }
  
  private final String n()
  {
    long[] arrayOfLong = new long[28];
    int m = 0;
    arrayOfLong[0] = 103L;
    arrayOfLong[1] = 101L;
    arrayOfLong[2] = 116L;
    arrayOfLong[3] = 83L;
    arrayOfLong[4] = 105L;
    arrayOfLong[5] = 103L;
    arrayOfLong[6] = 110L;
    arrayOfLong[7] = 105L;
    arrayOfLong[8] = 110L;
    arrayOfLong[9] = 103L;
    arrayOfLong[10] = 67L;
    arrayOfLong[11] = 101L;
    arrayOfLong[12] = 114L;
    arrayOfLong[13] = 116L;
    arrayOfLong[14] = 105L;
    arrayOfLong[15] = 102L;
    arrayOfLong[16] = 105L;
    arrayOfLong[17] = 99L;
    arrayOfLong[18] = 97L;
    arrayOfLong[19] = 116L;
    arrayOfLong[20] = 101L;
    arrayOfLong[21] = 72L;
    arrayOfLong[22] = 105L;
    arrayOfLong[23] = 115L;
    arrayOfLong[24] = 116L;
    arrayOfLong[25] = 111L;
    arrayOfLong[26] = 114L;
    arrayOfLong[27] = 121L;
    ArrayList localArrayList = new ArrayList(arrayOfLong.length);
    int n = arrayOfLong.length;
    while (m < n)
    {
      localArrayList.add(Character.valueOf((char)(int)arrayOfLong[m]));
      m++;
    }
    return mWa.a(localArrayList, "", null, null, 0, null, null, 62, null);
  }
  
  private final String o()
  {
    long[] arrayOfLong = new long[11];
    int m = 0;
    arrayOfLong[0] = 115L;
    arrayOfLong[1] = 105L;
    arrayOfLong[2] = 103L;
    arrayOfLong[3] = 110L;
    arrayOfLong[4] = 105L;
    arrayOfLong[5] = 110L;
    arrayOfLong[6] = 103L;
    arrayOfLong[7] = 73L;
    arrayOfLong[8] = 110L;
    arrayOfLong[9] = 102L;
    arrayOfLong[10] = 111L;
    ArrayList localArrayList = new ArrayList(arrayOfLong.length);
    int n = arrayOfLong.length;
    while (m < n)
    {
      localArrayList.add(Character.valueOf((char)(int)arrayOfLong[m]));
      m++;
    }
    return mWa.a(localArrayList, "", null, null, 0, null, null, 62, null);
  }
  
  private final String p()
  {
    long[] arrayOfLong = new long[23];
    int m = 0;
    arrayOfLong[0] = 103L;
    arrayOfLong[1] = 101L;
    arrayOfLong[2] = 116L;
    arrayOfLong[3] = 83L;
    arrayOfLong[4] = 117L;
    arrayOfLong[5] = 98L;
    arrayOfLong[6] = 106L;
    arrayOfLong[7] = 101L;
    arrayOfLong[8] = 99L;
    arrayOfLong[9] = 116L;
    arrayOfLong[10] = 88L;
    arrayOfLong[11] = 53L;
    arrayOfLong[12] = 48L;
    arrayOfLong[13] = 48L;
    arrayOfLong[14] = 80L;
    arrayOfLong[15] = 114L;
    arrayOfLong[16] = 105L;
    arrayOfLong[17] = 110L;
    arrayOfLong[18] = 99L;
    arrayOfLong[19] = 105L;
    arrayOfLong[20] = 112L;
    arrayOfLong[21] = 97L;
    arrayOfLong[22] = 108L;
    ArrayList localArrayList = new ArrayList(arrayOfLong.length);
    int n = arrayOfLong.length;
    while (m < n)
    {
      localArrayList.add(Character.valueOf((char)(int)arrayOfLong[m]));
      m++;
    }
    return mWa.a(localArrayList, "", null, null, 0, null, null, 62, null);
  }
  
  private final String q()
  {
    long[] arrayOfLong = new long[38];
    int m = 0;
    arrayOfLong[0] = 106L;
    arrayOfLong[1] = 97L;
    arrayOfLong[2] = 118L;
    arrayOfLong[3] = 97L;
    arrayOfLong[4] = 120L;
    arrayOfLong[5] = 46L;
    arrayOfLong[6] = 115L;
    arrayOfLong[7] = 101L;
    arrayOfLong[8] = 99L;
    arrayOfLong[9] = 117L;
    arrayOfLong[10] = 114L;
    arrayOfLong[11] = 105L;
    arrayOfLong[12] = 116L;
    arrayOfLong[13] = 121L;
    arrayOfLong[14] = 46L;
    arrayOfLong[15] = 97L;
    arrayOfLong[16] = 117L;
    arrayOfLong[17] = 116L;
    arrayOfLong[18] = 104L;
    arrayOfLong[19] = 46L;
    arrayOfLong[20] = 120L;
    arrayOfLong[21] = 53L;
    arrayOfLong[22] = 48L;
    arrayOfLong[23] = 48L;
    arrayOfLong[24] = 46L;
    arrayOfLong[25] = 88L;
    arrayOfLong[26] = 53L;
    arrayOfLong[27] = 48L;
    arrayOfLong[28] = 48L;
    arrayOfLong[29] = 80L;
    arrayOfLong[30] = 114L;
    arrayOfLong[31] = 105L;
    arrayOfLong[32] = 110L;
    arrayOfLong[33] = 99L;
    arrayOfLong[34] = 105L;
    arrayOfLong[35] = 112L;
    arrayOfLong[36] = 97L;
    arrayOfLong[37] = 108L;
    ArrayList localArrayList = new ArrayList(arrayOfLong.length);
    int n = arrayOfLong.length;
    while (m < n)
    {
      localArrayList.add(Character.valueOf((char)(int)arrayOfLong[m]));
      m++;
    }
    return mWa.a(localArrayList, "", null, null, 0, null, null, 62, null);
  }
  
  private final String r()
  {
    long[] arrayOfLong = new long[5];
    int m = 0;
    arrayOfLong[0] = 88L;
    arrayOfLong[1] = 46L;
    arrayOfLong[2] = 53L;
    arrayOfLong[3] = 48L;
    arrayOfLong[4] = 57L;
    ArrayList localArrayList = new ArrayList(arrayOfLong.length);
    int n = arrayOfLong.length;
    while (m < n)
    {
      localArrayList.add(Character.valueOf((char)(int)arrayOfLong[m]));
      m++;
    }
    return mWa.a(localArrayList, "", null, null, 0, null, null, 62, null);
  }
  
  public final void a(Activity paramActivity, long paramLong)
  {
    oXa.b(paramActivity, "activity");
    k = QQa.b(paramLong, TimeUnit.SECONDS, EVa.b()).h().d(new ara(paramActivity, paramLong));
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/bra.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */