package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.util.m;
import com.google.firebase.FirebaseApp;
import com.google.firebase.d;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.util.List;

public final class q
{
  private final Context a;
  private String b;
  private String c;
  private int d;
  private int e = 0;
  
  public q(Context paramContext)
  {
    this.a = paramContext;
  }
  
  private final PackageInfo a(String paramString)
  {
    try
    {
      paramString = this.a.getPackageManager().getPackageInfo(paramString, 0);
      return paramString;
    }
    catch (PackageManager.NameNotFoundException paramString)
    {
      paramString = String.valueOf(paramString);
      StringBuilder localStringBuilder = new StringBuilder(String.valueOf(paramString).length() + 23);
      localStringBuilder.append("Failed to find package ");
      localStringBuilder.append(paramString);
      Log.w("FirebaseInstanceId", localStringBuilder.toString());
    }
    return null;
  }
  
  public static String a(FirebaseApp paramFirebaseApp)
  {
    String str = paramFirebaseApp.d().c();
    if (str != null) {
      return str;
    }
    paramFirebaseApp = paramFirebaseApp.d().b();
    if (!paramFirebaseApp.startsWith("1:")) {
      return paramFirebaseApp;
    }
    paramFirebaseApp = paramFirebaseApp.split(":");
    if (paramFirebaseApp.length < 2) {
      return null;
    }
    paramFirebaseApp = paramFirebaseApp[1];
    if (paramFirebaseApp.isEmpty()) {
      return null;
    }
    return paramFirebaseApp;
  }
  
  public static String a(KeyPair paramKeyPair)
  {
    paramKeyPair = paramKeyPair.getPublic().getEncoded();
    try
    {
      paramKeyPair = MessageDigest.getInstance("SHA1").digest(paramKeyPair);
      paramKeyPair[0] = ((byte)(byte)((paramKeyPair[0] & 0xF) + 112));
      paramKeyPair = Base64.encodeToString(paramKeyPair, 0, 8, 11);
      return paramKeyPair;
    }
    catch (NoSuchAlgorithmException paramKeyPair)
    {
      Log.w("FirebaseInstanceId", "Unexpected error, device missing required algorithms");
    }
    return null;
  }
  
  private final void e()
  {
    try
    {
      PackageInfo localPackageInfo = a(this.a.getPackageName());
      if (localPackageInfo != null)
      {
        this.b = Integer.toString(localPackageInfo.versionCode);
        this.c = localPackageInfo.versionName;
      }
      return;
    }
    finally {}
  }
  
  public final int a()
  {
    try
    {
      if (this.e != 0)
      {
        i = this.e;
        return i;
      }
      Object localObject1 = this.a.getPackageManager();
      if (((PackageManager)localObject1).checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1)
      {
        Log.e("FirebaseInstanceId", "Google Play services missing or without correct permission.");
        return 0;
      }
      if (!m.k())
      {
        localObject3 = new android/content/Intent;
        ((Intent)localObject3).<init>("com.google.android.c2dm.intent.REGISTER");
        ((Intent)localObject3).setPackage("com.google.android.gms");
        localObject3 = ((PackageManager)localObject1).queryIntentServices((Intent)localObject3, 0);
        if ((localObject3 != null) && (((List)localObject3).size() > 0))
        {
          this.e = 1;
          i = this.e;
          return i;
        }
      }
      Object localObject3 = new android/content/Intent;
      ((Intent)localObject3).<init>("com.google.iid.TOKEN_REQUEST");
      ((Intent)localObject3).setPackage("com.google.android.gms");
      localObject1 = ((PackageManager)localObject1).queryBroadcastReceivers((Intent)localObject3, 0);
      if ((localObject1 != null) && (((List)localObject1).size() > 0))
      {
        this.e = 2;
        i = this.e;
        return i;
      }
      Log.w("FirebaseInstanceId", "Failed to resolve IID implementation package, falling back");
      if (m.k()) {
        this.e = 2;
      } else {
        this.e = 1;
      }
      int i = this.e;
      return i;
    }
    finally {}
  }
  
  public final String b()
  {
    try
    {
      if (this.b == null) {
        e();
      }
      String str = this.b;
      return str;
    }
    finally {}
  }
  
  public final String c()
  {
    try
    {
      if (this.c == null) {
        e();
      }
      String str = this.c;
      return str;
    }
    finally {}
  }
  
  public final int d()
  {
    try
    {
      if (this.d == 0)
      {
        PackageInfo localPackageInfo = a("com.google.android.gms");
        if (localPackageInfo != null) {
          this.d = localPackageInfo.versionCode;
        }
      }
      int i = this.d;
      return i;
    }
    finally {}
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/firebase/iid/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */