import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;

class Na$b
  extends Drawable.ConstantState
{
  private final Drawable.ConstantState a;
  
  public Na$b(Drawable.ConstantState paramConstantState)
  {
    this.a = paramConstantState;
  }
  
  public boolean canApplyTheme()
  {
    return this.a.canApplyTheme();
  }
  
  public int getChangingConfigurations()
  {
    return this.a.getChangingConfigurations();
  }
  
  public Drawable newDrawable()
  {
    Na localNa = new Na();
    localNa.a = this.a.newDrawable();
    localNa.a.setCallback(localNa.g);
    return localNa;
  }
  
  public Drawable newDrawable(Resources paramResources)
  {
    Na localNa = new Na();
    localNa.a = this.a.newDrawable(paramResources);
    localNa.a.setCallback(localNa.g);
    return localNa;
  }
  
  public Drawable newDrawable(Resources paramResources, Resources.Theme paramTheme)
  {
    Na localNa = new Na();
    localNa.a = this.a.newDrawable(paramResources, paramTheme);
    localNa.a.setCallback(localNa.g);
    return localNa;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Na$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */