package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.support.v4.content.c;
import android.util.Log;
import gd;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class z
{
  private final SharedPreferences a;
  private final Context b;
  private final ca c;
  private final Map<String, da> d = new gd();
  
  public z(Context paramContext)
  {
    this(paramContext, new ca());
  }
  
  private z(Context paramContext, ca paramca)
  {
    this.b = paramContext;
    this.a = paramContext.getSharedPreferences("com.google.android.gms.appid", 0);
    this.c = paramca;
    paramContext = new File(c.b(this.b), "com.google.android.gms.appid-no-backup");
    if (!paramContext.exists()) {
      try
      {
        if ((paramContext.createNewFile()) && (!c()))
        {
          Log.i("FirebaseInstanceId", "App restored, clearing state");
          b();
          FirebaseInstanceId.b().h();
        }
        return;
      }
      catch (IOException paramContext)
      {
        if (Log.isLoggable("FirebaseInstanceId", 3))
        {
          paramContext = String.valueOf(paramContext.getMessage());
          if (paramContext.length() != 0) {
            paramContext = "Error creating file in no backup dir: ".concat(paramContext);
          } else {
            paramContext = new String("Error creating file in no backup dir: ");
          }
          Log.d("FirebaseInstanceId", paramContext);
        }
      }
    }
  }
  
  static String a(String paramString1, String paramString2)
  {
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(paramString1).length() + 3 + String.valueOf(paramString2).length());
    localStringBuilder.append(paramString1);
    localStringBuilder.append("|S|");
    localStringBuilder.append(paramString2);
    return localStringBuilder.toString();
  }
  
  private static String b(String paramString1, String paramString2, String paramString3)
  {
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(paramString1).length() + 4 + String.valueOf(paramString2).length() + String.valueOf(paramString3).length());
    localStringBuilder.append(paramString1);
    localStringBuilder.append("|T|");
    localStringBuilder.append(paramString2);
    localStringBuilder.append("|");
    localStringBuilder.append(paramString3);
    return localStringBuilder.toString();
  }
  
  private final boolean c()
  {
    try
    {
      boolean bool = this.a.getAll().isEmpty();
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final A a(String paramString1, String paramString2, String paramString3)
  {
    try
    {
      paramString1 = A.a(this.a.getString(b(paramString1, paramString2, paramString3), null));
      return paramString1;
    }
    finally
    {
      paramString1 = finally;
      throw paramString1;
    }
  }
  
  public final String a()
  {
    try
    {
      String str = this.a.getString("topic_operaion_queue", "");
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void a(String paramString)
  {
    try
    {
      this.a.edit().putString("topic_operaion_queue", paramString).apply();
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public final void a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    try
    {
      paramString4 = A.a(paramString4, paramString5, System.currentTimeMillis());
      if (paramString4 == null) {
        return;
      }
      paramString5 = this.a.edit();
      paramString5.putString(b(paramString1, paramString2, paramString3), paramString4);
      paramString5.commit();
      return;
    }
    finally {}
  }
  
  public final da b(String paramString)
  {
    try
    {
      da localda1 = (da)this.d.get(paramString);
      if (localda1 != null) {
        return localda1;
      }
      da localda2;
      try
      {
        localda1 = this.c.a(this.b, paramString);
      }
      catch (d locald)
      {
        Log.w("FirebaseInstanceId", "Stored data is corrupt, generating new identity");
        FirebaseInstanceId.b().h();
        localda2 = this.c.b(this.b, paramString);
      }
      this.d.put(paramString, localda2);
      return localda2;
    }
    finally {}
  }
  
  public final void b()
  {
    try
    {
      this.d.clear();
      ca.a(this.b);
      this.a.edit().clear().commit();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void c(String paramString)
  {
    try
    {
      String str1 = String.valueOf(paramString).concat("|T|");
      SharedPreferences.Editor localEditor = this.a.edit();
      paramString = this.a.getAll().keySet().iterator();
      while (paramString.hasNext())
      {
        String str2 = (String)paramString.next();
        if (str2.startsWith(str1)) {
          localEditor.remove(str2);
        }
      }
      localEditor.commit();
      return;
    }
    finally {}
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/firebase/iid/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */