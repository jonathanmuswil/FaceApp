package com.facebook.accountkit.internal;

import Sm;
import Vm.a;
import Wm;
import android.content.Context;

final class wa
{
  static void a()
  {
    if (Sm.k()) {
      return;
    }
    throw new Wm(Vm.a.e, O.p);
  }
  
  static void a(Context paramContext)
  {
    if (paramContext.checkCallingOrSelfPermission("android.permission.INTERNET") != -1) {
      return;
    }
    throw new IllegalStateException("No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.");
  }
  
  static void a(X paramX)
  {
    if (paramX != null) {
      return;
    }
    throw new Wm(Vm.a.f, O.y);
  }
  
  static void a(X paramX1, X paramX2)
  {
    if (!va.b(paramX1, paramX2)) {
      return;
    }
    throw new Wm(Vm.a.f, O.z);
  }
  
  static void a(Object paramObject1, Object paramObject2, String paramString)
  {
    if (!va.b(paramObject1, paramObject2)) {
      return;
    }
    throw new Wm(Vm.a.f, O.A, paramString);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/accountkit/internal/wa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */