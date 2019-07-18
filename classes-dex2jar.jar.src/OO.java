import android.annotation.TargetApi;
import android.content.Context;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdManager.RegistrationListener;
import android.net.nsd.NsdServiceInfo;
import android.os.Build;
import android.os.Build.VERSION;
import com.facebook.FacebookSdk;
import com.facebook.internal.C;
import com.facebook.internal.O;
import com.facebook.internal.S;
import com.facebook.internal.y;
import java.util.EnumSet;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

public class oo
{
  private static final String a = "oo";
  private static HashMap<String, NsdManager.RegistrationListener> b = new HashMap();
  
  public static String a()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("device", Build.DEVICE);
      localJSONObject.put("model", Build.MODEL);
      return localJSONObject.toString();
    }
    catch (JSONException localJSONException)
    {
      for (;;) {}
    }
  }
  
  public static void a(String paramString)
  {
    d(paramString);
  }
  
  /* Error */
  public static android.graphics.Bitmap b(String paramString)
  {
    // Byte code:
    //   0: new 56	java/util/EnumMap
    //   3: dup
    //   4: ldc 58
    //   6: invokespecial 61	java/util/EnumMap:<init>	(Ljava/lang/Class;)V
    //   9: astore_1
    //   10: aload_1
    //   11: getstatic 65	tU:f	LtU;
    //   14: iconst_2
    //   15: invokestatic 71	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   18: invokeinterface 76 3 0
    //   23: pop
    //   24: new 78	wU
    //   27: astore_2
    //   28: aload_2
    //   29: invokespecial 79	wU:<init>	()V
    //   32: aload_2
    //   33: aload_0
    //   34: getstatic 85	rU:l	LrU;
    //   37: sipush 200
    //   40: sipush 200
    //   43: aload_1
    //   44: invokevirtual 88	wU:a	(Ljava/lang/String;LrU;IILjava/util/Map;)LLU;
    //   47: astore_0
    //   48: aload_0
    //   49: invokevirtual 93	LU:b	()I
    //   52: istore_3
    //   53: aload_0
    //   54: invokevirtual 96	LU:c	()I
    //   57: istore 4
    //   59: iload_3
    //   60: iload 4
    //   62: imul
    //   63: newarray <illegal type>
    //   65: astore_1
    //   66: iconst_0
    //   67: istore 5
    //   69: iload 5
    //   71: iload_3
    //   72: if_icmpge +58 -> 130
    //   75: iconst_0
    //   76: istore 6
    //   78: iload 6
    //   80: iload 4
    //   82: if_icmpge +42 -> 124
    //   85: aload_0
    //   86: iload 6
    //   88: iload 5
    //   90: invokevirtual 99	LU:a	(II)Z
    //   93: ifeq +10 -> 103
    //   96: ldc 100
    //   98: istore 7
    //   100: goto +6 -> 106
    //   103: iconst_m1
    //   104: istore 7
    //   106: aload_1
    //   107: iload 5
    //   109: iload 4
    //   111: imul
    //   112: iload 6
    //   114: iadd
    //   115: iload 7
    //   117: iastore
    //   118: iinc 6 1
    //   121: goto -43 -> 78
    //   124: iinc 5 1
    //   127: goto -58 -> 69
    //   130: iload 4
    //   132: iload_3
    //   133: getstatic 106	android/graphics/Bitmap$Config:ARGB_8888	Landroid/graphics/Bitmap$Config;
    //   136: invokestatic 112	android/graphics/Bitmap:createBitmap	(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    //   139: astore_0
    //   140: aload_0
    //   141: aload_1
    //   142: iconst_0
    //   143: iload 4
    //   145: iconst_0
    //   146: iconst_0
    //   147: iload 4
    //   149: iload_3
    //   150: invokevirtual 116	android/graphics/Bitmap:setPixels	([IIIIIII)V
    //   153: goto +6 -> 159
    //   156: astore_0
    //   157: aconst_null
    //   158: astore_0
    //   159: aload_0
    //   160: areturn
    //   161: astore_1
    //   162: goto -3 -> 159
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	165	0	paramString	String
    //   9	133	1	localObject	Object
    //   161	1	1	localAU	AU
    //   27	6	2	localwU	wU
    //   52	98	3	i	int
    //   57	91	4	j	int
    //   67	58	5	k	int
    //   76	43	6	m	int
    //   98	18	7	n	int
    // Exception table:
    //   from	to	target	type
    //   24	66	156	AU
    //   85	96	156	AU
    //   130	140	156	AU
    //   140	153	161	AU
  }
  
  public static boolean b()
  {
    boolean bool;
    if ((Build.VERSION.SDK_INT >= 16) && (C.b(FacebookSdk.e()).j().contains(O.b))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean c(String paramString)
  {
    if (b()) {
      return e(paramString);
    }
    return false;
  }
  
  @TargetApi(16)
  private static void d(String paramString)
  {
    NsdManager.RegistrationListener localRegistrationListener = (NsdManager.RegistrationListener)b.get(paramString);
    if (localRegistrationListener != null)
    {
      NsdManager localNsdManager = (NsdManager)FacebookSdk.d().getSystemService("servicediscovery");
      try
      {
        localNsdManager.unregisterService(localRegistrationListener);
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        S.a(a, localIllegalArgumentException);
      }
      b.remove(paramString);
    }
  }
  
  @TargetApi(16)
  private static boolean e(String paramString)
  {
    if (b.containsKey(paramString)) {
      return true;
    }
    Object localObject = String.format("%s_%s_%s", new Object[] { "fbsdk", String.format("%s-%s", new Object[] { "android", FacebookSdk.m().replace('.', '|') }), paramString });
    NsdServiceInfo localNsdServiceInfo = new NsdServiceInfo();
    localNsdServiceInfo.setServiceType("_fb._tcp.");
    localNsdServiceInfo.setServiceName((String)localObject);
    localNsdServiceInfo.setPort(80);
    NsdManager localNsdManager = (NsdManager)FacebookSdk.d().getSystemService("servicediscovery");
    localObject = new no((String)localObject, paramString);
    b.put(paramString, localObject);
    localNsdManager.registerService(localNsdServiceInfo, 1, (NsdManager.RegistrationListener)localObject);
    return true;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/oo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */