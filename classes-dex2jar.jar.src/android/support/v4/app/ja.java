package android.support.v4.app;

import android.app.Activity;
import android.arch.lifecycle.d;
import android.arch.lifecycle.d.b;
import android.arch.lifecycle.f;
import android.arch.lifecycle.h;
import android.arch.lifecycle.p;
import android.os.Bundle;
import android.support.v4.view.g;
import android.support.v4.view.g.a;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import ud;

public class ja
  extends Activity
  implements f, g.a
{
  private ud<Class<? extends Object>, Object> a = new ud();
  private h b = new h(this);
  
  public boolean a(KeyEvent paramKeyEvent)
  {
    return super.dispatchKeyEvent(paramKeyEvent);
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    View localView = getWindow().getDecorView();
    if ((localView != null) && (g.a(localView, paramKeyEvent))) {
      return true;
    }
    return g.a(this, localView, this, paramKeyEvent);
  }
  
  public boolean dispatchKeyShortcutEvent(KeyEvent paramKeyEvent)
  {
    View localView = getWindow().getDecorView();
    if ((localView != null) && (g.a(localView, paramKeyEvent))) {
      return true;
    }
    return super.dispatchKeyShortcutEvent(paramKeyEvent);
  }
  
  public d ka()
  {
    return this.b;
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    p.a(this);
  }
  
  protected void onSaveInstanceState(Bundle paramBundle)
  {
    this.b.a(d.b.c);
    super.onSaveInstanceState(paramBundle);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/app/ja.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */