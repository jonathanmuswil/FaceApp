package com.facebook.accountkit.internal;

import Rm;
import Sm;
import Vm.a;
import Wm;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.net.TrafficStats;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

final class f
{
  public static final String a = "f";
  private static final String b;
  private static final Pattern c = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
  private Rm d;
  private Handler e;
  private final String f;
  private L g;
  private final boolean h;
  private Bundle i;
  private JSONObject j;
  private Object k;
  private String l;
  
  static
  {
    SecureRandom localSecureRandom = new SecureRandom();
    byte[] arrayOfByte = new byte[32];
    localSecureRandom.nextBytes(arrayOfByte);
    b = Base64.encodeToString(arrayOfByte, 1);
  }
  
  public f(Rm paramRm, String paramString, Bundle paramBundle, boolean paramBoolean, L paramL)
  {
    this(paramRm, paramString, paramBundle, paramBoolean, paramL, null);
  }
  
  public f(Rm paramRm, String paramString1, Bundle paramBundle, boolean paramBoolean, L paramL, String paramString2)
  {
    this.d = paramRm;
    this.f = paramString1;
    this.h = paramBoolean;
    a(paramL);
    if (paramBundle != null) {
      this.i = new Bundle(paramBundle);
    } else {
      this.i = new Bundle();
    }
    paramRm = paramString2;
    if (paramString2 == null) {
      paramRm = "v1.3";
    }
    this.l = paramRm;
  }
  
  static j a(f paramf, a parama)
  {
    paramf = new j(paramf, parama);
    paramf.executeOnExecutor(va.e(), new Void[0]);
    return paramf;
  }
  
  static l a(HttpURLConnection paramHttpURLConnection, f paramf)
  {
    paramf = l.a(paramHttpURLConnection, paramf);
    va.a(paramHttpURLConnection);
    return paramf;
  }
  
  /* Error */
  static HttpURLConnection a(f paramf)
  {
    // Byte code:
    //   0: new 135	java/net/URL
    //   3: dup
    //   4: aload_0
    //   5: invokespecial 137	com/facebook/accountkit/internal/f:k	()Ljava/lang/String;
    //   8: invokespecial 140	java/net/URL:<init>	(Ljava/lang/String;)V
    //   11: astore_1
    //   12: aload_1
    //   13: invokestatic 143	com/facebook/accountkit/internal/f:a	(Ljava/net/URL;)Ljava/net/HttpURLConnection;
    //   16: astore_1
    //   17: aload_0
    //   18: aload_1
    //   19: invokestatic 146	com/facebook/accountkit/internal/f:a	(Lcom/facebook/accountkit/internal/f;Ljava/net/HttpURLConnection;)V
    //   22: aload_1
    //   23: areturn
    //   24: astore_0
    //   25: goto +4 -> 29
    //   28: astore_0
    //   29: new 148	Wm
    //   32: dup
    //   33: getstatic 153	Vm$a:d	LVm$a;
    //   36: getstatic 158	com/facebook/accountkit/internal/O:g	Lcom/facebook/accountkit/internal/O;
    //   39: aload_0
    //   40: invokespecial 161	Wm:<init>	(LVm$a;Lcom/facebook/accountkit/internal/O;Ljava/lang/Throwable;)V
    //   43: athrow
    //   44: astore_0
    //   45: new 148	Wm
    //   48: dup
    //   49: getstatic 163	Vm$a:a	LVm$a;
    //   52: getstatic 165	com/facebook/accountkit/internal/O:a	Lcom/facebook/accountkit/internal/O;
    //   55: invokespecial 168	Wm:<init>	(LVm$a;Lcom/facebook/accountkit/internal/O;)V
    //   58: athrow
    //   59: astore_0
    //   60: new 148	Wm
    //   63: dup
    //   64: getstatic 153	Vm$a:d	LVm$a;
    //   67: getstatic 170	com/facebook/accountkit/internal/O:f	Lcom/facebook/accountkit/internal/O;
    //   70: aload_0
    //   71: invokespecial 161	Wm:<init>	(LVm$a;Lcom/facebook/accountkit/internal/O;Ljava/lang/Throwable;)V
    //   74: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	75	0	paramf	f
    //   11	12	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   12	22	24	org/json/JSONException
    //   12	22	28	java/io/IOException
    //   12	22	44	java/net/UnknownHostException
    //   0	12	59	java/net/MalformedURLException
  }
  
  private static HttpURLConnection a(URL paramURL)
    throws IOException
  {
    paramURL = (HttpURLConnection)FirebasePerfUrlConnection.instrument(paramURL.openConnection());
    paramURL.setRequestProperty("User-Agent", c.a);
    paramURL.setChunkedStreamingMode(0);
    return paramURL;
  }
  
  private void a(Uri.Builder paramBuilder)
  {
    Object localObject1 = new ArrayList(this.i.keySet());
    Collections.sort((List)localObject1);
    Iterator localIterator = ((List)localObject1).iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      Object localObject2 = this.i.get(str);
      localObject1 = localObject2;
      if (localObject2 == null) {
        localObject1 = "";
      }
      paramBuilder.appendQueryParameter(str, f(localObject1));
    }
  }
  
  private static void a(Bundle paramBundle, e parame)
    throws IOException
  {
    Iterator localIterator = paramBundle.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      parame.a(str, paramBundle.get(str));
    }
  }
  
  private static void a(f paramf, OutputStream paramOutputStream, boolean paramBoolean)
    throws IOException
  {
    paramOutputStream = new e(paramOutputStream, paramBoolean ^ true);
    a(paramf.i, paramOutputStream);
    paramf = paramf.j;
    if (paramf != null) {
      a(paramf, paramOutputStream);
    }
  }
  
  /* Error */
  private static void a(f paramf, HttpURLConnection paramHttpURLConnection)
    throws IOException, org.json.JSONException
  {
    // Byte code:
    //   0: new 264	com/facebook/accountkit/internal/v
    //   3: dup
    //   4: getstatic 269	bn:a	Lbn;
    //   7: ldc_w 271
    //   10: invokespecial 274	com/facebook/accountkit/internal/v:<init>	(Lbn;Ljava/lang/String;)V
    //   13: astore_2
    //   14: aload_0
    //   15: getfield 276	com/facebook/accountkit/internal/f:g	Lcom/facebook/accountkit/internal/L;
    //   18: astore_3
    //   19: aload_1
    //   20: aload_3
    //   21: invokevirtual 281	java/lang/Enum:name	()Ljava/lang/String;
    //   24: invokevirtual 284	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   27: aload_0
    //   28: getfield 91	com/facebook/accountkit/internal/f:i	Landroid/os/Bundle;
    //   31: invokestatic 287	com/facebook/accountkit/internal/f:b	(Landroid/os/Bundle;)Z
    //   34: istore 4
    //   36: aload_1
    //   37: iload 4
    //   39: invokestatic 290	com/facebook/accountkit/internal/f:a	(Ljava/net/HttpURLConnection;Z)V
    //   42: aload_1
    //   43: invokevirtual 294	java/net/HttpURLConnection:getURL	()Ljava/net/URL;
    //   46: astore 5
    //   48: aload_2
    //   49: ldc_w 296
    //   52: invokevirtual 298	com/facebook/accountkit/internal/v:a	(Ljava/lang/String;)V
    //   55: aload_2
    //   56: ldc_w 300
    //   59: aload_0
    //   60: invokevirtual 303	com/facebook/accountkit/internal/f:c	()LRm;
    //   63: invokevirtual 304	com/facebook/accountkit/internal/v:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   66: aload_2
    //   67: ldc_w 306
    //   70: aload 5
    //   72: invokevirtual 304	com/facebook/accountkit/internal/v:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   75: aload_2
    //   76: ldc_w 308
    //   79: aload_1
    //   80: invokevirtual 311	java/net/HttpURLConnection:getRequestMethod	()Ljava/lang/String;
    //   83: invokevirtual 304	com/facebook/accountkit/internal/v:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   86: aload_2
    //   87: ldc -72
    //   89: aload_1
    //   90: ldc -72
    //   92: invokevirtual 315	java/net/HttpURLConnection:getRequestProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   95: invokevirtual 304	com/facebook/accountkit/internal/v:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   98: aload_2
    //   99: ldc_w 317
    //   102: aload_1
    //   103: ldc_w 317
    //   106: invokevirtual 315	java/net/HttpURLConnection:getRequestProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   109: invokevirtual 304	com/facebook/accountkit/internal/v:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   112: aload_2
    //   113: invokevirtual 319	com/facebook/accountkit/internal/v:a	()V
    //   116: aload_1
    //   117: sipush 10000
    //   120: invokevirtual 322	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   123: aload_1
    //   124: sipush 10000
    //   127: invokevirtual 325	java/net/HttpURLConnection:setReadTimeout	(I)V
    //   130: aload_3
    //   131: getstatic 329	com/facebook/accountkit/internal/L:b	Lcom/facebook/accountkit/internal/L;
    //   134: if_acmpeq +4 -> 138
    //   137: return
    //   138: aload_1
    //   139: iconst_1
    //   140: invokevirtual 333	java/net/HttpURLConnection:setDoOutput	(Z)V
    //   143: aconst_null
    //   144: astore 5
    //   146: aload_1
    //   147: invokevirtual 337	java/net/HttpURLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   150: astore_3
    //   151: aload_3
    //   152: astore 5
    //   154: new 339	java/io/BufferedOutputStream
    //   157: astore_1
    //   158: aload_3
    //   159: astore 5
    //   161: aload_1
    //   162: aload_3
    //   163: invokespecial 342	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   166: iload 4
    //   168: ifne +27 -> 195
    //   171: new 344	java/util/zip/GZIPOutputStream
    //   174: astore 5
    //   176: aload 5
    //   178: aload_1
    //   179: invokespecial 345	java/util/zip/GZIPOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   182: aload 5
    //   184: astore_1
    //   185: goto +10 -> 195
    //   188: astore_0
    //   189: aload_1
    //   190: astore 5
    //   192: goto +19 -> 211
    //   195: aload_1
    //   196: astore 5
    //   198: aload_0
    //   199: aload_1
    //   200: iload 4
    //   202: invokestatic 347	com/facebook/accountkit/internal/f:a	(Lcom/facebook/accountkit/internal/f;Ljava/io/OutputStream;Z)V
    //   205: aload_1
    //   206: invokevirtual 352	java/io/FilterOutputStream:close	()V
    //   209: return
    //   210: astore_0
    //   211: aload 5
    //   213: ifnull +8 -> 221
    //   216: aload 5
    //   218: invokevirtual 355	java/io/OutputStream:close	()V
    //   221: aload_0
    //   222: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	223	0	paramf	f
    //   0	223	1	paramHttpURLConnection	HttpURLConnection
    //   13	100	2	localv	v
    //   18	145	3	localObject1	Object
    //   34	167	4	bool	boolean
    //   46	171	5	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   171	182	188	finally
    //   146	151	210	finally
    //   154	158	210	finally
    //   161	166	210	finally
    //   198	205	210	finally
  }
  
  private static void a(String paramString, Object paramObject, b paramb)
    throws IOException
  {
    Class localClass = paramObject.getClass();
    if ((!String.class.isAssignableFrom(localClass)) && (!Number.class.isAssignableFrom(localClass)) && (!Boolean.class.isAssignableFrom(localClass)))
    {
      if (Date.class.isAssignableFrom(localClass))
      {
        paramObject = (Date)paramObject;
        paramb.a(paramString, new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date)paramObject));
      }
    }
    else {
      paramb.a(paramString, paramObject.toString());
    }
  }
  
  private static void a(HttpURLConnection paramHttpURLConnection, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      paramHttpURLConnection.setRequestProperty("Content-Type", j());
    }
    else
    {
      paramHttpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
      paramHttpURLConnection.setRequestProperty("Content-Encoding", "gzip");
    }
  }
  
  private static void a(JSONObject paramJSONObject, b paramb)
    throws IOException
  {
    Iterator localIterator = paramJSONObject.keys();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      a(str, paramJSONObject.opt(str), paramb);
    }
  }
  
  private static boolean b(Bundle paramBundle)
  {
    Iterator localIterator = paramBundle.keySet().iterator();
    while (localIterator.hasNext()) {
      if (d(paramBundle.get((String)localIterator.next()))) {
        return true;
      }
    }
    return false;
  }
  
  private static boolean d(Object paramObject)
  {
    boolean bool;
    if ((!(paramObject instanceof Bitmap)) && (!(paramObject instanceof byte[])) && (!(paramObject instanceof Uri)) && (!(paramObject instanceof ParcelFileDescriptor)) && (!(paramObject instanceof d))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  private static boolean e(Object paramObject)
  {
    boolean bool;
    if ((!(paramObject instanceof String)) && (!(paramObject instanceof Boolean)) && (!(paramObject instanceof Number)) && (!(paramObject instanceof Date))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  private static String f(Object paramObject)
  {
    if ((paramObject instanceof String)) {
      return (String)paramObject;
    }
    if ((!(paramObject instanceof Boolean)) && (!(paramObject instanceof Number)))
    {
      if ((paramObject instanceof Date)) {
        return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format(paramObject);
      }
      throw new IllegalArgumentException("Unsupported parameter type.");
    }
    return paramObject.toString();
  }
  
  private void i()
  {
    va.a(this.i, "locale", Q.a());
    va.a(this.i, "sdk", "android");
    this.i.putBoolean("fb_app_events_enabled", Sm.b());
    Object localObject;
    if (this.d != null)
    {
      if (!this.i.containsKey("access_token"))
      {
        localObject = this.d.o();
        this.i.putString("access_token", (String)localObject);
      }
    }
    else if (!this.i.containsKey("access_token"))
    {
      String str1 = Sm.c();
      String str2 = Sm.e();
      if ((!va.e(str1)) && (!va.e(str2)))
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("AA|");
        ((StringBuilder)localObject).append(str1);
        ((StringBuilder)localObject).append("|");
        ((StringBuilder)localObject).append(str2);
        localObject = ((StringBuilder)localObject).toString();
        this.i.putString("access_token", (String)localObject);
      }
      else
      {
        Log.d(a, "Warning: Request without access token missing application ID or client token.");
      }
    }
  }
  
  private static String j()
  {
    return String.format("multipart/form-data; boundary=%s", new Object[] { b });
  }
  
  private String k()
  {
    Uri.Builder localBuilder = new Uri.Builder().scheme("https").authority(c.i());
    if (!c.matcher(this.f).matches()) {
      localBuilder.appendPath(this.l);
    }
    localBuilder.appendPath(this.f);
    i();
    if (this.g != L.b) {
      a(localBuilder);
    }
    return localBuilder.toString();
  }
  
  public void a(Bundle paramBundle)
  {
    this.i = paramBundle;
  }
  
  void a(Handler paramHandler)
  {
    this.e = paramHandler;
  }
  
  void a(L paramL)
  {
    if (paramL == null) {
      paramL = L.a;
    }
    this.g = paramL;
  }
  
  void a(JSONObject paramJSONObject)
  {
    this.j = paramJSONObject;
  }
  
  l b()
  {
    try
    {
      TrafficStats.setThreadStatsTag(61453);
      Object localObject = a(this);
      localObject = a((HttpURLConnection)localObject, this);
      if (localObject != null) {
        return (l)localObject;
      }
      throw new Wm(Vm.a.d, O.k);
    }
    catch (Exception localException)
    {
      return new l(this, null, new m(new Wm(Vm.a.d, localException)));
    }
    catch (Wm localWm)
    {
      return new l(this, null, new m(localWm));
    }
  }
  
  public Rm c()
  {
    return this.d;
  }
  
  public void c(Object paramObject)
  {
    this.k = paramObject;
  }
  
  Handler d()
  {
    return this.e;
  }
  
  public Bundle e()
  {
    return this.i;
  }
  
  JSONObject f()
  {
    return this.j;
  }
  
  public Object g()
  {
    return this.k;
  }
  
  boolean h()
  {
    return this.h;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("{Request:  accessToken: ");
    Rm localRm = this.d;
    Object localObject = localRm;
    if (localRm == null) {
      localObject = "null";
    }
    localStringBuilder.append(localObject);
    localStringBuilder.append(", graphPath: ");
    localStringBuilder.append(this.f);
    localStringBuilder.append(", requestObject: ");
    localStringBuilder.append(this.j);
    localStringBuilder.append(", httpMethod: ");
    localStringBuilder.append(this.g);
    localStringBuilder.append(", parameters: ");
    localStringBuilder.append(this.i);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public static abstract interface a
  {
    public abstract void a(l paraml);
  }
  
  private static abstract interface b
  {
    public abstract void a(String paramString1, String paramString2)
      throws IOException;
  }
  
  private static class c
  {
    static final String a = ;
    
    private static String a()
    {
      Object localObject1 = System.getProperty("http.agent");
      Object localObject2 = localObject1;
      if (localObject1 == null) {
        localObject2 = "";
      }
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append((String)localObject2);
      ((StringBuilder)localObject1).append(" ");
      ((StringBuilder)localObject1).append("AccountKitAndroidSDK");
      ((StringBuilder)localObject1).append("/");
      ((StringBuilder)localObject1).append("4.39.0");
      return ((StringBuilder)localObject1).toString();
    }
  }
  
  private static class d<RESOURCE extends Parcelable>
    implements Parcelable
  {
    public static final Parcelable.Creator<d> CREATOR = new g();
    private final String a;
    private final RESOURCE b;
    
    private d(Parcel paramParcel)
    {
      this.a = paramParcel.readString();
      this.b = paramParcel.readParcelable(c.f().getClassLoader());
    }
    
    public int describeContents()
    {
      return 1;
    }
    
    String l()
    {
      return this.a;
    }
    
    public RESOURCE m()
    {
      return this.b;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      paramParcel.writeString(this.a);
      paramParcel.writeParcelable(this.b, paramInt);
    }
  }
  
  private static class e
    implements f.b
  {
    private boolean a = true;
    private final OutputStream b;
    private boolean c = false;
    
    e(OutputStream paramOutputStream, boolean paramBoolean)
    {
      this.b = paramOutputStream;
      this.c = paramBoolean;
    }
    
    private RuntimeException b()
    {
      return new IllegalArgumentException("value is not a supported type.");
    }
    
    void a()
      throws IOException
    {
      if (!this.c) {
        b("--%s", new Object[] { f.a() });
      } else {
        this.b.write("&".getBytes());
      }
    }
    
    void a(String paramString, Bitmap paramBitmap)
      throws IOException
    {
      a(paramString, paramString, "image/png");
      paramBitmap.compress(Bitmap.CompressFormat.PNG, 100, this.b);
      b("", new Object[0]);
      a();
    }
    
    void a(String paramString1, Uri paramUri, String paramString2)
      throws IOException
    {
      String str = paramString2;
      if (paramString2 == null) {
        str = "content/unknown";
      }
      a(paramString1, paramString1, str);
      va.a(c.f().getContentResolver().openInputStream(paramUri), this.b);
      b("", new Object[0]);
      a();
    }
    
    void a(String paramString1, ParcelFileDescriptor paramParcelFileDescriptor, String paramString2)
      throws IOException
    {
      String str = paramString2;
      if (paramString2 == null) {
        str = "content/unknown";
      }
      a(paramString1, paramString1, str);
      va.a(new ParcelFileDescriptor.AutoCloseInputStream(paramParcelFileDescriptor), this.b);
      b("", new Object[0]);
      a();
    }
    
    void a(String paramString, Object paramObject)
      throws IOException
    {
      if (f.a(paramObject))
      {
        a(paramString, f.b(paramObject));
      }
      else if ((paramObject instanceof Bitmap))
      {
        a(paramString, (Bitmap)paramObject);
      }
      else if ((paramObject instanceof byte[]))
      {
        a(paramString, (byte[])paramObject);
      }
      else if ((paramObject instanceof Uri))
      {
        a(paramString, (Uri)paramObject, null);
      }
      else if ((paramObject instanceof ParcelFileDescriptor))
      {
        a(paramString, (ParcelFileDescriptor)paramObject, null);
      }
      else
      {
        if (!(paramObject instanceof f.d)) {
          break label162;
        }
        Object localObject = (f.d)paramObject;
        paramObject = ((f.d)localObject).m();
        localObject = ((f.d)localObject).l();
        if ((paramObject instanceof ParcelFileDescriptor))
        {
          a(paramString, (ParcelFileDescriptor)paramObject, (String)localObject);
        }
        else
        {
          if (!(paramObject instanceof Uri)) {
            break label157;
          }
          a(paramString, (Uri)paramObject, (String)localObject);
        }
      }
      return;
      label157:
      throw b();
      label162:
      throw b();
    }
    
    public void a(String paramString1, String paramString2)
      throws IOException
    {
      a(paramString1, null, null);
      b("%s", new Object[] { paramString2 });
      a();
    }
    
    void a(String paramString1, String paramString2, String paramString3)
      throws IOException
    {
      if (!this.c)
      {
        a("Content-Disposition: form-data; name=\"%s\"", new Object[] { paramString1 });
        if (paramString2 != null) {
          a("; filename=\"%s\"", new Object[] { paramString2 });
        }
        b("", new Object[0]);
        if (paramString3 != null) {
          b("%s: %s", new Object[] { "Content-Type", paramString3 });
        }
        b("", new Object[0]);
      }
      else
      {
        this.b.write(String.format("%s=", new Object[] { paramString1 }).getBytes());
      }
    }
    
    void a(String paramString, byte[] paramArrayOfByte)
      throws IOException
    {
      a(paramString, paramString, "content/unknown");
      this.b.write(paramArrayOfByte);
      b("", new Object[0]);
      a();
    }
    
    void a(String paramString, Object... paramVarArgs)
      throws IOException
    {
      if (!this.c)
      {
        if (this.a)
        {
          this.b.write("--".getBytes());
          this.b.write(f.a().getBytes());
          this.b.write("\r\n".getBytes());
          this.a = false;
        }
        this.b.write(String.format(paramString, paramVarArgs).getBytes());
      }
      else
      {
        this.b.write(URLEncoder.encode(String.format(Locale.US, paramString, paramVarArgs), "UTF-8").getBytes());
      }
    }
    
    void b(String paramString, Object... paramVarArgs)
      throws IOException
    {
      a(paramString, paramVarArgs);
      if (!this.c) {
        a("\r\n", new Object[0]);
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/accountkit/internal/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */