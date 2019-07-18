import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;

final class hi$a
  extends Drawable.ConstantState
{
  final li a;
  
  hi$a(li paramli)
  {
    this.a = paramli;
  }
  
  public int getChangingConfigurations()
  {
    return 0;
  }
  
  public Drawable newDrawable()
  {
    return new hi(this);
  }
  
  public Drawable newDrawable(Resources paramResources)
  {
    return newDrawable();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/hi$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */