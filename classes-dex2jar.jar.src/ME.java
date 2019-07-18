import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.view.LayoutInflater;

public class me
  extends ContextWrapper
{
  private int a;
  private Resources.Theme b;
  private LayoutInflater c;
  private Configuration d;
  private Resources e;
  
  public me()
  {
    super(null);
  }
  
  public me(Context paramContext, int paramInt)
  {
    super(paramContext);
    this.a = paramInt;
  }
  
  public me(Context paramContext, Resources.Theme paramTheme)
  {
    super(paramContext);
    this.b = paramTheme;
  }
  
  private Resources b()
  {
    if (this.e == null)
    {
      Configuration localConfiguration = this.d;
      if (localConfiguration == null) {
        this.e = super.getResources();
      } else if (Build.VERSION.SDK_INT >= 17) {
        this.e = createConfigurationContext(localConfiguration).getResources();
      }
    }
    return this.e;
  }
  
  private void c()
  {
    boolean bool;
    if (this.b == null) {
      bool = true;
    } else {
      bool = false;
    }
    if (bool)
    {
      this.b = getResources().newTheme();
      Resources.Theme localTheme = getBaseContext().getTheme();
      if (localTheme != null) {
        this.b.setTo(localTheme);
      }
    }
    a(this.b, this.a, bool);
  }
  
  public int a()
  {
    return this.a;
  }
  
  protected void a(Resources.Theme paramTheme, int paramInt, boolean paramBoolean)
  {
    paramTheme.applyStyle(paramInt, true);
  }
  
  protected void attachBaseContext(Context paramContext)
  {
    super.attachBaseContext(paramContext);
  }
  
  public AssetManager getAssets()
  {
    return getResources().getAssets();
  }
  
  public Resources getResources()
  {
    return b();
  }
  
  public Object getSystemService(String paramString)
  {
    if ("layout_inflater".equals(paramString))
    {
      if (this.c == null) {
        this.c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
      }
      return this.c;
    }
    return getBaseContext().getSystemService(paramString);
  }
  
  public Resources.Theme getTheme()
  {
    Resources.Theme localTheme = this.b;
    if (localTheme != null) {
      return localTheme;
    }
    if (this.a == 0) {
      this.a = Od.Theme_AppCompat_Light;
    }
    c();
    return this.b;
  }
  
  public void setTheme(int paramInt)
  {
    if (this.a != paramInt)
    {
      this.a = paramInt;
      c();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/me.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */