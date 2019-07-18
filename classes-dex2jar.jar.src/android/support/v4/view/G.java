package android.support.v4.view;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface.OnKeyListener;
import android.os.Build.VERSION;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.View;
import android.view.Window;
import android.view.Window.Callback;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class g
{
  private static boolean a = false;
  private static Method b;
  private static boolean c = false;
  private static Field d;
  
  private static DialogInterface.OnKeyListener a(Dialog paramDialog)
  {
    if (!c) {}
    try
    {
      d = Dialog.class.getDeclaredField("mOnKeyListener");
      d.setAccessible(true);
      c = true;
      Field localField = d;
      if (localField != null) {}
      try
      {
        paramDialog = (DialogInterface.OnKeyListener)localField.get(paramDialog);
        return paramDialog;
      }
      catch (IllegalAccessException paramDialog)
      {
        for (;;) {}
      }
      return null;
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      for (;;) {}
    }
  }
  
  private static boolean a(ActionBar paramActionBar, KeyEvent paramKeyEvent)
  {
    if (!a) {}
    try
    {
      b = paramActionBar.getClass().getMethod("onMenuKeyEvent", new Class[] { KeyEvent.class });
      a = true;
      Method localMethod = b;
      if (localMethod != null) {}
      try
      {
        boolean bool = ((Boolean)localMethod.invoke(paramActionBar, new Object[] { paramKeyEvent })).booleanValue();
        return bool;
      }
      catch (IllegalAccessException|InvocationTargetException paramActionBar)
      {
        for (;;) {}
      }
      return false;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;) {}
    }
  }
  
  private static boolean a(Activity paramActivity, KeyEvent paramKeyEvent)
  {
    paramActivity.onUserInteraction();
    Window localWindow = paramActivity.getWindow();
    if (localWindow.hasFeature(8))
    {
      localObject = paramActivity.getActionBar();
      if ((paramKeyEvent.getKeyCode() == 82) && (localObject != null) && (a((ActionBar)localObject, paramKeyEvent))) {
        return true;
      }
    }
    if (localWindow.superDispatchKeyEvent(paramKeyEvent)) {
      return true;
    }
    Object localObject = localWindow.getDecorView();
    if (y.a((View)localObject, paramKeyEvent)) {
      return true;
    }
    if (localObject != null) {
      localObject = ((View)localObject).getKeyDispatcherState();
    } else {
      localObject = null;
    }
    return paramKeyEvent.dispatch(paramActivity, (KeyEvent.DispatcherState)localObject, paramActivity);
  }
  
  private static boolean a(Dialog paramDialog, KeyEvent paramKeyEvent)
  {
    Object localObject = a(paramDialog);
    if ((localObject != null) && (((DialogInterface.OnKeyListener)localObject).onKey(paramDialog, paramKeyEvent.getKeyCode(), paramKeyEvent))) {
      return true;
    }
    localObject = paramDialog.getWindow();
    if (((Window)localObject).superDispatchKeyEvent(paramKeyEvent)) {
      return true;
    }
    localObject = ((Window)localObject).getDecorView();
    if (y.a((View)localObject, paramKeyEvent)) {
      return true;
    }
    if (localObject != null) {
      localObject = ((View)localObject).getKeyDispatcherState();
    } else {
      localObject = null;
    }
    return paramKeyEvent.dispatch(paramDialog, (KeyEvent.DispatcherState)localObject, paramDialog);
  }
  
  public static boolean a(a parama, View paramView, Window.Callback paramCallback, KeyEvent paramKeyEvent)
  {
    boolean bool = false;
    if (parama == null) {
      return false;
    }
    if (Build.VERSION.SDK_INT >= 28) {
      return parama.a(paramKeyEvent);
    }
    if ((paramCallback instanceof Activity)) {
      return a((Activity)paramCallback, paramKeyEvent);
    }
    if ((paramCallback instanceof Dialog)) {
      return a((Dialog)paramCallback, paramKeyEvent);
    }
    if (((paramView != null) && (y.a(paramView, paramKeyEvent))) || (parama.a(paramKeyEvent))) {
      bool = true;
    }
    return bool;
  }
  
  public static boolean a(View paramView, KeyEvent paramKeyEvent)
  {
    return y.b(paramView, paramKeyEvent);
  }
  
  public static abstract interface a
  {
    public abstract boolean a(KeyEvent paramKeyEvent);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/view/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */