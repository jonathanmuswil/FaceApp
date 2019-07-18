import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.preference.PreferenceManager;
import com.facebook.FacebookSdk;

class lo
{
  private String a;
  private boolean b;
  
  private lo(String paramString, boolean paramBoolean)
  {
    this.a = paramString;
    this.b = paramBoolean;
  }
  
  public static void a()
  {
    SharedPreferences.Editor localEditor = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.d()).edit();
    localEditor.remove("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage");
    localEditor.remove("com.facebook.appevents.SourceApplicationInfo.openedByApplink");
    localEditor.apply();
  }
  
  public static lo b()
  {
    SharedPreferences localSharedPreferences = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.d());
    if (!localSharedPreferences.contains("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage")) {
      return null;
    }
    return new lo(localSharedPreferences.getString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", null), localSharedPreferences.getBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", false));
  }
  
  public void c()
  {
    SharedPreferences.Editor localEditor = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.d()).edit();
    localEditor.putString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", this.a);
    localEditor.putBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", this.b);
    localEditor.apply();
  }
  
  public String toString()
  {
    String str;
    if (this.b) {
      str = "Applink";
    } else {
      str = "Unclassified";
    }
    Object localObject = str;
    if (this.a != null)
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(str);
      ((StringBuilder)localObject).append("(");
      ((StringBuilder)localObject).append(this.a);
      ((StringBuilder)localObject).append(")");
      localObject = ((StringBuilder)localObject).toString();
    }
    return (String)localObject;
  }
  
  public static class a
  {
    public static lo a(Activity paramActivity)
    {
      Object localObject1 = paramActivity.getCallingActivity();
      if (localObject1 != null)
      {
        localObject2 = ((ComponentName)localObject1).getPackageName();
        localObject1 = localObject2;
        if (((String)localObject2).equals(paramActivity.getPackageName())) {
          return null;
        }
      }
      else
      {
        localObject1 = "";
      }
      Object localObject2 = paramActivity.getIntent();
      boolean bool1 = false;
      paramActivity = (Activity)localObject1;
      boolean bool2 = bool1;
      if (localObject2 != null)
      {
        paramActivity = (Activity)localObject1;
        bool2 = bool1;
        if (!((Intent)localObject2).getBooleanExtra("_fbSourceApplicationHasBeenSet", false))
        {
          ((Intent)localObject2).putExtra("_fbSourceApplicationHasBeenSet", true);
          Bundle localBundle = ue.a((Intent)localObject2);
          paramActivity = (Activity)localObject1;
          bool2 = bool1;
          if (localBundle != null)
          {
            paramActivity = localBundle.getBundle("referer_app_link");
            if (paramActivity != null) {
              localObject1 = paramActivity.getString("package");
            }
            bool2 = true;
            paramActivity = (Activity)localObject1;
          }
        }
      }
      ((Intent)localObject2).putExtra("_fbSourceApplicationHasBeenSet", true);
      return new lo(paramActivity, bool2, null);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/lo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */