package android.support.v4.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

class j
  extends p
{
  j(l paraml) {}
  
  public l a(Context paramContext, String paramString, Bundle paramBundle)
  {
    return this.a.u.a(paramContext, paramString, paramBundle);
  }
  
  public View a(int paramInt)
  {
    View localView = this.a.K;
    if (localView != null) {
      return localView.findViewById(paramInt);
    }
    throw new IllegalStateException("Fragment does not have a view");
  }
  
  public boolean a()
  {
    boolean bool;
    if (this.a.K != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/app/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */