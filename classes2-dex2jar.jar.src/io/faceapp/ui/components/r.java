package io.faceapp.ui.components;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.h;
import android.support.v4.app.l;
import android.support.v4.app.s;
import android.support.v7.app.l.a;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import oXa;

public final class r
  extends h
{
  private static final AtomicBoolean ha = new AtomicBoolean();
  public static final a ia = new a(null);
  private HashMap ja;
  
  public void Ob()
  {
    HashMap localHashMap = this.ja;
    if (localHashMap != null) {
      localHashMap.clear();
    }
  }
  
  public void b(Bundle paramBundle)
  {
    super.b(paramBundle);
    A(false);
  }
  
  public Dialog n(Bundle paramBundle)
  {
    paramBundle = La();
    if (paramBundle != null)
    {
      paramBundle = new l.a(paramBundle);
      paramBundle.c(2131492968);
      paramBundle = paramBundle.a();
      oXa.a(paramBundle, "AlertDialog.Builder(chec…ng)\n            .create()");
      return paramBundle;
    }
    throw new IllegalStateException("Required value was null.");
  }
  
  public void onDismiss(DialogInterface paramDialogInterface)
  {
    ha.compareAndSet(true, false);
    super.onDismiss(paramDialogInterface);
  }
  
  public static final class a
  {
    public final void a(s params)
    {
      oXa.b(params, "fm");
      if (r.Pb().get())
      {
        params = (r)params.a("javaClass");
        if (params != null) {
          params.Lb();
        }
      }
    }
    
    public final void a(s params, boolean paramBoolean)
    {
      oXa.b(params, "fm");
      if (paramBoolean) {
        b(params);
      } else {
        a(params);
      }
    }
    
    public final void b(s params)
    {
      oXa.b(params, "fm");
      if (r.Pb().compareAndSet(false, true)) {
        new r().a(params, "javaClass");
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/components/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */