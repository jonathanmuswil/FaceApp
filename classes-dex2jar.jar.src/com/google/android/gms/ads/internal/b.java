package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.Fh;
import com.google.android.gms.internal.ads.jj;
import com.google.android.gms.internal.ads.nj;
import com.google.android.gms.internal.ads.vk;
import com.google.android.gms.internal.ads.yh;
import java.util.Iterator;
import java.util.List;

@yh
public final class b
{
  private final Context a;
  private boolean b;
  private nj c;
  private Fh d;
  
  public b(Context paramContext, nj paramnj, Fh paramFh)
  {
    this.a = paramContext;
    this.c = paramnj;
    this.d = null;
    if (this.d == null) {
      this.d = new Fh();
    }
  }
  
  private final boolean c()
  {
    nj localnj = this.c;
    return ((localnj != null) && (localnj.d().f)) || (this.d.a);
  }
  
  public final void a()
  {
    this.b = true;
  }
  
  public final void a(String paramString)
  {
    if (!c()) {
      return;
    }
    if (paramString == null) {
      paramString = "";
    }
    Object localObject = this.c;
    if (localObject != null)
    {
      ((nj)localObject).a(paramString, null, 3);
      return;
    }
    localObject = this.d;
    if (((Fh)localObject).a)
    {
      localObject = ((Fh)localObject).b;
      if (localObject != null)
      {
        localObject = ((List)localObject).iterator();
        while (((Iterator)localObject).hasNext())
        {
          String str = (String)((Iterator)localObject).next();
          if (!TextUtils.isEmpty(str))
          {
            str = str.replace("{NAVIGATION_URL}", Uri.encode(paramString));
            k.c();
            vk.a(this.a, "", str);
          }
        }
      }
    }
  }
  
  public final boolean b()
  {
    return (!c()) || (this.b);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/ads/internal/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */