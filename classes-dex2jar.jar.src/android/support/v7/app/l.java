package android.support.v7.app;

import Gd;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;

public class l
  extends B
  implements DialogInterface
{
  final AlertController c = new AlertController(getContext(), this, getWindow());
  
  protected l(Context paramContext, int paramInt)
  {
    super(paramContext, a(paramContext, paramInt));
  }
  
  static int a(Context paramContext, int paramInt)
  {
    if ((paramInt >>> 24 & 0xFF) >= 1) {
      return paramInt;
    }
    TypedValue localTypedValue = new TypedValue();
    paramContext.getTheme().resolveAttribute(Gd.alertDialogTheme, localTypedValue, true);
    return localTypedValue.resourceId;
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.c.a();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (this.c.a(paramInt, paramKeyEvent)) {
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    if (this.c.b(paramInt, paramKeyEvent)) {
      return true;
    }
    return super.onKeyUp(paramInt, paramKeyEvent);
  }
  
  public void setTitle(CharSequence paramCharSequence)
  {
    super.setTitle(paramCharSequence);
    this.c.b(paramCharSequence);
  }
  
  public static class a
  {
    private final AlertController.a a;
    private final int b;
    
    public a(Context paramContext)
    {
      this(paramContext, l.a(paramContext, 0));
    }
    
    public a(Context paramContext, int paramInt)
    {
      this.a = new AlertController.a(new ContextThemeWrapper(paramContext, l.a(paramContext, paramInt)));
      this.b = paramInt;
    }
    
    public a a(int paramInt)
    {
      AlertController.a locala = this.a;
      locala.h = locala.a.getText(paramInt);
      return this;
    }
    
    public a a(int paramInt, DialogInterface.OnClickListener paramOnClickListener)
    {
      AlertController.a locala = this.a;
      locala.l = locala.a.getText(paramInt);
      this.a.n = paramOnClickListener;
      return this;
    }
    
    public a a(DialogInterface.OnCancelListener paramOnCancelListener)
    {
      this.a.s = paramOnCancelListener;
      return this;
    }
    
    public a a(DialogInterface.OnDismissListener paramOnDismissListener)
    {
      this.a.t = paramOnDismissListener;
      return this;
    }
    
    public a a(DialogInterface.OnKeyListener paramOnKeyListener)
    {
      this.a.u = paramOnKeyListener;
      return this;
    }
    
    public a a(Drawable paramDrawable)
    {
      this.a.d = paramDrawable;
      return this;
    }
    
    public a a(View paramView)
    {
      this.a.g = paramView;
      return this;
    }
    
    public a a(ListAdapter paramListAdapter, DialogInterface.OnClickListener paramOnClickListener)
    {
      AlertController.a locala = this.a;
      locala.w = paramListAdapter;
      locala.x = paramOnClickListener;
      return this;
    }
    
    public a a(CharSequence paramCharSequence)
    {
      this.a.h = paramCharSequence;
      return this;
    }
    
    public a a(CharSequence paramCharSequence, DialogInterface.OnClickListener paramOnClickListener)
    {
      AlertController.a locala = this.a;
      locala.l = paramCharSequence;
      locala.n = paramOnClickListener;
      return this;
    }
    
    public a a(boolean paramBoolean)
    {
      this.a.r = paramBoolean;
      return this;
    }
    
    public a a(CharSequence[] paramArrayOfCharSequence, DialogInterface.OnClickListener paramOnClickListener)
    {
      AlertController.a locala = this.a;
      locala.v = paramArrayOfCharSequence;
      locala.x = paramOnClickListener;
      return this;
    }
    
    public l a()
    {
      l locall = new l(this.a.a, this.b);
      this.a.a(locall.c);
      locall.setCancelable(this.a.r);
      if (this.a.r) {
        locall.setCanceledOnTouchOutside(true);
      }
      locall.setOnCancelListener(this.a.s);
      locall.setOnDismissListener(this.a.t);
      DialogInterface.OnKeyListener localOnKeyListener = this.a.u;
      if (localOnKeyListener != null) {
        locall.setOnKeyListener(localOnKeyListener);
      }
      return locall;
    }
    
    public Context b()
    {
      return this.a.a;
    }
    
    public a b(int paramInt)
    {
      AlertController.a locala = this.a;
      locala.f = locala.a.getText(paramInt);
      return this;
    }
    
    public a b(int paramInt, DialogInterface.OnClickListener paramOnClickListener)
    {
      AlertController.a locala = this.a;
      locala.i = locala.a.getText(paramInt);
      this.a.k = paramOnClickListener;
      return this;
    }
    
    public a b(View paramView)
    {
      AlertController.a locala = this.a;
      locala.z = paramView;
      locala.y = 0;
      locala.E = false;
      return this;
    }
    
    public a b(CharSequence paramCharSequence)
    {
      this.a.f = paramCharSequence;
      return this;
    }
    
    public a b(CharSequence paramCharSequence, DialogInterface.OnClickListener paramOnClickListener)
    {
      AlertController.a locala = this.a;
      locala.i = paramCharSequence;
      locala.k = paramOnClickListener;
      return this;
    }
    
    public a c(int paramInt)
    {
      AlertController.a locala = this.a;
      locala.z = null;
      locala.y = paramInt;
      locala.E = false;
      return this;
    }
    
    public l c()
    {
      l locall = a();
      locall.show();
      return locall;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/app/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */