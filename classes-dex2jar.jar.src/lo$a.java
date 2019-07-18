import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;

public class lo$a
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


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/lo$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */