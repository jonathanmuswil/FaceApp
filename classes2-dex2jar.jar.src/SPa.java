import android.app.Activity;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class spa
{
  private static final QVa b = RVa.a(kpa.b);
  private static final QVa c = RVa.a(ppa.b);
  private static final QVa d = RVa.a(jpa.b);
  private static final QVa e = RVa.a(opa.b);
  private static final QVa f = RVa.a(lpa.b);
  private static final QVa g = RVa.a(qpa.b);
  private static final QVa h = RVa.a(mpa.b);
  private static final QVa i = RVa.a(npa.b);
  public static final spa j;
  
  static
  {
    rXa localrXa1 = new rXa(vXa.a(spa.class), "GENERIC", "getGENERIC()Ljava/lang/String;");
    vXa.a(localrXa1);
    rXa localrXa2 = new rXa(vXa.a(spa.class), "UNKNOWN", "getUNKNOWN()Ljava/lang/String;");
    vXa.a(localrXa2);
    rXa localrXa3 = new rXa(vXa.a(spa.class), "EMULATOR", "getEMULATOR()Ljava/lang/String;");
    vXa.a(localrXa3);
    rXa localrXa4 = new rXa(vXa.a(spa.class), "SDK", "getSDK()Ljava/lang/String;");
    vXa.a(localrXa4);
    rXa localrXa5 = new rXa(vXa.a(spa.class), "GENYMOTION", "getGENYMOTION()Ljava/lang/String;");
    vXa.a(localrXa5);
    rXa localrXa6 = new rXa(vXa.a(spa.class), "X86", "getX86()Ljava/lang/String;");
    vXa.a(localrXa6);
    rXa localrXa7 = new rXa(vXa.a(spa.class), "GOLDFISH", "getGOLDFISH()Ljava/lang/String;");
    vXa.a(localrXa7);
    rXa localrXa8 = new rXa(vXa.a(spa.class), "GOOGLE_SDK", "getGOOGLE_SDK()Ljava/lang/String;");
    vXa.a(localrXa8);
    a = new XXa[] { localrXa1, localrXa2, localrXa3, localrXa4, localrXa5, localrXa6, localrXa7, localrXa8 };
    j = new spa();
  }
  
  private final String a()
  {
    QVa localQVa = d;
    XXa localXXa = a[2];
    return (String)localQVa.getValue();
  }
  
  private final String a(List<Integer> paramList, int paramInt)
  {
    ArrayList localArrayList = new ArrayList(mWa.a(paramList, 10));
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      localArrayList.add(Character.valueOf((char)(((Number)paramList.next()).intValue() - paramInt)));
    }
    return mWa.a(localArrayList, "", null, null, 0, null, null, 62, null);
  }
  
  private final String a(int[] paramArrayOfInt, int paramInt)
  {
    ArrayList localArrayList = new ArrayList(paramArrayOfInt.length);
    int k = paramArrayOfInt.length;
    for (int m = 0; m < k; m++) {
      localArrayList.add(Character.valueOf((char)(paramArrayOfInt[m] - paramInt)));
    }
    return mWa.a(localArrayList, "", null, null, 0, null, null, 62, null);
  }
  
  private final String a(Integer[] paramArrayOfInteger, int paramInt)
  {
    ArrayList localArrayList = new ArrayList(paramArrayOfInteger.length);
    int k = paramArrayOfInteger.length;
    for (int m = 0; m < k; m++) {
      localArrayList.add(Character.valueOf((char)(paramArrayOfInteger[m].intValue() - paramInt)));
    }
    return mWa.a(localArrayList, "", null, null, 0, null, null, 62, null);
  }
  
  private final String b()
  {
    QVa localQVa = b;
    XXa localXXa = a[0];
    return (String)localQVa.getValue();
  }
  
  private final String c()
  {
    QVa localQVa = f;
    XXa localXXa = a[4];
    return (String)localQVa.getValue();
  }
  
  private final String d()
  {
    QVa localQVa = h;
    XXa localXXa = a[6];
    return (String)localQVa.getValue();
  }
  
  private final String e()
  {
    QVa localQVa = i;
    XXa localXXa = a[7];
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
    QVa localQVa = c;
    XXa localXXa = a[1];
    return (String)localQVa.getValue();
  }
  
  private final String h()
  {
    QVa localQVa = g;
    XXa localXXa = a[5];
    return (String)localQVa.getValue();
  }
  
  private final boolean i()
  {
    String str1 = Build.FINGERPRINT;
    oXa.a(str1, "Build.FINGERPRINT");
    boolean bool = false;
    String str2 = Build.DEVICE;
    oXa.a(str2, "Build.DEVICE");
    String str3 = Build.MODEL;
    oXa.a(str3, "Build.MODEL");
    String str4 = Build.BRAND;
    oXa.a(str4, "Build.BRAND");
    String str5 = Build.PRODUCT;
    oXa.a(str5, "Build.PRODUCT");
    String str6 = Build.MANUFACTURER;
    oXa.a(str6, "Build.MANUFACTURER");
    String str7 = Build.HARDWARE;
    oXa.a(str7, "Build.HARDWARE");
    str1 = mWa.a(mWa.b(new String[] { str1, str2, str3, str4, str5, str6, str7 }), "", null, null, 0, null, null, 62, null);
    if (str1 != null)
    {
      str1 = str1.toLowerCase();
      oXa.a(str1, "(this as java.lang.String).toLowerCase()");
      if ((zYa.a(str1, j.b(), false, 2, null)) || (zYa.a(str1, j.g(), false, 2, null)) || (zYa.a(str1, j.a(), false, 2, null)) || (zYa.a(str1, j.f(), false, 2, null)) || (zYa.a(str1, j.c(), false, 2, null)) || (zYa.a(str1, j.h(), false, 2, null)) || (zYa.a(str1, j.d(), false, 2, null)) || (zYa.a(str1, j.e(), false, 2, null))) {
        bool = true;
      }
      return bool;
    }
    throw new _Va("null cannot be cast to non-null type java.lang.String");
  }
  
  private final String j()
  {
    Integer localInteger1 = Integer.valueOf(52);
    Integer localInteger2 = Integer.valueOf(1);
    Integer localInteger3 = Integer.valueOf(55);
    Integer localInteger4 = Integer.valueOf(60);
    Integer localInteger5 = Integer.valueOf(67);
    Integer localInteger6 = Integer.valueOf(71);
    return a(new Integer[] { localInteger1, Integer.valueOf(65), localInteger3, Integer.valueOf(69), Integer.valueOf(66), localInteger4, localInteger3, localInteger2, localInteger1, localInteger5, localInteger5, localInteger2, Integer.valueOf(20), Integer.valueOf(54), localInteger6, localInteger4, Integer.valueOf(73), localInteger4, localInteger6, Integer.valueOf(76) }, -45);
  }
  
  private final String k()
  {
    return a(new Integer[] { Integer.valueOf(72), Integer.valueOf(80), Integer.valueOf(88), Integer.valueOf(79), Integer.valueOf(68), Integer.valueOf(87), Integer.valueOf(82), Integer.valueOf(85) }, -29);
  }
  
  private final String l()
  {
    Integer localInteger1 = Integer.valueOf(55);
    Integer localInteger2 = Integer.valueOf(58);
    Integer localInteger3 = Integer.valueOf(63);
    return a(new Integer[] { localInteger1, localInteger2, localInteger3, localInteger2, Integer.valueOf(68), Integer.valueOf(57), Integer.valueOf(18), localInteger1, localInteger1, localInteger2, localInteger3, localInteger2, Integer.valueOf(69), Integer.valueOf(74) }, -47);
  }
  
  private final String m()
  {
    Integer localInteger = Integer.valueOf(59);
    return a(new Integer[] { Integer.valueOf(61), localInteger, Integer.valueOf(68), localInteger, Integer.valueOf(72), Integer.valueOf(63), Integer.valueOf(57) }, -42);
  }
  
  private final String n()
  {
    Integer localInteger1 = Integer.valueOf(90);
    Integer localInteger2 = Integer.valueOf(91);
    return a(new Integer[] { Integer.valueOf(83), Integer.valueOf(81), localInteger1, Integer.valueOf(101), Integer.valueOf(89), localInteger2, Integer.valueOf(96), Integer.valueOf(85), localInteger2, localInteger1 }, -20);
  }
  
  private final String o()
  {
    return a(mWa.b(new Integer[] { Integer.valueOf(115), Integer.valueOf(123), Integer.valueOf(120), Integer.valueOf(112), Integer.valueOf(114), Integer.valueOf(117), Integer.valueOf(127), Integer.valueOf(116) }), 12);
  }
  
  private final String p()
  {
    Integer localInteger1 = Integer.valueOf(149);
    Integer localInteger2 = Integer.valueOf(157);
    return a(mWa.b(new Integer[] { localInteger1, localInteger2, localInteger2, localInteger1, Integer.valueOf(154), Integer.valueOf(147), Integer.valueOf(141), Integer.valueOf(161), Integer.valueOf(146), Integer.valueOf(153) }), 46);
  }
  
  private final String q()
  {
    return a(mWa.b(new Integer[] { Integer.valueOf(120), Integer.valueOf(105), Integer.valueOf(112) }), 5);
  }
  
  private final String r()
  {
    Integer localInteger = Integer.valueOf(129);
    return a(mWa.b(new Integer[] { Integer.valueOf(136), localInteger, Integer.valueOf(126), localInteger, Integer.valueOf(130), Integer.valueOf(138), localInteger }), 19);
  }
  
  private final String s()
  {
    return a(new int[] { 109, 45, 43 }, -11);
  }
  
  public final void a(Activity paramActivity)
  {
    oXa.b(paramActivity, "activity");
    EVa.b().a(new rpa(paramActivity));
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/spa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */