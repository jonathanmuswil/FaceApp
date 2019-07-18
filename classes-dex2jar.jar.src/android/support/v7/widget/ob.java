package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

class ob
  extends Ma
{
  private final WeakReference<Context> b;
  
  public ob(Context paramContext, Resources paramResources)
  {
    super(paramResources);
    this.b = new WeakReference(paramContext);
  }
  
  public Drawable getDrawable(int paramInt)
    throws Resources.NotFoundException
  {
    Drawable localDrawable = super.getDrawable(paramInt);
    Context localContext = (Context)this.b.get();
    if ((localDrawable != null) && (localContext != null))
    {
      p.a();
      p.a(localContext, paramInt, localDrawable);
    }
    return localDrawable;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/widget/ob.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */