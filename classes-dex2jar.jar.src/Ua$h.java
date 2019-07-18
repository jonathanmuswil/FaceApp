import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.VectorDrawable;

class Ua$h
  extends Drawable.ConstantState
{
  private final Drawable.ConstantState a;
  
  public Ua$h(Drawable.ConstantState paramConstantState)
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
    Ua localUa = new Ua();
    localUa.a = ((VectorDrawable)this.a.newDrawable());
    return localUa;
  }
  
  public Drawable newDrawable(Resources paramResources)
  {
    Ua localUa = new Ua();
    localUa.a = ((VectorDrawable)this.a.newDrawable(paramResources));
    return localUa;
  }
  
  public Drawable newDrawable(Resources paramResources, Resources.Theme paramTheme)
  {
    Ua localUa = new Ua();
    localUa.a = ((VectorDrawable)this.a.newDrawable(paramResources, paramTheme));
    return localUa;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Ua$h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */