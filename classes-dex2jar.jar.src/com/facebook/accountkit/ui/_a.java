package com.facebook.accountkit.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.support.v4.content.g;
import com.facebook.accountkit.internal.c.a;
import jn;
import un;
import un.a;

class _a
  implements Na.b
{
  _a(ab paramab) {}
  
  public void a(Context paramContext, String paramString)
  {
    ab localab = this.a;
    Object localObject = localab.g;
    if ((localObject != null) && (localab.h != null))
    {
      localObject = ((Na.e)localObject).k();
      if (localObject == null) {
        return;
      }
      c.a.a(paramString, Na.a((jn)localObject, this.a.g.g(), this.a.g.i()).name(), (jn)localObject);
      paramString = new Intent(un.b).putExtra(un.c, un.a.a).putExtra(un.d, (Parcelable)localObject);
      g.a(paramContext).a(paramString);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/accountkit/ui/_a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */