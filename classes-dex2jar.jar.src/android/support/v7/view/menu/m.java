package android.support.v7.view.menu;

import Md;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.os.IBinder;
import android.support.v7.app.l.a;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.ListAdapter;

class m
  implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, v.a
{
  private l a;
  private android.support.v7.app.l b;
  j c;
  private v.a d;
  
  public m(l paraml)
  {
    this.a = paraml;
  }
  
  public void a()
  {
    android.support.v7.app.l locall = this.b;
    if (locall != null) {
      locall.dismiss();
    }
  }
  
  public void a(IBinder paramIBinder)
  {
    l locall = this.a;
    l.a locala = new l.a(locall.e());
    this.c = new j(locala.b(), Md.abc_list_menu_item_layout);
    this.c.a(this);
    this.a.a(this.c);
    locala.a(this.c.b(), this);
    Object localObject = locall.i();
    if (localObject != null)
    {
      locala.a((View)localObject);
    }
    else
    {
      locala.a(locall.g());
      locala.b(locall.h());
    }
    locala.a(this);
    this.b = locala.a();
    this.b.setOnDismissListener(this);
    localObject = this.b.getWindow().getAttributes();
    ((WindowManager.LayoutParams)localObject).type = 1003;
    if (paramIBinder != null) {
      ((WindowManager.LayoutParams)localObject).token = paramIBinder;
    }
    ((WindowManager.LayoutParams)localObject).flags |= 0x20000;
    this.b.show();
  }
  
  public void a(l paraml, boolean paramBoolean)
  {
    if ((paramBoolean) || (paraml == this.a)) {
      a();
    }
    v.a locala = this.d;
    if (locala != null) {
      locala.a(paraml, paramBoolean);
    }
  }
  
  public boolean a(l paraml)
  {
    v.a locala = this.d;
    if (locala != null) {
      return locala.a(paraml);
    }
    return false;
  }
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.a((p)this.c.b().getItem(paramInt), 0);
  }
  
  public void onDismiss(DialogInterface paramDialogInterface)
  {
    this.c.a(this.a, true);
  }
  
  public boolean onKey(DialogInterface paramDialogInterface, int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 82) || (paramInt == 4)) {
      if ((paramKeyEvent.getAction() == 0) && (paramKeyEvent.getRepeatCount() == 0))
      {
        paramDialogInterface = this.b.getWindow();
        if (paramDialogInterface != null)
        {
          paramDialogInterface = paramDialogInterface.getDecorView();
          if (paramDialogInterface != null)
          {
            paramDialogInterface = paramDialogInterface.getKeyDispatcherState();
            if (paramDialogInterface != null)
            {
              paramDialogInterface.startTracking(paramKeyEvent, this);
              return true;
            }
          }
        }
      }
      else if ((paramKeyEvent.getAction() == 1) && (!paramKeyEvent.isCanceled()))
      {
        Object localObject = this.b.getWindow();
        if (localObject != null)
        {
          localObject = ((Window)localObject).getDecorView();
          if (localObject != null)
          {
            localObject = ((View)localObject).getKeyDispatcherState();
            if ((localObject != null) && (((KeyEvent.DispatcherState)localObject).isTracking(paramKeyEvent)))
            {
              this.a.a(true);
              paramDialogInterface.dismiss();
              return true;
            }
          }
        }
      }
    }
    return this.a.performShortcut(paramInt, paramKeyEvent, 0);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/view/menu/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */