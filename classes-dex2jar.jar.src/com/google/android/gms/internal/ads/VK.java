package com.google.android.gms.internal.ads;

import Dp;
import Fq;
import Gq;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager.RunningTaskInfo;
import android.app.AlertDialog.Builder;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.PopupWindow;
import com.google.android.gms.common.util.g;
import com.google.android.gms.common.util.m;
import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@yh
public final class vk
{
  public static final Handler a = new nk(Looper.getMainLooper());
  private AtomicReference<Pattern> b = new AtomicReference(null);
  private AtomicReference<Pattern> c = new AtomicReference(null);
  private boolean d = true;
  private final Object e = new Object();
  private String f;
  private boolean g = false;
  private boolean h = false;
  
  private static int a(char paramChar)
  {
    if ((paramChar >= '0') && (paramChar <= '9')) {
      return paramChar - '0';
    }
    char c1 = 'A';
    if ((paramChar >= 'A') && (paramChar <= 'F')) {}
    do
    {
      return paramChar - c1 + 10;
      c1 = 'a';
    } while ((paramChar >= 'a') && (paramChar <= 'f'));
    throw new IllegalArgumentException("Invalid Hex.");
  }
  
  public static int a(String paramString)
  {
    try
    {
      int i = Integer.parseInt(paramString);
      return i;
    }
    catch (NumberFormatException paramString)
    {
      paramString = String.valueOf(paramString);
      StringBuilder localStringBuilder = new StringBuilder(String.valueOf(paramString).length() + 22);
      localStringBuilder.append("Could not parse value:");
      localStringBuilder.append(paramString);
      Tl.d(localStringBuilder.toString());
    }
    return 0;
  }
  
  public static Bitmap a(View paramView)
  {
    paramView.setDrawingCacheEnabled(true);
    Bitmap localBitmap = Bitmap.createBitmap(paramView.getDrawingCache());
    paramView.setDrawingCacheEnabled(false);
    return localBitmap;
  }
  
  public static DisplayMetrics a(WindowManager paramWindowManager)
  {
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    paramWindowManager.getDefaultDisplay().getMetrics(localDisplayMetrics);
    return localDisplayMetrics;
  }
  
  public static WebResourceResponse a(HttpURLConnection paramHttpURLConnection)
    throws IOException
  {
    com.google.android.gms.ads.internal.k.c();
    String str = paramHttpURLConnection.getContentType();
    boolean bool = TextUtils.isEmpty(str);
    Object localObject1 = "";
    if (bool) {
      str = "";
    } else {
      str = str.split(";")[0].trim();
    }
    com.google.android.gms.ads.internal.k.c();
    Object localObject2 = paramHttpURLConnection.getContentType();
    Object localObject3 = localObject1;
    if (!TextUtils.isEmpty((CharSequence)localObject2))
    {
      localObject2 = ((String)localObject2).split(";");
      localObject3 = localObject1;
      if (localObject2.length != 1) {
        for (int i = 1;; i++)
        {
          localObject3 = localObject1;
          if (i >= localObject2.length) {
            break;
          }
          if (localObject2[i].trim().startsWith("charset"))
          {
            localObject3 = localObject2[i].trim().split("=");
            if (localObject3.length > 1)
            {
              localObject3 = localObject3[1].trim();
              break;
            }
          }
        }
      }
    }
    localObject2 = paramHttpURLConnection.getHeaderFields();
    localObject1 = new HashMap(((Map)localObject2).size());
    localObject2 = ((Map)localObject2).entrySet().iterator();
    while (((Iterator)localObject2).hasNext())
    {
      Map.Entry localEntry = (Map.Entry)((Iterator)localObject2).next();
      if ((localEntry.getKey() != null) && (localEntry.getValue() != null) && (((List)localEntry.getValue()).size() > 0)) {
        ((Map)localObject1).put((String)localEntry.getKey(), (String)((List)localEntry.getValue()).get(0));
      }
    }
    return com.google.android.gms.ads.internal.k.e().a(str, (String)localObject3, paramHttpURLConnection.getResponseCode(), paramHttpURLConnection.getResponseMessage(), (Map)localObject1, paramHttpURLConnection.getInputStream());
  }
  
  public static PopupWindow a(View paramView, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    return new PopupWindow(paramView, paramInt1, paramInt2, false);
  }
  
  public static String a()
  {
    return UUID.randomUUID().toString();
  }
  
  public static String a(InputStreamReader paramInputStreamReader)
    throws IOException
  {
    StringBuilder localStringBuilder = new StringBuilder(8192);
    char[] arrayOfChar = new char['ࠀ'];
    for (;;)
    {
      int i = paramInputStreamReader.read(arrayOfChar);
      if (i == -1) {
        break;
      }
      localStringBuilder.append(arrayOfChar, 0, i);
    }
    return localStringBuilder.toString();
  }
  
  public static Map<String, String> a(Uri paramUri)
  {
    Object localObject1 = ra.Xe;
    if (!((Boolean)Kea.e().a((ga)localObject1)).booleanValue())
    {
      if (paramUri == null) {
        return null;
      }
      localObject2 = new HashMap();
      com.google.android.gms.ads.internal.k.e();
      localObject1 = paramUri.getQueryParameterNames().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject3 = (String)((Iterator)localObject1).next();
        ((HashMap)localObject2).put(localObject3, paramUri.getQueryParameter((String)localObject3));
      }
      return (Map<String, String>)localObject2;
    }
    if (paramUri == null) {
      return null;
    }
    HashMap localHashMap = new HashMap(20);
    String str1 = paramUri.getEncodedQuery();
    if (str1 == null) {
      return localHashMap;
    }
    int i = str1.length();
    localObject1 = new StringBuilder(100);
    Object localObject2 = new StringBuilder(i);
    Object localObject3 = localObject1;
    int j = 0;
    for (;;)
    {
      int k;
      char c2;
      if (j < i)
      {
        char c1 = str1.charAt(j);
        if (c1 != '%')
        {
          if (c1 != '&')
          {
            if (c1 != '+')
            {
              if (c1 != '=')
              {
                ((StringBuilder)localObject3).append(c1);
                k = j;
                paramUri = (Uri)localObject3;
              }
              else if (localObject3 != localObject2)
              {
                paramUri = (Uri)localObject2;
                k = j;
              }
              else
              {
                ((StringBuilder)localObject3).append(c1);
                k = j;
                paramUri = (Uri)localObject3;
              }
            }
            else
            {
              ((StringBuilder)localObject3).append(' ');
              k = j;
              paramUri = (Uri)localObject3;
            }
          }
          else
          {
            if ((((StringBuilder)localObject1).length() > 0) && (localObject3 != localObject1))
            {
              localHashMap.put(((StringBuilder)localObject1).toString(), ((StringBuilder)localObject2).toString());
              ((StringBuilder)localObject1).setLength(0);
              ((StringBuilder)localObject2).setLength(0);
            }
            paramUri = (Uri)localObject1;
            k = j;
          }
        }
        else
        {
          paramUri = new byte[(i - j) / 3];
          k = 0;
          c2 = c1;
          label314:
          if ((j >= i - 2) || (c2 != '%')) {}
        }
      }
      try
      {
        paramUri[k] = ((byte)(byte)((a(str1.charAt(j + 1)) << 4) + a(str1.charAt(j + 2))));
        m = k + 1;
        int n = j + 3;
        j = n;
        k = m;
        if (n >= i) {
          break label314;
        }
        c2 = str1.charAt(n);
        j = n;
        k = m;
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        try
        {
          String str2 = new java/lang/String;
          str2.<init>(paramUri, 0, k, "UTF-8");
          ((StringBuilder)localObject3).append(str2);
          k = j;
          paramUri = (Uri)localObject3;
          if (c2 != '%') {
            continue;
          }
          j = k + 1;
          localObject3 = paramUri;
          continue;
          if ((((StringBuilder)localObject1).length() > 0) && (localObject3 != localObject1)) {
            localHashMap.put(((StringBuilder)localObject1).toString(), ((StringBuilder)localObject2).toString());
          }
          return localHashMap;
          localIllegalArgumentException = localIllegalArgumentException;
          int m = k;
        }
        catch (UnsupportedEncodingException paramUri)
        {
          for (;;) {}
        }
      }
    }
  }
  
  private final JSONArray a(Collection<?> paramCollection)
    throws JSONException
  {
    JSONArray localJSONArray = new JSONArray();
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext()) {
      a(localJSONArray, paramCollection.next());
    }
    return localJSONArray;
  }
  
  public static void a(Context paramContext, Intent paramIntent)
  {
    try
    {
      paramContext.startActivity(paramIntent);
      return;
    }
    catch (Throwable localThrowable)
    {
      paramIntent.addFlags(268435456);
      paramContext.startActivity(paramIntent);
    }
  }
  
  @TargetApi(18)
  public static void a(Context paramContext, Uri paramUri)
  {
    try
    {
      Intent localIntent = new android/content/Intent;
      localIntent.<init>("android.intent.action.VIEW", paramUri);
      Bundle localBundle = new android/os/Bundle;
      localBundle.<init>();
      localIntent.putExtras(localBundle);
      b(paramContext, localIntent);
      localBundle.putString("com.android.browser.application_id", paramContext.getPackageName());
      paramContext.startActivity(localIntent);
      paramUri = paramUri.toString();
      int i = String.valueOf(paramUri).length();
      paramContext = new java/lang/StringBuilder;
      paramContext.<init>(i + 26);
      paramContext.append("Opening ");
      paramContext.append(paramUri);
      paramContext.append(" in a new browser.");
      Tl.a(paramContext.toString());
      return;
    }
    catch (ActivityNotFoundException paramContext)
    {
      Tl.b("No browser is found.", paramContext);
    }
  }
  
  public static void a(Context paramContext, String paramString1, String paramString2)
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(paramString2);
    int i = localArrayList.size();
    int j = 0;
    while (j < i)
    {
      paramString2 = localArrayList.get(j);
      j++;
      new wl(paramContext, paramString1, (String)paramString2).b();
    }
  }
  
  public static void a(Context paramContext, Throwable paramThrowable)
  {
    if (paramContext == null) {
      return;
    }
    int i = 0;
    try
    {
      ga localga = ra.m;
      boolean bool = ((Boolean)Kea.e().a(localga)).booleanValue();
      i = bool;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      for (;;) {}
    }
    if (i != 0) {
      g.a(paramContext, paramThrowable);
    }
  }
  
  public static void a(Runnable paramRunnable)
  {
    if (Looper.getMainLooper().getThread() != Thread.currentThread())
    {
      paramRunnable.run();
      return;
    }
    tk.a(paramRunnable);
  }
  
  private final void a(JSONArray paramJSONArray, Object paramObject)
    throws JSONException
  {
    if ((paramObject instanceof Bundle))
    {
      paramJSONArray.put(a((Bundle)paramObject));
      return;
    }
    if ((paramObject instanceof Map))
    {
      paramJSONArray.put(a((Map)paramObject));
      return;
    }
    if ((paramObject instanceof Collection))
    {
      paramJSONArray.put(a((Collection)paramObject));
      return;
    }
    if ((paramObject instanceof Object[]))
    {
      Object[] arrayOfObject = (Object[])paramObject;
      paramObject = new JSONArray();
      int i = arrayOfObject.length;
      for (int j = 0; j < i; j++) {
        a((JSONArray)paramObject, arrayOfObject[j]);
      }
      paramJSONArray.put(paramObject);
      return;
    }
    paramJSONArray.put(paramObject);
  }
  
  private final void a(JSONObject paramJSONObject, String paramString, Object paramObject)
    throws JSONException
  {
    if ((paramObject instanceof Bundle))
    {
      paramJSONObject.put(paramString, a((Bundle)paramObject));
      return;
    }
    if ((paramObject instanceof Map))
    {
      paramJSONObject.put(paramString, a((Map)paramObject));
      return;
    }
    if ((paramObject instanceof Collection))
    {
      if (paramString == null) {
        paramString = "null";
      }
      paramJSONObject.put(paramString, a((Collection)paramObject));
      return;
    }
    if ((paramObject instanceof Object[]))
    {
      paramJSONObject.put(paramString, a(Arrays.asList((Object[])paramObject)));
      return;
    }
    paramJSONObject.put(paramString, paramObject);
  }
  
  public static boolean a(Context paramContext, String paramString)
  {
    Context localContext = li.b(paramContext);
    paramContext = localContext.getPackageName();
    return Gq.a(localContext).a(paramString, paramContext) == 0;
  }
  
  private static boolean a(String paramString1, AtomicReference<Pattern> paramAtomicReference, String paramString2)
  {
    if (TextUtils.isEmpty(paramString1)) {
      return false;
    }
    try
    {
      Pattern localPattern1 = (Pattern)paramAtomicReference.get();
      Pattern localPattern2;
      if (localPattern1 != null)
      {
        localPattern2 = localPattern1;
        if (paramString2.equals(localPattern1.pattern())) {}
      }
      else
      {
        localPattern2 = Pattern.compile(paramString2);
        paramAtomicReference.set(localPattern2);
      }
      boolean bool = localPattern2.matcher(paramString1).matches();
      return bool;
    }
    catch (PatternSyntaxException paramString1) {}
    return false;
  }
  
  public static int[] a(Activity paramActivity)
  {
    paramActivity = paramActivity.getWindow();
    if (paramActivity != null)
    {
      paramActivity = paramActivity.findViewById(16908290);
      if (paramActivity != null) {
        return new int[] { paramActivity.getWidth(), paramActivity.getHeight() };
      }
    }
    return e();
  }
  
  public static Bitmap b(View paramView)
  {
    if (paramView == null) {
      return null;
    }
    Bitmap localBitmap1 = f(paramView);
    Bitmap localBitmap2 = localBitmap1;
    if (localBitmap1 == null) {
      localBitmap2 = e(paramView);
    }
    return localBitmap2;
  }
  
  public static String b()
  {
    String str1 = Build.MANUFACTURER;
    String str2 = Build.MODEL;
    if (str2.startsWith(str1)) {
      return str2;
    }
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str1).length() + 1 + String.valueOf(str2).length());
    localStringBuilder.append(str1);
    localStringBuilder.append(" ");
    localStringBuilder.append(str2);
    return localStringBuilder.toString();
  }
  
  @TargetApi(18)
  public static void b(Context paramContext, Intent paramIntent)
  {
    if (paramIntent == null) {
      return;
    }
    if (m.e())
    {
      Bundle localBundle;
      if (paramIntent.getExtras() != null) {
        localBundle = paramIntent.getExtras();
      } else {
        localBundle = new Bundle();
      }
      localBundle.putBinder("android.support.customtabs.extra.SESSION", null);
      localBundle.putString("com.android.browser.application_id", paramContext.getPackageName());
      paramIntent.putExtras(localBundle);
    }
  }
  
  public static void b(Context paramContext, String paramString1, String paramString2)
  {
    try
    {
      paramContext = paramContext.openFileOutput(paramString1, 0);
      paramContext.write(paramString2.getBytes("UTF-8"));
      paramContext.close();
      return;
    }
    catch (Exception paramContext)
    {
      Tl.b("Error writing to file in internal storage.", paramContext);
    }
  }
  
  public static boolean b(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return false;
    }
    return paramString.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)");
  }
  
  public static WebResourceResponse c(Context paramContext, String paramString1, String paramString2)
  {
    try
    {
      HashMap localHashMap = new java/util/HashMap;
      localHashMap.<init>();
      localHashMap.put("User-Agent", com.google.android.gms.ads.internal.k.c().b(paramContext, paramString1));
      localHashMap.put("Cache-Control", "max-stale=3600");
      paramString1 = new com/google/android/gms/internal/ads/hl;
      paramString1.<init>(paramContext);
      paramString1 = (String)paramString1.a(paramString2, localHashMap).get(60L, TimeUnit.SECONDS);
      if (paramString1 == null) {
        break label125;
      }
      paramContext = new java/io/ByteArrayInputStream;
      paramContext.<init>(paramString1.getBytes("UTF-8"));
      paramContext = new WebResourceResponse("application/javascript", "UTF-8", paramContext);
      return paramContext;
    }
    catch (TimeoutException paramContext) {}catch (InterruptedException paramContext) {}catch (ExecutionException paramContext) {}catch (IOException paramContext) {}
    Tl.c("Could not fetch MRAID JS.", paramContext);
    label125:
    return null;
  }
  
  public static String c()
  {
    Object localObject = com.google.android.gms.ads.internal.k.g().b();
    if (localObject != null) {
      localObject = ((Resources)localObject).getString(Dp.s7);
    } else {
      localObject = "Test Ad";
    }
    return (String)localObject;
  }
  
  protected static String c(Context paramContext)
  {
    try
    {
      WebView localWebView = new android/webkit/WebView;
      localWebView.<init>(paramContext);
      paramContext = localWebView.getSettings().getUserAgentString();
      return paramContext;
    }
    catch (Throwable paramContext) {}
    return d();
  }
  
  public static String c(Context paramContext, String paramString)
  {
    try
    {
      paramContext = new String(com.google.android.gms.common.util.k.a(paramContext.openFileInput(paramString), true), "UTF-8");
      return paramContext;
    }
    catch (IOException paramContext)
    {
      Tl.a("Error reading from internal storage.");
    }
    return "";
  }
  
  public static boolean c(View paramView)
  {
    paramView = paramView.getRootView();
    Object localObject = null;
    if (paramView != null)
    {
      paramView = paramView.getContext();
      if ((paramView instanceof Activity))
      {
        paramView = (Activity)paramView;
        break label33;
      }
    }
    paramView = null;
    label33:
    if (paramView == null) {
      return false;
    }
    paramView = paramView.getWindow();
    if (paramView == null) {
      paramView = (View)localObject;
    } else {
      paramView = paramView.getAttributes();
    }
    return (paramView != null) && ((paramView.flags & 0x80000) != 0);
  }
  
  public static int d(View paramView)
  {
    if (paramView == null) {
      return -1;
    }
    for (ViewParent localViewParent = paramView.getParent(); (localViewParent != null) && (!(localViewParent instanceof AdapterView)); localViewParent = localViewParent.getParent()) {}
    if (localViewParent == null) {
      return -1;
    }
    return ((AdapterView)localViewParent).getPositionForView(paramView);
  }
  
  public static AlertDialog.Builder d(Context paramContext)
  {
    return new AlertDialog.Builder(paramContext);
  }
  
  private static String d()
  {
    StringBuilder localStringBuilder = new StringBuilder(256);
    localStringBuilder.append("Mozilla/5.0 (Linux; U; Android");
    if (Build.VERSION.RELEASE != null)
    {
      localStringBuilder.append(" ");
      localStringBuilder.append(Build.VERSION.RELEASE);
    }
    localStringBuilder.append("; ");
    localStringBuilder.append(Locale.getDefault());
    if (Build.DEVICE != null)
    {
      localStringBuilder.append("; ");
      localStringBuilder.append(Build.DEVICE);
      if (Build.DISPLAY != null)
      {
        localStringBuilder.append(" Build/");
        localStringBuilder.append(Build.DISPLAY);
      }
    }
    localStringBuilder.append(") AppleWebKit/533 Version/4.0 Safari/533");
    return localStringBuilder.toString();
  }
  
  private static Bitmap e(View paramView)
  {
    try
    {
      int i = paramView.getWidth();
      int j = paramView.getHeight();
      if ((i != 0) && (j != 0))
      {
        Bitmap localBitmap = Bitmap.createBitmap(paramView.getWidth(), paramView.getHeight(), Bitmap.Config.RGB_565);
        Canvas localCanvas = new android/graphics/Canvas;
        localCanvas.<init>(localBitmap);
        paramView.layout(0, 0, i, j);
        paramView.draw(localCanvas);
        return localBitmap;
      }
      Tl.d("Width or height of view is zero");
      return null;
    }
    catch (RuntimeException paramView)
    {
      Tl.b("Fail to capture the webview", paramView);
    }
    return null;
  }
  
  public static ca e(Context paramContext)
  {
    return new ca(paramContext);
  }
  
  public static boolean e(String paramString)
  {
    if (!Ll.a()) {
      return false;
    }
    Object localObject = ra.Sd;
    if (!((Boolean)Kea.e().a((ga)localObject)).booleanValue()) {
      return false;
    }
    localObject = ra.Ud;
    localObject = (String)Kea.e().a((ga)localObject);
    if (!((String)localObject).isEmpty())
    {
      localObject = ((String)localObject).split(";");
      i = localObject.length;
      for (j = 0; j < i; j++) {
        if (localObject[j].equals(paramString)) {
          return false;
        }
      }
    }
    localObject = ra.Td;
    localObject = (String)Kea.e().a((ga)localObject);
    if (((String)localObject).isEmpty()) {
      return true;
    }
    localObject = ((String)localObject).split(";");
    int i = localObject.length;
    for (int j = 0; j < i; j++) {
      if (localObject[j].equals(paramString)) {
        return true;
      }
    }
    return false;
  }
  
  private static int[] e()
  {
    return new int[] { 0, 0 };
  }
  
  private static Bitmap f(View paramView)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject3 = localObject1;
    try
    {
      boolean bool = paramView.isDrawingCacheEnabled();
      localObject3 = localObject1;
      paramView.setDrawingCacheEnabled(true);
      localObject3 = localObject1;
      Bitmap localBitmap = paramView.getDrawingCache();
      if (localBitmap != null)
      {
        localObject3 = localObject1;
        localObject2 = Bitmap.createBitmap(localBitmap);
      }
      localObject3 = localObject2;
      paramView.setDrawingCacheEnabled(bool);
    }
    catch (RuntimeException paramView)
    {
      Tl.b("Fail to capture the web view", paramView);
      localObject2 = localObject3;
    }
    return (Bitmap)localObject2;
  }
  
  public static String f(Context paramContext)
  {
    try
    {
      paramContext = (ActivityManager)paramContext.getSystemService("activity");
      if (paramContext == null) {
        return null;
      }
      paramContext = paramContext.getRunningTasks(1);
      if ((paramContext != null) && (!paramContext.isEmpty()))
      {
        paramContext = (ActivityManager.RunningTaskInfo)paramContext.get(0);
        if ((paramContext != null) && (paramContext.topActivity != null))
        {
          paramContext = paramContext.topActivity.getClassName();
          return paramContext;
        }
      }
    }
    catch (Exception paramContext)
    {
      for (;;) {}
    }
    return null;
  }
  
  public static boolean g(Context paramContext)
  {
    try
    {
      Object localObject = (ActivityManager)paramContext.getSystemService("activity");
      KeyguardManager localKeyguardManager = (KeyguardManager)paramContext.getSystemService("keyguard");
      if ((localObject != null) && (localKeyguardManager != null))
      {
        localObject = ((ActivityManager)localObject).getRunningAppProcesses();
        if (localObject == null) {
          return false;
        }
        Iterator localIterator = ((List)localObject).iterator();
        while (localIterator.hasNext())
        {
          localObject = (ActivityManager.RunningAppProcessInfo)localIterator.next();
          if (Process.myPid() == ((ActivityManager.RunningAppProcessInfo)localObject).pid) {
            if ((((ActivityManager.RunningAppProcessInfo)localObject).importance == 100) && (!localKeyguardManager.inKeyguardRestrictedInputMode()))
            {
              paramContext = (PowerManager)paramContext.getSystemService("power");
              boolean bool;
              if (paramContext == null) {
                bool = false;
              } else {
                bool = paramContext.isScreenOn();
              }
              if (bool) {
                return false;
              }
            }
          }
        }
        return true;
      }
    }
    catch (Throwable paramContext)
    {
      for (;;) {}
    }
    return false;
  }
  
  public static int h(Context paramContext)
  {
    paramContext = paramContext.getApplicationInfo();
    if (paramContext == null) {
      return 0;
    }
    return paramContext.targetSdkVersion;
  }
  
  @TargetApi(16)
  public static boolean i(Context paramContext)
  {
    if ((paramContext != null) && (m.c()))
    {
      paramContext = n(paramContext);
      if ((paramContext != null) && (paramContext.isKeyguardLocked())) {
        return true;
      }
    }
    return false;
  }
  
  public static boolean j(Context paramContext)
  {
    try
    {
      paramContext.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi2");
      return false;
    }
    catch (Throwable paramContext)
    {
      Tl.b("Error loading class.", paramContext);
      com.google.android.gms.ads.internal.k.g().a(paramContext, "AdUtil.isLiteSdk");
      return false;
    }
    catch (ClassNotFoundException paramContext) {}
    return true;
  }
  
  public static String k(Context paramContext)
  {
    ga localga = ra.Oe;
    if (!((Boolean)Kea.e().a(localga)).booleanValue()) {
      return "";
    }
    return paramContext.getSharedPreferences("mobileads_consent", 0).getString("consent_string", "");
  }
  
  public static Bundle l(Context paramContext)
  {
    Object localObject = ra.Pe;
    if (!((Boolean)Kea.e().a((ga)localObject)).booleanValue()) {
      return null;
    }
    localObject = PreferenceManager.getDefaultSharedPreferences(paramContext);
    paramContext = new Bundle();
    boolean bool = ((SharedPreferences)localObject).contains("IABConsent_CMPPresent");
    int i = 0;
    if (bool) {
      paramContext.putBoolean("IABConsent_CMPPresent", ((SharedPreferences)localObject).getBoolean("IABConsent_CMPPresent", false));
    }
    while (i < 4)
    {
      String str = new String[] { "IABConsent_SubjectToGDPR", "IABConsent_ConsentString", "IABConsent_ParsedPurposeConsents", "IABConsent_ParsedVendorConsents" }[i];
      if (((SharedPreferences)localObject).contains(str)) {
        paramContext.putString(str, ((SharedPreferences)localObject).getString(str, null));
      }
      i++;
    }
    return paramContext;
  }
  
  public static boolean m(Context paramContext)
  {
    if (!(paramContext instanceof Activity)) {
      return false;
    }
    Window localWindow = ((Activity)paramContext).getWindow();
    if ((localWindow != null) && (localWindow.getDecorView() != null))
    {
      Rect localRect = new Rect();
      paramContext = new Rect();
      localWindow.getDecorView().getGlobalVisibleRect(localRect, null);
      localWindow.getDecorView().getWindowVisibleDisplayFrame(paramContext);
      if ((localRect.bottom != 0) && (paramContext.bottom != 0) && (localRect.top == paramContext.top)) {
        return true;
      }
    }
    return false;
  }
  
  private static KeyguardManager n(Context paramContext)
  {
    paramContext = paramContext.getSystemService("keyguard");
    if ((paramContext != null) && ((paramContext instanceof KeyguardManager))) {
      paramContext = (KeyguardManager)paramContext;
    } else {
      paramContext = null;
    }
    return paramContext;
  }
  
  public final JSONObject a(Bundle paramBundle)
    throws JSONException
  {
    JSONObject localJSONObject = new JSONObject();
    Iterator localIterator = paramBundle.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      a(localJSONObject, str, paramBundle.get(str));
    }
    return localJSONObject;
  }
  
  public final JSONObject a(Bundle paramBundle, JSONObject paramJSONObject)
  {
    if (paramBundle != null) {
      try
      {
        paramBundle = a(paramBundle);
        return paramBundle;
      }
      catch (JSONException paramBundle)
      {
        Tl.b("Error converting Bundle to JSON", paramBundle);
      }
    }
    return null;
  }
  
  public final JSONObject a(Map<String, ?> paramMap)
    throws JSONException
  {
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>();
      Iterator localIterator = paramMap.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        a(localJSONObject, str, paramMap.get(str));
      }
      return localJSONObject;
    }
    catch (ClassCastException paramMap)
    {
      paramMap = String.valueOf(paramMap.getMessage());
      if (paramMap.length() != 0) {
        paramMap = "Could not convert map to JSON: ".concat(paramMap);
      } else {
        paramMap = new String("Could not convert map to JSON: ");
      }
      throw new JSONException(paramMap);
    }
  }
  
  public final void a(Context paramContext, String paramString, WebSettings paramWebSettings)
  {
    paramWebSettings.setUserAgentString(b(paramContext, paramString));
  }
  
  public final void a(Context paramContext, String paramString1, String paramString2, Bundle paramBundle, boolean paramBoolean)
  {
    com.google.android.gms.ads.internal.k.c();
    paramBundle.putString("device", b());
    paramBundle.putString("eids", TextUtils.join(",", ra.a()));
    Kea.a();
    Hl.a(paramContext, paramString1, paramString2, paramBundle, true, new yk(this, paramContext, paramString1));
  }
  
  public final void a(Context paramContext, String paramString, boolean paramBoolean, HttpURLConnection paramHttpURLConnection)
  {
    paramHttpURLConnection.setConnectTimeout(60000);
    paramHttpURLConnection.setInstanceFollowRedirects(false);
    paramHttpURLConnection.setReadTimeout(60000);
    paramHttpURLConnection.setRequestProperty("User-Agent", b(paramContext, paramString));
    paramHttpURLConnection.setUseCaches(false);
  }
  
  public final boolean a(Context paramContext)
  {
    if (this.g) {
      return false;
    }
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("android.intent.action.USER_PRESENT");
    localIntentFilter.addAction("android.intent.action.SCREEN_OFF");
    paramContext.getApplicationContext().registerReceiver(new Ak(this, null), localIntentFilter);
    this.g = true;
    return true;
  }
  
  public final boolean a(View paramView, Context paramContext)
  {
    Object localObject = paramContext.getApplicationContext();
    if (localObject != null) {
      localObject = (PowerManager)((Context)localObject).getSystemService("power");
    } else {
      localObject = null;
    }
    return a(paramView, (PowerManager)localObject, n(paramContext));
  }
  
  public final boolean a(View paramView, PowerManager paramPowerManager, KeyguardManager paramKeyguardManager)
  {
    if (!com.google.android.gms.ads.internal.k.c().d)
    {
      boolean bool;
      if (paramKeyguardManager == null) {
        bool = false;
      } else {
        bool = paramKeyguardManager.inKeyguardRestrictedInputMode();
      }
      if ((bool) && (!c(paramView)))
      {
        i = 0;
        break label49;
      }
    }
    int i = 1;
    label49:
    if ((paramView.getVisibility() == 0) && (paramView.isShown()))
    {
      int j;
      if ((paramPowerManager != null) && (!paramPowerManager.isScreenOn())) {
        j = 0;
      } else {
        j = 1;
      }
      if ((j != 0) && (i != 0))
      {
        paramPowerManager = ra.Nb;
        if ((!((Boolean)Kea.e().a(paramPowerManager)).booleanValue()) || (paramView.getLocalVisibleRect(new Rect())) || (paramView.getGlobalVisibleRect(new Rect()))) {
          return true;
        }
      }
    }
    return false;
  }
  
  public final String b(Context paramContext, String paramString)
  {
    synchronized (this.e)
    {
      if (this.f != null)
      {
        paramContext = this.f;
        return paramContext;
      }
      if (paramString == null)
      {
        paramContext = d();
        return paramContext;
      }
    }
    try
    {
      this.f = com.google.android.gms.ads.internal.k.e().a(paramContext);
      if (TextUtils.isEmpty(this.f))
      {
        Kea.a();
        if (!Hl.b())
        {
          this.f = null;
          Object localObject2 = a;
          localObject4 = new com/google/android/gms/internal/ads/xk;
          ((xk)localObject4).<init>(this, paramContext);
          ((Handler)localObject2).post((Runnable)localObject4);
          for (;;)
          {
            localObject2 = this.f;
            if (localObject2 != null) {
              break;
            }
            try
            {
              this.e.wait();
            }
            catch (InterruptedException localInterruptedException)
            {
              this.f = d();
              localObject3 = String.valueOf(this.f);
              if (((String)localObject3).length() != 0) {
                localObject3 = "Interrupted, use default user agent: ".concat((String)localObject3);
              } else {
                localObject3 = new String("Interrupted, use default user agent: ");
              }
              Tl.d((String)localObject3);
            }
          }
        }
        this.f = c(paramContext);
      }
      Object localObject4 = String.valueOf(this.f);
      int i = String.valueOf(localObject4).length();
      int j = String.valueOf(paramString).length();
      Object localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>(i + 10 + j);
      ((StringBuilder)localObject3).append((String)localObject4);
      ((StringBuilder)localObject3).append(" (Mobile; ");
      ((StringBuilder)localObject3).append(paramString);
      this.f = ((StringBuilder)localObject3).toString();
      try
      {
        if (Gq.a(paramContext).a()) {
          this.f = String.valueOf(this.f).concat(";aia");
        }
      }
      catch (Exception paramContext)
      {
        com.google.android.gms.ads.internal.k.g().a(paramContext, "AdUtil.getUserAgent");
      }
      this.f = String.valueOf(this.f).concat(")");
      paramContext = this.f;
      return paramContext;
      paramContext = finally;
      throw paramContext;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  public final boolean b(Context paramContext)
  {
    if (this.h) {
      return false;
    }
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
    paramContext.getApplicationContext().registerReceiver(new zk(this, null), localIntentFilter);
    this.h = true;
    return true;
  }
  
  public final int[] b(Activity paramActivity)
  {
    int[] arrayOfInt = a(paramActivity);
    return new int[] { Kea.a().b(paramActivity, arrayOfInt[0]), Kea.a().b(paramActivity, arrayOfInt[1]) };
  }
  
  public final boolean c(String paramString)
  {
    AtomicReference localAtomicReference = this.b;
    ga localga = ra.Aa;
    return a(paramString, localAtomicReference, (String)Kea.e().a(localga));
  }
  
  public final int[] c(Activity paramActivity)
  {
    Object localObject = paramActivity.getWindow();
    if (localObject != null)
    {
      View localView = ((Window)localObject).findViewById(16908290);
      if (localView != null)
      {
        localObject = new int[2];
        localObject[0] = localView.getTop();
        localObject[1] = localView.getBottom();
        break label46;
      }
    }
    localObject = e();
    label46:
    return new int[] { Kea.a().b(paramActivity, localObject[0]), Kea.a().b(paramActivity, localObject[1]) };
  }
  
  public final boolean d(String paramString)
  {
    AtomicReference localAtomicReference = this.c;
    ga localga = ra.Ba;
    return a(paramString, localAtomicReference, (String)Kea.e().a(localga));
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/vk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */