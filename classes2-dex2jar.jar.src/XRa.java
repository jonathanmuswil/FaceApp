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

public final class xra
{
  private static final QVa b = RVa.a(ora.b);
  private static final QVa c = RVa.a(vra.b);
  private static final QVa d = RVa.a(qra.b);
  private static final QVa e = RVa.a(sra.b);
  private static final QVa f = RVa.a(rra.b);
  private static final QVa g = RVa.a(nra.b);
  private static final QVa h = RVa.a(pra.b);
  private static final QVa i = RVa.a(ura.b);
  private static final QVa j = RVa.a(tra.b);
  private static kRa k;
  public static final xra l;
  
  static
  {
    rXa localrXa1 = new rXa(vXa.a(xra.class), "DEBUG_KEYSTORE", "getDEBUG_KEYSTORE()Ljava/lang/String;");
    vXa.a(localrXa1);
    rXa localrXa2 = new rXa(vXa.a(xra.class), "X509", "getX509()Ljava/lang/String;");
    vXa.a(localrXa2);
    rXa localrXa3 = new rXa(vXa.a(xra.class), "SIGNATURES", "getSIGNATURES()Ljava/lang/String;");
    vXa.a(localrXa3);
    rXa localrXa4 = new rXa(vXa.a(xra.class), "SIGNING_INFO", "getSIGNING_INFO()Ljava/lang/String;");
    vXa.a(localrXa4);
    rXa localrXa5 = new rXa(vXa.a(xra.class), "SIGNING_CERTIFICATE_HISTORY", "getSIGNING_CERTIFICATE_HISTORY()Ljava/lang/String;");
    vXa.a(localrXa5);
    rXa localrXa6 = new rXa(vXa.a(xra.class), "CERTIFICATE_FACTORY", "getCERTIFICATE_FACTORY()Ljava/lang/String;");
    vXa.a(localrXa6);
    rXa localrXa7 = new rXa(vXa.a(xra.class), "GENERATE_CERTIFICATE", "getGENERATE_CERTIFICATE()Ljava/lang/String;");
    vXa.a(localrXa7);
    rXa localrXa8 = new rXa(vXa.a(xra.class), "X500_PRINCIPAL", "getX500_PRINCIPAL()Ljava/lang/String;");
    vXa.a(localrXa8);
    rXa localrXa9 = new rXa(vXa.a(xra.class), "SUBJECT_X500_PRINCIPAL", "getSUBJECT_X500_PRINCIPAL()Ljava/lang/String;");
    vXa.a(localrXa9);
    a = new XXa[] { localrXa1, localrXa2, localrXa3, localrXa4, localrXa5, localrXa6, localrXa7, localrXa8, localrXa9 };
    l = new xra();
  }
  
  private final String a()
  {
    QVa localQVa = g;
    XXa localXXa = a[5];
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
  
  private final String b()
  {
    QVa localQVa = b;
    XXa localXXa = a[0];
    return (String)localQVa.getValue();
  }
  
  private final byte[] b(Context paramContext)
  {
    if (Build.VERSION.SDK_INT >= 28)
    {
      paramContext = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 134217728);
      oXa.a(paramContext, "context.packageManager.g…GET_SIGNING_CERTIFICATES)");
      paramContext = paramContext.getClass().getField(g()).get(paramContext);
      oXa.a(paramContext, "packageInfo.javaClass.ge…NG_INFO).get(packageInfo)");
      paramContext = (Object[])paramContext.getClass().getDeclaredMethod(f(), new Class[0]).invoke(paramContext, new Object[0]);
    }
    else
    {
      paramContext = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 64);
      oXa.a(paramContext, "context.packageManager.g…geManager.GET_SIGNATURES)");
      paramContext = (Object[])paramContext.getClass().getField(e()).get(paramContext);
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
  
  private final String c()
  {
    return a("x|", -19);
  }
  
  private final boolean c(Context paramContext)
  {
    Object localObject = b(paramContext);
    if (localObject != null)
    {
      Class localClass = Class.forName(a());
      paramContext = localClass.getDeclaredMethod("getInstance", new Class[] { String.class }).invoke(null, new Object[] { k() });
      localObject = new ByteArrayInputStream((byte[])localObject);
      paramContext = localClass.getDeclaredMethod(d(), new Class[] { InputStream.class }).invoke(paramContext, new Object[] { localObject });
      oXa.a(paramContext, "certificateFactoryClass.…rtificateFactory, stream)");
      return oXa.a(paramContext.getClass().getDeclaredMethod(h(), new Class[0]).invoke(paramContext, new Object[0]), Class.forName(j()).getConstructor(new Class[] { String.class }).newInstance(new Object[] { b() }));
    }
    return true;
  }
  
  private final String d()
  {
    QVa localQVa = h;
    XXa localXXa = a[6];
    return (String)localQVa.getValue();
  }
  
  private final String e()
  {
    QVa localQVa = d;
    XXa localXXa = a[2];
    return (String)localQVa.getValue();
  }
  
  private final String f()
  {
    QVa localQVa = f;
    XXa localXXa = a[4];
    return (String)localQVa.getValue();
  }
  
  private final String g()
  {
    QVa localQVa = e;
    XXa localXXa = a[3];
    return (String)localQVa.getValue();
  }
  
  private final String h()
  {
    QVa localQVa = j;
    XXa localXXa = a[8];
    return (String)localQVa.getValue();
  }
  
  private final String i()
  {
    return a("ull9wlyr9^~px", -11);
  }
  
  private final String j()
  {
    QVa localQVa = i;
    XXa localXXa = a[7];
    return (String)localQVa.getValue();
  }
  
  private final String k()
  {
    QVa localQVa = c;
    XXa localXXa = a[1];
    return (String)localQVa.getValue();
  }
  
  private final String l()
  {
    int[] arrayOfInt = new int[37];
    int m = 0;
    arrayOfInt[0] = 106;
    arrayOfInt[1] = 97;
    arrayOfInt[2] = 118;
    arrayOfInt[3] = 97;
    arrayOfInt[4] = 46;
    arrayOfInt[5] = 115;
    arrayOfInt[6] = 101;
    arrayOfInt[7] = 99;
    arrayOfInt[8] = 117;
    arrayOfInt[9] = 114;
    arrayOfInt[10] = 105;
    arrayOfInt[11] = 116;
    arrayOfInt[12] = 121;
    arrayOfInt[13] = 46;
    arrayOfInt[14] = 99;
    arrayOfInt[15] = 101;
    arrayOfInt[16] = 114;
    arrayOfInt[17] = 116;
    arrayOfInt[18] = 46;
    arrayOfInt[19] = 67;
    arrayOfInt[20] = 101;
    arrayOfInt[21] = 114;
    arrayOfInt[22] = 116;
    arrayOfInt[23] = 105;
    arrayOfInt[24] = 102;
    arrayOfInt[25] = 105;
    arrayOfInt[26] = 99;
    arrayOfInt[27] = 97;
    arrayOfInt[28] = 116;
    arrayOfInt[29] = 101;
    arrayOfInt[30] = 70;
    arrayOfInt[31] = 97;
    arrayOfInt[32] = 99;
    arrayOfInt[33] = 116;
    arrayOfInt[34] = 111;
    arrayOfInt[35] = 114;
    arrayOfInt[36] = 121;
    ArrayList localArrayList = new ArrayList(arrayOfInt.length);
    int n = arrayOfInt.length;
    while (m < n)
    {
      localArrayList.add(Character.valueOf((char)arrayOfInt[m]));
      m++;
    }
    return mWa.a(localArrayList, "", null, null, 0, null, null, 62, null);
  }
  
  private final String m()
  {
    int[] arrayOfInt = new int[33];
    int m = 0;
    arrayOfInt[0] = 67;
    arrayOfInt[1] = 78;
    arrayOfInt[2] = 61;
    arrayOfInt[3] = 65;
    arrayOfInt[4] = 110;
    arrayOfInt[5] = 100;
    arrayOfInt[6] = 114;
    arrayOfInt[7] = 111;
    arrayOfInt[8] = 105;
    arrayOfInt[9] = 100;
    arrayOfInt[10] = 32;
    arrayOfInt[11] = 68;
    arrayOfInt[12] = 101;
    arrayOfInt[13] = 98;
    arrayOfInt[14] = 117;
    arrayOfInt[15] = 103;
    arrayOfInt[16] = 44;
    arrayOfInt[17] = 32;
    arrayOfInt[18] = 79;
    arrayOfInt[19] = 61;
    arrayOfInt[20] = 65;
    arrayOfInt[21] = 110;
    arrayOfInt[22] = 100;
    arrayOfInt[23] = 114;
    arrayOfInt[24] = 111;
    arrayOfInt[25] = 105;
    arrayOfInt[26] = 100;
    arrayOfInt[27] = 44;
    arrayOfInt[28] = 32;
    arrayOfInt[29] = 67;
    arrayOfInt[30] = 61;
    arrayOfInt[31] = 85;
    arrayOfInt[32] = 83;
    ArrayList localArrayList = new ArrayList(arrayOfInt.length);
    int n = arrayOfInt.length;
    while (m < n)
    {
      localArrayList.add(Character.valueOf((char)arrayOfInt[m]));
      m++;
    }
    return mWa.a(localArrayList, "", null, null, 0, null, null, 62, null);
  }
  
  private final String n()
  {
    int[] arrayOfInt = new int[19];
    int m = 0;
    arrayOfInt[0] = 103;
    arrayOfInt[1] = 101;
    arrayOfInt[2] = 110;
    arrayOfInt[3] = 101;
    arrayOfInt[4] = 114;
    arrayOfInt[5] = 97;
    arrayOfInt[6] = 116;
    arrayOfInt[7] = 101;
    arrayOfInt[8] = 67;
    arrayOfInt[9] = 101;
    arrayOfInt[10] = 114;
    arrayOfInt[11] = 116;
    arrayOfInt[12] = 105;
    arrayOfInt[13] = 102;
    arrayOfInt[14] = 105;
    arrayOfInt[15] = 99;
    arrayOfInt[16] = 97;
    arrayOfInt[17] = 116;
    arrayOfInt[18] = 101;
    ArrayList localArrayList = new ArrayList(arrayOfInt.length);
    int n = arrayOfInt.length;
    while (m < n)
    {
      localArrayList.add(Character.valueOf((char)arrayOfInt[m]));
      m++;
    }
    return mWa.a(localArrayList, "", null, null, 0, null, null, 62, null);
  }
  
  private final String o()
  {
    int[] arrayOfInt = new int[10];
    int m = 0;
    arrayOfInt[0] = 115;
    arrayOfInt[1] = 105;
    arrayOfInt[2] = 103;
    arrayOfInt[3] = 110;
    arrayOfInt[4] = 97;
    arrayOfInt[5] = 116;
    arrayOfInt[6] = 117;
    arrayOfInt[7] = 114;
    arrayOfInt[8] = 101;
    arrayOfInt[9] = 115;
    ArrayList localArrayList = new ArrayList(arrayOfInt.length);
    int n = arrayOfInt.length;
    while (m < n)
    {
      localArrayList.add(Character.valueOf((char)arrayOfInt[m]));
      m++;
    }
    return mWa.a(localArrayList, "", null, null, 0, null, null, 62, null);
  }
  
  private final String p()
  {
    int[] arrayOfInt = new int[28];
    int m = 0;
    arrayOfInt[0] = 103;
    arrayOfInt[1] = 101;
    arrayOfInt[2] = 116;
    arrayOfInt[3] = 83;
    arrayOfInt[4] = 105;
    arrayOfInt[5] = 103;
    arrayOfInt[6] = 110;
    arrayOfInt[7] = 105;
    arrayOfInt[8] = 110;
    arrayOfInt[9] = 103;
    arrayOfInt[10] = 67;
    arrayOfInt[11] = 101;
    arrayOfInt[12] = 114;
    arrayOfInt[13] = 116;
    arrayOfInt[14] = 105;
    arrayOfInt[15] = 102;
    arrayOfInt[16] = 105;
    arrayOfInt[17] = 99;
    arrayOfInt[18] = 97;
    arrayOfInt[19] = 116;
    arrayOfInt[20] = 101;
    arrayOfInt[21] = 72;
    arrayOfInt[22] = 105;
    arrayOfInt[23] = 115;
    arrayOfInt[24] = 116;
    arrayOfInt[25] = 111;
    arrayOfInt[26] = 114;
    arrayOfInt[27] = 121;
    ArrayList localArrayList = new ArrayList(arrayOfInt.length);
    int n = arrayOfInt.length;
    while (m < n)
    {
      localArrayList.add(Character.valueOf((char)arrayOfInt[m]));
      m++;
    }
    return mWa.a(localArrayList, "", null, null, 0, null, null, 62, null);
  }
  
  private final String q()
  {
    int[] arrayOfInt = new int[11];
    int m = 0;
    arrayOfInt[0] = 115;
    arrayOfInt[1] = 105;
    arrayOfInt[2] = 103;
    arrayOfInt[3] = 110;
    arrayOfInt[4] = 105;
    arrayOfInt[5] = 110;
    arrayOfInt[6] = 103;
    arrayOfInt[7] = 73;
    arrayOfInt[8] = 110;
    arrayOfInt[9] = 102;
    arrayOfInt[10] = 111;
    ArrayList localArrayList = new ArrayList(arrayOfInt.length);
    int n = arrayOfInt.length;
    while (m < n)
    {
      localArrayList.add(Character.valueOf((char)arrayOfInt[m]));
      m++;
    }
    return mWa.a(localArrayList, "", null, null, 0, null, null, 62, null);
  }
  
  private final String r()
  {
    int[] arrayOfInt = new int[23];
    int m = 0;
    arrayOfInt[0] = 103;
    arrayOfInt[1] = 101;
    arrayOfInt[2] = 116;
    arrayOfInt[3] = 83;
    arrayOfInt[4] = 117;
    arrayOfInt[5] = 98;
    arrayOfInt[6] = 106;
    arrayOfInt[7] = 101;
    arrayOfInt[8] = 99;
    arrayOfInt[9] = 116;
    arrayOfInt[10] = 88;
    arrayOfInt[11] = 53;
    arrayOfInt[12] = 48;
    arrayOfInt[13] = 48;
    arrayOfInt[14] = 80;
    arrayOfInt[15] = 114;
    arrayOfInt[16] = 105;
    arrayOfInt[17] = 110;
    arrayOfInt[18] = 99;
    arrayOfInt[19] = 105;
    arrayOfInt[20] = 112;
    arrayOfInt[21] = 97;
    arrayOfInt[22] = 108;
    ArrayList localArrayList = new ArrayList(arrayOfInt.length);
    int n = arrayOfInt.length;
    while (m < n)
    {
      localArrayList.add(Character.valueOf((char)arrayOfInt[m]));
      m++;
    }
    return mWa.a(localArrayList, "", null, null, 0, null, null, 62, null);
  }
  
  private final String s()
  {
    int[] arrayOfInt = new int[38];
    int m = 0;
    arrayOfInt[0] = 106;
    arrayOfInt[1] = 97;
    arrayOfInt[2] = 118;
    arrayOfInt[3] = 97;
    arrayOfInt[4] = 120;
    arrayOfInt[5] = 46;
    arrayOfInt[6] = 115;
    arrayOfInt[7] = 101;
    arrayOfInt[8] = 99;
    arrayOfInt[9] = 117;
    arrayOfInt[10] = 114;
    arrayOfInt[11] = 105;
    arrayOfInt[12] = 116;
    arrayOfInt[13] = 121;
    arrayOfInt[14] = 46;
    arrayOfInt[15] = 97;
    arrayOfInt[16] = 117;
    arrayOfInt[17] = 116;
    arrayOfInt[18] = 104;
    arrayOfInt[19] = 46;
    arrayOfInt[20] = 120;
    arrayOfInt[21] = 53;
    arrayOfInt[22] = 48;
    arrayOfInt[23] = 48;
    arrayOfInt[24] = 46;
    arrayOfInt[25] = 88;
    arrayOfInt[26] = 53;
    arrayOfInt[27] = 48;
    arrayOfInt[28] = 48;
    arrayOfInt[29] = 80;
    arrayOfInt[30] = 114;
    arrayOfInt[31] = 105;
    arrayOfInt[32] = 110;
    arrayOfInt[33] = 99;
    arrayOfInt[34] = 105;
    arrayOfInt[35] = 112;
    arrayOfInt[36] = 97;
    arrayOfInt[37] = 108;
    ArrayList localArrayList = new ArrayList(arrayOfInt.length);
    int n = arrayOfInt.length;
    while (m < n)
    {
      localArrayList.add(Character.valueOf((char)arrayOfInt[m]));
      m++;
    }
    return mWa.a(localArrayList, "", null, null, 0, null, null, 62, null);
  }
  
  private final String t()
  {
    int[] arrayOfInt = new int[5];
    int m = 0;
    arrayOfInt[0] = 88;
    arrayOfInt[1] = 46;
    arrayOfInt[2] = 53;
    arrayOfInt[3] = 48;
    arrayOfInt[4] = 57;
    ArrayList localArrayList = new ArrayList(arrayOfInt.length);
    int n = arrayOfInt.length;
    while (m < n)
    {
      localArrayList.add(Character.valueOf((char)arrayOfInt[m]));
      m++;
    }
    return mWa.a(localArrayList, "", null, null, 0, null, null, 62, null);
  }
  
  public final void a(Context paramContext)
  {
    oXa.b(paramContext, "context");
    long l1 = '୔' + System.nanoTime() % 'ϒ';
    k = QQa.b(l1, TimeUnit.MILLISECONDS, EVa.b()).h().d(new wra(paramContext, l1));
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/xra.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */