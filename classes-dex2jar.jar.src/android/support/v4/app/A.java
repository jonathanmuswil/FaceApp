package android.support.v4.app;

import android.app.Activity;
import android.content.pm.PackageManager;

final class a
  implements Runnable
{
  a(String[] paramArrayOfString, Activity paramActivity, int paramInt) {}
  
  public void run()
  {
    int[] arrayOfInt = new int[this.a.length];
    PackageManager localPackageManager = this.b.getPackageManager();
    String str = this.b.getPackageName();
    int i = this.a.length;
    for (int j = 0; j < i; j++) {
      arrayOfInt[j] = localPackageManager.checkPermission(this.a[j], str);
    }
    ((b.a)this.b).onRequestPermissionsResult(this.c, this.a, arrayOfInt);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/app/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */