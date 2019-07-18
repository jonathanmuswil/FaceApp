package com.google.android.gms.dynamite;

import android.content.Context;

final class f
  implements DynamiteModule.b
{
  public final DynamiteModule.b.b a(Context paramContext, String paramString, DynamiteModule.b.a parama)
    throws DynamiteModule.a
  {
    DynamiteModule.b.b localb = new DynamiteModule.b.b();
    localb.a = parama.a(paramContext, paramString);
    localb.b = parama.a(paramContext, paramString, true);
    if ((localb.a == 0) && (localb.b == 0)) {
      localb.c = 0;
    } else if (localb.b >= localb.a) {
      localb.c = 1;
    } else {
      localb.c = -1;
    }
    return localb;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/dynamite/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */