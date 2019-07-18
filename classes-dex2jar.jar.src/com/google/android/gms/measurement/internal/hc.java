package com.google.android.gms.measurement.internal;

import Fq;
import Gq;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.util.e;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import qK;

public final class hc
  extends xa
{
  private static final String[] c = { "firebase_", "google_", "ga_" };
  private SecureRandom d;
  private final AtomicLong e = new AtomicLong(0L);
  private int f;
  private Integer g = null;
  
  hc(aa paramaa)
  {
    super(paramaa);
  }
  
  public static long a(long paramLong1, long paramLong2)
  {
    return (paramLong1 + paramLong2 * 60000L) / 86400000L;
  }
  
  static long a(byte[] paramArrayOfByte)
  {
    com.google.android.gms.common.internal.t.a(paramArrayOfByte);
    int i = paramArrayOfByte.length;
    int j = 0;
    boolean bool;
    if (i > 0) {
      bool = true;
    } else {
      bool = false;
    }
    com.google.android.gms.common.internal.t.b(bool);
    long l = 0L;
    for (i = paramArrayOfByte.length - 1; (i >= 0) && (i >= paramArrayOfByte.length - 8); i--)
    {
      l += ((paramArrayOfByte[i] & 0xFF) << j);
      j += 8;
    }
    return l;
  }
  
  public static Bundle a(List<ec> paramList)
  {
    Bundle localBundle = new Bundle();
    if (paramList == null) {
      return localBundle;
    }
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      ec localec = (ec)paramList.next();
      Object localObject = localec.f;
      if (localObject != null)
      {
        localBundle.putString(localec.b, (String)localObject);
      }
      else
      {
        localObject = localec.d;
        if (localObject != null)
        {
          localBundle.putLong(localec.b, ((Long)localObject).longValue());
        }
        else
        {
          localObject = localec.h;
          if (localObject != null) {
            localBundle.putDouble(localec.b, ((Double)localObject).doubleValue());
          }
        }
      }
    }
    return localBundle;
  }
  
  private static Object a(int paramInt, Object paramObject, boolean paramBoolean)
  {
    if (paramObject == null) {
      return null;
    }
    if ((!(paramObject instanceof Long)) && (!(paramObject instanceof Double)))
    {
      if ((paramObject instanceof Integer)) {
        return Long.valueOf(((Integer)paramObject).intValue());
      }
      if ((paramObject instanceof Byte)) {
        return Long.valueOf(((Byte)paramObject).byteValue());
      }
      if ((paramObject instanceof Short)) {
        return Long.valueOf(((Short)paramObject).shortValue());
      }
      if ((paramObject instanceof Boolean))
      {
        long l;
        if (((Boolean)paramObject).booleanValue()) {
          l = 1L;
        } else {
          l = 0L;
        }
        return Long.valueOf(l);
      }
      if ((paramObject instanceof Float)) {
        return Double.valueOf(((Float)paramObject).doubleValue());
      }
      if ((!(paramObject instanceof String)) && (!(paramObject instanceof Character)) && (!(paramObject instanceof CharSequence))) {
        return null;
      }
      return a(String.valueOf(paramObject), paramInt, paramBoolean);
    }
    return paramObject;
  }
  
  public static String a(String paramString, int paramInt, boolean paramBoolean)
  {
    if (paramString == null) {
      return null;
    }
    if (paramString.codePointCount(0, paramString.length()) > paramInt)
    {
      if (paramBoolean) {
        return String.valueOf(paramString.substring(0, paramString.offsetByCodePoints(0, paramInt))).concat("...");
      }
      return null;
    }
    return paramString;
  }
  
  private static void a(Bundle paramBundle, Object paramObject)
  {
    com.google.android.gms.common.internal.t.a(paramBundle);
    if ((paramObject != null) && (((paramObject instanceof String)) || ((paramObject instanceof CharSequence)))) {
      paramBundle.putLong("_el", String.valueOf(paramObject).length());
    }
  }
  
  static boolean a(Context paramContext, boolean paramBoolean)
  {
    com.google.android.gms.common.internal.t.a(paramContext);
    if (Build.VERSION.SDK_INT >= 24) {
      return b(paramContext, "com.google.android.gms.measurement.AppMeasurementJobService");
    }
    return b(paramContext, "com.google.android.gms.measurement.AppMeasurementService");
  }
  
  static boolean a(Intent paramIntent)
  {
    paramIntent = paramIntent.getStringExtra("android.intent.extra.REFERRER_NAME");
    return ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(paramIntent)) || ("https://www.google.com".equals(paramIntent)) || ("android-app://com.google.appcrawler".equals(paramIntent));
  }
  
  private static boolean a(Bundle paramBundle, int paramInt)
  {
    if (paramBundle.getLong("_err") == 0L)
    {
      paramBundle.putLong("_err", paramInt);
      return true;
    }
    return false;
  }
  
  static boolean a(Boolean paramBoolean1, Boolean paramBoolean2)
  {
    if ((paramBoolean1 == null) && (paramBoolean2 == null)) {
      return true;
    }
    if (paramBoolean1 == null) {
      return false;
    }
    return paramBoolean1.equals(paramBoolean2);
  }
  
  static boolean a(String paramString)
  {
    com.google.android.gms.common.internal.t.b(paramString);
    return (paramString.charAt(0) != '_') || (paramString.equals("_ep"));
  }
  
  private final boolean a(String paramString1, String paramString2, int paramInt, Object paramObject, boolean paramBoolean)
  {
    if (paramObject == null) {
      return true;
    }
    if ((!(paramObject instanceof Long)) && (!(paramObject instanceof Float)) && (!(paramObject instanceof Integer)) && (!(paramObject instanceof Byte)) && (!(paramObject instanceof Short)) && (!(paramObject instanceof Boolean)) && (!(paramObject instanceof Double)))
    {
      if ((!(paramObject instanceof String)) && (!(paramObject instanceof Character)) && (!(paramObject instanceof CharSequence)))
      {
        if (((paramObject instanceof Bundle)) && (paramBoolean)) {
          return true;
        }
        if (((paramObject instanceof Parcelable[])) && (paramBoolean))
        {
          for (paramObject : (Parcelable[])paramObject) {
            if (!(paramObject instanceof Bundle))
            {
              c().v().a("All Parcelable[] elements must be of type Bundle. Value type, name", paramObject.getClass(), paramString2);
              return false;
            }
          }
          return true;
        }
        if (((paramObject instanceof ArrayList)) && (paramBoolean))
        {
          paramString1 = (ArrayList)paramObject;
          ??? = paramString1.size();
          paramInt = 0;
          while (paramInt < ???)
          {
            paramObject = paramString1.get(paramInt);
            paramInt++;
            if (!(paramObject instanceof Bundle))
            {
              c().v().a("All ArrayList elements must be of type Bundle. Value type, name", paramObject.getClass(), paramString2);
              return false;
            }
          }
          return true;
        }
        return false;
      }
      paramObject = String.valueOf(paramObject);
      if (((String)paramObject).codePointCount(0, ((String)paramObject).length()) > paramInt)
      {
        c().v().a("Value is too long; discarded. Value kind, name, value length", paramString1, paramString2, Integer.valueOf(((String)paramObject).length()));
        return false;
      }
    }
    return true;
  }
  
  static boolean a(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    boolean bool1 = TextUtils.isEmpty(paramString1);
    boolean bool2 = TextUtils.isEmpty(paramString2);
    if ((!bool1) && (!bool2)) {
      return !paramString1.equals(paramString2);
    }
    if ((bool1) && (bool2))
    {
      if ((!TextUtils.isEmpty(paramString3)) && (!TextUtils.isEmpty(paramString4))) {
        return !paramString3.equals(paramString4);
      }
      return !TextUtils.isEmpty(paramString4);
    }
    if ((!bool1) && (bool2))
    {
      if (TextUtils.isEmpty(paramString4)) {
        return false;
      }
      return (TextUtils.isEmpty(paramString3)) || (!paramString3.equals(paramString4));
    }
    return (TextUtils.isEmpty(paramString3)) || (!paramString3.equals(paramString4));
  }
  
  static byte[] a(Parcelable paramParcelable)
  {
    if (paramParcelable == null) {
      return null;
    }
    Parcel localParcel = Parcel.obtain();
    try
    {
      paramParcelable.writeToParcel(localParcel, 0);
      paramParcelable = localParcel.marshall();
      return paramParcelable;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  static Bundle[] a(Object paramObject)
  {
    if ((paramObject instanceof Bundle)) {
      return new Bundle[] { (Bundle)paramObject };
    }
    if ((paramObject instanceof Parcelable[]))
    {
      paramObject = (Parcelable[])paramObject;
      return (Bundle[])Arrays.copyOf((Object[])paramObject, paramObject.length, Bundle[].class);
    }
    if ((paramObject instanceof ArrayList))
    {
      paramObject = (ArrayList)paramObject;
      return (Bundle[])((ArrayList)paramObject).toArray(new Bundle[((ArrayList)paramObject).size()]);
    }
    return null;
  }
  
  public static Bundle b(Bundle paramBundle)
  {
    if (paramBundle == null) {
      return new Bundle();
    }
    Bundle localBundle = new Bundle(paramBundle);
    paramBundle = localBundle.keySet().iterator();
    while (paramBundle.hasNext())
    {
      Object localObject1 = (String)paramBundle.next();
      Object localObject2 = localBundle.get((String)localObject1);
      if ((localObject2 instanceof Bundle))
      {
        localBundle.putBundle((String)localObject1, new Bundle((Bundle)localObject2));
      }
      else
      {
        boolean bool = localObject2 instanceof Parcelable[];
        int i = 0;
        int j = 0;
        if (bool)
        {
          localObject2 = (Parcelable[])localObject2;
          while (j < localObject2.length)
          {
            if ((localObject2[j] instanceof Bundle)) {
              localObject2[j] = new Bundle((Bundle)localObject2[j]);
            }
            j++;
          }
        }
        else if ((localObject2 instanceof List))
        {
          localObject1 = (List)localObject2;
          for (j = i; j < ((List)localObject1).size(); j++)
          {
            localObject2 = ((List)localObject1).get(j);
            if ((localObject2 instanceof Bundle)) {
              ((List)localObject1).set(j, new Bundle((Bundle)localObject2));
            }
          }
        }
      }
    }
    return localBundle;
  }
  
  public static ArrayList<Bundle> b(List<uc> paramList)
  {
    if (paramList == null) {
      return new ArrayList(0);
    }
    ArrayList localArrayList = new ArrayList(paramList.size());
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      Object localObject1 = (uc)paramList.next();
      Bundle localBundle = new Bundle();
      localBundle.putString("app_id", ((uc)localObject1).a);
      localBundle.putString("origin", ((uc)localObject1).b);
      localBundle.putLong("creation_timestamp", ((uc)localObject1).d);
      localBundle.putString("name", ((uc)localObject1).c.b);
      za.a(localBundle, ((uc)localObject1).c.y());
      localBundle.putBoolean("active", ((uc)localObject1).e);
      Object localObject2 = ((uc)localObject1).f;
      if (localObject2 != null) {
        localBundle.putString("trigger_event_name", (String)localObject2);
      }
      localObject2 = ((uc)localObject1).g;
      if (localObject2 != null)
      {
        localBundle.putString("timed_out_event_name", ((k)localObject2).a);
        localObject2 = ((uc)localObject1).g.b;
        if (localObject2 != null) {
          localBundle.putBundle("timed_out_event_params", ((h)localObject2).y());
        }
      }
      localBundle.putLong("trigger_timeout", ((uc)localObject1).h);
      localObject2 = ((uc)localObject1).i;
      if (localObject2 != null)
      {
        localBundle.putString("triggered_event_name", ((k)localObject2).a);
        localObject2 = ((uc)localObject1).i.b;
        if (localObject2 != null) {
          localBundle.putBundle("triggered_event_params", ((h)localObject2).y());
        }
      }
      localBundle.putLong("triggered_timestamp", ((uc)localObject1).c.c);
      localBundle.putLong("time_to_live", ((uc)localObject1).j);
      localObject2 = ((uc)localObject1).k;
      if (localObject2 != null)
      {
        localBundle.putString("expired_event_name", ((k)localObject2).a);
        localObject1 = ((uc)localObject1).k.b;
        if (localObject1 != null) {
          localBundle.putBundle("expired_event_params", ((h)localObject1).y());
        }
      }
      localArrayList.add(localBundle);
    }
    return localArrayList;
  }
  
  private static boolean b(Context paramContext, String paramString)
  {
    try
    {
      PackageManager localPackageManager = paramContext.getPackageManager();
      if (localPackageManager == null) {
        return false;
      }
      ComponentName localComponentName = new android/content/ComponentName;
      localComponentName.<init>(paramContext, paramString);
      paramContext = localPackageManager.getServiceInfo(localComponentName, 0);
      if (paramContext != null)
      {
        boolean bool = paramContext.enabled;
        if (bool) {
          return true;
        }
      }
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      for (;;) {}
    }
    return false;
  }
  
  private final boolean c(Context paramContext, String paramString)
  {
    X500Principal localX500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
    try
    {
      paramContext = Gq.a(paramContext).b(paramString, 64);
      if ((paramContext != null) && (paramContext.signatures != null) && (paramContext.signatures.length > 0))
      {
        paramContext = paramContext.signatures[0];
        CertificateFactory localCertificateFactory = CertificateFactory.getInstance("X.509");
        paramString = new java/io/ByteArrayInputStream;
        paramString.<init>(paramContext.toByteArray());
        boolean bool = ((X509Certificate)localCertificateFactory.generateCertificate(paramString)).getSubjectX500Principal().equals(localX500Principal);
        return bool;
      }
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      c().s().a("Package name not found", paramContext);
    }
    catch (CertificateException paramContext)
    {
      c().s().a("Error obtaining certificate", paramContext);
    }
    return true;
  }
  
  static boolean d(String paramString1, String paramString2)
  {
    if ((paramString1 == null) && (paramString2 == null)) {
      return true;
    }
    if (paramString1 == null) {
      return false;
    }
    return paramString1.equals(paramString2);
  }
  
  static boolean e(String paramString)
  {
    return (!TextUtils.isEmpty(paramString)) && (paramString.startsWith("_"));
  }
  
  private final boolean e(String paramString1, String paramString2)
  {
    if (paramString2 == null)
    {
      c().s().a("Name is required and can't be null. Type", paramString1);
      return false;
    }
    if (paramString2.length() == 0)
    {
      c().s().a("Name is required and can't be empty. Type", paramString1);
      return false;
    }
    int i = paramString2.codePointAt(0);
    if ((!Character.isLetter(i)) && (i != 95))
    {
      c().s().a("Name must start with a letter or _ (underscore). Type, name", paramString1, paramString2);
      return false;
    }
    int j = paramString2.length();
    i = Character.charCount(i);
    while (i < j)
    {
      int k = paramString2.codePointAt(i);
      if ((k != 95) && (!Character.isLetterOrDigit(k)))
      {
        c().s().a("Name must consist of letters, digits or _ (underscores). Type, name", paramString1, paramString2);
        return false;
      }
      i += Character.charCount(k);
    }
    return true;
  }
  
  private static boolean g(String paramString)
  {
    com.google.android.gms.common.internal.t.a(paramString);
    return paramString.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
  }
  
  private static int h(String paramString)
  {
    if ("_ldl".equals(paramString)) {
      return 2048;
    }
    if ("_id".equals(paramString)) {
      return 256;
    }
    return 36;
  }
  
  static MessageDigest s()
  {
    for (int i = 0; i < 2; i++) {
      try
      {
        MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
        if (localMessageDigest != null) {
          return localMessageDigest;
        }
      }
      catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
      {
        for (;;) {}
      }
    }
    return null;
  }
  
  public final int a(int paramInt)
  {
    return com.google.android.gms.common.f.a().a(getContext(), 12451000);
  }
  
  final long a(Context paramContext, String paramString)
  {
    j();
    com.google.android.gms.common.internal.t.a(paramContext);
    com.google.android.gms.common.internal.t.b(paramString);
    PackageManager localPackageManager = paramContext.getPackageManager();
    MessageDigest localMessageDigest = s();
    long l = -1L;
    if (localMessageDigest == null)
    {
      c().s().a("Could not get MD5 instance");
    }
    else
    {
      if (localPackageManager != null) {
        try
        {
          if (!c(paramContext, paramString))
          {
            paramContext = Gq.a(paramContext).b(getContext().getPackageName(), 64);
            if ((paramContext.signatures != null) && (paramContext.signatures.length > 0)) {
              l = a(localMessageDigest.digest(paramContext.signatures[0].toByteArray()));
            } else {
              c().v().a("Could not get signatures");
            }
          }
        }
        catch (PackageManager.NameNotFoundException paramContext)
        {
          c().s().a("Package name not found", paramContext);
        }
      }
      l = 0L;
    }
    return l;
  }
  
  final Bundle a(Uri paramUri)
  {
    if (paramUri == null) {
      return null;
    }
    try
    {
      boolean bool = paramUri.isHierarchical();
      Object localObject1;
      Object localObject3;
      Object localObject4;
      if (bool)
      {
        localObject1 = paramUri.getQueryParameter("utm_campaign");
        localObject2 = paramUri.getQueryParameter("utm_source");
        localObject3 = paramUri.getQueryParameter("utm_medium");
        localObject4 = paramUri.getQueryParameter("gclid");
      }
      else
      {
        localBundle = null;
        localObject2 = localBundle;
        localObject1 = localObject2;
        localObject4 = localObject1;
        localObject3 = localObject1;
        localObject1 = localBundle;
      }
      if ((TextUtils.isEmpty((CharSequence)localObject1)) && (TextUtils.isEmpty((CharSequence)localObject2)) && (TextUtils.isEmpty((CharSequence)localObject3)) && (TextUtils.isEmpty((CharSequence)localObject4))) {
        return null;
      }
      Bundle localBundle = new Bundle();
      if (!TextUtils.isEmpty((CharSequence)localObject1)) {
        localBundle.putString("campaign", (String)localObject1);
      }
      if (!TextUtils.isEmpty((CharSequence)localObject2)) {
        localBundle.putString("source", (String)localObject2);
      }
      if (!TextUtils.isEmpty((CharSequence)localObject3)) {
        localBundle.putString("medium", (String)localObject3);
      }
      if (!TextUtils.isEmpty((CharSequence)localObject4)) {
        localBundle.putString("gclid", (String)localObject4);
      }
      Object localObject2 = paramUri.getQueryParameter("utm_term");
      if (!TextUtils.isEmpty((CharSequence)localObject2)) {
        localBundle.putString("term", (String)localObject2);
      }
      localObject2 = paramUri.getQueryParameter("utm_content");
      if (!TextUtils.isEmpty((CharSequence)localObject2)) {
        localBundle.putString("content", (String)localObject2);
      }
      localObject2 = paramUri.getQueryParameter("aclid");
      if (!TextUtils.isEmpty((CharSequence)localObject2)) {
        localBundle.putString("aclid", (String)localObject2);
      }
      localObject2 = paramUri.getQueryParameter("cp1");
      if (!TextUtils.isEmpty((CharSequence)localObject2)) {
        localBundle.putString("cp1", (String)localObject2);
      }
      paramUri = paramUri.getQueryParameter("anid");
      if (!TextUtils.isEmpty(paramUri)) {
        localBundle.putString("anid", paramUri);
      }
      return localBundle;
    }
    catch (UnsupportedOperationException paramUri)
    {
      c().v().a("Install referrer url isn't a hierarchical URI", paramUri);
    }
    return null;
  }
  
  final Bundle a(Bundle paramBundle)
  {
    Bundle localBundle = new Bundle();
    if (paramBundle != null)
    {
      Iterator localIterator = paramBundle.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        Object localObject = a(str, paramBundle.get(str));
        if (localObject == null) {
          c().v().a("Param value can't be null", d().b(str));
        } else {
          a(localBundle, str, localObject);
        }
      }
    }
    return localBundle;
  }
  
  final Bundle a(String paramString1, String paramString2, Bundle paramBundle, List<String> paramList, boolean paramBoolean1, boolean paramBoolean2)
  {
    Object localObject1;
    if (paramBundle != null)
    {
      Bundle localBundle = new Bundle(paramBundle);
      if (g().e(paramString1, m.Ja)) {
        localObject1 = new TreeSet(paramBundle.keySet());
      } else {
        localObject1 = paramBundle.keySet();
      }
      Iterator localIterator = ((Set)localObject1).iterator();
      int i = 0;
      localObject1 = localBundle;
      if (localIterator.hasNext())
      {
        localObject1 = (String)localIterator.next();
        int j;
        if ((paramList != null) && (paramList.contains(localObject1)))
        {
          j = 0;
        }
        else
        {
          int k = 14;
          if (paramBoolean1)
          {
            if (!b("event param", (String)localObject1)) {}
            do
            {
              j = 3;
              break;
              if (!a("event param", null, (String)localObject1))
              {
                j = 14;
                break;
              }
            } while (!a("event param", 40, (String)localObject1));
          }
          j = 0;
          if (j == 0)
          {
            if (!e("event param", (String)localObject1)) {}
            for (;;)
            {
              j = 3;
              break label241;
              if (!a("event param", null, (String)localObject1))
              {
                j = k;
                break label241;
              }
              if (a("event param", 40, (String)localObject1)) {
                break;
              }
            }
          }
        }
        label241:
        Object localObject2;
        if (j != 0)
        {
          if (a(localBundle, j))
          {
            localBundle.putString("_ev", a((String)localObject1, 40, true));
            if (j == 3) {
              a(localBundle, localObject1);
            }
          }
          localBundle.remove((String)localObject1);
          j = i;
        }
        else
        {
          localObject2 = paramBundle.get((String)localObject1);
          j();
          if (paramBoolean2)
          {
            if ((localObject2 instanceof Parcelable[]))
            {
              j = ((Parcelable[])localObject2).length;
            }
            else
            {
              if (!(localObject2 instanceof ArrayList)) {
                break label390;
              }
              j = ((ArrayList)localObject2).size();
            }
            if (j > 1000)
            {
              c().v().a("Parameter array is too long; discarded. Value kind, name, array length", "param", localObject1, Integer.valueOf(j));
              j = 0;
            }
            else
            {
              label390:
              j = 1;
            }
            if (j == 0)
            {
              j = 17;
              break label483;
            }
          }
          boolean bool;
          if (((g().i(paramString1)) && (e(paramString2))) || (e((String)localObject1))) {
            bool = a("param", (String)localObject1, 256, localObject2, paramBoolean2);
          } else {
            bool = a("param", (String)localObject1, 100, localObject2, paramBoolean2);
          }
          if (bool) {
            j = 0;
          } else {
            j = 4;
          }
          label483:
          if ((j == 0) || ("_ev".equals(localObject1))) {
            break label554;
          }
          if (a(localBundle, j))
          {
            localBundle.putString("_ev", a((String)localObject1, 40, true));
            a(localBundle, paramBundle.get((String)localObject1));
          }
          localBundle.remove((String)localObject1);
          j = i;
        }
        for (;;)
        {
          i = j;
          break;
          label554:
          j = i;
          if (a((String)localObject1))
          {
            i++;
            j = i;
            if (i > 25)
            {
              localObject2 = new StringBuilder(48);
              ((StringBuilder)localObject2).append("Event can't contain more than 25 params");
              localObject2 = ((StringBuilder)localObject2).toString();
              c().s().a((String)localObject2, d().a(paramString2), d().a(paramBundle));
              a(localBundle, 5);
              localBundle.remove((String)localObject1);
              j = i;
            }
          }
        }
      }
    }
    else
    {
      localObject1 = null;
    }
    return (Bundle)localObject1;
  }
  
  final k a(String paramString1, String paramString2, Bundle paramBundle, String paramString3, long paramLong, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (TextUtils.isEmpty(paramString2)) {
      return null;
    }
    if (b(paramString2) == 0)
    {
      if (paramBundle != null) {
        paramBundle = new Bundle(paramBundle);
      } else {
        paramBundle = new Bundle();
      }
      paramBundle.putString("_o", paramString3);
      return new k(paramString2, new h(a(a(paramString1, paramString2, paramBundle, com.google.android.gms.common.util.f.a("_o"), false, false))), paramString3, paramLong);
    }
    c().s().a("Invalid conditional property event name", d().c(paramString2));
    throw new IllegalArgumentException();
  }
  
  final Object a(String paramString, Object paramObject)
  {
    boolean bool = "_ev".equals(paramString);
    int i = 256;
    if (bool) {
      return a(256, paramObject, true);
    }
    if (!e(paramString)) {
      i = 100;
    }
    return a(i, paramObject, false);
  }
  
  public final void a(int paramInt1, String paramString1, String paramString2, int paramInt2)
  {
    a(null, paramInt1, paramString1, paramString2, paramInt2);
  }
  
  final void a(Bundle paramBundle, long paramLong)
  {
    long l = paramBundle.getLong("_et");
    if (l != 0L) {
      c().v().a("Params already contained engagement", Long.valueOf(l));
    }
    paramBundle.putLong("_et", paramLong + l);
  }
  
  final void a(Bundle paramBundle, String paramString, Object paramObject)
  {
    if (paramBundle == null) {
      return;
    }
    if ((paramObject instanceof Long))
    {
      paramBundle.putLong(paramString, ((Long)paramObject).longValue());
      return;
    }
    if ((paramObject instanceof String))
    {
      paramBundle.putString(paramString, String.valueOf(paramObject));
      return;
    }
    if ((paramObject instanceof Double))
    {
      paramBundle.putDouble(paramString, ((Double)paramObject).doubleValue());
      return;
    }
    if (paramString != null)
    {
      if (paramObject != null) {
        paramBundle = paramObject.getClass().getSimpleName();
      } else {
        paramBundle = null;
      }
      c().x().a("Not putting event parameter. Invalid value type. name, type", d().b(paramString), paramBundle);
    }
  }
  
  final void a(String paramString1, int paramInt1, String paramString2, String paramString3, int paramInt2)
  {
    Bundle localBundle = new Bundle();
    a(localBundle, paramInt1);
    if (g().e(paramString1, m.Da))
    {
      if ((!TextUtils.isEmpty(paramString2)) && (!TextUtils.isEmpty(paramString3))) {
        localBundle.putString(paramString2, paramString3);
      }
    }
    else if (!TextUtils.isEmpty(paramString2)) {
      localBundle.putString(paramString2, paramString3);
    }
    if ((paramInt1 == 6) || (paramInt1 == 7) || (paramInt1 == 2)) {
      localBundle.putLong("_el", paramInt2);
    }
    this.a.a();
    this.a.z().b("auto", "_err", localBundle);
  }
  
  public final void a(qK paramqK, int paramInt)
  {
    Bundle localBundle = new Bundle();
    localBundle.putInt("r", paramInt);
    try
    {
      paramqK.a(localBundle);
      return;
    }
    catch (RemoteException paramqK)
    {
      this.a.c().v().a("Error returning int value to wrapper", paramqK);
    }
  }
  
  public final void a(qK paramqK, long paramLong)
  {
    Bundle localBundle = new Bundle();
    localBundle.putLong("r", paramLong);
    try
    {
      paramqK.a(localBundle);
      return;
    }
    catch (RemoteException paramqK)
    {
      this.a.c().v().a("Error returning long value to wrapper", paramqK);
    }
  }
  
  public final void a(qK paramqK, Bundle paramBundle)
  {
    try
    {
      paramqK.a(paramBundle);
      return;
    }
    catch (RemoteException paramqK)
    {
      this.a.c().v().a("Error returning bundle value to wrapper", paramqK);
    }
  }
  
  public final void a(qK paramqK, String paramString)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("r", paramString);
    try
    {
      paramqK.a(localBundle);
      return;
    }
    catch (RemoteException paramqK)
    {
      this.a.c().v().a("Error returning string value to wrapper", paramqK);
    }
  }
  
  public final void a(qK paramqK, ArrayList<Bundle> paramArrayList)
  {
    Bundle localBundle = new Bundle();
    localBundle.putParcelableArrayList("r", paramArrayList);
    try
    {
      paramqK.a(localBundle);
      return;
    }
    catch (RemoteException paramqK)
    {
      this.a.c().v().a("Error returning bundle list to wrapper", paramqK);
    }
  }
  
  public final void a(qK paramqK, boolean paramBoolean)
  {
    Bundle localBundle = new Bundle();
    localBundle.putBoolean("r", paramBoolean);
    try
    {
      paramqK.a(localBundle);
      return;
    }
    catch (RemoteException paramqK)
    {
      this.a.c().v().a("Error returning boolean value to wrapper", paramqK);
    }
  }
  
  public final void a(qK paramqK, byte[] paramArrayOfByte)
  {
    Bundle localBundle = new Bundle();
    localBundle.putByteArray("r", paramArrayOfByte);
    try
    {
      paramqK.a(localBundle);
      return;
    }
    catch (RemoteException paramqK)
    {
      this.a.c().v().a("Error returning byte array to wrapper", paramqK);
    }
  }
  
  final boolean a(String paramString1, int paramInt, String paramString2)
  {
    if (paramString2 == null)
    {
      c().s().a("Name is required and can't be null. Type", paramString1);
      return false;
    }
    if (paramString2.codePointCount(0, paramString2.length()) > paramInt)
    {
      c().s().a("Name is too long. Type, maximum supported length, name", paramString1, Integer.valueOf(paramInt), paramString2);
      return false;
    }
    return true;
  }
  
  final boolean a(String paramString1, String[] paramArrayOfString, String paramString2)
  {
    if (paramString2 == null)
    {
      c().s().a("Name is required and can't be null. Type", paramString1);
      return false;
    }
    com.google.android.gms.common.internal.t.a(paramString2);
    String[] arrayOfString = c;
    int i = arrayOfString.length;
    for (int j = 0; j < i; j++) {
      if (paramString2.startsWith(arrayOfString[j]))
      {
        j = 1;
        break label72;
      }
    }
    j = 0;
    label72:
    if (j != 0)
    {
      c().s().a("Name starts with reserved prefix. Type, name", paramString1, paramString2);
      return false;
    }
    if (paramArrayOfString != null)
    {
      com.google.android.gms.common.internal.t.a(paramArrayOfString);
      i = paramArrayOfString.length;
      for (j = 0; j < i; j++) {
        if (d(paramString2, paramArrayOfString[j]))
        {
          j = 1;
          break label143;
        }
      }
      j = 0;
      label143:
      if (j != 0)
      {
        c().s().a("Name is reserved. Type, name", paramString1, paramString2);
        return false;
      }
    }
    return true;
  }
  
  final int b(String paramString)
  {
    if (!e("event", paramString)) {
      return 2;
    }
    if (!a("event", Aa.a, paramString)) {
      return 13;
    }
    if (!a("event", 40, paramString)) {
      return 2;
    }
    return 0;
  }
  
  final int b(String paramString, Object paramObject)
  {
    boolean bool;
    if ("_ldl".equals(paramString)) {
      bool = a("user property referrer", paramString, h(paramString), paramObject, false);
    } else {
      bool = a("user property", paramString, h(paramString), paramObject, false);
    }
    if (bool) {
      return 0;
    }
    return 7;
  }
  
  final boolean b(String paramString1, String paramString2)
  {
    if (paramString2 == null)
    {
      c().s().a("Name is required and can't be null. Type", paramString1);
      return false;
    }
    if (paramString2.length() == 0)
    {
      c().s().a("Name is required and can't be empty. Type", paramString1);
      return false;
    }
    int i = paramString2.codePointAt(0);
    if (!Character.isLetter(i))
    {
      c().s().a("Name must start with a letter. Type, name", paramString1, paramString2);
      return false;
    }
    int j = paramString2.length();
    i = Character.charCount(i);
    while (i < j)
    {
      int k = paramString2.codePointAt(i);
      if ((k != 95) && (!Character.isLetterOrDigit(k)))
      {
        c().s().a("Name must consist of letters, digits or _ (underscores). Type, name", paramString1, paramString2);
        return false;
      }
      i += Character.charCount(k);
    }
    return true;
  }
  
  final int c(String paramString)
  {
    if (!e("user property", paramString)) {
      return 6;
    }
    if (!a("user property", Ca.a, paramString)) {
      return 15;
    }
    if (!a("user property", 24, paramString)) {
      return 6;
    }
    return 0;
  }
  
  final Object c(String paramString, Object paramObject)
  {
    if ("_ldl".equals(paramString)) {
      return a(h(paramString), paramObject, true);
    }
    return a(h(paramString), paramObject, false);
  }
  
  final boolean c(String paramString1, String paramString2)
  {
    if (!TextUtils.isEmpty(paramString1))
    {
      if (!g(paramString1))
      {
        if (this.a.m()) {
          c().s().a("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", v.a(paramString1));
        }
        return false;
      }
    }
    else
    {
      if (TextUtils.isEmpty(paramString2)) {
        break label78;
      }
      if (!g(paramString2))
      {
        c().s().a("Invalid admob_app_id. Analytics disabled.", v.a(paramString2));
        return false;
      }
    }
    return true;
    label78:
    if (this.a.m()) {
      c().s().a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
    }
    return false;
  }
  
  final boolean d(String paramString)
  {
    j();
    if (Gq.a(getContext()).a(paramString) == 0) {
      return true;
    }
    c().z().a("Permission not granted", paramString);
    return false;
  }
  
  final boolean f(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return false;
    }
    String str = g().t();
    a();
    return str.equals(paramString);
  }
  
  protected final boolean q()
  {
    return true;
  }
  
  protected final void r()
  {
    j();
    SecureRandom localSecureRandom = new SecureRandom();
    long l1 = localSecureRandom.nextLong();
    long l2 = l1;
    if (l1 == 0L)
    {
      l1 = localSecureRandom.nextLong();
      l2 = l1;
      if (l1 == 0L)
      {
        c().v().a("Utils falling back to Random for random id");
        l2 = l1;
      }
    }
    this.e.set(l2);
  }
  
  public final long t()
  {
    long l1;
    if (this.e.get() == 0L) {
      synchronized (this.e)
      {
        Random localRandom = new java/util/Random;
        localRandom.<init>(System.nanoTime() ^ b().a());
        l1 = localRandom.nextLong();
        int i = this.f + 1;
        this.f = i;
        long l2 = i;
        return l1 + l2;
      }
    }
    synchronized (this.e)
    {
      this.e.compareAndSet(-1L, 1L);
      l1 = this.e.getAndIncrement();
      return l1;
    }
  }
  
  final SecureRandom u()
  {
    j();
    if (this.d == null) {
      this.d = new SecureRandom();
    }
    return this.d;
  }
  
  public final int v()
  {
    if (this.g == null) {
      this.g = Integer.valueOf(com.google.android.gms.common.f.a().b(getContext()) / 1000);
    }
    return this.g.intValue();
  }
  
  final String w()
  {
    byte[] arrayOfByte = new byte[16];
    u().nextBytes(arrayOfByte);
    return String.format(Locale.US, "%032x", new Object[] { new BigInteger(1, arrayOfByte) });
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/measurement/internal/hc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */