package android.support.v4.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.content.c;

public class b
  extends c
{
  private static b c;
  
  public static b a()
  {
    return c;
  }
  
  public static void a(Activity paramActivity)
  {
    if (Build.VERSION.SDK_INT >= 16) {
      paramActivity.finishAffinity();
    } else {
      paramActivity.finish();
    }
  }
  
  public static void a(Activity paramActivity, Intent paramIntent, int paramInt, Bundle paramBundle)
  {
    if (Build.VERSION.SDK_INT >= 16) {
      paramActivity.startActivityForResult(paramIntent, paramInt, paramBundle);
    } else {
      paramActivity.startActivityForResult(paramIntent, paramInt);
    }
  }
  
  public static void a(Activity paramActivity, String[] paramArrayOfString, int paramInt)
  {
    b localb = c;
    if ((localb != null) && (localb.a(paramActivity, paramArrayOfString, paramInt))) {
      return;
    }
    if (Build.VERSION.SDK_INT >= 23)
    {
      if ((paramActivity instanceof c)) {
        ((c)paramActivity).a(paramInt);
      }
      paramActivity.requestPermissions(paramArrayOfString, paramInt);
    }
    else if ((paramActivity instanceof a))
    {
      new Handler(Looper.getMainLooper()).post(new a(paramArrayOfString, paramActivity, paramInt));
    }
  }
  
  public static boolean a(Activity paramActivity, String paramString)
  {
    if (Build.VERSION.SDK_INT >= 23) {
      return paramActivity.shouldShowRequestPermissionRationale(paramString);
    }
    return false;
  }
  
  public static abstract interface a
  {
    public abstract void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt);
  }
  
  public static abstract interface b
  {
    public abstract boolean a(Activity paramActivity, int paramInt1, int paramInt2, Intent paramIntent);
    
    public abstract boolean a(Activity paramActivity, String[] paramArrayOfString, int paramInt);
  }
  
  public static abstract interface c
  {
    public abstract void a(int paramInt);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/app/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */