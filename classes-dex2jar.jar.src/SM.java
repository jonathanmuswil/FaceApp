import android.app.ActivityManager.RunningAppProcessInfo;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class sm
{
  private static final Nk a = Nk.a("0");
  private static final Nk b = Nk.a("Unity");
  
  private static int a()
  {
    return Rk.a(1, a) + 0 + Rk.a(2, a) + Rk.a(3, 0L);
  }
  
  private static int a(int paramInt1, Nk paramNk1, int paramInt2, long paramLong1, long paramLong2, boolean paramBoolean, Map<Bba.a, String> paramMap, int paramInt3, Nk paramNk2, Nk paramNk3)
  {
    int i = Rk.a(3, paramInt1);
    int j = 0;
    if (paramNk1 == null) {
      paramInt1 = 0;
    } else {
      paramInt1 = Rk.a(4, paramNk1);
    }
    paramInt1 = i + 0 + paramInt1 + Rk.c(5, paramInt2) + Rk.a(6, paramLong1) + Rk.a(7, paramLong2) + Rk.a(10, paramBoolean);
    paramInt2 = paramInt1;
    if (paramMap != null)
    {
      paramMap = paramMap.entrySet().iterator();
      for (;;)
      {
        paramInt2 = paramInt1;
        if (!paramMap.hasNext()) {
          break;
        }
        paramNk1 = (Map.Entry)paramMap.next();
        paramInt2 = a((Bba.a)paramNk1.getKey(), (String)paramNk1.getValue());
        paramInt1 += Rk.e(11) + Rk.c(paramInt2) + paramInt2;
      }
    }
    i = Rk.c(12, paramInt3);
    if (paramNk2 == null) {
      paramInt1 = 0;
    } else {
      paramInt1 = Rk.a(13, paramNk2);
    }
    if (paramNk3 == null) {
      paramInt3 = j;
    } else {
      paramInt3 = Rk.a(14, paramNk3);
    }
    return paramInt2 + i + paramInt1 + paramInt3;
  }
  
  private static int a(long paramLong1, String paramString, wm paramwm, Thread paramThread, StackTraceElement[] paramArrayOfStackTraceElement, Thread[] paramArrayOfThread, List<StackTraceElement[]> paramList, int paramInt1, Map<String, String> paramMap, ActivityManager.RunningAppProcessInfo paramRunningAppProcessInfo, int paramInt2, Nk paramNk1, Nk paramNk2, Float paramFloat, int paramInt3, boolean paramBoolean, long paramLong2, long paramLong3, Nk paramNk3)
  {
    int i = Rk.a(1, paramLong1);
    int j = Rk.a(2, Nk.a(paramString));
    paramInt1 = a(paramwm, paramThread, paramArrayOfStackTraceElement, paramArrayOfThread, paramList, paramInt1, paramNk1, paramNk2, paramMap, paramRunningAppProcessInfo, paramInt2);
    int k = Rk.e(3);
    int m = Rk.c(paramInt1);
    paramInt2 = a(paramFloat, paramInt3, paramBoolean, paramInt2, paramLong2, paramLong3);
    paramInt2 = i + 0 + j + (k + m + paramInt1) + (Rk.e(5) + Rk.c(paramInt2) + paramInt2);
    paramInt1 = paramInt2;
    if (paramNk3 != null)
    {
      paramInt1 = a(paramNk3);
      paramInt1 = paramInt2 + (Rk.e(6) + Rk.c(paramInt1) + paramInt1);
    }
    return paramInt1;
  }
  
  private static int a(Bba.a parama, String paramString)
  {
    return Rk.a(1, parama.i) + Rk.a(2, Nk.a(paramString));
  }
  
  private static int a(Nk paramNk)
  {
    return Rk.a(1, paramNk);
  }
  
  private static int a(Nk paramNk1, Nk paramNk2)
  {
    int i = Rk.a(1, 0L) + 0 + Rk.a(2, 0L) + Rk.a(3, paramNk1);
    int j = i;
    if (paramNk2 != null) {
      j = i + Rk.a(4, paramNk2);
    }
    return j;
  }
  
  private static int a(Nk paramNk1, Nk paramNk2, Nk paramNk3, Nk paramNk4, Nk paramNk5, int paramInt, Nk paramNk6)
  {
    int i = Rk.a(1, paramNk1);
    int j = Rk.a(2, paramNk3);
    int k = Rk.a(3, paramNk4);
    int m = b(paramNk2);
    k = i + 0 + j + k + (Rk.e(5) + Rk.c(m) + m) + Rk.a(6, paramNk5);
    j = k;
    if (paramNk6 != null) {
      j = k + Rk.a(8, b) + Rk.a(9, paramNk6);
    }
    return j + Rk.a(10, paramInt);
  }
  
  private static int a(Nk paramNk1, Nk paramNk2, boolean paramBoolean)
  {
    return Rk.a(1, 3) + 0 + Rk.a(2, paramNk1) + Rk.a(3, paramNk2) + Rk.a(4, paramBoolean);
  }
  
  private static int a(Float paramFloat, int paramInt1, boolean paramBoolean, int paramInt2, long paramLong1, long paramLong2)
  {
    int i = 0;
    if (paramFloat != null) {
      i = 0 + Rk.a(1, paramFloat.floatValue());
    }
    return i + Rk.b(2, paramInt1) + Rk.a(3, paramBoolean) + Rk.c(4, paramInt2) + Rk.a(5, paramLong1) + Rk.a(6, paramLong2);
  }
  
  private static int a(StackTraceElement paramStackTraceElement, boolean paramBoolean)
  {
    boolean bool = paramStackTraceElement.isNativeMethod();
    int i = 0;
    if (bool) {
      j = Rk.a(1, Math.max(paramStackTraceElement.getLineNumber(), 0));
    } else {
      j = Rk.a(1, 0L);
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramStackTraceElement.getClassName());
    localStringBuilder.append(".");
    localStringBuilder.append(paramStackTraceElement.getMethodName());
    int k = j + 0 + Rk.a(2, Nk.a(localStringBuilder.toString()));
    int j = k;
    if (paramStackTraceElement.getFileName() != null) {
      j = k + Rk.a(3, Nk.a(paramStackTraceElement.getFileName()));
    }
    k = j;
    if (!paramStackTraceElement.isNativeMethod())
    {
      k = j;
      if (paramStackTraceElement.getLineNumber() > 0) {
        k = j + Rk.a(4, paramStackTraceElement.getLineNumber());
      }
    }
    j = i;
    if (paramBoolean) {
      j = 2;
    }
    return k + Rk.c(5, j);
  }
  
  private static int a(String paramString1, String paramString2)
  {
    int i = Rk.a(1, Nk.a(paramString1));
    paramString1 = paramString2;
    if (paramString2 == null) {
      paramString1 = "";
    }
    return i + Rk.a(2, Nk.a(paramString1));
  }
  
  private static int a(Thread paramThread, StackTraceElement[] paramArrayOfStackTraceElement, int paramInt, boolean paramBoolean)
  {
    paramInt = Rk.a(1, Nk.a(paramThread.getName())) + Rk.c(2, paramInt);
    int i = paramArrayOfStackTraceElement.length;
    for (int j = 0; j < i; j++)
    {
      int k = a(paramArrayOfStackTraceElement[j], paramBoolean);
      paramInt += Rk.e(3) + Rk.c(k) + k;
    }
    return paramInt;
  }
  
  private static int a(wm paramwm, int paramInt1, int paramInt2)
  {
    int i = Rk.a(1, Nk.a(paramwm.b));
    int j = 0;
    int k = i + 0;
    Object localObject = paramwm.a;
    i = k;
    if (localObject != null) {
      i = k + Rk.a(3, Nk.a((String)localObject));
    }
    localObject = paramwm.c;
    int m = localObject.length;
    for (k = 0; k < m; k++)
    {
      int n = a(localObject[k], true);
      i += Rk.e(4) + Rk.c(n) + n;
    }
    localObject = paramwm.d;
    k = i;
    if (localObject != null)
    {
      k = j;
      paramwm = (wm)localObject;
      if (paramInt1 < paramInt2)
      {
        paramInt1 = a((wm)localObject, paramInt1 + 1, paramInt2);
        k = i + (Rk.e(6) + Rk.c(paramInt1) + paramInt1);
      }
      else
      {
        while (paramwm != null)
        {
          paramwm = paramwm.d;
          k++;
        }
        k = i + Rk.c(7, k);
      }
    }
    return k;
  }
  
  private static int a(wm paramwm, Thread paramThread, StackTraceElement[] paramArrayOfStackTraceElement, Thread[] paramArrayOfThread, List<StackTraceElement[]> paramList, int paramInt, Nk paramNk1, Nk paramNk2)
  {
    int i = a(paramThread, paramArrayOfStackTraceElement, 4, true);
    int j = Rk.e(1);
    int k = Rk.c(i);
    int m = paramArrayOfThread.length;
    k = j + k + i + 0;
    for (j = 0; j < m; j++)
    {
      i = a(paramArrayOfThread[j], (StackTraceElement[])paramList.get(j), 0, false);
      k += Rk.e(1) + Rk.c(i) + i;
    }
    paramInt = a(paramwm, 1, paramInt);
    int n = Rk.e(2);
    m = Rk.c(paramInt);
    j = a();
    i = Rk.e(3);
    int i1 = Rk.c(j);
    int i2 = a(paramNk1, paramNk2);
    return k + (n + m + paramInt) + (i + i1 + j) + (Rk.e(3) + Rk.c(i2) + i2);
  }
  
  private static int a(wm paramwm, Thread paramThread, StackTraceElement[] paramArrayOfStackTraceElement, Thread[] paramArrayOfThread, List<StackTraceElement[]> paramList, int paramInt1, Nk paramNk1, Nk paramNk2, Map<String, String> paramMap, ActivityManager.RunningAppProcessInfo paramRunningAppProcessInfo, int paramInt2)
  {
    int i = a(paramwm, paramThread, paramArrayOfStackTraceElement, paramArrayOfThread, paramList, paramInt1, paramNk1, paramNk2);
    paramInt1 = Rk.e(1);
    int j = Rk.c(i);
    boolean bool = false;
    j = paramInt1 + j + i + 0;
    paramInt1 = j;
    if (paramMap != null)
    {
      paramThread = paramMap.entrySet().iterator();
      for (;;)
      {
        paramInt1 = j;
        if (!paramThread.hasNext()) {
          break;
        }
        paramwm = (Map.Entry)paramThread.next();
        paramInt1 = a((String)paramwm.getKey(), (String)paramwm.getValue());
        j += Rk.e(2) + Rk.c(paramInt1) + paramInt1;
      }
    }
    j = paramInt1;
    if (paramRunningAppProcessInfo != null)
    {
      if (paramRunningAppProcessInfo.importance != 100) {
        bool = true;
      }
      j = paramInt1 + Rk.a(3, bool);
    }
    return j + Rk.c(4, paramInt2);
  }
  
  private static Nk a(String paramString)
  {
    if (paramString == null) {
      paramString = null;
    } else {
      paramString = Nk.a(paramString);
    }
    return paramString;
  }
  
  private static void a(Rk paramRk, int paramInt, StackTraceElement paramStackTraceElement, boolean paramBoolean)
    throws Exception
  {
    paramRk.f(paramInt, 2);
    paramRk.l(a(paramStackTraceElement, paramBoolean));
    if (paramStackTraceElement.isNativeMethod()) {
      paramRk.b(1, Math.max(paramStackTraceElement.getLineNumber(), 0));
    } else {
      paramRk.b(1, 0L);
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramStackTraceElement.getClassName());
    localStringBuilder.append(".");
    localStringBuilder.append(paramStackTraceElement.getMethodName());
    paramRk.b(2, Nk.a(localStringBuilder.toString()));
    if (paramStackTraceElement.getFileName() != null) {
      paramRk.b(3, Nk.a(paramStackTraceElement.getFileName()));
    }
    boolean bool = paramStackTraceElement.isNativeMethod();
    paramInt = 4;
    if ((!bool) && (paramStackTraceElement.getLineNumber() > 0)) {
      paramRk.b(4, paramStackTraceElement.getLineNumber());
    }
    if (!paramBoolean) {
      paramInt = 0;
    }
    paramRk.g(5, paramInt);
  }
  
  public static void a(Rk paramRk, int paramInt1, String paramString1, int paramInt2, long paramLong1, long paramLong2, boolean paramBoolean, Map<Bba.a, String> paramMap, int paramInt3, String paramString2, String paramString3)
    throws Exception
  {
    Nk localNk = a(paramString1);
    paramString1 = a(paramString3);
    paramString2 = a(paramString2);
    paramRk.f(9, 2);
    paramRk.l(a(paramInt1, localNk, paramInt2, paramLong1, paramLong2, paramBoolean, paramMap, paramInt3, paramString2, paramString1));
    paramRk.d(3, paramInt1);
    paramRk.b(4, localNk);
    paramRk.g(5, paramInt2);
    paramRk.b(6, paramLong1);
    paramRk.b(7, paramLong2);
    paramRk.b(10, paramBoolean);
    paramString3 = paramMap.entrySet().iterator();
    while (paramString3.hasNext())
    {
      paramMap = (Map.Entry)paramString3.next();
      paramRk.f(11, 2);
      paramRk.l(a((Bba.a)paramMap.getKey(), (String)paramMap.getValue()));
      paramRk.d(1, ((Bba.a)paramMap.getKey()).i);
      paramRk.b(2, Nk.a((String)paramMap.getValue()));
    }
    paramRk.g(12, paramInt3);
    if (paramString2 != null) {
      paramRk.b(13, paramString2);
    }
    if (paramString1 != null) {
      paramRk.b(14, paramString1);
    }
  }
  
  public static void a(Rk paramRk, long paramLong1, String paramString1, wm paramwm, Thread paramThread, StackTraceElement[] paramArrayOfStackTraceElement, Thread[] paramArrayOfThread, List<StackTraceElement[]> paramList, Map<String, String> paramMap, am paramam, ActivityManager.RunningAppProcessInfo paramRunningAppProcessInfo, int paramInt1, String paramString2, String paramString3, Float paramFloat, int paramInt2, boolean paramBoolean, long paramLong2, long paramLong3)
    throws Exception
  {
    Nk localNk = Nk.a(paramString2);
    if (paramString3 == null) {
      paramString2 = null;
    } else {
      paramString2 = Nk.a(paramString3.replace("-", ""));
    }
    paramString3 = paramam.b();
    if (paramString3 == null) {
      Naa.e().d("CrashlyticsCore", "No log data to include with this event.");
    }
    paramam.a();
    paramRk.f(10, 2);
    paramRk.l(a(paramLong1, paramString1, paramwm, paramThread, paramArrayOfStackTraceElement, paramArrayOfThread, paramList, 8, paramMap, paramRunningAppProcessInfo, paramInt1, localNk, paramString2, paramFloat, paramInt2, paramBoolean, paramLong2, paramLong3, paramString3));
    paramRk.b(1, paramLong1);
    paramRk.b(2, Nk.a(paramString1));
    a(paramRk, paramwm, paramThread, paramArrayOfStackTraceElement, paramArrayOfThread, paramList, 8, localNk, paramString2, paramMap, paramRunningAppProcessInfo, paramInt1);
    a(paramRk, paramFloat, paramInt2, paramBoolean, paramInt1, paramLong2, paramLong3);
    a(paramRk, paramString3);
  }
  
  private static void a(Rk paramRk, Nk paramNk)
    throws Exception
  {
    if (paramNk != null)
    {
      paramRk.f(6, 2);
      paramRk.l(a(paramNk));
      paramRk.b(1, paramNk);
    }
  }
  
  private static void a(Rk paramRk, Float paramFloat, int paramInt1, boolean paramBoolean, int paramInt2, long paramLong1, long paramLong2)
    throws Exception
  {
    paramRk.f(5, 2);
    paramRk.l(a(paramFloat, paramInt1, paramBoolean, paramInt2, paramLong1, paramLong2));
    if (paramFloat != null) {
      paramRk.b(1, paramFloat.floatValue());
    }
    paramRk.e(2, paramInt1);
    paramRk.b(3, paramBoolean);
    paramRk.g(4, paramInt2);
    paramRk.b(5, paramLong1);
    paramRk.b(6, paramLong2);
  }
  
  public static void a(Rk paramRk, String paramString1, String paramString2, long paramLong)
    throws Exception
  {
    paramRk.b(1, Nk.a(paramString2));
    paramRk.b(2, Nk.a(paramString1));
    paramRk.b(3, paramLong);
  }
  
  public static void a(Rk paramRk, String paramString1, String paramString2, String paramString3)
    throws Exception
  {
    Object localObject = paramString1;
    if (paramString1 == null) {
      localObject = "";
    }
    paramString1 = Nk.a((String)localObject);
    localObject = a(paramString2);
    Nk localNk = a(paramString3);
    int i = Rk.a(1, paramString1) + 0;
    int j = i;
    if (paramString2 != null) {
      j = i + Rk.a(2, (Nk)localObject);
    }
    i = j;
    if (paramString3 != null) {
      i = j + Rk.a(3, localNk);
    }
    paramRk.f(6, 2);
    paramRk.l(i);
    paramRk.b(1, paramString1);
    if (paramString2 != null) {
      paramRk.b(2, (Nk)localObject);
    }
    if (paramString3 != null) {
      paramRk.b(3, localNk);
    }
  }
  
  public static void a(Rk paramRk, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt, String paramString6)
    throws Exception
  {
    Nk localNk = Nk.a(paramString1);
    paramString2 = Nk.a(paramString2);
    paramString3 = Nk.a(paramString3);
    paramString4 = Nk.a(paramString4);
    paramString5 = Nk.a(paramString5);
    if (paramString6 != null) {
      paramString1 = Nk.a(paramString6);
    } else {
      paramString1 = null;
    }
    paramRk.f(7, 2);
    paramRk.l(a(localNk, paramString2, paramString3, paramString4, paramString5, paramInt, paramString1));
    paramRk.b(1, localNk);
    paramRk.b(2, paramString3);
    paramRk.b(3, paramString4);
    paramRk.f(5, 2);
    paramRk.l(b(paramString2));
    paramRk.b(1, paramString2);
    paramRk.b(6, paramString5);
    if (paramString1 != null)
    {
      paramRk.b(8, b);
      paramRk.b(9, paramString1);
    }
    paramRk.d(10, paramInt);
  }
  
  public static void a(Rk paramRk, String paramString1, String paramString2, boolean paramBoolean)
    throws Exception
  {
    paramString1 = Nk.a(paramString1);
    paramString2 = Nk.a(paramString2);
    paramRk.f(8, 2);
    paramRk.l(a(paramString1, paramString2, paramBoolean));
    paramRk.d(1, 3);
    paramRk.b(2, paramString1);
    paramRk.b(3, paramString2);
    paramRk.b(4, paramBoolean);
  }
  
  private static void a(Rk paramRk, Thread paramThread, StackTraceElement[] paramArrayOfStackTraceElement, int paramInt, boolean paramBoolean)
    throws Exception
  {
    paramRk.f(1, 2);
    paramRk.l(a(paramThread, paramArrayOfStackTraceElement, paramInt, paramBoolean));
    paramRk.b(1, Nk.a(paramThread.getName()));
    paramRk.g(2, paramInt);
    int i = paramArrayOfStackTraceElement.length;
    for (paramInt = 0; paramInt < i; paramInt++) {
      a(paramRk, 3, paramArrayOfStackTraceElement[paramInt], paramBoolean);
    }
  }
  
  private static void a(Rk paramRk, Map<String, String> paramMap)
    throws Exception
  {
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      paramMap = (Map.Entry)localIterator.next();
      paramRk.f(2, 2);
      paramRk.l(a((String)paramMap.getKey(), (String)paramMap.getValue()));
      paramRk.b(1, Nk.a((String)paramMap.getKey()));
      String str = (String)paramMap.getValue();
      paramMap = str;
      if (str == null) {
        paramMap = "";
      }
      paramRk.b(2, Nk.a(paramMap));
    }
  }
  
  private static void a(Rk paramRk, wm paramwm, int paramInt1, int paramInt2, int paramInt3)
    throws Exception
  {
    paramRk.f(paramInt3, 2);
    paramRk.l(a(paramwm, 1, paramInt2));
    paramRk.b(1, Nk.a(paramwm.b));
    Object localObject = paramwm.a;
    if (localObject != null) {
      paramRk.b(3, Nk.a((String)localObject));
    }
    localObject = paramwm.c;
    int i = localObject.length;
    int j = 0;
    for (paramInt3 = 0; paramInt3 < i; paramInt3++) {
      a(paramRk, 4, localObject[paramInt3], true);
    }
    localObject = paramwm.d;
    if (localObject != null)
    {
      paramInt3 = j;
      paramwm = (wm)localObject;
      if (paramInt1 < paramInt2)
      {
        a(paramRk, (wm)localObject, paramInt1 + 1, paramInt2, 6);
      }
      else
      {
        while (paramwm != null)
        {
          paramwm = paramwm.d;
          paramInt3++;
        }
        paramRk.g(7, paramInt3);
      }
    }
  }
  
  private static void a(Rk paramRk, wm paramwm, Thread paramThread, StackTraceElement[] paramArrayOfStackTraceElement, Thread[] paramArrayOfThread, List<StackTraceElement[]> paramList, int paramInt, Nk paramNk1, Nk paramNk2)
    throws Exception
  {
    paramRk.f(1, 2);
    paramRk.l(a(paramwm, paramThread, paramArrayOfStackTraceElement, paramArrayOfThread, paramList, paramInt, paramNk1, paramNk2));
    a(paramRk, paramThread, paramArrayOfStackTraceElement, 4, true);
    int i = paramArrayOfThread.length;
    for (int j = 0; j < i; j++) {
      a(paramRk, paramArrayOfThread[j], (StackTraceElement[])paramList.get(j), 0, false);
    }
    a(paramRk, paramwm, 1, paramInt, 2);
    paramRk.f(3, 2);
    paramRk.l(a());
    paramRk.b(1, a);
    paramRk.b(2, a);
    paramRk.b(3, 0L);
    paramRk.f(4, 2);
    paramRk.l(a(paramNk1, paramNk2));
    paramRk.b(1, 0L);
    paramRk.b(2, 0L);
    paramRk.b(3, paramNk1);
    if (paramNk2 != null) {
      paramRk.b(4, paramNk2);
    }
  }
  
  private static void a(Rk paramRk, wm paramwm, Thread paramThread, StackTraceElement[] paramArrayOfStackTraceElement, Thread[] paramArrayOfThread, List<StackTraceElement[]> paramList, int paramInt1, Nk paramNk1, Nk paramNk2, Map<String, String> paramMap, ActivityManager.RunningAppProcessInfo paramRunningAppProcessInfo, int paramInt2)
    throws Exception
  {
    paramRk.f(3, 2);
    paramRk.l(a(paramwm, paramThread, paramArrayOfStackTraceElement, paramArrayOfThread, paramList, paramInt1, paramNk1, paramNk2, paramMap, paramRunningAppProcessInfo, paramInt2));
    a(paramRk, paramwm, paramThread, paramArrayOfStackTraceElement, paramArrayOfThread, paramList, paramInt1, paramNk1, paramNk2);
    if ((paramMap != null) && (!paramMap.isEmpty())) {
      a(paramRk, paramMap);
    }
    if (paramRunningAppProcessInfo != null)
    {
      boolean bool;
      if (paramRunningAppProcessInfo.importance != 100) {
        bool = true;
      } else {
        bool = false;
      }
      paramRk.b(3, bool);
    }
    paramRk.g(4, paramInt2);
  }
  
  private static int b(Nk paramNk)
  {
    return Rk.a(1, paramNk) + 0;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/sm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */