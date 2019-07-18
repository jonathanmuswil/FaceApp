import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.view.ViewConfiguration;

public class je
{
  private Context a;
  
  private je(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public static je a(Context paramContext)
  {
    return new je(paramContext);
  }
  
  public boolean a()
  {
    boolean bool;
    if (this.a.getApplicationInfo().targetSdkVersion < 14) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public int b()
  {
    return this.a.getResources().getDisplayMetrics().widthPixels / 2;
  }
  
  public int c()
  {
    Configuration localConfiguration = this.a.getResources().getConfiguration();
    int i = localConfiguration.screenWidthDp;
    int j = localConfiguration.screenHeightDp;
    if ((localConfiguration.smallestScreenWidthDp <= 600) && (i <= 600) && ((i <= 960) || (j <= 720)) && ((i <= 720) || (j <= 960)))
    {
      if ((i < 500) && ((i <= 640) || (j <= 480)) && ((i <= 480) || (j <= 640)))
      {
        if (i >= 360) {
          return 3;
        }
        return 2;
      }
      return 4;
    }
    return 5;
  }
  
  public int d()
  {
    return this.a.getResources().getDimensionPixelSize(Jd.abc_action_bar_stacked_tab_max_width);
  }
  
  public int e()
  {
    TypedArray localTypedArray = this.a.obtainStyledAttributes(null, Pd.ActionBar, Gd.actionBarStyle, 0);
    int i = localTypedArray.getLayoutDimension(Pd.ActionBar_height, 0);
    Resources localResources = this.a.getResources();
    int j = i;
    if (!f()) {
      j = Math.min(i, localResources.getDimensionPixelSize(Jd.abc_action_bar_stacked_max_height));
    }
    localTypedArray.recycle();
    return j;
  }
  
  public boolean f()
  {
    return this.a.getResources().getBoolean(Hd.abc_action_bar_embed_tabs);
  }
  
  public boolean g()
  {
    if (Build.VERSION.SDK_INT >= 19) {
      return true;
    }
    return ViewConfiguration.get(this.a).hasPermanentMenuKey() ^ true;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/je.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */