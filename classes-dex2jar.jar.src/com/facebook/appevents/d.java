package com.facebook.appevents;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import com.facebook.FacebookSdk;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;

class d
{
  private static final String a = "d";
  private static ReentrantReadWriteLock b = new ReentrantReadWriteLock();
  private static String c;
  private static volatile boolean d = false;
  
  public static String b()
  {
    if (!d)
    {
      Log.w(a, "initStore should have been called before calling setUserID");
      d();
    }
    b.readLock().lock();
    try
    {
      String str = c;
      return str;
    }
    finally
    {
      b.readLock().unlock();
    }
  }
  
  public static void c()
  {
    if (d) {
      return;
    }
    AppEventsLogger.c().execute(new c());
  }
  
  private static void d()
  {
    if (d) {
      return;
    }
    b.writeLock().lock();
    try
    {
      boolean bool = d;
      if (bool) {
        return;
      }
      c = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.d()).getString("com.facebook.appevents.AnalyticsUserIDStore.userID", null);
      d = true;
      return;
    }
    finally
    {
      b.writeLock().unlock();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/appevents/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */