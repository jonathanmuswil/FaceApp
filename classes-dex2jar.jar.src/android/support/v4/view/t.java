package android.support.v4.view;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.PointerIcon;

public final class t
{
  private Object a;
  
  private t(Object paramObject)
  {
    this.a = paramObject;
  }
  
  public static t a(Context paramContext, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 24) {
      return new t(PointerIcon.getSystemIcon(paramContext, paramInt));
    }
    return new t(null);
  }
  
  public Object a()
  {
    return this.a;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/view/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */